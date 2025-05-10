package com.mycompany.agregacao;

public class Agregacao {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario ("Maria", "Analista de Sistemas");
        Funcionario f2 = new Funcionario ("Joao", "Desenvolvedor");
        
        //Mostra no console que a Maria é um funcionário independente, ou seja, existe fora da empresa
        System.out.println(f1.getNome() + " e um funcionario independente."); 
        
        //Criação de uma empresa chamada "Tech Solutions", cuja qual começa com uma lista de funcionários vazia
        Empresa empresa = new Empresa("Tech Solutions");
        
        //Maria (f1) é adicionada à lista de funcionários da empresa
        //Ela já existia antes. A empresa só está "agregando" ela agora
        empresa.adicionarFuncionario(f1);
        
        //O mesmo acontece com o João (f2). Ele também é adicionado à empresa
        empresa.adicionarFuncionario(f2);
        
        //Este método exibi todos os funcionários da empresa, imprimindo seus nomes e cargos
        empresa.listarFuncionarios();
    }
}
