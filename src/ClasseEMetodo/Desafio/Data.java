package ClasseEMetodo.Desafio;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data () {
		this(1, 1, 1970);//this() chama outro construtor já existente na mesma classe
	}
	
	Data (int dia, int mes, int ano) {
		//this é usado para acessar um atributo de instancia e evitar conflito do nome.
		//EX: this.nomeVariavel
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	//um metodo pode chamar um outro
	String dataFormatada () {
		return String.format("%d/%d/%d", dia, mes, ano);
	} 
	
	void exibirData () {
		System.out.println(dataFormatada());
	}
}
