package io.matheusbraynner.estruturadados.pilha.labs;

import io.matheusbraynner.estruturadados.pilha.Pilha;

public class Ex03 {
    public static void main(String[] args) {
        Pilha<Livro> livro = new Pilha<>(20);

        System.out.println("Pilha de livro está vazia ? " + livro.estaVazio());

        livro.empilha(new Livro("Nome do Livro 01", "isbn", "29-10-2000", "Matheus Braynner"));
        livro.empilha(new Livro("Nome do Livro 02", "isbn", "29-10-2000", "Matheus Braynner"));
        livro.empilha(new Livro("Nome do Livro 03", "isbn", "29-10-2000", "Matheus Braynner"));
        livro.empilha(new Livro("Nome do Livro 04", "isbn", "29-10-2000", "Matheus Braynner"));
        livro.empilha(new Livro("Nome do Livro 05", "isbn", "29-10-2000", "Matheus Braynner"));
        livro.empilha(new Livro("Nome do Livro 06", "isbn", "29-10-2000", "Matheus Braynner"));

        System.out.println("Pilha de livro está vazia ? " + livro.estaVazio());

        System.out.println("Espiando topo da pilha: " + livro.topo());

        while (!livro.estaVazio()) {
            System.out.println("Desempilhando os livros " + livro.desempilha());
        }

        System.out.println("Todos livros foram desempilhados ? " + livro.estaVazio());
    }
}
