/**
 * 
 */
package br.ifrn.peoo.atividade01;

import java.util.Scanner;

/**
 * @author joaohelis
 *
 */
public class Questao05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("-------------------------------------------------");
		System.out.println("ORDENAR VALORES");
		System.out.println("-------------------------------------------------");

		System.out.print("Informe o número 1: ");
		int n1 = entrada.nextInt();

		System.out.print("Informe o número 2: ");
		int n2 = entrada.nextInt();

		System.out.print("Informe o número 3: ");
		int n3 = entrada.nextInt();

		System.out.println("-------------------------------------------------");
		System.out.println("RESULTADO");
		System.out.println("-------------------------------------------------");

		if (n1 < n2 && n1 < n3) {
			if (n2 < n3)
				System.out.printf("%d, %d, %d", n1, n2, n3);
			else
				System.out.printf("%d, %d, %d", n1, n3, n2);
		} else if (n2 < n1 && n2 < n3) {
			if (n1 < n3)
				System.out.printf("%d, %d, %d", n2, n1, n3);
			else
				System.out.printf("%d, %d, %d", n2, n3, n1);
		} else {
			if (n1 < n2)
				System.out.printf("%d, %d, %d", n3, n1, n2);
			else
				System.out.printf("%d, %d, %d", n3, n2, n1);
		}

	}

}