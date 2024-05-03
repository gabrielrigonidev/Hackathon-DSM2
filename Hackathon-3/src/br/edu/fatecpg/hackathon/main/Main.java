package br.edu.fatecpg.hackathon.main;

import br.edu.fatecpg.hackathon.model.Aluno;
import br.edu.fatecpg.hackathon.model.Biblioteca;
import br.edu.fatecpg.hackathon.model.Livro;
import br.edu.fatecpg.hackathon.model.Professor;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      Aluno aluno = new Aluno(entrada, "bruna", "111", 13,5, 10, "Pequeno Principe", 6, 2, 8);
      Livro livro = new Livro("Pequeno Principe","Autor",20);

      aluno.realizarEmprestimo(livro);
      aluno.realizaDevolucao(livro);
      aluno.realizaRenovacao(livro);
   }
}
