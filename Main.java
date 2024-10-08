package com.paulosa.questao7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Conjunto conjunto1 = new Conjunto();
        conjunto1.adicionarElemento("arthur");
        conjunto1.adicionarElemento("paulosa");
        conjunto1.adicionarElemento("tuzin");

        Conjunto conjunto2 = new Conjunto();
        conjunto2.adicionarElemento("levi");
        conjunto2.adicionarElemento("gordao");
        conjunto2.adicionarElemento("tuzin");

        Conjunto conjunto3 = conjunto1.uniao(conjunto2);

        Conjunto conjunto4 = conjunto1.inter(conjunto2);

        Conjunto conjunto5 = conjunto1.menos(conjunto2);

        conjunto3.exibir();
        System.out.println("----------");
        conjunto4.exibir();
        System.out.println("-----------");
        conjunto5.exibir();


    }
}
