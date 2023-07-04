package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		while(!texto.equalsIgnoreCase("sair")) {
			System.out.print("Digite \"sair\" para encerrar o programa: ");
			texto = entrada.nextLine().strip();
		}
		
		System.out.println("FIM!");
		
		entrada.close();
	}
}
	