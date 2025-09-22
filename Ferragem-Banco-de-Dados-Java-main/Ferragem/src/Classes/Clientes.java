
package Classes;

import java.util.Date;

public class Clientes {

    public static int getSelectedIndex() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private int ID_Cliente;
    private String nome;
    private char sexo;
    private Date data_nasc;
    private String endereco;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private int fone1;
    private int fone2;
    
    public Clientes() {
    }

    public Clientes(int ID_Cliente, String nome, char sexo, Date data_nasc, String endereco, int numero, String complemento, String bairro, String cidade, int fone1, int fone2) {
        this.ID_Cliente = ID_Cliente;
        this.nome = nome;
        this.sexo = sexo;
        this.data_nasc = data_nasc;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.fone1 = fone1;
        this.fone2 = fone2;
    }

    public Clientes(int ID_Cliente, String nome, char sexo, java.sql.Date dataNasc, String endereco, int numero, String complemento, String bairro, String cidade, String fone1, String fone2) {
    this.ID_Cliente = ID_Cliente;
    this.nome = nome;
    this.sexo = sexo;
    this.data_nasc = dataNasc;
    this.endereco = endereco;
    this.numero = numero;
    this.complemento = complemento;
    this.bairro = bairro;
    this.cidade = cidade;

    try {
        this.fone1 = Integer.parseInt(fone1);
    } catch (NumberFormatException e) {
        this.fone1 = 0;
    }

    try {
        this.fone2 = Integer.parseInt(fone2);
    } catch (NumberFormatException e) {
        this.fone2 = 0;
    }
}

    
    
    
    
    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getFone1() {
        return fone1;
    }

    public void setFone1(int fone1) {
        this.fone1 = fone1;
    }

    public int getFone2() {
        return fone2;
    }

    public void setFone2(int fone2) {
        this.fone2 = fone2;
    }
    
    
    
}
