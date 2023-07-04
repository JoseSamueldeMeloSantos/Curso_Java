package controle;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int numero = Integer.parseInt(entrada.nextLine());
		
		if(numero % 2 == 0) {
			System.out.println("O número é par");
		} else {
			System.out.println("O número é impar");
		}
		
		entrada.close();
	}
}
