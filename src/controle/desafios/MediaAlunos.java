package controle.desafios;

import java.util.Scanner;

public class MediaAlunos {
	//calcular a media das notas de uma turma
	//nota invalida não pode contar 
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float nota = 0, totalNota = 0;
		int quantNota = 0;
		
		while (nota != -1) {
			System.out.print("Digite sua nota(-1 para parar): ");
			nota = Float.parseFloat(entrada.nextLine());
			
			if (nota >= 0 && nota <= 10) {
				totalNota += nota;
				quantNota++;
			} else if (nota != -1) {
				System.out.println("Digite uma nota valida!!!");
			}
		}
		
		float media = totalNota / quantNota;
		System.out.printf("A média da sala é: %.2f", media);
		
		entrada.close();
	}
}
