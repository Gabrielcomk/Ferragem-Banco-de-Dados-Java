package DAO;

import Classes.Clientes;
import Classes.Nota_fiscal;
import Classes.Pedido;
import Conexao.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class clientesDAO {

    private Connection conn;

    public clientesDAO() {
        try {
            this.conn = Conexao.getConnection();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ArrayList<Clientes> listarTodos() throws ErpDAOException {
    ArrayList<Clientes> clientes = new ArrayList<>();
    String SQL = "SELECT * FROM clientes ORDER BY ID_Cliente";

    try (PreparedStatement ps = conn.prepareStatement(SQL);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            Clientes cliente = new Clientes(
                rs.getInt("ID_Cliente"),
                rs.getString("nome"),
                rs.getString("sexo") != null ? rs.getString("sexo").charAt(0) : ' ',
                rs.getDate("data_nasc"),
                rs.getString("endereco"),
                rs.getInt("numero"),
                rs.getString("complemento"),
                rs.getString("bairro"),
                rs.getString("cidade"),
                rs.getInt("fone1"),
                rs.getInt("fone2")
            );
            clientes.add(cliente);
        }
    } catch (SQLException e) {
        throw new ErpDAOException("Erro ao listar clientes: " + e.getMessage(), e);
    }
    return clientes;
}
    
    public ArrayList<Pedido> listarPedidosDoCliente(int idCliente) throws ErpDAOException {
    ArrayList<Pedido> pedidos = new ArrayList<>();
    String SQL = "SELECT p.codigo_item, p.NR_NF, p.quantidade, e.item " +
                 "FROM pedido p " +
                 "JOIN nota_fiscal nf ON p.NR_NF = nf.NF " +
                 "JOIN estoque e ON p.codigo_item = e.codigo " +
                 "WHERE nf.ID_cliente = ?";

    try (PreparedStatement ps = conn.prepareStatement(SQL)) {
        ps.setInt(1, idCliente);
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Pedido pedido = new Pedido(
                    rs.getInt("codigo_item"),
                    rs.getInt("NR_NF"),
                    rs.getInt("quantidade"),
                    rs.getString("item")
                );
                pedidos.add(pedido);
            }
        }
    } catch (SQLException e) {
        throw new ErpDAOException("Erro ao listar pedidos do cliente: " + e.getMessage(), e);
    }
    return pedidos;
}
    
    public void alterarCliente(Clientes cliente) throws ErpDAOException {
    String SQL = "UPDATE clientes SET nome = ?, sexo = ?, data_nasc = ?, endereco = ?, numero = ?, " +
                 "complemento = ?, bairro = ?, cidade = ?, fone1 = ?, fone2 = ? WHERE ID_Cliente = ?";
    try (PreparedStatement ps = conn.prepareStatement(SQL)) {
        ps.setString(1, cliente.getNome());
        ps.setString(2, String.valueOf(cliente.getSexo()));
        if (cliente.getData_nasc() != null) {
            ps.setDate(3, new java.sql.Date(cliente.getData_nasc().getTime()));
        } else {
            ps.setNull(3, java.sql.Types.DATE);
        }
        ps.setString(4, cliente.getEndereco());
        ps.setInt(5, cliente.getNumero());
        ps.setString(6, cliente.getComplemento());
        ps.setString(7, cliente.getBairro());
        ps.setString(8, cliente.getCidade());
        ps.setInt(9, cliente.getFone1());
        ps.setInt(10, cliente.getFone2());
        ps.setInt(11, cliente.getID_Cliente());

        ps.executeUpdate();
    } catch (SQLException e) {
        throw new ErpDAOException("Erro ao alterar cliente: " + e.getMessage(), e);
    }
}

    
    public void inserirCliente(Clientes cliente) throws ErpDAOException {
    String sqlProximoId =
        "SELECT COALESCE(MIN(t1.ID_Cliente) + 1, 1) AS proximoID " +
        "FROM clientes t1 " +
        "WHERE NOT EXISTS (SELECT 1 FROM clientes t2 WHERE t2.ID_Cliente = t1.ID_Cliente + 1)";
    String sqlVerificaUm = "SELECT 1 FROM clientes WHERE ID_Cliente = 1";

    String SQL = "INSERT INTO clientes (ID_Cliente, nome, sexo, data_nasc, endereco, numero, complemento, bairro, cidade, fone1, fone2) " +
                 "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try {
        int novoId = 1;

        try (PreparedStatement psCheck = conn.prepareStatement(sqlVerificaUm);
             ResultSet rsCheck = psCheck.executeQuery()) {
            if (rsCheck.next()) {
                try (PreparedStatement psId = conn.prepareStatement(sqlProximoId);
                     ResultSet rs = psId.executeQuery()) {
                    if (rs.next()) {
                        novoId = rs.getInt("proximoID");
                    }
                }
            }
        }

        try (PreparedStatement ps = conn.prepareStatement(SQL)) {
            ps.setInt(1, novoId);
            ps.setString(2, cliente.getNome());
            ps.setString(3, String.valueOf(cliente.getSexo()));
            if (cliente.getData_nasc() != null) {
                ps.setDate(4, new java.sql.Date(cliente.getData_nasc().getTime()));
            } else {
                ps.setNull(4, java.sql.Types.DATE);
            }
            ps.setString(5, cliente.getEndereco());
            ps.setInt(6, cliente.getNumero());
            ps.setString(7, cliente.getComplemento());
            ps.setString(8, cliente.getBairro());
            ps.setString(9, cliente.getCidade());
            ps.setInt(10, cliente.getFone1());
            ps.setInt(11, cliente.getFone2());

            ps.executeUpdate();
        }

    } catch (SQLException e) {
        throw new ErpDAOException("Erro ao inserir cliente: " + e.getMessage(), e);
    }
}
    
    
    public void excluirCliente(int idCliente) throws ErpDAOException {
    String sqlPedidos = "DELETE FROM pedido WHERE NR_NF IN (SELECT NF FROM nota_fiscal WHERE ID_cliente = ?)";
    String sqlNotas   = "DELETE FROM nota_fiscal WHERE ID_cliente = ?";
    String sqlCliente = "DELETE FROM clientes WHERE ID_Cliente = ?";

    try (Connection con = Conexao.getConnection()) {
        con.setAutoCommit(false);

        try (
            PreparedStatement psPedidos = con.prepareStatement(sqlPedidos);
            PreparedStatement psNotas   = con.prepareStatement(sqlNotas);
            PreparedStatement psCliente = con.prepareStatement(sqlCliente)
        ) {

            psPedidos.setInt(1, idCliente);
            psPedidos.executeUpdate();


            psNotas.setInt(1, idCliente);
            psNotas.executeUpdate();


            psCliente.setInt(1, idCliente);
            psCliente.executeUpdate();

            con.commit();
        } catch (SQLException e) {
            con.rollback();
            throw new ErpDAOException("Erro ao excluir cliente: " + e.getMessage(), e);
        }
    } catch (SQLException e) {
        throw new ErpDAOException("Erro de conexão: " + e.getMessage(), e);
    }
}
}
