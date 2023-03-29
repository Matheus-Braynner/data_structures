package io.matheusbraynner.estruturadados.fila.Teste;

public class Paciente {//implements Comparable<Paciente> {

    private String nome;
    private int prioridade;

    public Paciente(){}

    public Paciente(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Integer prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Paciente{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", prioridade=").append(prioridade);
        sb.append('}');
        return sb.toString();
    }

//    @Override
//    public int compareTo(Paciente o) {
//        if (this.prioridade > o.getPrioridade()) {
//            return 1;
//        } else if (this.prioridade < o.getPrioridade()) {
//            return -1;
//        }
//        return 0;
//    }
}
