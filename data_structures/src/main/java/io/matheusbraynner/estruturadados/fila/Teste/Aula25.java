package io.matheusbraynner.estruturadados.fila.Teste;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {
    public static void main(String[] args) {
        Queue<Paciente> filaComPrioridade = new PriorityQueue<>(
                new Comparator<Paciente>() {
                    @Override
                    public int compare(Paciente o1, Paciente o2) {
                        return Integer.valueOf(o1.getPrioridade().compareTo(o2.getPrioridade()));
                    }
                }
        );

        filaComPrioridade.add(new Paciente("A", 2));
        filaComPrioridade.add(new Paciente("B", 1));
        filaComPrioridade.add(new Paciente("C", 4));
        filaComPrioridade.add(new Paciente("D", 5));
        filaComPrioridade.add(new Paciente("E", 3));

        System.out.println(filaComPrioridade);
    }
}
