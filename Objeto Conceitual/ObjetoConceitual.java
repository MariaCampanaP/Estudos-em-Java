package com.mycompany.objetoconceitual;

public class ObjetoConceitual {

    public static void main(String[] args) {
        Dormir d1 = new Dormir();
        d1.hora = 22;
        d1.corLencol = "Cinza";
        d1.coberta = "Bege";
        d1.bichinhoPelucia = 2;
        
        d1.cobrir();
        d1.dormir();
        d1.status();
        
        Dormir d2 = new Dormir();
        d2.hora = 23;
        d2.corLencol = "Caramelo";
        d2.coberta = "Ciano";
        d2.bichinhoPelucia = 3;
        d2.edredom = true;
        d2.olhosFechados = true;
        
        d2.cobrir();
        d2.dormir();
        d2.status();
    }
}
