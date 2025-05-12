package com.mycompany.nivel1;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    public void mostrarDados(){
        System.out.println("Nome:" + this.nome + "\nIdade:" + this.idade + "\nSexo:" + this.sexo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    
    
}
