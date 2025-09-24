/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;


public class Entregador {
    private int ID_entregador;
    private String nome;
    private String contato;

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

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Entregador() {
    }

    public Entregador(int ID_entregador, String nome, String contato) {
        this.ID_entregador = ID_entregador;
        this.nome = nome;
        this.contato = contato;
    }
    
    
}
