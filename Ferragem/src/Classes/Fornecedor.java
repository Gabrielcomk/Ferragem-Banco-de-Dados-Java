
package Classes;

public class Fornecedor {
     public static int getSelectedIndex() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private int ID_Forn;
    private String fornecedor;
    private String endereco;
    private int nr;
    private String complemento;
    private String bairro;
    private String cidade;

    public int getID_Forn() {
        return ID_Forn;
    }

    public void setID_Forn(int ID_Forn) {
        this.ID_Forn = ID_Forn;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
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

    public Fornecedor(int ID_Forn, String fornecedor, String endereco, int nr, String complemento, String bairro, String cidade) {
        this.ID_Forn = ID_Forn;
        this.fornecedor = fornecedor;
        this.endereco = endereco;
        this.nr = nr;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public Fornecedor() {
    }
    
    
}
