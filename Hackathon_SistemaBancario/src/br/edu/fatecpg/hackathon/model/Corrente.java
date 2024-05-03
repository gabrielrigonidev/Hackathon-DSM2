package br.edu.fatecpg.hackathon.model;

public class Corrente extends Conta{
    private Poupanca numPp;
    private double limite;


    public Corrente(int numConta, String titular, double saldo,double limite) {
        super(numConta, titular, saldo);
        this.limite=limite;

    }
    
    
    @Override
	public void depositar(double valor) {
    	if(this.limite<200) {
            this.limite += valor;
            if(this.limite > 200) {
                 double resto = this.limite - 200;
                 this.saldo += resto;
                 this.limite -=resto;
            }
        }
        else {
            this.saldo += valor;
        }
	}


    public void guadarPp(double valor){
        numPp.depositar(valor);
    }
   

    @Override
    public void sacar(double valor) {
    	if(this.saldo >= valor) {
            this.saldo -= valor;
        }
        else if((this.limite+this.saldo) >= valor) {
            if(this.saldo >0) {
                this.saldo -= valor;
                this.limite += this.saldo;
                this.saldo = 0;
            }
        }else {
            System.out.println("Você não tem limite para saque");
        }
    }


	@Override
	public String toString() {
		return "Conta Corrente{" +
                "Numero da Conta=" + super.getNumConta() +
                ", Titular= " + super.getTitular() + '\'' +
                ", Saldo= " + super.getSaldo() + "Limite= "+limite+
                '}';
				
	}
	
	public String getLimite() {
		return "Limite: "+this.limite;
		
	}


	
    
    
    
    
}//fim
