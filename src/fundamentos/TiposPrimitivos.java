package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
	//Informações do funcionario
	
	//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56_789;
		long pontosAcumulados = 3_134_845_223L;//use o anderline para deixar o número mais visivel
		/*Quando o valor de uma variável long ultrapassa
		 * o limite do tipo int,é necessario colocar um "L"
		 * no final do número para exemplificar que é um 
		 * número do tipo long(Isso ocorre pq o padrão de um
		 * número interio no java é o int)
		 */
	
	//Tipos numéricos reais
		float salario = 11_445.44F;
		//No float é necessario colocar um "F" no final do número
		double vendasAcumuladas = 2_991_797_103.01;
		
	//Tipo booleano
		boolean estaDeFerias = false;
	
	//Tipo caractere
		char status = 'A';//Ativo
		//é necessario ser entre aspas simples
	
		//Dias de empresa
		System.out.println("O funcionario tem " + anosDeEmpresa * 365 + " dias de empresa");
		
		//Número de viagens
		System.out.println("O funcionario efetuou " + numeroDeVoos / 2 + " voos");
		
		//Pontos em real 
		System.out.println("pontos em real: " + pontosAcumulados / vendasAcumuladas);
		
		//salario
		System.out.println(id + ": ganha -> " + salario);
		
		//estado de férias
		System.out.println("Ferias? " + estaDeFerias);
		
		//status
		System.out.println("Status: " + status);
	
	}
}
