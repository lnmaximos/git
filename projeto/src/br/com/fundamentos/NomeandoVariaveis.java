package br.com.fundamentos;

public class NomeandoVariaveis {

	public static void main(String[] args) {
		// V�LIDO SEPARADO POR UM UNDERLINE _
		String variavel_separada_por_underline;
		
		// PADR�O camelCase *usar esse
		String variavelSeparadaPorUnderline;
		
		// V�LIDO, POR�M ESTRANHO
		int _numero = 1;
		
		System.out.println(_numero);
		
		// V�LIDO, POR�M MAIS ESTRANHO AINDA
		int $outroNumero = 3;
		System.out.println($outroNumero);

		// N�O PODE INICIAR COM CARACTERES ESPECIAIS
		// String 1um;
		// int @arroba;
	}
}