package com.mycompany.iluminacao;

public class Iluminacao {

    public static void main(String[] args) {
        Lampada l1 = new Lampada();
        l1.ligar();
        l1.mostrarEstado();
        
        Lampada l2 = new Lampada();
        l2.desligar();
        l2.mostrarEstado();
    }
}
