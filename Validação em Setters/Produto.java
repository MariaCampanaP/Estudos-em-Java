package com.mycompany.validacaoemsetters;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        setPreco(preco); //Usa o setter para validar o preço
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco > 0){
            this.preco = preco; //atribui o valor válido ao atributo
            System.out.println("Preco valido");
        }else{
            System.out.println("Preco invalido");
        }
    }
}
