package DAO;

import Classes.Entregador;
import Conexao.util.Conexao;
import java.sql.*;
import java.util.ArrayList;

public class EntregadorDAO {
    private Connection conn;

    public EntregadorDAO() throws Exception {
        this.conn = Conexao.getConnection();
    }

    public ArrayList<Entregador> listarTodos() throws SQLException {
        ArrayList<Entregador> lista = new ArrayList<>();
        String sql = "SELECT * FROM entregador";
        try (Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Entregador e = new Entregador(
                    rs.getInt("ID_Entregador"),
                    rs.getString("nome"),
                    String.valueOf(rs.getInt("contato"))
                );
                lista.add(e);
            }
        }
        return lista;
    }
    
    public void excluir(int id) throws SQLException {
    String sql = "DELETE FROM entregador WHERE ID_Entregador = ?";
    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, id);
        ps.executeUpdate();
    }
}
    
    public boolean podeExcluir(int idEntregador) throws SQLException {
    String sql = "SELECT COUNT(*) FROM nota_fiscal WHERE ID_entrega = ?";
    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, idEntregador);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return rs.getInt(1) == 0; 
        }
    }
    return false;
}
    
    public void inserir(Entregador e) throws SQLException {
    String sql = "INSERT INTO entregador (nome, contato) VALUES (?, ?)";
    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, e.getNome());
        ps.setString(2, e.getContato());
        ps.executeUpdate();
    }
}
    
    public void atualizar(Entregador e) throws SQLException {
    String sql = "UPDATE entregador SET nome = ?, contato = ? WHERE ID_Entregador = ?";
    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, e.getNome());
        ps.setString(2, e.getContato());
        ps.setInt(3, e.getID_entregador());
        ps.executeUpdate();
    }
}
}