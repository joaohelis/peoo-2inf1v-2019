/**
 * 
 */
package br.ifrn.peoo.atividade01;

import java.util.Scanner;

/**
 * @author joaohelis
 *
 */
public class Questao06 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("-------------------------------------------------");
		System.out.println("Bem vind@ ao programa calculador do peso ideal!");
		System.out.println("-------------------------------------------------");
		
		System.out.print("Informe o sexo (1 - M) (2 - F): ");
		int sexo = entrada.nextInt();
		
		System.out.print("Informe a altura: ");
		float altura = entrada.nextFloat();
		
		float pesoIdeal = 0f;
		if(sexo == 1)
			pesoIdeal = (72.7f * altura) - 58;
		else
			pesoIdeal = (62.1f * altura) - 44.7f;
		
		System.out.println("-------------------------------------------------");
		System.out.println("SEU PESO IDEAL É: " + pesoIdeal);
		System.out.println("-------------------------------------------------");
	}
}