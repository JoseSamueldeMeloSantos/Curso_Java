package excecao;

public class Produto {
	
	String nome;
	double preco;
	double desconto;

	double calculoDesconto () {
		return preco * (1 - desconto);
	}
}
 