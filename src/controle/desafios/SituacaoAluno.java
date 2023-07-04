package controle.desafios;

import java.util.Scanner;

public class SituacaoAluno {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua 1° nota: ");
		double primeiraNota = Double.parseDouble(entrada.nextLine());
		System.out.print("Digite sua 2° nota: ");
		double segundaNota = Double.parseDouble(entrada.nextLine());
		
		double media = (primeiraNota + segundaNota) / 2;
		
		if(media >= 7) {
			System.out.println("Aprovado!");
		} else if (media > 4 && media < 7) {
			System.out.println("Recuperação!");
		} else {
			System.out.println("Reprovado!");
		}
		
		entrada.close();
	}
}
