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
    String SQL = "SELECT * FROM clientes ORDER BY nome";

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
                    rs.getString("item") // <-- novo campo
                );
                pedidos.add(pedido);
            }
        }
    } catch (SQLException e) {
        throw new ErpDAOException("Erro ao listar pedidos do cliente: " + e.getMessage(), e);
    }
    return pedidos;
}

} // fim clientesDAO (Classe inteira)
