package com.mycompany.cadastro;

public class Cadastro {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Maria", 18);
        Pessoa p2 = new Pessoa ("Joao", 19);
        
        System.out.println("Nome:" + p1.getNome());
        System.out.println("Idade:" + p1.getIdade());
        
        System.out.println("Nome:" + p2.getNome());
        System.out.println("Idade:" + p2.getIdade());
        
        //Caso eu queira mudar os valores de p1
        //p1.setNome("Joana");
        //p1.setIdade(19);
        
        System.out.println("Nome:" + p1.getNome());
        System.out.println("Idade:" + p1.getIdade());
    }
}
