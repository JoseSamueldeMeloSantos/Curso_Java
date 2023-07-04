package excecao.personalizadaB;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends Exception {
	//para criar uma exceção personalizada herdada de Exception
	
	private String nomeDoAtributo;
	
	
	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessager() {//retorna a mensagem do erro
		return String.format("O atributo '%s' está fora do intervalo", nomeDoAtributo);
	}
	
	
}
