package com.herancapolimorfismo.model;

public class Cachorro extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Cachorro latindo");
    }

    public void abanarRabo(){
        System.out.println("Cachorro abanando o rabo");
    }
}
