
package Classes;


public class fones_forn {
    private int ID_fornecedor;
    private int DDD;
    private int numero;

    public fones_forn(int ID_fornecedor, int DDD, int numero) {
        this.ID_fornecedor = ID_fornecedor;
        this.DDD = DDD;
        this.numero = numero;
    }

    public fones_forn() {
    }

    
    
    public int getID_fornecedor() {
        return ID_fornecedor;
    }

    public void setID_fornecedor(int ID_fornecedor) {
        this.ID_fornecedor = ID_fornecedor;
    }

    public int getDDD() {
        return DDD;
    }

    public void setDDD(int DDD) {
        this.DDD = DDD;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
