package fundamentos.operadores;

public class Aritimeticos {
	
	public static void main(String[] args) {
		/*
		 * operadores aritiméricos
		 * 
		 * 	+ soma
		 * 	- subtração
		 * 	* multiplicação
		 * 	/ divisão
		 * 	% resto da divisão
		 * 
		 * 	Math.pow(a,b) -> função usada para fazer uma exponenciação
		 * 
		 * OBS: O resulado de uma divisão entre dois números inteiros sempre vai ser inteiro
		 * 
		 * 		para obter uma divisão real é necessário que um dos operandos seja real
		 * 			EX:
		 * 				1 / 2.0
		 * 
		 * Ordem de precedência
		 *	
		 *	1° () -> parenteses
		 *	2° *, /, % 
		 *	3° +, -
		 */
	
		System.out.println(10 + 2);
		System.out.println(10 - 2);
		System.out.println(10 * 2);
		System.out.println(10 / 2);
		System.out.println(10 % 2);
		System.out.println(Math.pow(10, 2));
	}
}
