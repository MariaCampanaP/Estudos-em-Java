package com.mycompany.aula13;

public class Aula13 {

    public static void main(String[] args) {
        
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
        
        System.out.println("-----Lobo-----");
        System.out.println(" ");
        l.emitirSom();
        System.out.println(" ");
        
        System.out.println("-----Cachorro-----");
        System.out.println(" ");
        c.reagir("Ola");
        c.reagir(10,45);
        c.reagir(true);
        c.reagir(2, 12.5f);
        
        
    }
}
