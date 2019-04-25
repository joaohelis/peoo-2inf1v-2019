/**
 * 
 */
package br.ifrn.peoo.ca.abril25;

import java.util.Scanner;

/**
 * @author joaohelis
 *
 */
public class CadastroDeComputadores {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int qtdeDeComputadores = 3;
		
		int[] numeros = new int[qtdeDeComputadores];
		int[] memorias = new int[qtdeDeComputadores];
		String[] nomes = new String[qtdeDeComputadores];
		
		System.out.println("----------------------------------------");
		System.out.println("CADASTRO DE COMPUTADOR");
		System.out.println("----------------------------------------");
		
		for(int pos = 0; pos < qtdeDeComputadores; pos++) {
			
			System.out.print("\nInforme o número do computador: ");
			int num = Integer.parseInt(entrada.nextLine());
			numeros[pos] = num;
			
			System.out.print("Informe a memória: ");
			int mem = Integer.parseInt(entrada.nextLine());
			memorias[pos] = mem;
			
			System.out.print("Informe o nome do usuário: ");
			String nome = entrada.nextLine();
			nomes[pos] = nome;			
		}
		
		// PEGAR O COMPUTADOR COM A MAIOR MEMÓRIA
		
		int indiceMaiorMemora = 0;
		
		for(int i = 1; i < qtdeDeComputadores; i++) {
			if(memorias[i] > memorias[indiceMaiorMemora])
				indiceMaiorMemora = i;
		}
		System.out.println("----------------------------------------");
		System.out.println("O número do computador com maior memória é " + numeros[indiceMaiorMemora] + " - " + memorias[indiceMaiorMemora] + " GB");
		System.out.println("----------------------------------------");
		
		// MOSTRAR O NOME DOS USUÁRIOS COM COMPUTADORES COM MAIS DE 4 GB
		System.out.println("----------------------------------------");
		System.out.println("Os usuários que tem computadores com mais de 4 GB são:");
		System.out.println("----------------------------------------");
		for(int i = 0; i < qtdeDeComputadores; i++) {
			if(memorias[i] > 4) {
				System.out.println(nomes[i] + " - " + memorias[i] + " GB");
			}
			
		}
	}
}