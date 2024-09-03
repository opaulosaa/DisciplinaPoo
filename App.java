package com.paulosa.aulinhadagalera;

public class App {
    public static void main(String[] args) {
    Uchiha sasuke = new Uchiha("Sasuke Uchiha", 33, "Folha", "Renegado", 1.80);
    sasuke.correr();

    sasuke.sharinganAtivado();

    System.out.println("------------------------");

    Uzumaki naruto = new Uzumaki("Naruto Uzumaki", 32, "Folha", "Hokage", 1.82);

    naruto.correr();

        System.out.println("---------------------");

    Ninja asuma = new Ninja("Asuma", 50, "Folha", "jounin", 1.80);

    asuma.correr();
        System.out.println("---------------------------");


        Uzumaki kurenai = new Uzumaki();
        kurenai.setAldeia("Folha");
    }
}
