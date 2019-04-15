/**
 * 
 */
package br.ifrn.peoo.atividade01;

import java.util.Scanner;

/**
 * @author joaohelis
 *
 */
public class Questao04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("-------------------------------------------------");
		System.out.println("CALCULAR VALOR DA COMPRA");
		System.out.println("-------------------------------------------------");
		System.out.println("-------------------------------------------------");
		System.out.println(">>>>>> PREÇO DA MAÇÃ <<<<<<");
		System.out.println("Quantidade >= 12 - R$ 0.25 por unidade");
		System.out.println("Quantidade  < 12 - R$ 0.30 por unidade");
		System.out.println("-------------------------------------------------");

		System.out.print(">> Informe a quantidade de maçãs a serem compradas: ");
		int qtdeMacas = entrada.nextInt();
		
		float precoPorUnidade = 0.30f;
		if(qtdeMacas >= 12)
			precoPorUnidade = 0.25f;
		
		float precoTotal = qtdeMacas * precoPorUnidade;
			
		System.out.println("\n-------------------------------------------------");
		System.out.println("INFORMAÇÕES DA COMPRA");
		System.out.println("-------------------------------------------------");
		System.out.printf("%d maçãs x R$ %.2f \n", qtdeMacas, precoPorUnidade);
		System.out.printf("TOTAL = R$ %.2f", precoTotal);
	}
}