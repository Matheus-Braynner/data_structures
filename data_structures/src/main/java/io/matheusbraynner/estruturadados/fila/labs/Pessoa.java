package io.matheusbraynner.estruturadados.fila.labs;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int prioridade;

    public Pessoa() {
    }

    public Pessoa(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(Pessoa o) {
        if (prioridade > o.getPrioridade()) {
            return 1;
        } else if (prioridade < o.getPrioridade()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pessoa{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", prioridade=").append(prioridade);
        sb.append('}');
        return sb.toString();
    }
}
