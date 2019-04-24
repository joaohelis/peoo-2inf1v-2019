/**
 * 
 */
package br.ifrn.peoo.abril24;

import java.util.Scanner;

/**
 * @author joaohelis
 *
 */
public class CadastroDeComputador {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int qtdeComputadores = 3;
		
		int[] capacidadesMem = new int[qtdeComputadores];
		int[] numerosComp = new int[qtdeComputadores];
		String[] nomesUsuarios = new String[qtdeComputadores];
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Sistema de Cadastro de Computadores");
		System.out.println("-----------------------------------------------------------------------");
		
		// Realiza a inserção dos dados nos vetores
		for(int i = 0; i < qtdeComputadores; i++) {			
			System.out.print("\nInforme o nome do usuário: ");
			String nome = entrada.nextLine();
			
			System.out.print("Informe a capacidade de armazenamento: ");
			int capacidadeMem = Integer.parseInt(entrada.nextLine());
			
			System.out.print("Informe o número do computador: ");
			int numComp = Integer.parseInt(entrada.nextLine());
			
			capacidadesMem[i] = capacidadeMem;
			numerosComp[i] = numComp;
			nomesUsuarios[i] = nome;			
		}
		
		// Verifica o índice do computador com a maior capacidade de armazenamento
		
		int indiceComputadorMaiorMem = 0;
		for(int i = 1; i < qtdeComputadores; i++) {
			if(capacidadesMem[i] > capacidadesMem[indiceComputadorMaiorMem])
				indiceComputadorMaiorMem = i;
		}
		System.out.println("\n-----------------------------------------------------------------------");
		System.out.println("O computador com a maior capacidade de armazenamento é o de número: " 
						  + numerosComp[indiceComputadorMaiorMem] + " com " + capacidadesMem[indiceComputadorMaiorMem] + " GB");
		
		// Verifica os computadores com memória maior de 4 GB
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Os seguintes usuários utilizam computadores com mais de 4 GB");
		System.out.println("-----------------------------------------------------------------------");
		for(int i = 0; i < qtdeComputadores; i++) {
			if(capacidadesMem[i] > 4) {
				System.out.println(">> " + nomesUsuarios[i] + " | " + capacidadesMem[i] + " GB");
			}
		}
	}
}
