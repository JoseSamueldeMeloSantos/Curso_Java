package excecao;

public class Basico {
//sempre tente tratar erro de forma especifica
	public static void main(String[] args) {
		//thread são linhas de execução
		

		Produto p1 = null;
		
		try {			
			imprimirProduto(p1);
		} catch(Exception excecao) {//tratando de forma generica
			System.out.println("Ocorreu um erro ");
		}
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {//tratando de forma espécifica
			System.out.println("Ocorreu um erro: " + e.getMessage());;
		}
		
		System.out.println("fim :)");
	}
	
	//o bloco try tem um codigo que pode gerar um erro
	//o bloco catch tem um codigo que trata/mostrar mensagem/silênciar o erro do try
	//(para silênciar o erro é só não escrever nada[não é recomendado silênciar o erro])
	
	
	public static void imprimirProduto(Produto produto) {
		System.out.println(produto.nome);
	}
}
