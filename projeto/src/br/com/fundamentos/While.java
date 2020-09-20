package br.com.fundamentos;

public class While {

	public static void main(String[] args ) {
		
		int incremento = 0;
		
		while (incremento <= 2) {
			System.out.println("Contador -> " + incremento);
			// incremento = incremento + 1;
			// incremento += 1;
			incremento++;
		}
		 System.out.println("Valor final do contador " + incremento);
		 
		System.out.println("Descrescente:");
		
		int decremento = 2;
		
		while (decremento >= 0) {
			System.out.println("Contador -> " + decremento);
			decremento--;
		}
	}
}