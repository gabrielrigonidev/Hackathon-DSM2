package br.edu.fatecpg.hackathon.model;

public class Produtos {

    private String nome;
    private int cod;

    public Produtos(String nome, int cod) {
        this.nome = nome;
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "nome='" + nome + '\'' +
                ", cod=" + cod +
                '}';
    }

    public void adcProduto(){
        System.out.println("Seu produto " + toString() + "foi adicionado ao carrinho!");

    }
}
