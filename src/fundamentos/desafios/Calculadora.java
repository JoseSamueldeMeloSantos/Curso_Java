package fundamentos.desafios;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
			
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o 1° número: ");
		int num1 = Integer.parseInt(entrada.nextLine().strip());
		
		System.out.print("Digite o 2° número: ");
		int num2 = Integer.parseInt(entrada.nextLine().strip());
		
		System.out.print("Digite o operador desejado: ");
		String operador = entrada.nextLine().strip();
		
		
		
		int resultado = operador.equals("+") ? num1 + num2 : -999999999;
		
		resultado = operador.equals("-") ? num1 - num2 : resultado;
		
		resultado = operador.equals("*") ? num1 * num2 : resultado;
		
		resultado = operador.equals("/") ? num1 / num2 : resultado;
		
		resultado = operador.equals("%") ? num1 % num2 : resultado;
		
		String equacao = String.format("%d %s %d = ", num1, operador, num2);
		
		System.out.println(resultado != -999999999 ? equacao + resultado : "Esse operador não existe");
		/*
		System.out.println(operador.equals("+") ? 
							"%d + %d = %d".formatted(num1, num2, num1 + num2):
							"O operador de \"+\" não foi escolhido");
		
		System.out.println(operador.equals("-") ? 
							"%d - %d = %d".formatted(num1, num2, num1 - num2) : 
							"O operador \"-\" não foi ecolhido");
		
		System.out.println(operador.equals("*") ? 
						   "%d * %d = %d".formatted(num1, num2, num1 * num2) :
						   "O operador \"*\" não foi escolhido");
		
		System.out.println(operador.equals("/") ? 
						   "%d / %d = %d".formatted(num1, num2, num1 / num2) : 
						   "O operador \"/\" não foi escolhido");
		
		System.out.println(operador.equals("%") ? 
						   "%d  %d = %d".formatted(num1, num2, num1 % num2) :
						   "O operador \"%\" não foi escolhido"); 
		*/
		entrada.close(); 
	}
}
