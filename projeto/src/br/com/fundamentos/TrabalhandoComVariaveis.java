package br.com.fundamentos;

public class TrabalhandoComVariaveis {

		public static void main(String[] args) {
			int quantidade;
			quantidade = 10;
			
			System.out.println(quantidade);
			
			quantidade = 15;
			System.out.println(quantidade);
		
		    double numeroComVirgula;
		    numeroComVirgula = 1.3;
		    
		    System.out.println("Numero decimal -> " + numeroComVirgula);
		    
		    float numeroComVirgulaPontoFluante = 1.5f;
		    System.out.println("Numero decimal com float -> " + numeroComVirgulaPontoFluante);
		    
		    /*
		     * Tipos primitivos de dados
		     * https://medium.com/@mauriciogeneroso/java-oca-1z0-808-2-1-tipos-de-dados-vari%C3%A1veis-vari%C3%A1veis-primitivas-e-de-refer%C3%AAncia-c8f007756bc5
		     */
		 
		    boolean alunoMatriculado = true;
		    boolean clienteBloqueado = false;
		    
		    char turmaAluno1 = 'A';
		    char tipoCliente = '2';
		    char simbolo = '@';
		    
		    long numeroInteiroGrande = 25l;
		    System.out.println("Numero inteiro com long -> " + numeroInteiroGrande);
		}
}