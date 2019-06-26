/**
 * 
 */
package br.ifrn.peoo.dep.junho12;

/**
 * @author joaohelis
 *
 */
public class Desenha {

	public static void main(String[] args) {

		imprimeNomeEmDiagonal("vou-tirar-100-hoje");

	}

	public static void imprimeNomeEmDiagonal(String nome) {

		String[] partes = nome.split(" ");

		String sobrenome = partes[partes.length - 1];
		
		sobrenome = sobrenome.toUpperCase();

		// {"João", "Helis", "Bernardo"} length-1
		
		int n = sobrenome.length();

		for (int j = 0; j < n; j++) { // imprime as linhas

			// imprime as colunas
			for (int i = 0; i < n; i++) {
				if (i == j) {
					System.out.print(sobrenome.charAt(i) + " ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();

		}

	}

	public static void quadrado(int n) {

		for (int j = 0; j < n; j++) { // imprime as linhas

			// imprime as colunas
			for (int i = 0; i < n; i++) {
				System.out.println("* ");
			}
			System.out.println();

		}
	}
	
	// * * *
	// * * 
	// *

	public static void diagonal(int n) {

		for (int j = 0; j < n; j++) { // imprime as linhas

			// imprime as colunas
			for (int i = 0; i < n; i++) {
				if (i == j) {
					System.out.print("\\");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();

		}
	}

	public static void triangulo(int n) {

		for (int j = 0; j < n; j++) { // imprime as linhas

			// imprime as colunas
			for (int i = 0; i <= j; i++) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}
}
