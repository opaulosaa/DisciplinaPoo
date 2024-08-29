package com.paulosa.ex1;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate dataDeNascimento; //utiliza a classe localdate
    private double altura;

    public Pessoa(String nome, LocalDate dataDeNascimento, double altura) { // construtor com todos os parametros da pessoa
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIdade(){ //metodo para calcular idade
        return LocalDate.now().getYear() - this.dataDeNascimento.getYear(); //ano atual - ano inserido na data de nascimento
    }
    public void mostrarDados(){ // metodo para mostrar os dados da pessoa no terminal
        System.out.println("Nome: " + getNome());
        System.out.println("Data de Nascimento: " + getDataDeNascimento());
        System.out.println("Idade: " + calcularIdade());
        System.out.println("Altura: " + getAltura());
    }
}
