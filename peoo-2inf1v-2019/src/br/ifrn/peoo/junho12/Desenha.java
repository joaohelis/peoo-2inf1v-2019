/**
 * 
 */
package br.ifrn.peoo.junho12;

/**
 * @author joaohelis
 *
 */
public class Desenha {

	public static void main(String[] args) {

		quadrado(4);

	}

	public static void quadrado(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void diagonal(int n) {
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j == i)
					System.out.print("\\");
				else
					System.out.print("*");
			}
			System.out.println();						
		}
	}

	public static void triangulo(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
