package controle;

public class Break {
	//O break interrompe o fluxo padrão de um código(quebra todo o fluxo de repetição)
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if (i == 5) {
				break;
			}
			
			System.out.println(i);
		}
		
		System.out.println("Fim!");
	}
}
