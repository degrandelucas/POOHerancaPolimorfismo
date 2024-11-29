package com.herancapolimorfismo.model;

public class Carro {
    private String modelo;
    protected double precoAno1;
    protected double precoAno2;
    protected double precoAno3;

    public Carro(String modelo,double precoAno1, double precoAno2, double precoAno3) {
        this.modelo = modelo;
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public Carro() {

    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecoAno1() {
        return precoAno1 > 0 ? precoAno1 : 0; // garante valor não negativo
    }

    public double getPrecoAno2() {
        return precoAno2 > 0 ? precoAno2 : 0; // garante valor não negativo
    }

    public double getPrecoAno3() {
        return precoAno3 > 0 ? precoAno3 : 0; // garante valor não negativo
    }

    public double informaMenorValorNoPeriodo() {
        return 0;
    }
}
