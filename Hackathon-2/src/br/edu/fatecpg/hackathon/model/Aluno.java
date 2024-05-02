package br.edu.fatecpg.hackathon.model;

public class Aluno {
    private int cdMatricula;
    private String nmAluno;
    private int dtNascimento;
    private double p1;
    private double p2;
    private double tp;
    private double numMedia;
    private Professor professor;

    public Aluno(int cdMatricula, String nmAluno, int dtNascimento) {
        this.cdMatricula = cdMatricula;
        this.nmAluno = nmAluno;
        this.dtNascimento = dtNascimento;
    }

    public void avaliarALuno(double p1, double p2, double tp){
        this.p1 = p1;
        this.p2 = p2;
        this.tp = tp;
    }

    public void setProfessor(Professor professor){
        this.professor = professor;
    }

    public int getCdMatricula() {
        return cdMatricula;
    }

    public void setCdMatricula(int cdMatricula) {
        this.cdMatricula = cdMatricula;
    }

    public String getNmAluno() {
        return nmAluno;
    }

    public void setNmAluno(String nmAluno) {
        this.nmAluno = nmAluno;
    }

    public int getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(int dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public double getNumMedia() {
        return numMedia;
    }

    public void setNumMedia(double numMedia) {
        this.numMedia = numMedia;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getTp() {
        return tp;
    }

    public void setTp(double tp) {
        this.tp = tp;
    }

    public String gerarHistorico(){
        this.numMedia = (this.p1 + this.p2 + this.tp) / 3;
        return "Histórico Escolar de: " + this.nmAluno +
                "\n Nota de P1: " + this.p1 +
                "\n Nota de P2: " + this.p2 +
                "\n Nota de TP: " + this.tp +
                "\n Nota de Média: " + this.numMedia +
                "\n Professor: " + this.professor.getNmProfessor();
    }
}
