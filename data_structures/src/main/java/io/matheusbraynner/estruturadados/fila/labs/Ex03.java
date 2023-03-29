package io.matheusbraynner.estruturadados.fila.labs;

import io.matheusbraynner.estruturadados.fila.Fila;
import io.matheusbraynner.estruturadados.fila.FilaComPrioridade;

public class Ex03 {
    public static final int VERDE = 2;
    public static final int AMARELO = 1;
    public static final int VERMELHO = 0;

    public static void main(String[] args) {
        FilaComPrioridade<Pessoa> fila = new FilaComPrioridade<>();
        fila.enfileira(new Pessoa("P1", VERDE));
        fila.enfileira(new Pessoa("P2", AMARELO));
        fila.enfileira(new Pessoa("P3", VERMELHO));
        fila.enfileira(new Pessoa("P4", VERDE));
        fila.enfileira(new Pessoa("P5", VERDE));
        fila.enfileira(new Pessoa("P6", VERMELHO));

        PSAtendimento atendimento = new PSAtendimento(fila);
        PSNovosPacientes pacientes = new PSNovosPacientes(fila);

        Thread t1 = new Thread(atendimento);
        Thread t2 = new Thread(pacientes);
        t1.start();
        t2.start();
    }
}
