package controle;

public class ContinueRotulado {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				if (i == 1) {
					continue;
				}
				
				System.out.printf("[i:%d j:%d]", i, j);
			}
			
			System.out.println();
		}
	}
}
