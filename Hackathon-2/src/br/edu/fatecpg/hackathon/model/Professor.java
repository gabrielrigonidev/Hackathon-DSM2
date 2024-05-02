package br.edu.fatecpg.hackathon.model;

public class Professor {
    private int idProfessor;
    private String nmProfessor;
    private String dtNascimento;
    private String dtAdmissao;

    public Professor(int idProfessor, String nmProfessor, String dtNascimento, String dtAdmissao) {
        this.idProfessor = idProfessor;
        this.nmProfessor = nmProfessor;
        this.dtNascimento = dtNascimento;
        this.dtAdmissao = dtAdmissao;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getNmProfessor() {
        return nmProfessor;
    }

    public void setNmProfessor(String nmProfessor) {
        this.nmProfessor = nmProfessor;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getDtAdmissao() {
        return dtAdmissao;
    }

    public void setDtAdmissao(String dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }
}
