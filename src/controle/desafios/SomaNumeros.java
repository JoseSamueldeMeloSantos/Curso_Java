package controle.desafios;

import java.util.Scanner;

public class SomaNumeros {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int totalNumero = 0;
				
		while (numero >= 0) {
			System.out.print("Digite um numero(negativo para sair): ");
			numero = Integer.parseInt(entrada.nextLine());
			
			if (numero >= 0) {
				totalNumero += numero;
				System.out.printf("A soma dos numeros digitados é: %d \n",totalNumero);
			}	
		}
		
		System.out.println("--Programa Encerrado!--");
		
		entrada.close();
	}
}
