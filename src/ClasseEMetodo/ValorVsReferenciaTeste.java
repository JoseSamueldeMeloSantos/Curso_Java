package ClasseEMetodo;

public class ValorVsReferenciaTeste {
	
	public static void main(String[] args) {
		
		//--atribuição por valor(tipo primitivo)
		//o valor é cópiado(são independentes)
		double a = 2.0;
		double b = a;//atribuição por valor
		
		a++;
		b--;
		//o resultado é diferênte
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	    //--atribuição por referência(objeto)
		//o valor é interligado
		ValorVsReferencia d1 = new ValorVsReferencia(1, 6, 2022);
		ValorVsReferencia d2 = d1;//atribuição por referência
		
		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2025;
		
		//o resultado é igual
		System.out.println("d1 = " + d1.dia + "/" + d1.mes + "/" + d1.ano);
		System.out.println("d2 = " + d2.dia + "/" + d2.mes + "/" + d2.ano);
		
		//por parametro
		voltarDataParaValorPadrao(d2);
		System.out.println(d2.dia + "/" + d2.mes + "/" + d2.ano);
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	//evite isso 
	//quando eu passo um objeto como parameto para um método 
	//esse objeto é passado por referência
	//o que eu modificar no objeto dentro do método tbm iraá modificar fora dele
	static void voltarDataParaValorPadrao(ValorVsReferencia d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	//quando eu passo um tipo primitivo como parametro para um método
	//esse tipo é passado por valor
	//oque eu mexer nesse tipo dentro do método não irá mexer fora dele
	static void alterarPrimitivo(int a) {
		a++;
	}
}
	