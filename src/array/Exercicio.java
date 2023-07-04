package array;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		//transforma o array em uma string
		System.out.println(Arrays.toString(notasAlunoA));
		
		//para pecorrer o array
		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		double mediaAlunoA = totalAlunoA / notasAlunoA.length;//length é o comprimento de um array
		System.out.println("Média aluno a = " + mediaAlunoA);
	
		//outra forma de definir um array
		double[] notasAlunoB = { 6.9, 8.9, 5.5, 10.1 };
		
		double totaAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totaAlunoB += notasAlunoB[i];
		}
		
		double mediaAlunoB = totaAlunoB / notasAlunoB.length;
		System.out.println("Média Aluno b = " + mediaAlunoB);
	}
}
