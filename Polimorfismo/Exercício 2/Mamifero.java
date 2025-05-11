package com.mycompany.aula13;

public class Mamifero extends Animal{
    protected String CorPelo;
    
    @Override
    public void emitirSom(){
        System.out.println("Som de mamifero");
    }

    public String getCorPelo() {
        return CorPelo;
    }

    public void setCorPelo(String CorPelo) {
        this.CorPelo = CorPelo;
    }
    
}
