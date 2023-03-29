package io.matheusbraynner.estruturadados.pilha.labs;

import java.util.Stack;

public class Ex06 {
    public static void main(String[] args) {
    resultadoDecimalParaBinario(25);

    resultadoDecimalQualquerBase(25, 16);
    resultadoDecimalQualquerBase(10035, 8);
    resultadoDecimalQualquerBase(10035, 16);
    resultadoDecimalQualquerBase(35996, 16);


    }

    public static void resultadoDecimalParaBinario(int numero) {
        System.out.println("O valor binario do número " + numero + " é : " + decimalParaBinario(numero));
    }

    public static void resultadoDecimalQualquerBase(int numero, int base) {
        System.out.println("O valor binario do número " + numero + " na base " + base + " é : " + decimalParaQualquerBase(numero, base));
    }

    public static String decimalParaBinario(int numero) {
        Stack<Integer> pilha = new Stack<>();
        String numBinario = "";
        int resto;

        while(numero > 0) {
            resto = numero % 2;
            pilha.push(resto);
            numero /= 2;
        }

        while (!pilha.empty()) {
            numBinario += pilha.pop();
        }


        return numBinario;
    }

    public static String decimalParaQualquerBase(int numero, int base) {
        if (base > 16) {
            throw new IllegalArgumentException();
        }

        Stack<Integer> pilha = new Stack<>();
        String numBase = "";
        int resto;
        String bases = "0123456789ABCDEF";

        while(numero > 0) {
            resto = numero % base;
            pilha.push(resto);
            numero /= base;
        }

        while (!pilha.empty()) {
            numBase += bases.charAt(pilha.pop());
        }


        return numBase;
    }
}
