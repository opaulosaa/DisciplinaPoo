package com.paulosa.ex1;

import com.paulosa.ex1.Pessoa;

import java.time.LocalDate;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Paulo", LocalDate.of(1993,4,15), 1.74);
        pessoa.mostrarDados();
        System.out.println("---------------------");
        Pessoa pessoa1 = new Pessoa("Mariana", LocalDate.of(1994,8,11),1.68);
        pessoa1.mostrarDados();

    }
}
