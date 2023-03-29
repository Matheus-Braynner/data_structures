package io.matheusbraynner.estruturadados.vetor.teste;

import io.matheusbraynner.estruturadados.vetor.Vetor;

public class Aula09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);
        vetor.adiciona("B");
        vetor.adiciona("G");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("F");

        vetor.remove(1);
        System.out.println(vetor);
    }
}

