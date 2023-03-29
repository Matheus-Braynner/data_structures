package io.matheusbraynner.estruturadados.pilha;

import io.matheusbraynner.estruturadados.vetor.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilha(T elemento) {
       super.adiciona(elemento);
    }

    public T topo() {
        if (this.estaVazio()) {
            return null;
        }
        return this.elementos[tamanho - 1];
    }

    public T desempilha() {
        if (this.estaVazio()) {
            return null;
        }
        return this.elementos[--tamanho];
    }
}
