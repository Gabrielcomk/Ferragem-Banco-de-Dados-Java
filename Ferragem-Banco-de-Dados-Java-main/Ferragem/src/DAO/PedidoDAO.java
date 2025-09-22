package DAO;

import Classes.Pedido;
import Conexao.util.Conexao;
import java.sql.*;

public class PedidoDAO {
    private Connection conn;

    public PedidoDAO() {
        try {
            this.conn = Conexao.getConnection();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void inserir(Pedido p) throws ErpDAOException {
        String sql = "INSERT INTO pedido (codigo_item, NR_NF, quantidade) VALUES (?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, p.getCodigo_item());
            ps.setInt(2, p.getNR_NF());
            ps.setInt(3, p.getQuantidade());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new ErpDAOException("Erro ao inserir pedido: " + e.getMessage(), e);
        }
    }
}