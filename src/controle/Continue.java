package controle;

public class Continue {
	
	public static void main(String[] args) {
		/*
		 * o continue interrompe apenas o fluxo de repetição que ele é chamado
		 * (Éle pula o fluxo no momento que ele é chamado e vai para o próximo automaticamente)
		 */
		for (int i = 0; i <= 10; i++) {
			
			if (i == 5) {
				continue;
			}
			
			System.out.println(i);
		}
	}
}
