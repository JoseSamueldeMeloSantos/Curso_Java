package controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua média: ");
		double media = Double.parseDouble(entrada.nextLine());
		
		//só entra no IF se a condição for verdadeira
		if(media >= 7.0 && media <= 10) {
			System.out.println("Aprovado!!");
			System.out.println("Parabens!!");
		}
		
		if(media < 7 && media >= 4.5) {
			System.out.println("Recuperação!");
		}
		
		boolean criterioReprovacao = media < 4.5 && media >= 0;
		if(criterioReprovacao) {
			System.out.println("Reprovado!");
		}
		
		entrada.close();
	}
}
