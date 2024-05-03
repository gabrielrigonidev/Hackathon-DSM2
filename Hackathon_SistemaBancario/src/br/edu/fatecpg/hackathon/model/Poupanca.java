package br.edu.fatecpg.hackathon.model;

public class Poupanca extends Conta{

    private Corrente numCc;

    public Poupanca(int numConta, String titular, double saldo,Corrente numCc) {
        super(numConta, titular, saldo);
        this.numCc=numCc;


    }

    @Override
    public void sacar(double valor) {
        System.out.println("Não pode sacar da conta poupança, o valor deve primeiro ser resgatado para sua conta correte");
    }
    public void resgatar(double valor){
        saldo-=valor;
        numCc.depositar(valor);

    }

}
