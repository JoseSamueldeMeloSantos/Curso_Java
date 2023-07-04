package controle.desafios;

import java.util.Scanner;

public class AnoBissexto {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um ano: ");
		int ano = Integer.parseInt(entrada.nextLine());
		
		if (ano % 4 == 0
			&& ano % 100 != 0
			|| ano % 400 == 0) {
			System.out.printf("%d é Bissexto", ano);
		} else {
			System.out.printf("%d não é Bissexto",ano );
		}
		
		entrada.close();
	}
}
