/**
 * 
 */
package br.ifrn.peoo.maio30;

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
		float numero1 = Float.parseFloat(input.nextLine());
		
		System.out.print("Informe o segundo número: ");
		float numero2 = Float.parseFloat(input.nextLine());
		
		System.out.println("Você quer o maior ou o menor entre os números informados?");
		System.out.println("Se quer o maior, digite MAIOR, se quer o menor, digite MENOR");
		String operacao = input.nextLine();
		
		if(operacao.equals("MENOR")) {			
			float menor = menorValor(numero1, numero2);
			System.out.println("O menor valor é o número " + menor);
 		}else {
 			float maior = maiorValor(numero1, numero2);
 			System.out.println("O maior valor é o número " + maior); 			
 		}
	}
	
	public static float menorValor(float num1, float num2) {
		
		if(num1 < num2) {
			return num1;
		}else {
			return num2;
		}				
	}
	
	public static float maiorValor(float num1, float num2) {
		
		if(num1 > num2) {
			return num1;
		}else {
			return num2;
		}				
	}
	
	
}
