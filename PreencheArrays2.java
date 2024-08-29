package com.paulosa.arrays;

import java.util.ArrayList;
import java.util.List;

public class PreencheArrays2 {
    public static void main(String[] args) {
    //String [] -> Fixo
    // new ArrayList<String>() -> Dinâmico
        List<String> names = new ArrayList<>();
        //add elementos no array:
        names.add("Luffy");
        names.add("Zoro");
        names.add("Nami");
        names.add("Robin");

        //buscar elemento especifico pelo indice get()
        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        //buscar o índice a partir de um elemento
        int index = names.indexOf("Zoro");
        System.out.println(index);

        // verificar se a lista está vazia
        System.out.println(names.isEmpty());

        //verificar se a lista contem algum elemento
        System.out.println(names.contains("John")); //não contem
        System.out.println(names.contains("Luffy"));//contem

        //verificar tamanho da lista
        System.out.println(names.size());

        //limpar a lista (remover os elementos)
        names.clear();
        System.out.println(names.isEmpty());
    }
}
