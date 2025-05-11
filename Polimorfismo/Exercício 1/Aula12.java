package com.mycompany.aula12;

public class Aula12 {

    public static void main(String[] args) {
        
       //Mamiferos
       Mamifero m = new Mamifero();
       Canguru c = new Canguru();
       Cachorro k = new Cachorro();
       
       //Repteis
       Reptil r = new Reptil();
       Cobra j = new Cobra();
       Tartaruga t = new Tartaruga();
       
       //Peixes
       Peixe p = new Peixe();
       GoldFish g = new GoldFish();
       
       //Aves
       Ave a = new Ave();
       Arara b = new Arara();
        
       System.out.println("-----Mamifero-----");
       System.out.println(" ");
       m.setPeso(85.3f);
       m.setIdade(2);
       m.setMembros(4);
       m.locomover();
       m.alimentar();
       m.emitirSom();
       System.out.println(" ");

       System.out.println("-----Canguru-----");
       System.out.println(" ");
       c.setCorPelo("Caramelo");
       System.out.println("Cor do Pelo: " + c.getCorPelo());
       c.setPeso(55.30f);
       System.out.println("Peso: " + c.getPeso());
       c.setIdade(3);
       System.out.println("Idade: " + c.getIdade());
       c.setMembros(4);
       System.out.println("Quantidade de membros: " + c.getMembros());
       c.locomover();
       c.alimentar();
       c.emitirSom();
       c.usarBolsa();
       System.out.println(" ");

       System.out.println("-----Cachorro-----");
       System.out.println(" ");
       k.setCorPelo("Caramelo");
       System.out.println("Cor do Pelo: " + k.getCorPelo());
       k.setPeso(3.94f);
       System.out.println("Peso: " + k.getPeso());
       k.setIdade(5);
       System.out.println("Idade: " + k.getIdade());
       k.setMembros(4);
       System.out.println("Quantidade de membros: " + k.getMembros());
       k.locomover();
       k.alimentar();
       k.emitirSom();
       k.abanarRabo();
       System.out.println(" ");

       System.out.println("-----Reptil-----");
       System.out.println(" ");
       r.setPeso(35.0f);
       r.setIdade(1);
       r.setMembros(4);
       r.locomover();
       r.alimentar();
       r.emitirSom();
       System.out.println(" ");

       System.out.println("-----Cobra-----");
       System.out.println(" ");
       j.setCorEscama("Verde");
       System.out.println("Cor da Escama: " + j.getCorEscama());
       j.setPeso(2.5f);
       System.out.println("Peso: " + j.getPeso());
       j.setIdade(4);
       System.out.println("Idade: "  + j.getIdade());
       j.setMembros(0);
       System.out.println("Quantidade de membros: " + j.getMembros());
       j.locomover();
       j.alimentar();
       j.emitirSom();
       System.out.println(" ");

       System.out.println("-----Tartauga-----");
       System.out.println(" ");
       t.setCorEscama("Verde");
       System.out.println("Cor do Casco: " + t.getCorEscama());
       t.setPeso(12.00f);
       System.out.println("Peso: " + t.getPeso());
       t.setIdade(30);
       System.out.println("Idade: "  + t.getIdade());
       t.setMembros(4);
       System.out.println("Quantidade de membros: " + t.getMembros());
       t.locomover();
       t.alimentar();
       t.emitirSom();
       System.out.println(" ");

       System.out.println("-----Peixe-----");
       System.out.println(" ");
       p.setPeso(0.35f);
       p.setIdade(1);
       p.setMembros(0);
       p.locomover();
       p.alimentar();
       p.emitirSom();
       p.soltarBolha();
       System.out.println(" ");

       System.out.println("-----Gold Fish-----");
       System.out.println(" ");
       g.setCorEscama("Dourado");
       System.out.println("Cor da Escama: " + g.getCorEscama());
       g.setPeso(0.1f);
       System.out.println("Peso: " + g.getPeso());
       g.setIdade(2);
       System.out.println("Idade: "  + g.getIdade());
       g.setMembros(0);
       System.out.println("Quantidade de membros: " + g.getMembros());
       g.locomover();
       g.alimentar();
       g.emitirSom();
       g.soltarBolha();
       System.out.println(" ");
 
       System.out.println("-----Ave-----");
       System.out.println(" ");
       a.setPeso(0.90f);
       a.setIdade(4);
       a.setMembros(4);
       a.locomover();
       a.alimentar();
       a.emitirSom();
       a.fazerNinho();
       System.out.println(" ");
       
       System.out.println("-----Arara-----");
       System.out.println(" ");
       b.setCorPena("Vermelha");
       System.out.println("Cor das Penas: " + b.getCorPena());
       b.setPeso(1.2f);
       System.out.println("Peso: " + b.getPeso());
       b.setIdade(5);
       System.out.println("Idade: " + b.getIdade());
       b.setMembros(4);
       System.out.println("Quantidade de membros: " + b.getMembros());
       b.locomover();
       b.alimentar();
       b.emitirSom();
       b.fazerNinho();
       System.out.println(" ");
       
       
    }
}
