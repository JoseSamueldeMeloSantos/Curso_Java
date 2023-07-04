package fundamentos;

public class VariaveisEConstantes {
	
	public static void main(String[] args) {
		/*
		 * para definir uma variável
		 * 
		 *  tipo nome_variavel = valor;
		 *  
		 *  ex:
		 *  	int numero = 3;
		 *  
		 *  para definir uma constante
		 *  
		 *  final tipo NOME_CONSTANTE = valor;
		 *  
		 *  final int NUMERO = 3;
		 */
		double raio,area;
		final double PI;
		
		raio = 3.4;
		PI = 3.14159;
		
		area = PI * raio * raio;
		
		System.out.println(area);
	
	}
}
