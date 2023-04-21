package com.mycompany.pizzaria;

public class Bebida {
   
    private String item;
    private float valor;
    private int codigo;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String toString() {
    return "Bebida{" + "sabor='" + item + '\'' + ", valor=" + valor + ", codigo=" + codigo + '}';
}
    
}
