package com.herancapolimorfismo.model;

public class ContaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double valor){
        setSaldo(getSaldo() + valor);
    }

    public void sacar(double valor){
        if (valor <= getSaldo()){
            setSaldo(getSaldo() - valor);
            System.out.println("Operação realizada com Sucesso");
            consultaSaldo();
        }
        else
            System.out.println("Você não tem saldo suficiente!");
    }

    public void consultaSaldo(){
        System.out.println("Seu saldo atual é: "+ getSaldo());
    }

    public void desconto(double valor){
        setSaldo(getSaldo() - valor);
    }

}
