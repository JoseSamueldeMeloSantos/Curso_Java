package controle.desafios;

import java.util.Scanner;

public class NumeroPrimoSwitch {
	
	public static void main(String[] args) {
		int quantDivisores = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um numero para verificar se é primo: ");
		int numero = entrada.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				quantDivisores++;
			}
		}
		
		switch (quantDivisores) {
			case 2:
				System.out.printf("O número %d é primo", numero);
				break;
			default:
				System.out.printf("O número %d não é primo", numero);
				break;
		}
		
		entrada.close();
	}
}
