package com.mycompany.agregacao;

//Importa a classe ArrayList, usada para guardar uma lista de funcionários
import java.util.ArrayList;

public class Empresa {
    private String nome;
    
    //Lista que vai armazenar os objetos do tipo Funcionario
    private ArrayList<Funcionario> funcionarios;

    public Empresa(String nome) {
        this.nome = nome;
        
        //Cria um ArrayList vazio para armazenar funcionários
        this.funcionarios = new ArrayList<>();
    }
    
    //Método para adicionar um funcionário à empresa
    //Recebe um Funcionario como parâmetro e o adiciona à lista funcionarios
    public void adicionarFuncionario(Funcionario f){
        funcionarios.add(f);
    }

    //Método que exibe todos os funcionários da empresa
    public void listarFuncionarios(){
        
        //Primeiro imprime o nome da empresa
        System.out.println("Funcionario da empresa " + nome + ":");
        
        //Esse laço for percorre a lista de funcionários
        for(Funcionario f : funcionarios){
            
            //Para cada funcionário, imprime o nome e o cargo
            System.out.println("- " + f.getNome() + " | Cargo: " + f.getCargo());
        }
    }
    
    
}
