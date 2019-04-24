/**
 * 
 */
package br.ifrn.peoo.dep.abril18;

import java.util.Scanner;

/**
 * @author joaohelis
 *
 */
public class Fatorial {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("---------------------------------------");
		System.out.println("Bem vindos ao sistema de cálculo do Fatorial");
		System.out.println("---------------------------------------");
		
		System.out.println("Informe um número: ");
		int num = input.nextInt();
		
		int resultado = num;
		
		for(int i = num-1; i > 1; i--) {
			resultado *= i;
		}
		
		System.out.println(resultado);
	}

}
