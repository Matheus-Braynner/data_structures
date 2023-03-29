package io.matheusbraynner.estruturadados.fila.labs;

import io.matheusbraynner.estruturadados.fila.FilaComPrioridade;

import java.util.Random;

public class PSNovosPacientes implements Runnable {

    private FilaComPrioridade<Pessoa> fila;
    private int cont = 7;
    private Random prioridade = new Random();

    public PSNovosPacientes(FilaComPrioridade<Pessoa> fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        for (int i = 0; i < 8; i++) {
            try {
                Thread.sleep(8000);
                Pessoa p = new Pessoa("P"+ cont, prioridade.nextInt(3));
                fila.enfileira(p);
                cont++;
                System.out.println("A pessoa " + p + " foi enfileirada!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
