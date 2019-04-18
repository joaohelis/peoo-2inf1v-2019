/**
 * 
 */
package br.ifrn.peoo.dep.abril18;

import java.util.Scanner;

/**
 * @author joaohelis
 *
 */
public class Temperaturas {
	
	public static void main(String[] args) {
		
		System.out.println("---------------------------------------");
		System.out.println("Bem vindos ao sistema de temperatura");
		System.out.println("---------------------------------------");
		
		String[] mesesDoAno = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio"};
		
		Scanner entrada = new Scanner(System.in);
		
		float[] temperaturas = new float[5];
		
		for(int i = 0; i < temperaturas.length; i++) {
			
			System.out.println("Informe a temperatura do mês " + (i+1));
			float temp = entrada.nextFloat();			
			temperaturas[i] = temp;			
		}
		
		int indiceMaiorTemperatura = 0;
		
		for(int i = 1; i < temperaturas.length; i++) {
			
			if(temperaturas[i] > temperaturas[indiceMaiorTemperatura]) {
				indiceMaiorTemperatura = i;
			}			
		}
		
		System.out.println("A maior temperatura registrada foi para o mês de " + mesesDoAno[indiceMaiorTemperatura]);
		System.out.println("A temperatura para este mês foi de " + temperaturas[indiceMaiorTemperatura] + " ºc");
		
	}

}
