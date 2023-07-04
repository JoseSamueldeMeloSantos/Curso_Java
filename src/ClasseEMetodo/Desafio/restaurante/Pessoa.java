package ClasseEMetodo.Desafio.restaurante;

public class Pessoa {
	
	final String NOME;
	final double ALTURA;
	double peso;
	
	Pessoa (final String NOME, double peso, final double ALTURA) { 
		this.NOME = NOME;
		this.ALTURA = ALTURA;
		this.peso = peso;
	}
	
	double imc () {
		return peso / Math.pow(ALTURA, 2);
	}
	
	String classificacaoImc () {
		double imc = imc();
		
		if(imc < 18.5) {
			return "Magreza";
		} else if (imc >= 18.5 
				&& imc <= 29.9) {
			return "Normal";
		} else if (imc >= 20.0
				&& imc <= 29.9) {
			return "Sobrepeso";
		} else if (imc >= 30 
				&& imc <= 39.9) {
			return "Obesidade";
		} else {
			return "Obesidade Grave";
		}
	}
	
	void comer (Comida alimento) {
		this.peso += alimento.PESO / 1000;//primerio converte para Kg
	}
}
