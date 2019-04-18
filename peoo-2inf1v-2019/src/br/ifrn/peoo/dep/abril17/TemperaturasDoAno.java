/**
 * 
 */
package br.ifrn.peoo.dep.abril17;

import java.util.Scanner;

/**
 * @author joaohelis
 *
 */
public class TemperaturasDoAno {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio"};
		
		int qtdeMeses = 5;
		
		int[] temperaturas = new int[qtdeMeses];
		
		for(int i = 0; i < temperaturas.length; i++) {
			
			System.out.println("Informe a temperatura do mês " + (i+1));
			int temperatura = entrada.nextInt();
			
			temperaturas[i] = temperatura;
										
		}
		
		int indiceMaiorTemperatura = 0;
		
		for(int i = 1; i < temperaturas.length; i++) {
			
			if(temperaturas[i] > temperaturas[indiceMaiorTemperatura]) {
				indiceMaiorTemperatura = i;
			}
			
		}
		
		System.out.println("O mês com a maior temperatura foi o mês de " + meses[indiceMaiorTemperatura]);
		System.out.println("A maior temperatura registrada foi " + temperaturas[indiceMaiorTemperatura]);
		
	}

}
