package ClasseEMetodo.Classe;
//para criar um tipo
public class Produto {
	//para definir as caractqueristicas da classe.
	String nome;
	double preco;
	double desconto;
	//quando for instânciar o objeto é necessário 
	//atribuir valor á todos esse atributos
	
	
	//quando o dado já esta na classe não precissa receber nada
	//pq tudo que você for usar já está aqui
	double calculoDesconto () {
		return preco * (1 - desconto);
	}
}
 