package ClasseEMetodo;

public class ValorNulo {
		
	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!"));
		
		//não é posivel acessar um atributo/método  null
		String s2 = null;
		System.out.println(s2.concat("???"));
		
		//forma de evitar erro
		if (s2 != null) {
			System.out.println(s2.concat("!!!"));
		}
	
		
	}
}
