package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		//Só é possivel usar o ponto com tipos que não são primitivos
		String mensagem = "bom dia x";
		mensagem = mensagem.toUpperCase();//converte a string para maiúsculo
		mensagem = mensagem.replace("x", "senhora");//troca as strings
		mensagem = mensagem.concat("!!!");//Junta isso na mensagem
		
		System.out.println(mensagem);
		
		String x = "Leo".toUpperCase();//É possivel fazer diretamente com o valor
		System.out.println(x);
		
		String y = "Bom dia X"//quando for fazer isso em grande quantidade,quebre a linha
				.replace("X", "Gui")
				.concat("!!!")
				.toUpperCase();
		//só é possivel fazer isso em cadeia quando todos os valores de retorno são do mesmo tipo 
		System.out.println(y); 
		
		System.out.println("Samuel".toUpperCase());
	}
}
