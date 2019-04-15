/**
 * 
 */
package br.ifrn.peoo.atividade01;

import java.util.Scanner;

/**
 * @author joaohelis
 *
 */
public class Questao02 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("-------------------------------------------------");
		System.out.println("Calculadora de Idade");
		System.out.println("-------------------------------------------------");
		
		System.out.print("Informe o ano atual: ");
		int anoAtual = entrada.nextInt();

		System.out.print("Informe o ano de nascimento: ");
		int anoNascimento = entrada.nextInt();
		
		int idade = anoAtual - anoNascimento;
		
		System.out.println("-------------------------------------------------");
		System.out.println("INFORMAÇÕES IMPORTANTES");
		System.out.println("-------------------------------------------------");
		System.out.println("IDADE: " + idade + " anos!");
		if(idade < 16)
			System.out.println("VOTO NÃO PERMITIDO!");
		else if(idade < 17 || idade >= 70)
			System.out.println("VOTO PERMITIDO (NÃO OBRIGATÓRIO)");
		else
			System.out.println("VOTO OBRIGATÓRIO!");				
	}

}
