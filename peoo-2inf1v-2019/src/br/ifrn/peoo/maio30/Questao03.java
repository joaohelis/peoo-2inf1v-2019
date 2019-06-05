/**
 * 
 */
package br.ifrn.peoo.maio30;

/**
 * @author joaohelis
 *
 */
public class Questao03 {
	
	public static void main(String[] args) {
		System.out.println(maiorValor(10, 20, 30));
	}
	
	public static float maiorValor(float num1, float num2, float num3) {
		float maior = Math.max(num1, num2);
		maior = Math.max(maior, num3);
		return maior;
	}

}
