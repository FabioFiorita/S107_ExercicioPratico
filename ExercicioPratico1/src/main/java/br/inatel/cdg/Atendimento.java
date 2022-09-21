package br.inatel.cdg;

public class Atendimento {

    private String nomeProfessor;
    private String horarioAtendimento;
    private String periodo;

    public Atendimento(String nomeProfessor, String horarioAtendimento, String periodo) {
        this.nomeProfessor = nomeProfessor;
        this.horarioAtendimento = horarioAtendimento;
        this.periodo = periodo;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public String getHorarioAtendimento() {
        return horarioAtendimento;
    }

    public String getPeriodo() {
        return periodo;
    }
}
