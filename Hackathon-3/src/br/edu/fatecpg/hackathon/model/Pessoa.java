package br.edu.fatecpg.hackathon.model;
import java.util.Scanner;

public class Pessoa {
   Scanner entrada = new Scanner(System.in);

   String nome;
   String cpf;
   int idade;
   int mes_atual;
   int qtd_desejada_livro;
   String nm_livro_desejado;
   int mes_devolucao = mes_atual+2;
   int qtd_ficou;
   int mes_desejado;

   public Pessoa(Scanner entrada, String nome, String cpf, int idade, int mes_atual, int qtd_desejada_livro, String nm_livro_desejado, int mes_devolucao, int qtd_ficou, int mes_desejado) {
      this.entrada = entrada;
      this.nome = nome;
      this.cpf = cpf;
      this.idade = idade;
      this.mes_atual = mes_atual;
      this.qtd_desejada_livro = qtd_desejada_livro;
      this.nm_livro_desejado = nm_livro_desejado;
      this.mes_devolucao = mes_devolucao;
      this.qtd_ficou = qtd_ficou;
      this.mes_desejado = mes_desejado;
   }

   public void realizarEmprestimo(Livro livro) {
   }

   public void realizaDevolucao(Livro livro) {
   }

   public void realizaRenovacao(Livro livro) {
   }
}