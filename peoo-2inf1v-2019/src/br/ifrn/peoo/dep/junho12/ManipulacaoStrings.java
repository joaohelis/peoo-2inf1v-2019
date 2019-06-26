/**
 * 
 */
package br.ifrn.peoo.dep.junho12;

import java.util.Scanner;

/**
 * @author joaohelis
 *
 */
public class ManipulacaoStrings {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o seu nome completo: ");
		
		System.out.println("\n\n");
		String nome = input.nextLine();
		
//		String sobrenome = pegarSobrenome(nome).toUpperCase();
		
		diagonal(nome);
	}
	
	public static void diagonal(String nome) {
		
		int n = nome.length();
		
		for(int j = 0; j < n; j++) {
			
			for(int i = 0; i < n; i++) {
				
				if(i == j) {					
					System.out.print(nome.charAt(i) + " ");
				}else {
					System.out.print("* ");					
				}
				
			}
			System.out.println();			
		}
	}
	
	
	public static String pegarSobrenome(String nome) {
		
		String[] partesDoNome = nome.split(" ");
		
		int tam = partesDoNome.length;
		
		String sobrenome = partesDoNome[tam - 1];
		
		return sobrenome;
	}

}
