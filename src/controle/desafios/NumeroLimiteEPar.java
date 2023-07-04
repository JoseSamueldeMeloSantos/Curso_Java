package controle.desafios;

import java.util.Scanner;

public class NumeroLimiteEPar {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int numero = Integer.parseInt(entrada.nextLine());
		
		if (numero >= 0 && numero <= 10) {
			if (numero % 2 == 0) {
				
				System.out.println("O número está no limite de 0 à 10 \n"
								+ "O número é par");
			}
		}
		
		entrada.close();
	}
}
