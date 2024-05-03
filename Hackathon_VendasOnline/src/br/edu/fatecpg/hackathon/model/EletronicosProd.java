package br.edu.fatecpg.hackathon.model;

public class EletronicosProd extends Produtos{
    private String modelo;
    private double valor;
    private int qtde;

    public EletronicosProd(String nome, int cod, String modelo, double valor, int qtde) {
        super(nome, cod);
        this.modelo = modelo;
        this.valor = valor;
        this.qtde = qtde;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtde() {
        return qtde;
    }

	@Override
	public String toString() {
		return "EletronicosProd [modelo=" + modelo + ", valor=" + valor + ", qtde=" + qtde + "]";
	}
    
    
}
