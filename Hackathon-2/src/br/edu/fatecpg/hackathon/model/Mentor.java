package br.edu.fatecpg.hackathon.model;

public class Mentor extends Aluno{
    private double numSalario;
    private String hrEntrada;
    private String hrSaida;

    public Mentor(int cdMatricula, String nmAluno, int dtNascimento) {
        super(cdMatricula, nmAluno, dtNascimento);


    }
}
