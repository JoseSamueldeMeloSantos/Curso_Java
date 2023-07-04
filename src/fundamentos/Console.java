package fundamentos;

import java.util.Scanner;
//é para usar o Scanner do java.util
public class Console {
	
	public static void main(String[] args) {
		//disponibiliza  o uso do imput
		Scanner entrada = new Scanner(System.in);//necessario para pegar um valor de entrada
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();//guarda o valor digitado na variável
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();/*
		dependendo do valor da entrada,o next varia
		*/
		
		System.out.print("Digite seu salario: ");
		double salario = entrada.nextDouble();
		
				
		System.out.printf("Nome: %s \n"
						+ "Idade: %d \n"
						+ "Salario: R$%,.2f \n", nome, idade, salario);
		
		//é necessario fechar o input após terminar de usar ele
		entrada.close();
		/*
		Scanner teclado = new Scanner(System.in);
		 
	    System.out.print("Qual a sua idade?");
	    int idade = teclado.nextInt();
	    teclado.nextLine(); quando for ler um valor inteiro ou real antes de uma string,coloque um nextLine() na linha seguinte 
	    
	    System.out.print("Qual o seu nome?");
	    String nome = teclado.nextLine();
	    System.out.print("Qual o seu sobrenome?");
	    String sobrenome = teclado.nextLine();
	 
	    teclado.close();
		 */
	}
}
