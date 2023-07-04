package fundamentos.desafios;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
		boolean primeiro_trabalho, segundo_trabalho,
				televisao_50pl, televisao_32pl, sorvete,
				mais_saudavel;
		
		primeiro_trabalho = true;
		segundo_trabalho = false;
		
		televisao_50pl = primeiro_trabalho && segundo_trabalho;
		televisao_32pl = primeiro_trabalho ^ segundo_trabalho;
		
		sorvete = televisao_50pl || televisao_32pl;
		mais_saudavel = !sorvete;
		
		System.out.printf("Oque vai acontecer? \n\n"
						+ "Vai comprar a televisão de 50 "
						+ "polegadas?: %b \n"
						+ "vai comprar a televisão de 32 polegadas?: %b \n"
						+ "vai ter sovete?: %b \n"
						+ "mais saudável?: %b ", televisao_50pl, televisao_32pl, sorvete,mais_saudavel);
	}
}
