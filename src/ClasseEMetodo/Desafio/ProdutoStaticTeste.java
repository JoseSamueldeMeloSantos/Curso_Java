package ClasseEMetodo.Desafio;

public class ProdutoStaticTeste {
	
	public static void main(String[] args) {
		
		ProdutoStatic p1 = new ProdutoStatic("Notebook", 4_356.89);
		ProdutoStatic p2 = new ProdutoStatic("Caneta Preta", 12.56);
		
		System.out.println("O desconto é de: " + ProdutoStatic.DESCONTO * 100 + "%");
		
		System.out.println("1° produto: " + p1.nome);
		System.out.println("2° produto: " + p2.nome);
		
		double notebookDesconto = p1.calculoDesconto();
		System.out.printf("Valor do Notebook com desconsto: R$%,.2f \n", notebookDesconto);
		
		double canetaDesconto = p2.calculoDesconto();
		System.out.printf("Valor da Caneta Preta com desconto: R$%,.2f \n", canetaDesconto);
		
		double valorMedioGasto = (notebookDesconto + canetaDesconto) / 2;
		System.out.printf("Valor médio gasto na loja: R$%,.2f", valorMedioGasto);
	}
}
