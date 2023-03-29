package io.matheusbraynner.estruturadados.fila.Teste;

import io.matheusbraynner.estruturadados.fila.FilaComPrioridade;

public class Aula24 {
    public static void main(String[] args) {
        FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();
        fila.enfileira(1);
        fila.enfileira(3);
        fila.enfileira(2);

        System.out.println(fila); // 1 2 3 e não 1 3 2
    }
}
