package com.paulosa.aulinhadagalera;

public class Ninja {
        //Atributos -> características do objeto(nome, idade, aldeira, cargo, altura, quantida de chakra, clã)
        //Métodos -> ações do obejto (solta o jutsu, perde chakra, correr, comer lámen)
        private String nome;
        private int idade;
        private String aldeia;
        private String cargo;
        private double altura;

        public Ninja() {
        }

        public Ninja(String nome, int idade, String aldeia) {
                this.nome = nome;
                this.idade = idade;
                this.aldeia = aldeia;
        }

        public Ninja(String nome, int idade, String aldeia, String cargo, double altura) {
                this.nome = nome;
                this.idade = idade;
                this.aldeia = aldeia;
                this.cargo = cargo;
                this.altura = altura;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public int getIdade() {
                return idade;
        }

        public void setIdade(int idade) {
                this.idade = idade;
        }

        public String getAldeia() {
                return aldeia;
        }

        public void setAldeia(String aldeia) {
                this.aldeia = aldeia;
        }

        public String getCargo() {
                return cargo;
        }

        public void setCargo(String cargo) {
                this.cargo = cargo;
        }

        public double getAltura() {
                return altura;
        }

        public void setAltura(double altura) {
                this.altura = altura;
        }
        public void correr(){
                System.out.println("Correndo");
        }

}