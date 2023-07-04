package fundamentos.operadores;

public class Logicos {
	
	public static void main(String[] args) {
		/*
		 * Operadores Lógicos
		 * 
		 * 	&& operador e 
		 * 	|| operador ou
		 * 	^  operador ou exclusivo
		 * 	!  operador de negação
		 * 	!! operadaor de dupla negação
		 */
		
		boolean condicao_1 = true;
		boolean condicao_2 = 3 > 7;
		
		System.out.println(condicao_1 && condicao_2);
		System.out.println(condicao_1 || condicao_2);
		System.out.println(condicao_1 ^ condicao_2);
		System.out.println(!condicao_1);
		System.out.println(!!condicao_1);
		
	}
}
