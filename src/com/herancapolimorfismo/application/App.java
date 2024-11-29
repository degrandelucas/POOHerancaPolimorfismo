package com.herancapolimorfismo.application;

import com.herancapolimorfismo.Service.ModeloCarro;
import com.herancapolimorfismo.model.Carro;

public class App {
    public static void main(String[] args) {
        //Exercicio 1 Classe Carro
        Carro meucarro = new ModeloCarro("HB20", 65000, 56000, 57500, "Gasolina");
        double menorValor = meucarro.informaMenorValorNoPeriodo();
        System.out.println(String.format("O menor valor do %s foi de R$ %.2f", meucarro.getModelo(), menorValor));

        //Exercicio 2 Classe Animal
    }
}