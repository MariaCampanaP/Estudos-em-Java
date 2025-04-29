package com.mycompany.iluminacao;

public class Lampada {
    boolean ligada = false;
    
    void ligar(){
        ligada = true;
    }
    
    void desligar(){
        ligada = false;
    }
    
    void mostrarEstado(){
        if(ligada){
            System.out.println("Ligada");
        }else{
            System.out.println("Desligada");
        }
    }
    
}
