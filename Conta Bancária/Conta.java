package com.mycompany.aula05;

public class Conta {
    public int numConta;
    protected String tipoConta;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void abrirConta(String tipoConta){ 
        setTipoConta(tipoConta);
        setStatus(true);
        
        if(tipoConta.equals("CC")){
           saldo = 50;
        }else{
            saldo = 150;
        }
    }
    
    public void fecharConta(){
        if(saldo > 0){
            System.out.println("Ainda possui dinheiro e nao pode ser fechada");
        }else if (saldo < 0){
            System.out.println("Voce esta devendo, logo nao pode fechar");
        }else{
            setStatus(false);
        }
    }

   public Conta() {
        this.saldo = saldo = 0;
        this.status = status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void depositar(float valor){
        if(status == true){
            saldo = saldo + valor;
        }else{
            System.out.println("Sua conta esta fechada");
    }
   }
    
    public void sacar(float saque){
        if(status == true){
            if(saldo > saque){
                saldo = saldo - saque;
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossivel Sacar");
        }
    }
    
    public void pagarMensalidade(){
        float valor;
        
        if(tipoConta.equals("CC")){
            valor = 12;
        }else{
            valor = 20;
        }
        
        if(status == true){
           if(saldo > valor){
               saldo = saldo - valor;
           }else{
               System.out.println("Saldo insuficiente");
           }
        }else{
            System.out.println("Impossivel cobrar");
        }
    }
    
    public void estadoAtual(){
        System.out.println("--------------------------");
        System.out.println("Conta:" + this.getNumConta());
        System.out.println("Tipo:" + this.getTipoConta());
        System.out.println("Dono:" + this.getDono());
        System.out.println("Saldo:" + this.getSaldo());
        System.out.println("Status:" + this.getStatus());
    }
}