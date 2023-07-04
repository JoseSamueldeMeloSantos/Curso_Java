package fundamentos.desafios;

import java.util.Scanner;

public class CalculoImc {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu peso em Kgs: ");
		double peso = Double.parseDouble(entrada.nextLine().strip());
		
		System.out.print("Digite sua altura em metros: ");
		double altura = Double.parseDouble(entrada.nextLine().strip());
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.printf("Seu IMC é: %.2f", imc);
		
		entrada.close();
	}
}
