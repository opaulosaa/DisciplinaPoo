package com.paulosa.aulinhadagalera;

public class Uchiha extends Ninja{

    public Uchiha(String nome, int idade, String aldeia, String cargo, double altura) {
        super(nome, idade, aldeia, cargo, altura);
    }

    public void sharinganAtivado(){
        System.out.println("Sharingan ativado");
    }
    public void correr(){
        System.out.println("Uchiha correndo");
    }
}
