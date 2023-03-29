package io.matheusbraynner.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(String elemento) {
        aumentaCapacidade();
        if(tamanho < this.elementos.length) {
            this.elementos[tamanho] = elemento;
            tamanho++;
        } else {
            throw new IndexOutOfBoundsException("Vetor já está cheio, não é possível adicionar elementos");
        }
    }

    public void adiciona(int posicao, String elemento) {
        if(!(posicao < this.tamanho))
            throw new IllegalArgumentException("Posição inválida");

        aumentaCapacidade();

        for (int i = tamanho-1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
    }

    private void aumentaCapacidade() {
        if(this.tamanho == this.elementos.length) {
            String[] elementosNovos = new String[this.elementos.length*2];
            System.arraycopy(this.elementos, 0, elementosNovos, 0, this.elementos.length);
            this.elementos = elementosNovos;
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    public String busca(int posicao) {
        if(!(posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(String elemento) {
       for (int i = 0; i < this.tamanho; i++) {
           if (this.elementos[i].equals(elemento)) {
               return i;
           }
       }
        return -1;
    }

    public void remove(int posicao) {
        if(!(posicao < this.tamanho))
            throw new IllegalArgumentException("Posição inválida");

        aumentaCapacidade();

        for (int i = posicao; i < this.tamanho-1; i++) {
           this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append("[");

        for (int i =0; i < this.tamanho-1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if(this.tamanho > 0) {
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();
    }
}
