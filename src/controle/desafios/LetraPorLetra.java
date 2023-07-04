package controle.desafios;

import java.util.Scanner;

public class LetraPorLetra {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escreva uma palavra: ");
		String palavra = entrada.nextLine().strip();
		
		for (int i = 0; i < palavra.length(); i++) {
			System.out.printf("%5s \n", palavra.toUpperCase().charAt(i));
		}
		
		System.out.println("---FIM!---");
		
		entrada.close();
	}
}
