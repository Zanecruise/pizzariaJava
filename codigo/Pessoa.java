package com.mycompany.pizzaria;

public class Pessoa{
    
    String nome;
    String cpf;
    String rg;
    String telefone;
    
    Endereco endereco;
    
    public Pessoa() {
        endereco = new Endereco();
    }
    public Pessoa(boolean notAdress) {
        //endereco = new Endereco();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return endereco.getCidade();
    }

    public void setCidade(String cidade) {
        this.endereco.setCidade(cidade);
    }

    public String getRua() {
        return endereco.getRua();
    }

    public void setRua(String rua) {
        this.endereco.setRua(rua);
    }

    public String getBairro() {
        return endereco.getBairro();
    }

    public void setBairro(String bairro) {
        this.endereco.setBairro(bairro);
    }

    public String getNumero() {
        return endereco.getNumero();
    }

    public void setNumero(String numero) {
        this.endereco.setNumero(numero);
    }
    
    
    
    @Override
    public String toString() {
    return "Nome: " + nome + "\nCPF: " + cpf + "\nRG: " + rg + "\nTelefone: " + telefone + "\nCidade: " + endereco.getCidade() + "\nRua: " + endereco.getRua() + "\nBairro: " + endereco.getBairro() + "\nNumero: " + endereco.getNumero();
}
    public String toString(boolean notAdress) {
    return "Nome: " + nome + "\nCPF: " + cpf + "\nRG: " + rg + "\nTelefone: " + telefone;
}


}
