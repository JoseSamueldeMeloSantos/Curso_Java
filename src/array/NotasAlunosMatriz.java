package array;

import java.util.Arrays;
import java.util.Scanner;

public class NotasAlunosMatriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos alunos tem a sua turma: ");
		int quantAlunos = entrada.nextInt();
		System.out.print("Quantas notas serão cadastradas por aluno?: ");
		int quantNotas = entrada.nextInt();
		
		double[][] notasSala = new double[quantAlunos][quantNotas];
		
		//IRÁ LER A NOTAS
		for (int aluno = 0; aluno < notasSala.length; aluno++) {
			System.out.printf("-Notas do %d aluno \n", (aluno + 1));
			
			for (int nota = 0; nota < notasSala[aluno].length; nota++) {
				
				do {
				System.out.printf(" Digite a %d nota: ", (nota + 1));
				notasSala[aluno][nota] = entrada.nextDouble();
				} while (notasSala[aluno][nota] < 0 || notasSala[aluno][nota] > 10);
			}
		}
		
		double[] mediaAlunos = new double[notasSala.length];
		
		double mediaSala = 0;
		double totalNotaAluno = 0;
		double totalMediaSala = 0;
		//SERÁ CALCULADO AS MÉDIAS
		for (int aluno = 0; aluno < notasSala.length; aluno++) {
			for (int nota = 0; nota < notasSala[aluno].length; nota++) {
				totalNotaAluno += notasSala[aluno][nota];
			}
			
			mediaAlunos[aluno] = totalNotaAluno / notasSala[aluno].length;
			totalMediaSala += mediaAlunos[aluno];
			totalNotaAluno = 0;
		}
		
		mediaSala = totalMediaSala / mediaAlunos.length;
		
		//VAI EXIBIR OS DADOS
		for (int i = 0; i < mediaAlunos.length; i++) {
			System.out.printf("Aluno %d teve a média: %.1f \n", (i + 1), mediaAlunos[i]);
		}
		
		System.out.println("A média geral da sala foi de: " + mediaSala);
		
		
		entrada.close();
	}
}
