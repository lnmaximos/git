package br.com.fundamentos;

public class TrabalhandoComStrings {
// String não é um tipo primitivo e sim uma classe (possui métodos)
	
	public static void main(String[] args) {
		String nome = "Maria";
		int idade = 30;
		
		System.out.println(nome.toUpperCase() + " tem " + idade + " anos ");
            
		          //0123456789101112131415		
		String c = "Alicio Fernandes".substring(2,4);
		System.out.println(c);
	}
}