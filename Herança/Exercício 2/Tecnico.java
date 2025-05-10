package com.mycompany.aula11;

public class Tecnico extends Aluno {
    int registroProfissional;
    
    public void praticar(){
        System.out.println("O tecnico " + this.nome + " esta praticando suas habilidades!");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public String Registro() {
        return "Tecnico{" + "Registro Profissional = " + registroProfissional + '}';
    }
    
    
}
