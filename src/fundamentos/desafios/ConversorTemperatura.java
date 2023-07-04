package fundamentos.desafios;

import java.util.Scanner;

public class ConversorTemperatura {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual opção você deseja? \n"
					   + "[C] Celcius para Fahrenheit \n"
					   + "[F] Fahrenheit para Celsius \n"
					   + ">");
		String tipoConversao = entrada.nextLine()
									  .strip()
									  .toUpperCase();
		
		System.out.printf("Dige a temperatura em °%s:", tipoConversao);
		double temperatura = Double.parseDouble(entrada.nextLine().strip());
													
													       // C -> F                    F -> C
		double conversao = tipoConversao.equals("C") ? (temperatura * 9/5) + 32 : (temperatura - 32) * 5/9 ;
		
		System.out.printf("%f°%s convertido é %.2f", temperatura, tipoConversao, conversao);
			
		entrada.close();
		
	}
}
