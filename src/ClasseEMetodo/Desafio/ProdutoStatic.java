package ClasseEMetodo.Desafio;

public class ProdutoStatic {

	String nome;
	double preco;
	static final double DESCONTO = 0.25;

	ProdutoStatic(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double calculoDesconto () {
		return preco * (1 - DESCONTO);
	}
}
