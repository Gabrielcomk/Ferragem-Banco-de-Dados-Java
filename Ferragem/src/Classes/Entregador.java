
package Classes;

public class Entregador {
    private int ID_entregador;
    private String nome;
    private int contato;

    public Entregador(int ID_entregador, String nome, int contato) {
        this.ID_entregador = ID_entregador;
        this.nome = nome;
        this.contato = contato;
    }

    public Entregador() {
    }

    
    public int getID_entregador() {
        return ID_entregador;
    }

    public void setID_entregador(int ID_entregador) {
        this.ID_entregador = ID_entregador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getContato() {
        return contato;
    }

    public void setContato(int contato) {
        this.contato = contato;
    }
    
    
    
}
