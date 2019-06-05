/**
 * 
 */
package br.ifrn.peoo.ca.abril25;

/**
 * @author joaohelis
 *
 */
class IncrementoDecremento {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int c = 1;
		c = 0;
		
		System.out.println( c--);
		System.out.println( ++c);
		System.out.println(c);
		
		c -= --c - c++;
		
		System.out.println(c--);
		System.out.println(++c);
		System.out.println(c);
		
	}

}
