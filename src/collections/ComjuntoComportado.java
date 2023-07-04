package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ComjuntoComportado {
	
	public static void main(String[] args) {
		
	//criar uma set de tipo unico
		
		
		//set sem ordenção
		Set<String> listaAprovados =  new HashSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for (String candidatos: listaAprovados) {
			System.out.println("Nome: " + candidatos);
		}
		
		System.out.println();
		
		//para deixar em ordem 
		Set<String> listaPessoas = new TreeSet<>();
		listaPessoas.add("Jose");
		listaPessoas.add("Ana");
		listaPessoas.add("Issac");
		listaPessoas.add("Cleber");
		
		for (String pessoa: listaPessoas) {
			System.out.println("Pessoa: " + pessoa);
		}
		
		//para deixar em ordem de incerssão
		Set<String> listaFruta = new LinkedHashSet<String>();
		listaFruta.add("manga");
		listaFruta.add("banana");
		listaFruta.add("abacaxi");
		listaFruta.add("limão");
		
		System.out.println();
		
		for (String fruta: listaFruta) {
			System.out.println("Fruta: " + fruta);
		}
	}
}
