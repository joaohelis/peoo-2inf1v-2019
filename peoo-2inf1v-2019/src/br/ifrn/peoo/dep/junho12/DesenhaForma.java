/**
 * 
 */
package br.ifrn.peoo.dep.junho12;

/**
 * @author joaohelis
 *
 */
public class DesenhaForma {
	
	public static void main(String[] args) {
		
		diagonal(5);
		
	}
	
	public static void quadrado(int n) {
		
		for(int j = 0; j < n; j++) {
			for(int i = 0; i < n; i++) {
				System.out.print("* ");
			}
			System.out.println();					
		}
	}
	
	public static void diagonal(int n) {
		
		// linhas
		for(int j = 0; j < n; j++) {
			
			// colunas
			for(int i = 0; i < n; i++) {
				
				if(i == j) {					
					System.out.print("# ");
				}else {
					System.out.print("* ");					
				}
				
			}
			System.out.println();
			
		}
	}
	
	public static void triangulo(int n) {
		
		// linhas
		for(int j = 0; j < n; j++) {
			
			// colunas
			for(int i = 0; i <= j; i++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}

}
