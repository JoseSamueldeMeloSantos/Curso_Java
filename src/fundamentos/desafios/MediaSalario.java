package fundamentos.desafios;

import java.util.Scanner;

public class MediaSalario {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		System.out.printf("Digite o valor de seu primerio salário: R$");
		String valor_1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o valor do seu segundo salário: R$");
		String valor_2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o valor de seu terceiro salário: R$");
		String valor_3 = entrada.nextLine().replace(",", ".");
		
		double salario_1 = Double.parseDouble(valor_1);
		double salario_2 = Double.parseDouble(valor_2);
		double salario_3 = Double.parseDouble(valor_3);
		
		double media_salario = (salario_1 + salario_2 + salario_3) / 3;	
	
		System.out.printf("A média dos três salários é: R$%,.2f", media_salario);
		
		entrada.close();
	}
}
