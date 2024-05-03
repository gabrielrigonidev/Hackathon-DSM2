package br.edu.fatecpg.hackathon.model;
import br.edu.fatecpg.hackathon.model.*;

public class Carrinho {

    private double valor_total;
    private double valor_frete;
    private int qtde_total;
    private RoupasProd roupas;
    private EletronicosProd eletronicos;



    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public double getValor_frete() {
        return valor_frete;
    }

    public void setValor_frete(double valor_frete) {
        this.valor_frete = valor_frete;
    }


    public int getQtde_total() {
        return qtde_total;
    }

    public void setQtde_total(int qtde_total) {
        this.qtde_total = qtde_total;
    }
    

    public RoupasProd getRoupas() {
		return roupas;
	}


	public EletronicosProd getEletronicos() {
		return eletronicos;
	}

	public void setEletronicos(EletronicosProd eletronicos) {
		this.eletronicos = eletronicos;
		this.qtde_total += eletronicos.getQtde();
		this.valor_total += eletronicos.getValor();
	}
	
	public void setRoupas(RoupasProd roupas) {
		this.roupas = roupas;
		this.valor_total += roupas.getValor();
		this.qtde_total += roupas.getQtde();
		
	}
	
	public String printValor() {
		return "Valor total da compra: R$" + (getValor_total() + getValor_frete());
	}

	@Override
    public String toString() {
        return 
                "\n Valor_total=" + valor_total +
                "\n Valor_frete=" + valor_frete +
                "\n Qtde_total=" + qtde_total +
                "\n Roupas=" + roupas +
                "\n Eletronicos=" + eletronicos +
                '\n';
    }
}
