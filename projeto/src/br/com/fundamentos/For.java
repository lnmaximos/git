package br.com.fundamentos;

import java.util.Scanner;

public class For {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ultimo numero: ");
		int numeroFinal = entrada.nextInt();
		
		// for (	;	;	){
		// }
		// for (iniciação; condição; incremento)
		for (int i = 1; i <= numeroFinal; i++) {
			System.out.println(i);
		}
		entrada.close();
	}
}