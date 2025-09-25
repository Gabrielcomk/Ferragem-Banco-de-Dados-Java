package Classes;

public class Pedido {
    private int codigo_item;
    private int NR_NF;
    private int quantidade;
    private String nomeItem;
    private double preco;  

    public Pedido(int codigo_item, int NR_NF, int quantidade, String nomeItem) {
        this.codigo_item = codigo_item;
        this.NR_NF = NR_NF;
        this.quantidade = quantidade;
        this.nomeItem = nomeItem;
    }
    
    public Pedido(int codigo_item, int NR_NF, int quantidade, String nomeItem, double preco, double valorTotal) {
        this.codigo_item = codigo_item;
        this.NR_NF = NR_NF;
        this.quantidade = quantidade;
        this.nomeItem = nomeItem;
        this.preco = preco;
        this.valorTotal = valorTotal;
    }
    
     public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
    

    private double valorTotal;
public Pedido(int codigo_item, int NR_NF, int quantidade, String nomeItem, double valorTotal) {
    this.codigo_item = codigo_item;
    this.NR_NF = NR_NF;
    this.quantidade = quantidade;
    this.nomeItem = nomeItem;
    this.valorTotal = valorTotal;
}


    public Pedido() {
    }

    public int getCodigo_item() { return codigo_item; }
    public void setCodigo_item(int codigo_item) { this.codigo_item = codigo_item; }

    public int getNR_NF() { return NR_NF; }
    public void setNR_NF(int NR_NF) { this.NR_NF = NR_NF; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public String getNomeItem() { return nomeItem; }
    public void setNomeItem(String nomeItem) { this.nomeItem = nomeItem; }
    
    public double getValorTotal() { return valorTotal; }
public void setValorTotal(double valorTotal) { this.valorTotal = valorTotal; }
}