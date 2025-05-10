package com.mycompany.encapsulamento;

public class Encapsulamento {

    public static void main(String[] args) {
        
        Produto p1 = new Produto();
        p1.setNome("Arroz");
        p1.setPreco(-34.90f);
        p1.setQuantidade(-9);
        p1.exibirInformacoes();
    }
}
