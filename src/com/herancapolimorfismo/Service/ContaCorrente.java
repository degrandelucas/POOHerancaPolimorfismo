package com.herancapolimorfismo.Service;

import com.herancapolimorfismo.model.ContaBancaria;

public class ContaCorrente extends ContaBancaria {
    double tarifaMensal = 17.00;
    double tarifaSaque = 0.01;

    public void saqueContaCorrente(double valor) {
        double valorETarifaSaque = valor + (valor * tarifaSaque);
        super.sacar(valorETarifaSaque);
    }

    public void descontoTarifa(){
        desconto(tarifaMensal);
    }

}
