package fundamentos.desafios;

import java.util.Scanner;

public class PrimeirLetraMaiuscula {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite se nome completo: ");
		String nome = entrada.nextLine();
		
		String primeira_letra_maiuscula = nome
										.toLowerCase()//irá deixar em minúsculo
										.substring(0,1)//depois pega a primeira letra da palavra
										.toUpperCase()//deixa ela em maiúsculo
										.concat(nome.substring(1));//e por fim ele junta tudo
		
		System.out.printf("\nO nome com a primeira letra em maiusculo e: %s"
						,primeira_letra_maiuscula);
		
		entrada.close();
	}
}
