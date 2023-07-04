package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		//o push retorna um excessão se tiver restrição de capacidade
		livros.push("O Pequeno Príncipe");
		livros.push("Dom Quixote");
		livros.push("A Arte Da Guerra");
		
		for (String livro: livros) {
			System.out.println(livro);
		}
		System.out.println();
		
		//para pegar
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		//para pegar e  remover
		System.out.println(livros.poll());
		System.out.println(livros.remove());                   
		System.out.println(livros.pop());//reorna uma ecessão
		
		//outros metodos
//		livros.size();
//		livros.clear();
//		livros.contains(livros);
//		livros.isEmpty();
		
	}
}
