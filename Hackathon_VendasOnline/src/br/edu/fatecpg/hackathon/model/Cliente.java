package br.edu.fatecpg.hackathon.model;

public class Cliente {
    private String nome;
    private int doc;
    private boolean vip;

	public Cliente(String nome, int doc, boolean vip) {
		super();
		this.nome = nome;
		this.doc = doc;
		this.vip = vip;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDoc() {
		return doc;
	}

	public void setDoc(int doc) {
		this.doc = doc;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", doc=" + doc + ", vip=" + vip + "]";
	}

	
	
}
