package controle.desafios;

import java.util.Scanner;

public class NumeroPrimo {
	
	public static void main(String[] args) {
		int quantDivisores = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = Integer.parseInt(entrada.nextLine());
		
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				quantDivisores++;
			}
		}
		
		if (quantDivisores == 2) {
			System.out.printf("O número %d é primo", numero);
		} else {
			System.out.printf("O número %d não é primo", numero);
		}
		
		entrada.close();
	}
}
