package DAO;

import Classes.Fornecedor;
import Conexao.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class fornecedorDAO {

    private Connection conn;

    public fornecedorDAO() {
        try {
            this.conn = Conexao.getConnection();
        } catch (Exception e) {
            System.out.println("Erro de conexão: " + e.getMessage());
        }
    }

    
    public ArrayList<Fornecedor> listarTodos() throws ErpDAOException {
        ArrayList<Fornecedor> fornecedores = new ArrayList<>();
        String SQL = "SELECT * FROM fornecedor ORDER BY ID_Forn";

        try (PreparedStatement ps = conn.prepareStatement(SQL);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Fornecedor f = new Fornecedor(
                    rs.getInt("ID_Forn"),
                    rs.getString("fornecedor"),
                    rs.getString("endereco"),
                    rs.getInt("nr"),
                    rs.getString("complemento"),
                    rs.getString("bairro"),
                    rs.getString("cidade")
                );
                fornecedores.add(f);
            }
        } catch (SQLException e) {
            throw new ErpDAOException("Erro ao listar fornecedores: " + e.getMessage(), e);
        }

        return fornecedores;
    }
}