package br.com.fundamentos;

public class TrabalhandoComStrings {
// STRING NÃO É UM TIPO PRIMITIVO E SIM UMA CLASSE (POSSUI MÉTODOS)
	
	public static void main(String[] args) {
		String nome = "Maria";
		int idade = 30;
		
		System.out.println(nome.toUpperCase() + " tem " + idade + " anos ");
            
		          //0123456789101112131415		
		String c = "Alicio Fernandes".substring(2,4);
		System.out.println(c);
	
		char data[] = { 'a', 'b', 'c' };
		String str = new String(data);
		System.out.println(str);
		
		String valor = "Trabalhando com strings";
		System.out.println(valor.charAt(0));
		
		System.out.println(valor.codePointAt(0));
		
		String treinamento = "Treinamento com String";
		System.out.println(treinamento.compareTo("Treinamento com String") == 0 ? true : false);
		System.out.println(treinamento.compareTo("TREINAMENTO COM STRING") == 0 ? true : false);
		System.out.println(treinamento.compareToIgnoreCase("TREINAMENTO COM STRING") == 0 ? true : false);
		
		System.out.println(treinamento.endsWith("Treinamento"));
		System.out.println(treinamento.startsWith("Trei"));
		System.out.println(treinamento.startsWith("in", 3));
		
		System.out.println("Tamanho da String -> " + treinamento.length());
		
		// FOREACH EXCLUSIVO PARA PERCORRER OBJETOS
		for (char d : treinamento.toCharArray()){
			System.out.println("Char: " + d);
		}
		
		// Outra opção de quebrar e percorrer um objeto ** MAIS INDICADO USAR O FOREACH
		for (int i = 0; i < treinamento.length(); i++){
			char d = treinamento.toCharArray()[i];
			System.out.println(d);
		}
		
		for (byte b : treinamento.getBytes()){
			System.out.println("Byte: " + b);
		}
		
		// VERIFICA SE UMA STRING ESTÁ OU NÃO VAZIA
		String aluno = ""; 
		System.out.println(aluno.isEmpty());
	
		// USO DO SPLIT SEM LIMIT
		String curso = "Fundamentos em java";
		String[] valorComSplit = curso.split(" ");
		
		for (String s : valorComSplit){
			System.out.println(s);
		}
		
		// USO DO SPLIT COM LIMIT
		String usandoSplitELimit = "Fundamentos - JAVA - SOFTWARE - ENGENHARIA - COMPUTAÇÃO";
		String[] valorComSplitComLimit = usandoSplitELimit.split("-", 2);
		
		for (String s : valorComSplitComLimit){
			System.out.println(s);
		}
		
		String valor2 = "Trabalhando com Strings";
		
		System.out.println(valor2.subSequence(0,5));
		System.out.println(valor2.substring(0,5));
		
		String maiusculoEMinusculo = " Treinamento em Java - Trabalhando com classe String";
		System.out.println(maiusculoEMinusculo.toLowerCase());
		System.out.println(maiusculoEMinusculo.toUpperCase());
		System.out.println(maiusculoEMinusculo.trim());
		
		boolean myBoolean = true;
		System.out.println(String.valueOf(myBoolean));
		
		float myFloat = -10;
		System.out.println(String.valueOf(myFloat));
		
		int myInt = 9;
		System.out.println(String.valueOf(myInt));
		
		double myDouble = 10.30;
		System.out.println(String.valueOf(myDouble));
		
		String result = String.format("Hoje nós processamos %,d transações", 100000);
		System.out.println(result);
		
		result = String.format("10 / 3 = %.2f", 10.0 / 3.0);
		System.out.println(result);
	}
}