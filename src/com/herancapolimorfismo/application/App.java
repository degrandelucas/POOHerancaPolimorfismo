package com.herancapolimorfismo.application;

import com.herancapolimorfismo.Service.ContaCorrente;
import com.herancapolimorfismo.Service.ModeloCarro;
import com.herancapolimorfismo.model.*;

public class App {
    public static void main(String[] args) {
        //Exercicio 1 Classe Carro
        Carro meucarro = new ModeloCarro("HB20", 65000, 56000, 57500, "Gasolina");
        double menorValor = meucarro.informaMenorValorNoPeriodo();
        System.out.println(String.format("O menor valor do %s foi de R$ %.2f", meucarro.getModelo(), menorValor));

        System.out.println("");

        //Exercicio 2 Classe Animal
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        cachorro.emitirSom();
        cachorro.abanarRabo();
        gato.emitirSom();
        gato.arranharMoveis();

        System.out.println("");

        //Exercicio 3 Classe ContaBancaria
        ContaCorrente conta1 = new ContaCorrente();
        conta1.deposita(500);
        conta1.saqueContaCorrente(100);
        conta1.descontoTarifa();
        conta1.consultaSaldo();

    }
}