package com.mycompany.encapsulamento;

public class Produto {
    private String nome;
    private float preco;
    private int quantidade;
    
    public void exibirInformacoes(){
        System.out.println("Nome do produto:" + this.getNome());
        System.out.println("Preco do produto R$" + this.getPreco());
        System.out.println("Quantidade do produto:" + this.getQuantidade());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if(preco < 0){
            System.out.println("Preco invalido");
        }else{
            this.preco = preco;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade < 0){
            System.out.println("Quantidade invalida");
        }else{
            this.quantidade = quantidade;
        }
    }
    
    
}
