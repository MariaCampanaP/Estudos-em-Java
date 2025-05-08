package com.mycompany.aula09;

public class Aula09 {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");
        
        l[0] = new Livro("Memorias Postumas de Bras Cubas", "Machado de Assis", 368, p[0]);
        l[1] = new Livro("O pequeno principe", "Antoine de Saint-Exupery", 96, p[1]);
        l[2] = new Livro("It - A coisa", "Stephen King", 1104, p[1]);
        
        l[0].abrir();
        l[0].folhear(300);
        System.out.println(l[0].detalhes());
        

    }
}
