package ClasseEMetodo.Classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		/*
		 * para instânciar um objeto
		 * 
		 * tipo nomeVariavel = new tipo();
		 * ex:
		 * 		Scanner entrada = new Scanner(system.in);
		 * 
		 * esse new é  a palavra reserva em java responsavel para
		 * chamar um construor(o nome do construtor é exatamente o nome da classe)
		 * 
		 * o construtor é responsavel por criar uma objeto
		 */
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4_356.89;
		p1.desconto = 0.25; 
		
		Produto p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println("1° produto: " + p1.nome);
		System.out.println("2° produto: " + p2.nome);
		
		//com parenteses é um método,sem parenteses é um atributo
		double notebookDesconto = p1.calculoDesconto();
		System.out.printf("Valor do Notebook com desconsto: R$%,.2f \n", notebookDesconto);
		
		double canetaDesconto = p2.calculoDesconto();
		System.out.printf("Valor da Caneta Preta com desconto: R$%,.2f \n", canetaDesconto);
		
		double valorMedioGasto = (notebookDesconto + canetaDesconto) / 2;
		System.out.printf("Valor médio gasto na loja: R$%,.2f", valorMedioGasto);
	}
}
