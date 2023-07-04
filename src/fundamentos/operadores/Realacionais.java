package fundamentos.operadores;

public class Realacionais {
	
	public static void main(String[] args) {
		/*
		 * Operadores Relacionais
		 * 	
		 * 	> maior que
		 * 	>= maior ou igual que
		 *  < menor que
		 *  <= menor ou igual que
		 *  == igual
		 * 
		 * retorna valores booleanos
		 */
				
		System.out.println(3 == 4);
		System.out.println(30 != 7);
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
	}
}
