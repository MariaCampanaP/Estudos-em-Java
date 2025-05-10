package com.mycompany.aula11;

public class Aula11 {

    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(); -> errado
        
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        System.out.println("-----------");
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        System.out.println(a1.informacoes());
        
        System.out.println("----------");
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setMatricula(1112);
        b1.setBolsa(12.5f);
        b1.setIdade(18);
        b1.setSexo("M");
        b1.pagarMensalidade();
        System.out.println(b1.toString());
       
        System.out.println("----------");
        
        Professor p1 = new Professor();
        p1.setNome("Pedro");
        p1.setIdade(31);
        p1.setSexo("M");
        p1.setEspecialidade("Java POO");
        p1.setSalario(3200.09f);
        p1.receberAumento(90.0f);
        System.out.println(p1.toString());
        System.out.println(p1.informacoes());
        
        System.out.println("----------");
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Roberto");
        t1.setIdade(23);
        t1.setSexo("M");
        t1.setRegistroProfissional(123345);
        t1.praticar();
        System.out.println(t1.Registro());
        System.out.println(t1.toString());
        
    }
}
