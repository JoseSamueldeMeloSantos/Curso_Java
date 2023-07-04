package ClasseEMetodo.Desafio.restaurante;

import java.util.Scanner;

public class Jantar {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Pessoa cliente = new Pessoa("José Samuel", 65.0, 1.76);
		
		Comida arroz = new Comida("Arroz", 125);
		Comida feijao = new Comida("Feijão", 50);
		Comida macarrao = new Comida("Macarrão", 100);
		Comida cuscuz = new Comida("Cuscuz", 100);
		Comida inhame = new Comida("Inhame", 100);
		Comida pure = new Comida("Purê", 100);
		Comida batataFrita = new Comida("Batata-frita", 300);
		Comida bife = new Comida("Bife", 90);
		Comida frango = new Comida("Frango", 140);
		Comida linguica = new Comida("Linguiça", 50);
		Comida salada = new Comida("Salada", 100);
		
		System.out.println("====================Restaurante Java====================");
		
		String alimentoPrato = "";
		double pesoInicial = cliente.peso;
		int escolha = 0;
		
		do {
			System.out.printf("\n %37s \n\n", ("*----cardapio----*"));
			System.out.printf(" 1 - %s (%.2fg) \n"
							+ " 2 - %s (%.2fg) \n"
							+ " 3 - %s (%.2fg) \n"
							+ " 4 - %s (%.2fg) \n"
							+ " 5 - %s (%.2fg) \n"
							+ " 6 - %s (%.2fg) \n"
							+ " 7 - %s (%.2fg) \n"
							+ " 8 - %s (%.2fg) \n"
							+ " 9 - %s (%.2fg) \n"
							+ " 10 - %s (%.2fg) \n"
							+ " 11 - %s (%.2fg) \n"
							+ " 12 - Sair do cardapio \n\n", arroz.NOME, arroz.PESO
											 			   , feijao.NOME, feijao.PESO
											 			   , macarrao.NOME, macarrao.PESO
											 			   , cuscuz.NOME, cuscuz.PESO
											 			   , inhame.NOME, inhame.PESO
											 			   , pure.NOME, pure.PESO
											 			   , batataFrita.NOME, batataFrita.PESO
											 			   , bife.NOME, bife.PESO
											 			   , frango.NOME, frango.PESO
											 			   , linguica.NOME, linguica.PESO
											 			   , salada.NOME, salada.PESO);
			
			do { 
				System.out.print("escolha a comida de sua preferência: ");
				escolha = entrada.nextInt(); 
			} while (escolha < 1 || escolha > 12);
			
			switch (escolha) {
				case 1:
					alimentoPrato += String.format("%s \n", arroz.NOME);
					cliente.comer(arroz);
					break;
				case 2:
					alimentoPrato += String.format("%s \n", feijao.NOME);
					cliente.comer(feijao);
					break;
				case 3:
					alimentoPrato += String.format("%s \n", macarrao.NOME);
					cliente.comer(macarrao);
					break;
				case 4:
					alimentoPrato += String.format("%s \n", cuscuz.NOME);
					cliente.comer(cuscuz);
					break;
				case 5:
					alimentoPrato += String.format("%s \n", inhame.NOME);
					cliente.comer(inhame);
					break;
				case 6:
					alimentoPrato += String.format("%s \n", pure.NOME);
					cliente.comer(pure);
					break;
				case 7:
					alimentoPrato += String.format("%s \n", batataFrita.NOME);
					cliente.comer(batataFrita);
					break;
				case 8:
					alimentoPrato += String.format("%s \n", bife.NOME);
					cliente.comer(bife);
					break;
				case 9:
					alimentoPrato += String.format("%s \n", frango.NOME);
					cliente.comer(frango);
					break;
				case 10:
					alimentoPrato += String.format("%s \n", linguica.NOME);
					cliente.comer(linguica);
					break;
				case 11:
					alimentoPrato += String.format("%s \n", salada.NOME);
					cliente.comer(salada);
					break;
			}
			
		} while (escolha != 12);
		
		System.out.printf("\n%s entrou com %.2fKg e saiu do restaurante com %.2fKg \n", cliente.NOME, pesoInicial, cliente.peso);
		System.out.printf("Alimetos injeridos:\n%s", alimentoPrato);
		System.out.printf("Condição corporal após sair do restaurante: %s", cliente.classificacaoImc());
		
		entrada.close();
	}
}
