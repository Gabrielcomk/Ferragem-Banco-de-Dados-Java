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
            String SQL = "INSERT INTO clientes (ID_Cliente, nome, sexo, data_nasc, endereco, numero, complemento, bairro, cidade, fone1, fone2) "
                    + "values (?,?,?,?,?,?,?,?,?,?,?)";
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
        PreparedStatement ps = null;
        Connection connL = null;
        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "O objeto cliente não pode ser nulo.");
        }
        String SQL = "UPDATE clientes set nome=?, sexo=?, data_nasc=?, endereco=?, numero=?, complemento=?, bairro=?, cidade=?, fone1=?, fone2=? WHERE ID_Cliente=?";
        try{
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
        } catch (SQLException sqle){
            throw new ErpDAOException("Erro ao editar o paciente " + sqle);
        } finally{
            Conexao.close(connL, ps);
        }
    }
    
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
    

} // fim clientesDAO (Classe inteira)
