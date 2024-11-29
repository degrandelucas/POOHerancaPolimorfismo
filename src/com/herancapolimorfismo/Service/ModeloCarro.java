package com.herancapolimorfismo.Service;

import com.herancapolimorfismo.model.Carro;

public class ModeloCarro extends Carro {
    private String tipoCombustivel;

    // Construtor que inicializa (necessario novamente, quando não é o construtor padrão na classe super) e tipoCombustivel
    public ModeloCarro(String modelo, double precoAno1, double precoAno2, double precoAno3, String tipoCombustivel) {
        super(modelo, precoAno1, precoAno2, precoAno3); // Chama o outro construtor da subclasse
        this.tipoCombustivel = tipoCombustivel;
    }

    // Método adicional para exibir informações
    public void exibirInformacoes() {
        System.out.println("Modelo: " + getModelo()); // Nessecário o get porque modelo é private
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
        System.out.println("Preço Ano 1: " + getPrecoAno1());
        System.out.println("Preço Ano 2: " + getPrecoAno2());
        System.out.println("Preço Ano 3: " + getPrecoAno3());
    }

    @Override
    public double informaMenorValorNoPeriodo() {
        // Math.min comparar os preços diretamente, retornando o menor
        return Math.min(getPrecoAno1(), Math.min(getPrecoAno2(), getPrecoAno3()));
    }
}
