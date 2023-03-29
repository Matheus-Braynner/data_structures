package io.matheusbraynner.estruturadados.pilha.labs;

import io.matheusbraynner.estruturadados.pilha.Pilha;

public class Ex05 {
    public static void main(String[] args) {
        imprimeResultado("{(A + B)}");
    }
    final static String ABRE = "{[(";
    final static String FECHA = ")]}";

    public static void imprimeResultado(String expressao) {
        System.out.println(expressao + " está balanceada ? " + verificaSimbolosBalanceados(expressao));
    }


    public static boolean verificaSimbolosBalanceados(String expressao) {
        Pilha<Character> pilha = new Pilha<>();
        int index = 0;
        char simbolo, topo;

        while (index < expressao.length()) {
            simbolo = expressao.charAt(index);

            if (ABRE.indexOf(simbolo) > -1) {
                pilha.empilha(simbolo);
            } else if (FECHA.indexOf(simbolo) > -1){
                if (pilha.estaVazio()) {
                    return  false;
                } else {
                    topo = pilha.desempilha();
                    if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
                        return false;
                    }
                }
            }

            index++;
        }

        return true;
    }
}
