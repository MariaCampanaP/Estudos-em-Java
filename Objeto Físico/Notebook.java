package com.mycompany.objetofisico;

public class Notebook {
    String modelo;
    String cor;
    int bateria;
    String linguagemTeclado;
    String placaVideo;
    boolean ligado;
    
    void status(){
        System.out.println("Marca: " + this.modelo);
        System.out.println("Bateria: " + this.bateria);
        System.out.println("Tipo de Teclado: " + this.linguagemTeclado);
        System.out.println("Placa de Video: " + this.placaVideo);
        System.out.println("Esta ligado? " + this.ligado);
    }
    
    void digitar(){
        if(this.ligado == true){
            System.out.println("Pode digitar!");
        }else{
            System.out.println("Nao e possivel digitar!");
        }
    }
    
    void ligar(){
       this.ligado = true;
    }
    
    void desligar(){
        this.ligado = false;
    }
}
