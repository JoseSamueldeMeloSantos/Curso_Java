package array;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Jose Samuel";
		u1.email = "jose.samuel@gmail.com.br";
		u1.senha = "15032002melo";
		u1.id = 1232143254;
		
		Usuario u2 = new Usuario();
		u2.nome = "Jose Samuel";
		u2.email = "jose.samuel@gmail.com.br";
		u2.senha = "15032002melo";
		u2.id = 1232143254;
		 
		System.out.println(u1 == u2);//da false pois está comparando endereço de memoria
		System.out.println(u1.equals(u2));//só irá funcionar se vc definir um equals
	}
}
