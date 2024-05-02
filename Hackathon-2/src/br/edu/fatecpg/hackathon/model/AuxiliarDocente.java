package br.edu.fatecpg.hackathon.model;

public class AuxiliarDocente extends Professor{
    private double numSalario;
    private String hrEntrada;
    private String hrSaida;

    public AuxiliarDocente(int idProfessor, String nmProfessor, String dtNascimento, String dtAdmissao) {
        super(idProfessor, nmProfessor, dtNascimento, dtAdmissao);
    }


}
