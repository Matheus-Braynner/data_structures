package io.matheusbraynner.estruturadados.lista.teste;

import io.matheusbraynner.estruturadados.lista.ListaEncadeada;

public class ListaEncadeadaTeste {

    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.adiciona(1);

        System.out.println(lista);
        System.out.println("Tamanho = " + lista.getTamanho());

        lista.adiciona(2);

        System.out.println(lista);
        System.out.println("Tamanho = " + lista.getTamanho());

        lista.adiciona(3);

        System.out.println(lista);
        System.out.println("Tamanho = " + lista.getTamanho());

        lista.limpa();

        System.out.println(lista);
    }
}
