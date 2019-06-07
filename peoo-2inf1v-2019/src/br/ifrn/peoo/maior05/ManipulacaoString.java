/**
 * 
 */
package br.ifrn.peoo.maior05;

import java.util.Scanner;

/**
 * @author joaohelis
 *
 */
public class ManipulacaoString {
	
	public static void main(String[] args) {
		
		int resultado = somar("3231", 2349);
		System.out.println(resultado);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a palavra: ");
		String palavra = input.nextLine();
		
		String[] partes = palavra.split(" ");
		
		System.out.println("O sobrenome é: " + partes[partes.length - 1]);				
	}
	
	public static int somar(String num1, int num2) {
		return Integer.parseInt(num1) + num2;
	}

}
