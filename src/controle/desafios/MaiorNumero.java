package controle.desafios;

import java.util.Scanner;

public class MaiorNumero {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int quantValores = 0;
		int maiorNumero = 0;
		do {
			System.out.print("Digite um numero: ");
			int numero = entrada.nextInt();
			
			if (quantValores == 0) {
				maiorNumero = numero;
			} else if (numero > maiorNumero) {
				maiorNumero = numero;
			}
			
			quantValores++;
		} while (quantValores != 10);
		
		System.out.println("O maior número digitado foi: " + maiorNumero);
		
		entrada.close();
	}
}
