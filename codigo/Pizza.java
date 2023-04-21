package com.mycompany.pizzaria;

public class Pizza {
   
    private String sabor;
    private float valor;
    private int codigo;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
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
    return "Pizza{" + "sabor='" + sabor + '\'' + ", valor=" + valor + ", codigo=" + codigo + '}';
}
    
}
