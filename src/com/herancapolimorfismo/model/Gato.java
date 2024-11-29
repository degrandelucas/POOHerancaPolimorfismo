package com.herancapolimorfismo.model;

public class Gato extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Gato miando");
    }

    public void arranharMoveis(){
        System.out.println("Gato arranhando os móveis");
    }
}
