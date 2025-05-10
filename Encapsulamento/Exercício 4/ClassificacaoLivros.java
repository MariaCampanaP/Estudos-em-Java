package com.mycompany.classificacaolivros;

public class ClassificacaoLivros {

    public static void main(String[] args) {
        Livro l1 = new Livro("Coraline", "Neil Gaiman", 163);
        System.out.println(l1.getDescricao());
        
        Livro l2 = new Livro("Dracula", "Bram Stoker", 418);
        //System.out.println(l2.getDescricao());
        
        l2.setAutor("Junji Ito");
        l2.setTitulo("A sala de aula que derreteu");
        l2.setPaginas(188);
        System.out.println(l2.getDescricao());
    }
}
