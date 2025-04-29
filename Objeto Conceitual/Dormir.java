package com.mycompany.objetoconceitual;

public class Dormir {
    int hora;
    String corLencol;
    String coberta;
    int bichinhoPelucia;
    boolean edredom;
    boolean olhosFechados;
    
    void status(){
        System.out.println("Em que horas voce se deita?:" + this.hora);
        System.out.println("Qual a cor do seu lencol?:" + this.corLencol);
        System.out.println("Qual a cor do seu cobertor?:" + this.coberta);
        System.out.println("Quantos bichinho de pelucia tem na sua cama?:" + this.bichinhoPelucia);
    }
    
    void cobrir(){
        if(this.edredom == true){
            System.out.println("Voce pode se cobrir!");
        }else{
            System.out.println("Voce nao pode se cobrir!");
        }
    }
    
    void dormir(){
        if(this.olhosFechados == true){
            System.out.println("Pabens, voce esta mimindo!");
        }else{
            System.out.println("Mona, voce esta com insonia?");
        }
    
    }
}
