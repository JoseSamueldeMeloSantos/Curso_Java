package array;

import java.util.Scanner;

public class NotasAluno {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas notas você deseja informar?: ");
		int quantNotas = entrada.nextInt();
		
		double[] notas = new double[quantNotas];
		
		for (int i = 0; i < notas.length; i++) {
			
			do {
				System.out.printf("Digite a %d° nota: ", (i + 1));
				notas[i] = entrada.nextDouble();
			}while(notas[i] < 0 || notas[i] > 10);
			
		}
		
		double totalNotas = 0;
		for (double nota: notas) {
			totalNotas += nota;
		}
		
		double media = totalNotas / notas.length;
		System.out.println("A sua média é: " + media);
	
		entrada.close();
	}
}
