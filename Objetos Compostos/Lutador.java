package com.mycompany.aula07;

public class Lutador {
    
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //Métodos
    public void apresentar(){
        System.out.println("----------APRESENTACAO----------");
        System.out.println("Lutador:" + this.getNome());
        System.out.println("Origem:" + this.getNacionalidade());
        System.out.println("Idade:" + this.getIdade());
        System.out.println("Altura:" + this.getAltura() + "m de altura");
        System.out.println("Pesando:" + this.getPeso() + "Kg");
        System.out.println("Ganhou:" + this.getVitorias());
        System.out.println("Perdeu:" + this.getDerrotas());
        System.out.println("Empatou:" + this.getEmpates());
    }
    
    public void status(){
        System.out.println("----------STATUS----------");
        System.out.println("Lutador:" + this.getNome());
        System.out.println("Categoria:" + this.getCategoria());
        System.out.println("Vitorias:" + this.getVitorias());
        System.out.println("Perdeu:" + this.getDerrotas());
        System.out.println("Empatou:" + this.getEmpates());
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() - 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
    //Métodos Especiais 

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Invalido";
        }else if(this.peso <= 70.0){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Medio";
        }else if(this.peso <= 120.0){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }  
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
