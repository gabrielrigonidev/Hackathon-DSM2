package br.edu.fatecpg.hackathon.main;

import br.edu.fatecpg.hackathon.model.Conta;
import br.edu.fatecpg.hackathon.model.Corrente;
import br.edu.fatecpg.hackathon.model.Poupanca;

public class Main {
    public static void main(String[] args) {


    	System.out.println("Criando contas");
        var contac1=new Corrente(6565,"Bruna",0,200);
        var contap1=new Poupanca(656,"Bruna",0,contac1);
        
        System.out.println(contac1.toString());
        System.out.println(contap1.toString());
        
        System.out.println("Depositando na Conta Corrente: R$300,00  ");
        contac1.depositar(300);
        System.out.println(contac1.getLimite());
        System.out.println(contac1.getSaldo());
        
        System.out.println("Sacando alem do saldo: R$500,00");
        contac1.sacar(500);
        System.out.println(contac1.getLimite());
        System.out.println(contac1.getSaldo());
        
        System.out.println("Sacando sem saldo: R$1");
        contac1.sacar(1);
        System.out.println(contac1.getLimite());
        System.out.println(contac1.getSaldo());
        
        System.out.println("Depositando: R$150,00");
        contac1.depositar(150);
        System.out.println(contac1.getLimite());
        System.out.println(contac1.getSaldo());
        
        System.out.println("Depositando: R$150,00");
        contac1.depositar(150);
        System.out.println(contac1.getLimite());
        System.out.println(contac1.getSaldo());
        
        System.out.println("Depositando na poupança: R$150,00");
        contap1.depositar(150);
        System.out.println(contap1.getSaldo());
        
        System.out.println("Tentando sacar da poupança");
        contap1.sacar(150);
        System.out.println(contap1.getSaldo());
        
        System.out.println("Resgatando para CC: ");
        contap1.resgatar(150);
        System.out.println(contap1.getSaldo());
        System.out.println(contac1.getSaldo());
        
        
        
        
        
      






    }
}
