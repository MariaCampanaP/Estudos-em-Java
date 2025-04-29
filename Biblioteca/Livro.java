package com.mycompany.biblioteca;

public class Livro {
    private String titulo = "Dom Casmurro";
    private String autor = "Machado de Assis";
    
    public void mostrarLivro(){
        System.out.println("Nome do livro:" + this.titulo);
        System.out.println("Nome do autor:" + this.autor);
    }
}
