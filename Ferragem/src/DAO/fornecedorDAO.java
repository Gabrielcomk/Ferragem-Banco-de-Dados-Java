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
    
    public void inserir(Fornecedor f) throws ErpDAOException {
    String sql = "INSERT INTO fornecedor (fornecedor, endereco, nr, complemento, bairro, cidade) "
               + "VALUES (?, ?, ?, ?, ?, ?)";
    
    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, f.getFornecedor());
        ps.setString(2, f.getEndereco());
        ps.setInt(3, f.getNr());
        ps.setString(4, f.getComplemento());
        ps.setString(5, f.getBairro());
        ps.setString(6, f.getCidade());

        ps.executeUpdate();
    } catch (SQLException e) {
        throw new ErpDAOException("Erro ao inserir fornecedor: " + e.getMessage(), e);
    }
}
    
    
    public void excluir(int idForn) throws ErpDAOException {
    String sql = "DELETE FROM fornecedor WHERE ID_Forn = ?";

    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, idForn);
        int linhasAfetadas = ps.executeUpdate();
        if (linhasAfetadas == 0) {
            throw new ErpDAOException("Nenhum fornecedor encontrado com o ID: " + idForn);
        }
    } catch (SQLException e) {
        throw new ErpDAOException("Erro ao excluir fornecedor: " + e.getMessage(), e);
    }
}
    
    public void alterar(Fornecedor f) throws ErpDAOException {
    String sql = "UPDATE fornecedor SET fornecedor=?, endereco=?, nr=?, complemento=?, bairro=?, cidade=? WHERE ID_Forn=?";

    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, f.getFornecedor());
        ps.setString(2, f.getEndereco());
        ps.setInt(3, f.getNr());
        ps.setString(4, f.getComplemento());
        ps.setString(5, f.getBairro());
        ps.setString(6, f.getCidade());
        ps.setInt(7, f.getID_Forn());

        int linhasAfetadas = ps.executeUpdate();
        if (linhasAfetadas == 0) {
            throw new ErpDAOException("Nenhum fornecedor encontrado com o ID: " + f.getID_Forn());
        }
    } catch (SQLException e) {
        throw new ErpDAOException("Erro ao alterar fornecedor: " + e.getMessage(), e);
    }
}
}