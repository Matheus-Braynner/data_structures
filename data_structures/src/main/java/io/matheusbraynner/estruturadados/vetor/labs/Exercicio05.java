package io.matheusbraynner.estruturadados.vetor.labs;

import io.matheusbraynner.estruturadados.vetor.Lista;

public class Exercicio05 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");

        System.out.println(lista);

        lista.limpar();

        System.out.println(lista);

    }
}
