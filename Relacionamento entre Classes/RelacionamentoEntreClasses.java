package com.mycompany.relacionamentoentreclasses;

public class RelacionamentoEntreClasses {

    public static void main(String[] args) {
        Autor a1 = new Autor();
        
        a1.setNome("Edgar Allan Poe");
        a1.setNacionalidade("Estadunidense");
        
        Livro l1 = new Livro();
        
        l1.setTitulo("O corvo");
        l1.setAno(1845);
        l1.setAutor(a1);
        
        l1.exibirDetalhes();
                
    }
}
