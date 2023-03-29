package io.matheusbraynner.estruturadados.pilha.labs;

import io.matheusbraynner.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();
        int valor;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            valor = sc.nextInt();

           if (valor == 0 && par.estaVazio()) {
                System.out.println("Pilha par está vazia");
            } else if (valor == 0 && impar.estaVazio()) {
               System.out.println("Pilha impar está vazia");
           } else if (valor == 0){
               System.out.println("Desempilhando ");
               par.desempilha();
               impar.desempilha();
           }
            if (valor % 2 == 0 && valor !=0) {
                System.out.println("Número par, empilhando número : " + valor);
                par.empilha(valor);
            } else if (valor % 2 == 1){
                System.out.println("Número ímpar, empilhando número : " + valor);
                impar.empilha(valor);
            }
        }

        while(!impar.estaVazio()) {
            System.out.println(impar);
            System.out.println("Desempilhando pilha impar : " + impar.desempilha());
            System.out.println(impar);
        }

        while(!par.estaVazio()) {
            System.out.println(par);
            System.out.println("Desempilhando pilha par : " + par.desempilha());
            System.out.println(par);
        }


    }
}
