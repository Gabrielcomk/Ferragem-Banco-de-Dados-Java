package DAO;

import Classes.Estoque;
import Conexao.util.Conexao;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class estoqueDAO {
    private Connection conn;
    
    public estoqueDAO() {
        try {
            this.conn = Conexao.getConnection();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ArrayList<Estoque> Listar() {
        ArrayList<Estoque> lista = new ArrayList<>();
        String SQL = "SELECT * FROM estoque ORDER BY item";
        try (PreparedStatement ps = conn.prepareStatement(SQL);
             ResultSet rs = ps.executeQuery()) {
            
            while (rs.next()) {
                lista.add(new Estoque(
                        rs.getInt("codigo"),
                        rs.getString("item"),
                        rs.getString("unidade"),
                        rs.getFloat("preco"),
                        rs.getInt("ID_fornecedor")
                ));
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro ao listar estoque: " + sqle);
        }
        return lista;
    }
    
    public void Inserir(Estoque e) throws SQLException {
        String SQL = "INSERT INTO estoque (item, unidade, preco, ID_fornecedor) VALUES (?,?,?,?)";
        try (PreparedStatement ps = conn.prepareStatement(SQL)) {
            ps.setString(1, e.getItem());
            ps.setString(2, e.getUnidade());
            ps.setFloat(3, e.getPreco());
            ps.setInt(4, e.getID_fornecedor());
            ps.executeUpdate();
        }
    }

    // arttualizar item
    public void Atualizar(Estoque e) throws SQLException {
        String SQL = "UPDATE estoque SET item=?, unidade=?, preco=?, ID_fornecedor=? WHERE codigo=?";
        try (PreparedStatement ps = conn.prepareStatement(SQL)) {
            ps.setString(1, e.getItem());
            ps.setString(2, e.getUnidade());
            ps.setFloat(3, e.getPreco());
            ps.setInt(4, e.getID_fornecedor());
            ps.setInt(5, e.getCodigo());
            ps.executeUpdate();
        }
    }

    public void ExcluirComDependencias(int codigo) throws SQLException {
        Connection con = null;
        PreparedStatement psPedido = null;
        PreparedStatement psEstoque = null;

        try {
            con = Conexao.getConnection();
            con.setAutoCommit(false);

            // apaga pedidos ddo item
            String sqlPedido = "DELETE FROM pedido WHERE codigo_item = ?";
            psPedido = con.prepareStatement(sqlPedido);
            psPedido.setInt(1, codigo);
            psPedido.executeUpdate();

            // a´[aga o item
            String sqlEstoque = "DELETE FROM estoque WHERE codigo = ?";
            psEstoque = con.prepareStatement(sqlEstoque);
            psEstoque.setInt(1, codigo);
            psEstoque.executeUpdate();

            con.commit();
        } catch (SQLException e) {
            if (con != null) con.rollback();
            throw new SQLException("Erro ao excluir item do estoque com dependências: " + e.getMessage(), e);
        } finally {
            if (psPedido != null) psPedido.close();
            if (psEstoque != null) psEstoque.close();
            if (con != null) con.close();
        }
    }

    public Estoque Procurar(int codigo) {
        Estoque e = null;
        String SQL = "SELECT * FROM estoque WHERE codigo=?";
        try (PreparedStatement ps = conn.prepareStatement(SQL)) {
            ps.setInt(1, codigo);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    e = new Estoque(
                            rs.getInt("codigo"),
                            rs.getString("item"),
                            rs.getString("unidade"),
                            rs.getFloat("preco"),
                            rs.getInt("ID_fornecedor")
                    );
                }
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro ao procurar item: " + sqle);
        }
        return e;
    }
}