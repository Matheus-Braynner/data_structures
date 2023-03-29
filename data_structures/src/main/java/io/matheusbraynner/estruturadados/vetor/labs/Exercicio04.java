package io.matheusbraynner.estruturadados.vetor.labs;

import io.matheusbraynner.estruturadados.vetor.Lista;

public class Exercicio04 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");

        System.out.println(lista.obtem(0));
        System.out.println(lista.obtem(2));
        System.out.println(lista.obtem(4));
        // EXCEPTION System.out.println(lista.obtem(5));
    }
}
