package fundamentos.desafios;

import java.util.Scanner;

public class AreaTriangulo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor da base do triângulo: ");
		double base = entrada.nextDouble();
		
		System.out.print("Digite o valor da altura do triângulo: ");
		double altura = entrada.nextDouble();
		
		double area =  base * altura / 2;
		
		System.out.printf("O valor da área do triângulo é: %.2f",area);
		
		entrada.close();
	}
}
