package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {
	
	public static void main(String[] args) {
		
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		//pega o dado do indice desejado
		System.out.println(lista.get(0));//com objeto é necessario definir um toString para ficar mais legivel
		
		//Mosta o tamanho da lista(quantidade de dados)
		System.out.println(lista.size());
		
		//mostra qual é o indice de um determindado dado
		System.out.println(lista.indexOf(new Usuario("Carlos")));//com obj é necessario definir um equals
		
		//verifica se um dado está na lista
		System.out.println(lista.contains(new Usuario("Bia")));//com obj é necessario definir um equals
		
		//remove um determinado dado
		System.out.println(lista.remove(new Usuario("Ana")));//precisa do metodo equals com obj criado	
		
		//limpa toda a lista
		lista.clear();
		
		for (Usuario u: lista) {
			System.out.println(u.nome);
		}
		
		System.out.println();
		List<Integer> l = new ArrayList<>(List.of(2,4,24,5,2,34,5,5,2));
	
		System.out.println(l.contains(2));
		System.out.println(l.get(0));
		
		//deixa a lista ordenada
		Collections.sort(l);
		
		for (Integer numero: l) {
			System.out.println(numero);
		}
	}
}