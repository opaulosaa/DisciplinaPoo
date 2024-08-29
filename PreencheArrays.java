package com.paulosa.arrays;

import java.util.Arrays;

public class PreencheArrays {
    public static void main(String[] args) {
        String [] names = new String[10];
        System.out.println(Arrays.toString(names));
        Arrays.fill(names, "Desconhecido"); //inicializar array com valores padrões
        System.out.println(Arrays.toString(names));
    }
}
