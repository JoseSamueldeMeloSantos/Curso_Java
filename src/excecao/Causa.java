package excecao;

import excecao.personalizadaA.Aluno;

public class Causa {

	public static void main(String[] args) {
		try {
			metodoA(null);
		} catch (IllegalArgumentException e) {
			if(e.getCause() != null) {//.getCause pega a causa do erro(se não tiver erro o valor é nulo)
				System.out.println(e.getCause().getMessage());
			}
		}
		
		metodoA(null);
	}
	
	static void metodoA(Aluno aluno) {
		
		try {
			metodoB(aluno);
		} catch (Exception causa) {
			throw new IllegalArgumentException(causa);
		}
	}
	
	static void metodoB(Aluno aluno) {
		
		if (aluno == null) {
			throw new NullPointerException("O aluno está nulo");
		}
		
		System.out.println(aluno.nome);
	}
}
