/**
 * 
 */
package br.ifrn.peoo.dep.junho5;

import java.util.Scanner;

/**
 * @author joaohelis
 *
 */
public class ManipulacaoString {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um nome: ");
		String nome = input.nextLine();
		
		String[] partes = nome.split(" ");
		
		int ultimaPosicaoVetor = partes.length - 1;
		
		String sobrenome = partes[ultimaPosicaoVetor];
		
		System.out.println(sobrenome.toUpperCase() + ", " + partes[0]);		
		
	}
}
