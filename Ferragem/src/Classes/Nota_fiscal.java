/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

public class Nota_fiscal {
    private int NF;
    private Date data;
    private int ID_entrega;
    private int ID_cliente;

    
    
    public int getNF() {
        return NF;
    }

    public void setNF(int NF) {
        this.NF = NF;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getID_entrega() {
        return ID_entrega;
    }

    public void setID_entrega(int ID_entrega) {
        this.ID_entrega = ID_entrega;
    }

    public int getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(int ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    public Nota_fiscal(int NF, Date data, int ID_entrega, int ID_cliente) {
        this.NF = NF;
        this.data = data;
        this.ID_entrega = ID_entrega;
        this.ID_cliente = ID_cliente;
    }

    public Nota_fiscal() {
    }
    
    
}
