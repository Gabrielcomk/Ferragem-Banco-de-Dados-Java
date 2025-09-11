
package Classes;

public class Pedido {
    
    private int codigo_item;
    private int NR_NF;
    private int quantidade;

    public Pedido(int codigo_item, int NR_NF, int quantidade) {
        this.codigo_item = codigo_item;
        this.NR_NF = NR_NF;
        this.quantidade = quantidade;
    }

    public Pedido() {
    }

    
    
    
    public int getCodigo_item() {
        return codigo_item;
    }

    public void setCodigo_item(int codigo_item) {
        this.codigo_item = codigo_item;
    }

    public int getNR_NF() {
        return NR_NF;
    }

    public void setNR_NF(int NR_NF) {
        this.NR_NF = NR_NF;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
