package controle.desafios;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner entrada = new Scanner(System.in);
		
		int quantTentativa = 10;
		int numeroMaquina = random.nextInt(100 - 0 + 1) - 0;

		System.out.println("*===Tentente adivinhar um numero de 0 a 100===*");
		
		do {
			System.out.print("Tente adivinha o numero: ");
			int numeroJogador = Integer.parseInt(entrada.nextLine());
			
			if (numeroMaquina == numeroJogador) {
				System.out.println("Barabéns.Você acertou!");
				quantTentativa = 0;
			} else {
				quantTentativa--;
				
				System.out.printf("Você errou! \n");
				
				if (numeroJogador > numeroMaquina) {
					System.out.println("O número da máquina é menor");
				} else if(numeroJogador < numeroMaquina) {
					System.out.println("O número da máquina é maior");
				}
				
				System.out.printf("lhé resta %d tentativas \n", quantTentativa);
			}
			
			System.out.println("============================");
		} while(quantTentativa > 0);
		
		System.out.println("--FIM!--");
		
		entrada.close();
	}
}
