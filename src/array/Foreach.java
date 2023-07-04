package array;

public class Foreach {

	public static void main(String[] args) {
		
		double[] notas = { 7.0, 8.3, 5.9 };
		
		double totalNotas = 0;
		for (double nota: notas) {
			totalNotas += nota;
		}
		
		double media = totalNotas / notas.length;
		System.out.println("A média do aluno é : " + media);
	}
}
