package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.print("Fale a palavra mágica para sair: ");
			texto = entrada.nextLine().strip();
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado!! \n"
						+ "Fim!!");
		entrada.close();
	} 
}
