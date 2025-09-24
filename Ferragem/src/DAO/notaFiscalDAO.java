package DAO;

import Classes.Nota_fiscal;
import Conexao.util.Conexao;
import java.sql.*;
import java.util.ArrayList;

public class notaFiscalDAO {
    private Connection conn;

    public notaFiscalDAO() {
        try {
            this.conn = Conexao.getConnection();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

   public int criarNotaFiscal(int idCliente, int idEntrega) throws SQLException {
    String sql = "INSERT INTO nota_fiscal (data, ID_entrega, ID_cliente) VALUES (?, ?, ?)";
    try (PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
        ps.setDate(1, new java.sql.Date(System.currentTimeMillis()));
        ps.setInt(2, idEntrega);
        ps.setInt(3, idCliente);
        ps.executeUpdate();

        try (ResultSet rs = ps.getGeneratedKeys()) {
            if (rs.next()) {
                return rs.getInt(1);
            }
        }
    }
    return -1;
   }
   
   public int buscarNotaFiscalPorCliente(int idCliente) throws Exception {
    try (Connection conn = Conexao.getConnection();
         PreparedStatement ps = conn.prepareStatement(
                 "SELECT NF FROM nota_fiscal WHERE ID_cliente = ? ORDER BY data DESC LIMIT 1")) {
        ps.setInt(1, idCliente);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) return rs.getInt("NF");
        }
    }
    return -1;
}
   
   public int obterOuCriarNotaFiscal(int idCliente, int idEntrega) throws SQLException {
   
    String sqlSelect = "SELECT NF FROM nota_fiscal WHERE ID_cliente = ? LIMIT 1";
    try (PreparedStatement ps = conn.prepareStatement(sqlSelect)) {
        ps.setInt(1, idCliente);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                return rs.getInt("NF"); 
            }
        }
    }

    return criarNotaFiscal(idCliente, idEntrega);
}
   
   public ArrayList<Nota_fiscal> listarTodos() throws SQLException {
    ArrayList<Nota_fiscal> lista = new ArrayList<>();
    String sql = "SELECT * FROM nota_fiscal";
    try (Statement st = conn.createStatement();
         ResultSet rs = st.executeQuery(sql)) {
        while (rs.next()) {
            Nota_fiscal nf = new Nota_fiscal(
                rs.getInt("NF"),
                rs.getDate("data"),
                rs.getInt("ID_entrega"),
                rs.getInt("ID_cliente")
            );
            lista.add(nf);
        }
    }
    return lista;
}
}