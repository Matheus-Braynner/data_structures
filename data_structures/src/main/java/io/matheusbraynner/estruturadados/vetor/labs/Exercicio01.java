package io.matheusbraynner.estruturadados.vetor.labs;

import io.matheusbraynner.estruturadados.vetor.Lista;

public class Exercicio01 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("B"));
        System.out.println(lista.contem("E"));
    }
}
