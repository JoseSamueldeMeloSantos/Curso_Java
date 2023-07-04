package fundamentos.operadores;

public class Unarios {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++;// a = a + 1
		a--;// a = a - 1
		
		//mesma coisa escrita de um jeito diferente
		++b; 
		--b;
		
		System.out.println(++a == b--);

		/*
		 * ORDEM DE PRECEDÊNCIA
		 * 
		 * 	1° --a, ++a
		 * 	2° a--, a++
		 */
	}
}
