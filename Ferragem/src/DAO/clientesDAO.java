package DAO;

import Classes.Clientes;
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

    public ArrayList Listar() {
        PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;
        ArrayList clientes = new ArrayList();

        try {
            String SQL = "SELECT * FROM clientes ORDER BY nome";
            connL = this.conn;

            ps = connL.prepareStatement(SQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                int ID_Cliente = rs.getInt("ID_Cliente");
                String nome = rs.getString("nome");
                char sexo = ' ';
                if (rs.getString("sexo") == null) {
                    sexo = ' ';
                } else {
                    sexo = (rs.getString("sexo")).charAt(0);
                }
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                java.sql.Date data_nasc = rs.getDate("data_nasc");
                String telefone = rs.getString("endereco");
                int numero = rs.getInt("numero");
                String complemento = rs.getString("complemento");
                String bairro = rs.getString("bairro");
                String cidade = rs.getString("cidade");
                int fone1 = rs.getInt("fone1");
                int fone2 = rs.getInt("fone2");

                clientes.add(new Clientes(ID_Cliente, nome, sexo, data_nasc, telefone, numero, complemento, bairro, cidade, fone1, fone2));

            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro ao listar " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
        return clientes;
    }

    public void Inserir(Clientes cliente) throws ErpDAOException {
        PreparedStatement ps = null;
        Connection connL = null;
        if (cliente == null) {
            throw new ErpDAOException("O objeto paciente não pode ser nulo.");
        }
        try {
            String SQL = "INSERT INTO clientes (nome, sexo, data_nasc, endereco, numero, complemento, bairro, cidade, fone1, fone2) "
                    + "values (?,?,?,?,?,?,?,?,?,?)";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setString(1, cliente.getNome());
            ps.setString(2, Character.toString(cliente.getSexo()));
            java.util.Date dataJAVA = cliente.getData_nasc();
            java.sql.Date dataSQL = new java.sql.Date(dataJAVA.getTime());
            ps.setDate(3, dataSQL);
            ps.setString(4, cliente.getEndereco());
            ps.setInt(5, cliente.getNumero());
            ps.setString(6, cliente.getComplemento());
            ps.setString(7, cliente.getBairro());
            ps.setString(8, cliente.getCidade());
            ps.setInt(9, cliente.getFone1());
            ps.setInt(10, cliente.getFone2());
            ps.executeUpdate();
        } catch (SQLException sqle) {
            throw new ErpDAOException("Erro ao inserir um novo paciente" + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }
    
    public void Atualizar(Clientes cliente) throws ErpDAOException {
    if (cliente == null) {
        throw new ErpDAOException("O cliente não pode ser nulo.");
    }

    String SQL = "UPDATE clientes SET nome=?, sexo=?, data_nasc=?, endereco=?, numero=?, complemento=?, bairro=?, cidade=?, fone1=?, fone2=? WHERE ID_Cliente=?";
    try (PreparedStatement ps = conn.prepareStatement(SQL)) {
        ps.setString(1, cliente.getNome());
        ps.setString(2, Character.toString(cliente.getSexo()));

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
    } catch (SQLException sqle) {
        throw new ErpDAOException("Erro ao editar cliente: " + sqle);
    }
}
    
    public Clientes procurar(int ID_Cliente) throws ErpDAOException {
        PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;

        try {
            String SQL = "SELECT ID_Cliente, nome, sexo, data_nasc, endereco, numero, complemento, bairro, cidade, fone1, fone2 FROM clientes WHERE ID_Cliente = ?";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setInt(1, ID_Cliente);
            rs = ps.executeQuery();
            Clientes cliente = new Clientes();
            while (rs.next()) {
                int ID_Cliente2 = rs.getInt("ID_Cliente");
                String nome = rs.getString("nome");
                char sexo;
                if (rs.getString("sexo") == null) {
                    sexo = ' ';
                } else {
                    sexo = (rs.getString("sexo")).charAt(0);
                }
                String endereco = rs.getString("endereco");
                int numero = rs.getInt("numero");
                String complemento = rs.getString("complemento");
                String bairro = rs.getString("bairro");
                String cidade = rs.getString("cidade");
                String fone1 = rs.getString("fone1");
                String fone2 = rs.getString("fone2");
                java.sql.Date dataNasc = rs.getDate("data_nasc");
                cliente = new Clientes(ID_Cliente2, nome, sexo, dataNasc, endereco, numero, complemento, bairro, cidade, fone1, fone2);

            }

            return cliente;

        } catch (SQLException sqle) {
            throw new ErpDAOException("Erro ao procurar o paciente " + sqle);
        } finally {
            // conexaoAulaDAO.close(connL,ps);
        }
    }
    
    /*
    
    public void Excluir(Clientes cliente) {
        PreparedStatement ps = null;
        Connection connL = null;
        if (cliente == null) {
            System.out.println("O objeto paciente não pode ser nulo.");
        }

        try {
            String SQL = "DELETE FROM clientes WHERE ID_Cliente=?";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setInt(1, cliente.getID_Cliente());
            ps.executeUpdate();
        } catch (SQLException sqle) {
            System.out.println("Erro ao excluir pessoa " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }
    
    */
    
    
    public void ExcluirComDependencias(Clientes c) throws ErpDAOException {
    Connection con = null;
    PreparedStatement psPedidos = null;
    PreparedStatement psNotas = null;
    PreparedStatement psCliente = null;

    try {
        con = Conexao.getConnection();
        con.setAutoCommit(false); // inicia transação

        // paga pedidos ligados notas fiscais do cliente
        String sqlPedidos = "DELETE FROM pedido WHERE NR_NF IN (SELECT NF FROM nota_fiscal WHERE ID_cliente = ?)";
        psPedidos = con.prepareStatement(sqlPedidos);
        psPedidos.setInt(1, c.getID_Cliente());
        psPedidos.executeUpdate();

        // apaga notas fiscais do cliente
        String sqlNotas = "DELETE FROM nota_fiscal WHERE ID_cliente = ?";
        psNotas = con.prepareStatement(sqlNotas);
        psNotas.setInt(1, c.getID_Cliente());
        psNotas.executeUpdate();

        // Apaga o cliente
        String sqlCliente = "DELETE FROM clientes WHERE ID_Cliente = ?";
        psCliente = con.prepareStatement(sqlCliente);
        psCliente.setInt(1, c.getID_Cliente());
        psCliente.executeUpdate();

        con.commit(); // confirma a transação
    } catch (SQLException e) {
        try {
            if (con != null) con.rollback(); // desfaz em erro
        } catch (SQLException ex) {
            throw new ErpDAOException("Erro no rollback: " + ex.getMessage(), ex);
        }
        throw new ErpDAOException("Erro ao excluir cliente e dependências: " + e.getMessage(), e);
    } finally {
        try {
            if (psPedidos != null) psPedidos.close();
            if (psNotas != null) psNotas.close();
            if (psCliente != null) psCliente.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            throw new ErpDAOException("Erro ao fechar recursos: " + e.getMessage(), e);
        }
    }
}

} // fim clientesDAO (Classe inteira)
