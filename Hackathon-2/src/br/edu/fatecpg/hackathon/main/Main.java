package br.edu.fatecpg.hackathon.main;

import br.edu.fatecpg.hackathon.model.Aluno;
import br.edu.fatecpg.hackathon.model.Professor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Código de Matrícula: ");
        int cdMatricula = sc.nextInt();
        System.out.println("Digite o seu Nome: ");
        String nmAluno = sc.next();
        System.out.println("Digite sua Data de Nascimento: ");
        int dtNascimento = sc.nextInt();
        System.out.println("Digite sua nota da P1: ");
        double p1 = sc.nextDouble();
        System.out.println("Digite sua nota da P2: ");
        double p2 = sc.nextDouble();
        System.out.println("Digite sua nota de TP: ");
        double tp = sc.nextDouble();

        System.out.println("Digite o ID de Matrícula: ");
        int idProfessor = sc.nextInt();
        System.out.println("Digite o seu Nome: ");
        String nmProfessor = sc.next();
        System.out.println("Digite sua Data de Nascimento: ");
        String dtNascimentoProf = sc.next();
        System.out.println("Digite sua Data de Admissão: ");
        String dtAdmissao = sc.next();

        Aluno aluno = new Aluno(cdMatricula, nmAluno, dtNascimento);
        Professor professor = new Professor(idProfessor,nmProfessor,dtNascimentoProf,dtAdmissao);
        aluno.avaliarALuno(p1,p2,tp);
        aluno.setProfessor(professor);
        System.out.println(aluno.gerarHistorico());
    }
}
