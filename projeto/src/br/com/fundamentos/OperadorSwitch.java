package br.com.fundamentos;

import java.util.Scanner;

public class OperadorSwitch {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o final da placa ");
		int finalPlaca = entrada.nextInt();
		
		switch(finalPlaca) {
		case 1:
			System.out.println("Vencimento dia 11 de Janeiro");
		case 2:
			System.out.println("Vencimento dia 12 de Janeiro");
		default:
			System.out.println("Vencimento sem data, desculpe");
		}
	}
}
		/*
		 *  if(finalPlaca == 1) {
		 *  	System.out.println("Vencimento dia 11 de Janeiro");
		 *  } else if(finalPlaca == 2) {
		 * 	 System.out.println("Vencimento dia 12 de Janeiro");
		 *  } else {
		 * 	 System.out.println("Vencimento sem data, desculpe");
		 * }
		 */