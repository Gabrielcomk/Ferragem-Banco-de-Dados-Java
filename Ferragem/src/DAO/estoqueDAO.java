package DAO;

import Classes.Estoque;
import Conexao.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class estoqueDAO {
    
    private Connection conn;

    public estoqueDAO() {
        try {
            this.conn = Conexao.getConnection();
        } catch (Exception e) {
            System.out.println("Erro de conexão: " + e.getMessage());
        }
    }

    
    public ArrayList<Estoque> listarTodos() throws ErpDAOException {
    ArrayList<Estoque> lista = new ArrayList<>();
    String SQL = "SELECT e.codigo, e.item, e.unidade, e.preco, e.ID_fornecedor, f.fornecedor " +
                 "FROM estoque e " +
                 "LEFT JOIN fornecedor f ON e.ID_fornecedor = f.ID_Forn " +
                 "ORDER BY e.codigo";

    try (PreparedStatement ps = conn.prepareStatement(SQL);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            Estoque e = new Estoque(
                rs.getInt("codigo"),
                rs.getString("item"),
                rs.getString("unidade"),
                rs.getFloat("preco"),
                rs.getInt("ID_fornecedor"),
                rs.getString("fornecedor") // <<-- nome fornecedor
            );
            lista.add(e);
        }

    } catch (SQLException e) {
        throw new ErpDAOException("Erro ao listar estoque: " + e.getMessage(), e);
    }

    return lista;
}

    
    public void inserir(Estoque e) throws ErpDAOException {
        String SQL = "INSERT INTO estoque (codigo, item, unidade, preco, ID_fornecedor) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(SQL)) {
            ps.setInt(1, e.getCodigo());
            ps.setString(2, e.getItem());
            ps.setString(3, e.getUnidade());
            ps.setFloat(4, e.getPreco());
            ps.setInt(5, e.getID_fornecedor());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new ErpDAOException("Erro ao inserir no estoque: " + ex.getMessage(), ex);
        }
    }

    
    public void alterar(Estoque e) throws ErpDAOException {
        String SQL = "UPDATE estoque SET item = ?, unidade = ?, preco = ?, ID_fornecedor = ? WHERE codigo = ?";
        try (PreparedStatement ps = conn.prepareStatement(SQL)) {
            ps.setString(1, e.getItem());
            ps.setString(2, e.getUnidade());
            ps.setFloat(3, e.getPreco());
            ps.setInt(4, e.getID_fornecedor());
            ps.setInt(5, e.getCodigo());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new ErpDAOException("Erro ao alterar no estoque: " + ex.getMessage(), ex);
        }
    }

    
    public void excluir(int codigo) throws ErpDAOException {
        String SQL = "DELETE FROM estoque WHERE codigo = ?";
        try (PreparedStatement ps = conn.prepareStatement(SQL)) {
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new ErpDAOException("Erro ao excluir do estoque: " + ex.getMessage(), ex);
        }
    }
}