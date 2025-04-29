package com.mycompany.objetofisico;

public class ObjetoFisico {

    public static void main(String[] args) {
        //Atributos
        Notebook n1 = new Notebook();
        n1.modelo = "Acer Nitro";
        n1.cor = "Preto";
        n1.bateria = 19;
        n1.linguagemTeclado = "ABNT2";
        n1.placaVideo = "RTX3050";
        
        //Metodos
        n1.ligar();
        n1.digitar();
        n1.status();
        
        //Atributos
        Notebook n2 = new Notebook();
        n2.modelo = "Positvo";
        n2.cor = "Cinza";
        n2.bateria = 0;
        n2.linguagemTeclado = "ABNT";
        n2.placaVideo = "AMD";
        
        //Metodos contém chaves 
        n2.desligar();
        n2.digitar();
        n2.status();
        
    }
}
