package com.mycompany.nivel2;

import java.util.Scanner;

public class Nivel2 {

    public static void main(String[] args) {
        
        Produto p1 = new Produto("Macarrao", 34.5f, 3);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o desconto:");
        float desconto = sc.nextFloat();
        p1.aplicarDesconto(desconto);
        
        System.out.println("Preco com desconto: " + p1.getPreco());
    }
}
