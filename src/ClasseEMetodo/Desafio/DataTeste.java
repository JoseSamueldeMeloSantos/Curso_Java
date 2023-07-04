package ClasseEMetodo.Desafio;

import java.util.Scanner;

public class DataTeste {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Data aniversario0 = new Data();
		
		Data aniversario1 = new Data(15, 3, 2002);
		/*
		aniversario1.dia = 15;
		aniversario1.mes = 3;
		aniversario1.ano = 2002;
		*/
		Data aniversario2 = new Data(6, 5, 2005);
		/*
		aniversario2.dia = 6;
		aniversario2.mes = 5;
		aniversario2.ano = 2005;
		*/
		//adicional------------------------------------------------
		System.out.print("Digite o dia do seu nascimento: ");
		int dia = entrada.nextInt();
		System.out.print("Digite o mês no qual você nasceu: ");
		int mes = entrada.nextInt();
		System.out.print("Digite o ano do seu nascimento: ");
		int ano = entrada.nextInt();
		
		if (dia == aniversario1.dia
			&& mes == aniversario1.mes
			&& ano == aniversario1.ano) {
			System.out.println("Seu nome é Jose Samuel de Melo Santos. \n"
							 + "Você nasceu em " + aniversario1.dataFormatada());
		} else if (dia == aniversario2.dia
				   && mes == aniversario2.mes
				   && ano == aniversario2.ano) {
			System.out.println("Seu nome é Ana Clara de Melo Santos. \n"
							 + "Você nasceu em %d/%d/%d " + aniversario2.dataFormatada());
		} else {
			System.out.println("Você não está cadrastrado no sistema. \n"
							 + "Mas meu marco zero é em " + aniversario0.dataFormatada());
		}
		
		entrada.close();
	}
}
