package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	//o primeiro a entrar é o primeiro a  sair
	public static void main(String[] args) {
	
		Queue<String> fila = new LinkedList<>();
		
		/*
		 * .add() lançará uma exceção caso a fila esteja cheia.
		 * .offer() retorna falso caso a fila esteja cheia.
		 * 
		 * os dois adicionam um elemento na fila
		 */
		fila.add("Ana");
		fila.offer("Bia");
		
		System.out.println(fila);
		
		//.peek() e .element() pega o proximo elemento sem remover
		System.out.println(fila.peek());//retorna null quando a fila esta vazia
		System.out.println(fila.element());// retorna uma exceção quando a fila está vazia(erro)
		
		System.out.println(fila);

		//fila.size(); mostra o tamnho da fila
		//fila.clear(); limpa a fila
		//fila.isEmpty; verifica se a fila está vazia
		//fila.contains(); verifica se um elemto está na fila
		
		//.poll() e .remove obtem o proximo elemento e remove
		System.out.println(fila.poll());//retorna um um booleano quando a fila está vazia
		System.out.println(fila.remove());//retorna uma exceção quando a fila está vazia(erro)
		
		System.out.println(fila);
	}
}
