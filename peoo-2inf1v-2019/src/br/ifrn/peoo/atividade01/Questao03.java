/**
 * 
 */
package br.ifrn.peoo.atividade01;

import java.util.Scanner;

/**
 * @author joaohelis
 *
 */
public class Questao03 {
	
	public static void main(String[] args) {		

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("-------------------------------------------------");
		System.out.println("VERIFICADOR DE SENHA");
		System.out.println("-------------------------------------------------");
		
		int senhaValida = 1234;
		
		System.out.print("Informe a senha: ");
		int senha = entrada.nextInt();
		
		System.out.println("-------------------------------------------------");
		System.out.println("RESULTADO DA VERIFICAÇÃO");
		System.out.println("-------------------------------------------------");
		
		if(senha == senhaValida)
			System.out.println(">> Acesso permitido!");
		else
			System.out.println(">> Acesso negado!");
		
	}

}
