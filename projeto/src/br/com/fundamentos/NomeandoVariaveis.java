package br.com.fundamentos;

public class NomeandoVariaveis {

	public static void main(String[] args) {
		// VÁLIDO SEPARADO POR UM UNDERLINE _
		String variavel_separada_por_underline;
		
		// PADRÃO camelCase *usar esse
		String variavelSeparadaPorUnderline;
		
		// VÁLIDO, PORÉM ESTRANHO
		int _numero = 1;
		
		System.out.println(_numero);
		
		// VÁLIDO, PORÉM MAIS ESTRANHO AINDA
		int $outroNumero = 3;
		System.out.println($outroNumero);

		// NÃO PODE INICIAR COM CARACTERES ESPECIAIS
		// String 1um;
		// int @arroba;
	}
}