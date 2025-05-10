package com.mycompany.geometria;

public class Geometria {

    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        c1.setRaio(4);
        c1.calcularArea();
        double area = c1.calcularArea();
        System.out.printf("Area do circulo de raio %.2f: %.2f", c1.getRaio(), area);
        
        System.out.println(" ");
        
        Retangulo r1 = new Retangulo();
        r1.setAltura(4);
        r1.setBase(4);
        double areaRetangulo = r1.calcularArea();
        System.out.printf("Area do retangulo e: %.2f", areaRetangulo);
    }
}
