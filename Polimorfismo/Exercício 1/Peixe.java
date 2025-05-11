package com.mycompany.aula12;

public class Peixe extends Animal{
    private String corEscama;
    
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Nadar");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de peixe");
    }
    
}
