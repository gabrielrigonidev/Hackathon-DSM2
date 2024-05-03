package br.edu.fatecpg.hackathon.model;

public class Conta {
    private int numConta;
    private String titular;
    protected double saldo;

    public Conta(int numConta,String titular,double saldo){
        this.numConta=numConta;
        this.titular=titular;
        this.saldo=saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getSaldo() {
        return "Saldo: "+saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }
    public void sacar(double valor){
        this.saldo -= valor;
    }
    public void transferir(double valor,Conta conta){
        this.saldo-=valor;
        conta.depositar(valor);


    }


    @Override
    public String toString() {
        return "Conta{" +
                "numConta=" + numConta +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
