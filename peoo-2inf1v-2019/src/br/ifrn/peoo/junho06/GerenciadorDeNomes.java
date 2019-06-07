/**
 * 
 */
package br.ifrn.peoo.junho06;

import java.util.Scanner;

/**
 * @author joaohelis
 *
 */
public class GerenciadorDeNomes {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o nome: ");
		String nome = input.nextLine();
		
		String resultado = iniciaisMaiusculas(nome);
		System.out.println(resultado);
	}
		
	public static String iniciaisMaiusculas(String nome) {
		
		String[] partes = nome.split(" ");
		
		String resultado = "";
				
		for(int i = 0; i < partes.length; i++) {
			String parte = partes[i];
			
			String primeiraLetra = String.valueOf(parte.charAt(0)).toUpperCase();			
			String letrasRestantes = parte.substring(1, parte.length());
			
			String palavraCompleta = primeiraLetra + letrasRestantes;
			
			resultado = resultado + palavraCompleta + " ";
		}
		
		return resultado;		
	}

	
}
