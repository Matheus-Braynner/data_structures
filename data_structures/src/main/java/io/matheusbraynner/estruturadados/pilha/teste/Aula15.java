package io.matheusbraynner.estruturadados.pilha.teste;

import io.matheusbraynner.estruturadados.pilha.Pilha;

public class Aula15 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        System.out.println(pilha);
        System.out.println(pilha.estaVazio());

        pilha.empilha(1);

        System.out.println(pilha);
        System.out.println(pilha.estaVazio());
    }
}
