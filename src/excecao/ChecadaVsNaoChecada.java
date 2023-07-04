package excecao;

public class ChecadaVsNaoChecada {
	
	//vc pode ignorar o tratamento de uma exceção checada colocando throws Exception no metodo main
	public static void main(String[] args) throws Exception {
		
		try {
			geraErro1();			
		} catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
		geraErro2();
		
		System.out.println("Fim!");
	}
	
	//exceção não checada/não verificada
	public static void geraErro1() {
		/*
		 * se eu iniciar o programa assim não vai contecer nada
		 *
		 * new RuntimeException("Ocoreeu um erro bem legal #1!");//gera um erro
		 *
		 * para acontecer um erro não basta vc gerar ele,voce precissa
		 * lançar esse erro com um throw
		 */
	
		throw new RuntimeException("Ocoreeu um erro bem legal #1!");
	}
//	toda classe que termina com Exception é filha de Exception(vc só pode lançar algo que herda de throwble)
	
	
	//exceção checada
	//(é obrigado colocar na assinatura do metodo que vc lança uma exceção[clocando throws Execetion])
	public static void geraErro2() throws Exception{
		//new Exception("Ocorrey um erro bem legal #02!");//gera um erro
		throw new Exception("Ocorrey um erro bem legal #02!");
	}
	
	/*
	 * -Exceções Checadas
	 *
	 *		Elas devem ser obrigatoriamente tratadas ou declaradas no código que as lança.
	 *		Isso significa que, se um método lança uma exceção checada,
	 *		o código que o invoca deve tratá-la ou declará-la com a cláusula throws.
	 *
	 * -Exceções Não Checadas
	 * 		
	 * 		Já as exceções não checadas são aquelas que não precisam ser tratadas ou declaradas no código que as lança.
	 * 		Isso significa que o código que chama um método que lança uma exceção não checada não precisa necessariamente
	 * 		lidar com essa exceção, embora possa fazê-lo se assim desejar.
	 */
}


