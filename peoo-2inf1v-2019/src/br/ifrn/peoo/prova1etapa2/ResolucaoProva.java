/**
 * 
 */
package br.ifrn.peoo.prova1etapa2;

/**
 * @author joaohelis
 *
 */
public class ResolucaoProva {
	
	public static String inverterTexto(String texto) {
		
		String textoInvertido = "";
		 		
		for(int i = texto.length()-1; i >= 0; i--) {
			textoInvertido += texto.charAt(i);
		}
		return textoInvertido;
	}
	
	public static int contarTodasVogais(String texto) {
		
		int qtdeVogais = 0;
		for(int i = 0; i < texto.length(); i++) {
			char letra = texto.toLowerCase().charAt(i);
			if(letra == 'a' || 
				letra == 'e' ||
				letra == 'i' ||
				letra == 'o' ||
				letra == 'u')
				qtdeVogais++;			
		}
		
		return qtdeVogais;
	}
	
	public static void main(String[] args) {
		
		System.out.println(inverterTexto("VICTORIA"));
		System.out.println(contarTodasVogais("VICTORIA"));
		
	}
}