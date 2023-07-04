package excecao.personalizadaB;

public class TesteValidacoes {

	public static void main(String[] args) {
		
		/*
		Aluno aluno = new Aluno("", -7);
		
		Validar.aluno(aluno);
		*/
		
		try {
			Aluno aluno = new Aluno("         ", -7);
			Validar.aluno(aluno);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException e) {
			System.out.println(e.getMessage());
		}
		
		/*
		try {
			Aluno aluno = new Aluno("         ", -7);
			Validar.aluno(aluno);
		} catch (StringVaziaException | NumeroForaIntervaloException e) {
			System.out.println(e.getMessage());
		} 
		
		funciona tipo um ou esse "|"
		 */
		System.out.println("Fim");
	}
}
