package com.mycompany.validacaoemsetters;

public class ValidacaoEmSetters {

    public static void main(String[] args) {
        Produto p1 = new Produto("Arroz", 100);
        
        System.out.println("O item comprado foi:" + p1.getNome());
        System.out.println("O preco do item comprado foi R$" + p1.getPreco());
    }
}
