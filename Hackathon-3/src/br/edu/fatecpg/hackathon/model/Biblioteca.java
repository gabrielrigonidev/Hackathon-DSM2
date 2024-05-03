package br.edu.fatecpg.hackathon.model;
import java.util.Scanner;

public class Biblioteca {
   int qtd_copias_disponivel;
   Livro livro;
   int mes_devolucao;
   int dt_atual;
   Scanner entrada = new Scanner(System.in);

   public Scanner getEntrada() {
      return entrada;
   }

   public void setEntrada(Scanner entrada) {
      this.entrada = entrada;
   }

   public int getQtd_copias_disponivel() {
      return qtd_copias_disponivel;
   }

   public void setQtd_copias_disponivel(int qtd_copias_disponivel) {
      this.qtd_copias_disponivel = qtd_copias_disponivel;
   }

   public Livro getLivro() {
      return livro;
   }

   public void setLivro(Livro livro) {
      this.livro = livro;
   }

   public int getMes_devolucao() {
      return mes_devolucao;
   }

   public void setMes_devolucao(int mes_devolucao) {
      this.mes_devolucao = mes_devolucao;
   }

   public int getDt_atual() {
      return dt_atual;
   }

   public void setDt_atual(int dt_atual) {
      this.dt_atual = dt_atual;
   }

   @Override
   public String toString() {
      return "Biblioteca [entrada=" + entrada + ", qtd_copias_disponivel=" + qtd_copias_disponivel + ", livro="
              + livro + ", mes_devolucao=" + mes_devolucao + ", dt_atual=" + dt_atual + "]";
   }
}
