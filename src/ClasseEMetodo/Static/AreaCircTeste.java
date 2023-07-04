package ClasseEMetodo.Static;

public class AreaCircTeste {
	
	public static void main(String[] args) {
	
		//caso seja normal
		AreaCirc a = new AreaCirc(5.6);
		System.out.println(a.PI);
		System.out.println("A área vale: " + a.area());
		
		//quando é static
		System.out.println(AreaCirc.PI);
		System.out.println("A área vale: " + AreaCirc.area(5.6));
	}
}
