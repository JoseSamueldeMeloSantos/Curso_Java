package fundamentos;
//A contagem no java começa à partir do 0
public class TipoString {
	
	public static void main(String[] args) {
		
		String s = "Boa dia";
		//irá dizer se a string só tem espaço
		System.out.println(s.isBlank());
		
		//irá dizer se a string está vazia
		System.out.println(s.isEmpty());
		
		//A string começa com "Boa"? A função irá retorna um valor boolenao
		System.out.println(s.startsWith("Boa"));
		
		//termina com "dia"? A função irá retorna um valor booleano
		System.out.println(s.endsWith("dia"));
		
		//A string é igual a "boa tarde"? A função irá retorna um valor boleano
		System.out.println(s.equals("boa tarde"));
		
		//tem a mesma função que a de cima,porém ira desconsiderar se é maiúsculo ou minúsculo
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		//vai dizer se a string com "qual" (o valor de retorno é booleano)
		System.out.println("frase qualquer".contains("qual"));
		
		//=============================================================
		
		//irá trocar um pelo outro
		System.out.println("ola pessoal".replace("pessoal","familia"));
				
		//irá juntar "!!!" à variável "s"
		System.out.println(s.concat("!!!"));

		//===============================================
		//Irá dizer qual letra está no indice desejado
		System.out.println("Olá pessoal".charAt(4));		
		
		//irá dizer qual o indice da palavra
		System.out.println("frase qualquer".indexOf("qual"));
		
		//fatiamento de str
		System.out.println("frase qualquer".substring(6));
		
		//Diz quantos caracteres tem uma string
		System.out.println(s.length());
		
		//===============================================
		//deixará  a string em maiúsculo
		s = "Boa tarde";
		
		s = s.toUpperCase();
				
		//deixará a string em minúsculo
		s = s.toLowerCase();
			
		//tirará os espaços das extremidades
		s = s.strip();
		
		//junta os argumento e o primeiro paramento é oque delimita a união
		System.out.println("As letras: " + "".join(", ",  "A", "B", "C", "D"));
				
		//Vai separar a frase usando como o paramento como delimitador(a partir do parametro que vai separar)
		String[] letras = "Meu nome e Maria".split("Maria");
				
		for(String letra : letras) 
		{
			System.out.println(letra);
		}
		
		
		//-------------------format---------------------------//	
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		// "\n" quebra a linha
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome);
		
		//print format
		System.out.printf("Nome: %s %s \n"
						+ "Idade: %d \n"
						+ "Salario: %.2f \n", nome, sobrenome, idade, salario);
		
		
		String frase = String.format("ola %s","samuel");
		System.out.println(frase);
		
		System.out.println("ola %s".formatted("Samuel"));
	}
}
