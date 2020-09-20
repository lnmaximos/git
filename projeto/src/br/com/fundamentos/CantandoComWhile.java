package br.com.fundamentos;

public class CantandoComWhile {
	
	public static void main(String[] args) {
		
		int patos = 5;
		
		while (patos > 0) {
			System.out.println(patos + " patinhos foram passear\nAlém das montanhas para brincar\nA mamãe gritou: \"Quá, quá, quá, quá\"\nMas só " + --patos + " patinhos voltaram de lá\n");
		}
	}
}