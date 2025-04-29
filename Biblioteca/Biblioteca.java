package com.mycompany.biblioteca;

public class Biblioteca {

    public static void main(String[] args) {
        Livro l1 = new Livro();
        
        //Essas linhas vão dar erro de compilação porque os atributos são privados
        //l1.titulo = Noites Brancas;
        //l1.autor = Fiódor Dostoiévski ;
        
        l1.mostrarLivro();
    }
}
