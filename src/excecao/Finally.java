package excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		try {	
			System.out.println(7 / entrada.nextInt());
			
			//entrada.close(); //caso aconteca o erro essa codigo não é executado
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {//sempre vai ser executado com erro ou não
			System.out.println("Finally #01");
			entrada.close();
		}
		
		//coloque no finally coisas que vc deseja que sempre será executada
		//com erro ou não
		
		/*
		 
		 é possivel colocar um finally sem un catch
		 
		try {	
			System.out.println(7 / entrada.nextInt());
			
			//entrada.close(); //caso aconteca o erro essa codigo não é executado
		} finally {//sempre vai ser executado com erro ou não
			System.out.println("Finally #01");
			entrada.close();
		}
		*/
		
		System.out.println("Fim!");
	}
}
