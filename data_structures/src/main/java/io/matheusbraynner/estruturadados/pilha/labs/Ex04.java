package io.matheusbraynner.estruturadados.pilha.labs;

import io.matheusbraynner.estruturadados.pilha.Pilha;

public class Ex04 {
    public static void main(String[] args) {
        imprimiResultado("ADA");
    }

    public static void imprimiResultado(String palavra) {
        System.out.println(palavra +" é palidromo ? " + testaPalidromo(palavra));
    }

    public static boolean testaPalidromo(String palavra) {
        Pilha<Character> pilha = new Pilha<>();

        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(palavra.charAt(i));
        }

        String palavraInversa = "";

        while (!pilha.estaVazio()) {
           palavraInversa += pilha.desempilha();
        }

        return palavra.equalsIgnoreCase(palavraInversa);
    }
}
