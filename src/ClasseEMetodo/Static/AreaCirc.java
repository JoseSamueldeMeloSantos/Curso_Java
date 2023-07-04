package ClasseEMetodo.Static;

public class AreaCirc {
	
	double raio;
	static final double PI = 3.14;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return Math.pow(raio, 2) * 2;
	}
	
	static double area(double raioInicial) {
		return Math.pow(raioInicial, 2);
	}
}
