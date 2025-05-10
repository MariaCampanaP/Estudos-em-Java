package com.mycompany.relacionamentoentreclasses;

public class Livro {
    private String titulo;
    private int ano;
    private Autor autor;
    
    public void exibirDetalhes(){
        System.out.println("Nome do autor:" + this.autor.getNome());
        System.out.println("Nacionalidade do autor:" + this.autor.getNacionalidade());
        System.out.println("Titulo do livro:" + getTitulo());
        System.out.println("Ano de publicacao do livro:" + getAno());
               
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
}
