package com.paulosa.aulinhadagalera;

public class Uzumaki extends Ninja {

    public Uzumaki() {
    }

    public Uzumaki(String nome, int idade, String aldeia, String cargo, double altura) {
        super(nome, idade, aldeia, cargo, altura);
    }

    public void muitoChakra(){
        System.out.println("Tenho muito Chakra");
    }

    public void correr(){
        System.out.println("Uzumaki correndo");
    }
}
