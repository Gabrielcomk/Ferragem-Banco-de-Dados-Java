package Classes;

public class Fones_forn {
    private int idFornecedor;
    private int ddd;
    private int numero;
    private String nomeFornecedor;

    public Fones_forn(int idFornecedor, int ddd, int numero, String nomeFornecedor) {
        this.idFornecedor = idFornecedor;
        this.ddd = ddd;
        this.numero = numero;
        this.nomeFornecedor = nomeFornecedor;
    }

    public int getIdFornecedor() { return idFornecedor; }
    public int getDdd() { return ddd; }
    public int getNumero() { return numero; }
    public String getNomeFornecedor() { return nomeFornecedor; }

    public void setIdFornecedor(int idFornecedor) { this.idFornecedor = idFornecedor; }
    public void setDdd(int ddd) { this.ddd = ddd; }
    public void setNumero(int numero) { this.numero = numero; }
    public void setNomeFornecedor(String nomeFornecedor) { this.nomeFornecedor = nomeFornecedor; }
}