/**
 * 
 */
package br.ifrn.peoo.ca.junho06;

import java.util.Scanner;

/**
 * @author joaohelis
 *
 */
public class MaiorMenorValor {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("----------------------------------------------");
		System.out.println("Bem vindo ao sistema de verificação numérica");
		System.out.println("----------------------------------------------");

		System.out.print("Informe o primeiro número: ");
		int numero1 = Integer.parseInt(input.nextLine());

		System.out.print("Informe o segundo número: ");
		int numero2 = Integer.parseInt(input.nextLine());

		System.out.println("Você quer o maior ou o menor entre os números informados?");
		System.out.print("Se quer o maior, digite MAIOR, se quer o menor, digite MENOR\n> ");
		String operacao = input.nextLine();

		///

		if (operacao.equalsIgnoreCase("MENOR")) {
			int menorValor = menor(numero1, numero2);
			System.out.println("O menor valor é o número " + menorValor);
		} else if (operacao.equalsIgnoreCase("MAIOR")) {
			int maiorValor = maior(numero1, numero2);
			System.out.println("O maior valor é o número " + maiorValor);
		} else {
			System.out.println("OPERAÇÃO INVÁLIDA!");
		}
	}

	public static int maior(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}

	public static int menor(int num1, int num2) {
		if (num1 < num2) {
			return num1;
		} else {
			return num2;
		}
	}

}