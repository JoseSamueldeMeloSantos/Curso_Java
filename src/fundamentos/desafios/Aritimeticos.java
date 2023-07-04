package fundamentos.desafios;

public class Aritimeticos {
	
	public static void main(String[] args) {
		//primeira parte
		double x = 6 * (3 +2);
		double y =  Math.pow(x, 2) / (3 * 2);
		//segunda parte
		double a = ((1 - 5) * (2 - 7)) / 2;
		double b =  Math.pow(a, 2);
		//parte final
		double c =  Math.pow((y - b), 3);
		double d =  c / Math.pow(10, 3);
		
		System.out.println("O resultado final é: " + d);
	}
}
