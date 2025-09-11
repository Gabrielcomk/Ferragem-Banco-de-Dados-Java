
package Classes;

public class Estoque {
    
    public static int getSelectedIndex() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private int codigo;
    private String item;
    private String unidade;
    private float preco;
    private int ID_fornecedor;

    public Estoque(int codigo, String item, String unidade, float preco, int ID_fornecedor) {
        this.codigo = codigo;
        this.item = item;
        this.unidade = unidade;
        this.preco = preco;
        this.ID_fornecedor = ID_fornecedor;
    }

    public Estoque() {
    }

    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getID_fornecedor() {
        return ID_fornecedor;
    }

    public void setID_fornecedor(int ID_fornecedor) {
        this.ID_fornecedor = ID_fornecedor;
    }
    
    
    
}
