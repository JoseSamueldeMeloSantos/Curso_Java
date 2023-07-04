package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends RuntimeException {
	//para criar uma exceção personalizada herdada de RuntimeException
	
	private String nomeDoAtributo;
	
	
	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessager() {//retorna a mensagem do erro
		return String.format("O atributo '%s' está fora do intervalo", nomeDoAtributo);
	}
	
	
}
