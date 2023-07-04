package controle;

public class For3 {

	public static void main(String[] args) {
		//Quando a variável do for é definida nele,ela tem escopo local 
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("[%d %d]", i, j);
			}
		}
	}
}
