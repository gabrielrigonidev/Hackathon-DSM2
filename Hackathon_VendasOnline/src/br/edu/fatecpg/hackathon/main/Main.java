package br.edu.fatecpg.hackathon.main;


import java.util.Scanner;

import br.edu.fatecpg.hackathon.model.*;


public class Main {
    public static void main(String[] args) {
    	
    	var scan = new Scanner(System.in);
    	
        //instanciando cliente 
        var cliente1 = new Cliente("Vitor", 1234, false);		//boolean escolhe se é vip ou não

        System.out.println("\n ****SEU CADASTRO***");
        System.out.println(cliente1);                          

        var prod1 = new RoupasProd("Camisa", 001, "Social", 250, 5);
        var prod2 = new RoupasProd("Camiseta", 002, "Básica", 250, 1);
        var prod3 = new EletronicosProd("Smartphone", 003, "iPhoneX", 1000, 10);
        var carrinho1 = new Carrinho();
        
        
        //Setando valores no carrinho
        carrinho1.setValor_frete(80);
        carrinho1.setRoupas(prod1);
        carrinho1.setRoupas(prod2);
        carrinho1.setEletronicos(prod3);

        System.out.println("\n ****SEU CARRINHO****");
        System.out.println(carrinho1);
        System.out.println(carrinho1.printValor()); 


        //Validacao carrinho frete
        if(carrinho1.getQtde_total() > 10 || (cliente1.isVip())){
            System.out.println("Você nao vai pagar frete!");
            carrinho1.setValor_frete(0);
            System.out.println(carrinho1.printValor()); 
        }
        else{
            System.out.println("Frete para sua região de " + carrinho1.getValor_frete());
        }
        
		System.out.println("\n Pagamento será no PIX? S/N");
		String pix = scan.nextLine();
		if (pix.toUpperCase().equals("S")) {
		double valor_desc = carrinho1.getValor_total();
		valor_desc = valor_desc*0.9;
		carrinho1.setValor_total(valor_desc);
       
		System.out.println("\n ****SEU CARRINHO - VALOR ATUALIZADO****");
        System.out.println(carrinho1);
        System.out.println(carrinho1.printValor()); 
		}else {
			System.out.println("Obrigado!");
		}

    }
}