package fundamentos.desafios;

import java.util.Scanner;

public class Potencias {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		double numero = entrada.nextDouble();
		
		System.out.printf("%.2f ao quadrado é: %.2f \n"
						 + "%.2f ao cubo é: %.2f",numero,Math.pow(numero, 2)
						 					 , numero, Math.pow(numero, 3));
		
		entrada.close();
	}
}
