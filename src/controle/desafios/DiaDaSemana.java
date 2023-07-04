package controle.desafios;

import java.util.Scanner;

public class DiaDaSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		String nomeDia = entrada.nextLine().strip().toLowerCase();
		
		if(nomeDia.equals("domingo")) {
			System.out.println("O dia é: 1");
		} else if(nomeDia.equals("segunda")) {
			System.out.println("O dia é: 2");
		} else if(nomeDia.equals("terça")
				 || nomeDia.equals("terca")) {
			System.out.println("O dia é: 3");
		} else if(nomeDia.equals("quarta")) {
			System.out.println("O dia é: 4");
		} else if(nomeDia.equals("quinta")) {
			System.out.println("O dia é: 5");
		} else if(nomeDia.equals("sexta")) {
			System.out.println("O dia é: 6");
		} else if(nomeDia.equals("sábado") 
				|| nomeDia.equals("sabado")) {
			System.out.println("O dia é: 7");
		} else {
			System.out.println("Este dia não existe!!!");
		}
		
		entrada.close();
	}
}
