package io.matheusbraynner.estruturadados.fila.labs;

import io.matheusbraynner.estruturadados.fila.FilaComPrioridade;

public class PSAtendimento implements Runnable {

    private FilaComPrioridade<Pessoa> fila;

    public PSAtendimento(FilaComPrioridade<Pessoa> fila) {
        this.fila = fila;
    }

    @Override
    public void run() {

        while (!fila.estaVazio()) {
            System.out.println(fila.desenfileira() + " foi atendida");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Atendimento concluído!");
    }
}
