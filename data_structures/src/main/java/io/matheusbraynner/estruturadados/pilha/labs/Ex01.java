package io.matheusbraynner.estruturadados.pilha.labs;

import io.matheusbraynner.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha<Integer> pilha = new Pilha<>();
        int valor;

        for (int i = 0; i < 10; i++) {
            valor = sc.nextInt();

            if (valor % 2 == 1) {
                if(pilha.estaVazio()) {
                    System.out.println("Pilha está vazia, não pode desempilhar");
                } else {
                    System.out.println("Desempilhando o número : " + pilha.topo());
                    pilha.desempilha();
                }
            } else {
                System.out.println("Empilhando o número : " + valor);
                pilha.empilha(valor);
            }
        }

        System.out.println(pilha);

       for (int i = pilha.tamanho(); i > 0; i--) {
           System.out.println("Todos os números foram lidos, desempilhando números da pilha");
           pilha.desempilha();
           System.out.println(pilha);
       }

        sc.close();

    }
}
