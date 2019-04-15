/**
 * 
 */
package br.ifrn.peoo.atividade01;

import java.util.Scanner;

/**
 * @author joaohelis
 *
 */
public class Questao01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("-------------------------------------------------");
		System.out.println("Bem vind@ ao programa verificador do maior valor!");
		System.out.println("-------------------------------------------------");

		System.out.print("Informe o valor 1: ");
		int valor1 = entrada.nextInt();

		System.out.print("Informe o valor 2: ");
		int valor2 = entrada.nextInt();

		System.out.println("-------------------------------------------------");
		System.out.println("RESULTADO");
		System.out.println("-------------------------------------------------");

		System.out.print("O maior valor informado foi: ");
		if (valor1 > valor2) {
			System.out.println(valor1);
		} else {
			System.out.println(valor2);
		}
	}
}
