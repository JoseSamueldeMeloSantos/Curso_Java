package fundamentos.desafios;

import java.util.Scanner;

public class EquacaoSegundoGrau {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor de a: ");
		double a = entrada.nextDouble();
		
		System.out.print("Digite o valor de b: ");
		double b = entrada.nextDouble();
		
		System.out.print("Digite o valor de c: ");
		double c = entrada.nextDouble();
		
		double delta = (Math.pow(b, 2)) - (4 * b * c);
		
		double bhaskaraPositivo = (-b  + Math.sqrt(delta) ) / (2 * a); 
		
		double bhaskaraNegativo = (-b - Math.sqrt(delta) ) / (2 * a);
		
		System.out.printf("Sua equação é: %.0fx² + %.0fx + %.0f = 0 \n"
				        + "delta = %.2f \n"
				        + "x positivo = %.2f \n"
				        + "x negativo = %.2f \n", a, b, c, delta
				        						, bhaskaraPositivo,bhaskaraNegativo);
		
		entrada.close();
	}
}
