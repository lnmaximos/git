package br.com.fundamentos;

public class ProgressaoGeometrica {

	public static void main(String[] args) {
		int inicial = 1, quociente = 2, gn = inicial, valor_max = 32;
		
		System.out.printf("Elementos da PG, de valor inicial %d e razão %d, menores que %d\n", inicial, quociente, valor_max);
        
		while (gn <= valor_max) {
			System.out.println(gn);
			gn *= quociente;
		}
	}
}