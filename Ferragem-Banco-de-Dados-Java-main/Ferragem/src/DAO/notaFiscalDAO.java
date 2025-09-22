package DAO;

import Conexao.util.Conexao;
import java.sql.*;

public class notaFiscalDAO {
    private Connection conn;

    public notaFiscalDAO() {
        try {
            this.conn = Conexao.getConnection();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public int criarNotaFiscal(int idCliente) throws ErpDAOException {
        String sql = "INSERT INTO nota_fiscal (ID_cliente, data) VALUES (?, NOW())";
        try (PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, idCliente);
            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    return rs.getInt(1); // retorna o número da NF
                }
            }
        } catch (SQLException e) {
            throw new ErpDAOException("Erro ao criar nota fiscal: " + e.getMessage(), e);
        }
        return -1;
    }
}