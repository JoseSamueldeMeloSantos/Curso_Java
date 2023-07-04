package fundamentos.operadores;

public class Ternario {
	
	public static void main(String[] args) {
		
		//não tabalhe com mais de um operador ternário em uma mesma linha
		
		double media = 7.6;	
							//condição    verdadeira       falsa
		String resultado = media >= 7.0 ? "aprovado" : "em recuperação";
		
		System.out.println("O aluno está " + resultado);
	}
}
