package br.edu.fatecpg.hackathon.model;

import java.util.Scanner;

public class Professor extends Pessoa{

   public Professor(Scanner entrada, String nome, String cpf, int idade, int mes_atual, int qtd_desejada_livro, String nm_livro_desejado, int mes_devolucao, int qtd_ficou, int mes_desejado) {
      super(entrada, nome, cpf, idade, mes_atual, qtd_desejada_livro, nm_livro_desejado, mes_devolucao, qtd_ficou, mes_desejado);
   }

   @Override
   public void realizarEmprestimo(Livro livro) {
      System.out.println("Digite o mês atual: ");
      mes_atual = entrada.nextInt();
      System.out.println("Digite o nome do livro desejado: ");
      nm_livro_desejado = entrada.next();
      System.out.println("Quantidade de livros você deseja pegar: ");
      qtd_desejada_livro = entrada.nextInt();
      int mes_devolucao = mes_atual+2;

      if(qtd_desejada_livro <= 10){
         System.out.println("Emprestimo Relizado!"
                 + "A data de devolução fica para o mês: " + mes_devolucao);
      } else {
         System.out.println("Emprestimo Negado!");
      }
   }

   @Override
   public void realizaDevolucao(Livro livro) {
      System.out.println("Digite o mês atual");
      mes_atual = entrada.nextInt();
      System.out.println("Qual a data de devolução do emprestimo realizado?");
      mes_devolucao = entrada.nextInt();
      qtd_ficou = mes_atual - mes_devolucao;

      if(qtd_ficou > 2) {
         System.out.println("Livro entregue com atraso!");
      } else {
         System.out.println("Livro entregue!");
      }
   }

   @Override
   public void realizaRenovacao(Livro livro) {
      System.out.println("Qual o mês da devolução do emprestimo?");
      mes_devolucao = entrada.nextInt();
      System.out.println("Qual o mês desejado para renovação?");
      mes_desejado = entrada.nextInt();
      mes_devolucao = mes_desejado;
      System.out.println("Feito! Mês de devolução renovado para o mês: " + mes_devolucao);
   }
}
