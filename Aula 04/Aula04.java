package com.mycompany.aula04;

public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("Stabilo", "Preta", 0.5f);
        c1.status();
        
        Caneta c2 = new Caneta("Oswaldo", "Branca", 0.1f);
        c2.status();
        
        //c1.setModelo("Bic");
        //c1.modelo = "BIC";
        
        //c1.setPonta(0.5f);
        //c1.ponta = 0.5f;
        
        //System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
    }
}
