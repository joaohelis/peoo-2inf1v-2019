/**
 * 
 */
package br.ifrn.peoo.ca.junho06;

import java.util.Random;
import java.util.Scanner;

/**
 * @author joaohelis
 *
 */
public class Questao3 {
	
	public static void main(String[] args) {
		
//		Scanner entrada = new Scanner(System.in);
//		
//		System.out.println("Informe o primeiro número");
//		int primeiroNum = Integer.parseInt(entrada.nextLine());
//		
//		System.out.println("Informe o segundo número");
//		int segundoNum = Integer.parseInt(entrada.nextLine());		
//		
//		System.out.println("Informe o terceiro número");
//		int terceiroNum = Integer.parseInt(entrada.nextLine());
//		
//		int menor = menorValorUsandoMin(primeiroNum, segundoNum, terceiroNum);
//		
//		System.out.println("O menor valor dentre os números informados foi: " + menor );
		
		
//		System.out.println(menorValor(num1, num2, num3));
		
//		System.out.println(maiorValorDoVetor(new int[]{10, 20, 5, 3, 1, 0}));
		
		System.out.println(dado());
	}
	
	public static int menorValor(int num1, int num2, int num3) {
		
		int menor = num1;
		
		if(num2 < menor)
			menor = num2;
		
		if(num3 < menor) {
			menor = num3;
		}
		
		return menor;
	}
	
	public static int menorValorUsandoMin(int num1, int num2, int num3) {
		int menor = Math.min(num1, num2);
		menor = Math.min(menor, num3);
		return menor;
	}
	
	public static int maiorValorDoVetor(int[] numeros) {
		int maior = numeros[0];
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] > maior)
				maior = numeros[i];
		}
		return maior;		
	}
	
	public static int dado() {
		Random random = new Random();		
		int ladoDoDado = random.nextInt(6) + 1;
		return ladoDoDado;
	}
	
	
	

}
