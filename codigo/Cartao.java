package com.mycompany.pizzaria;

public class Cartao {
    
    private String nome;
    private String cvc;
    private String validade;
    private String numero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String toString() {
        return "Numero do cartao: " + this.numero + "\n" + "Nome no cartao: " + this.nome + "\n" + "Validade: " + this.validade + "\n" + "CVC: " + this.cvc;
    }
    
    
}
