package collections;

import java.util.HashSet;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		//para adiciona um dado
		//ele faz uma conversão automatica,pois não aceita tipo primitivo(só obj)
		conjunto.add(1.2); //double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> Caracter 
		conjunto.add("Teste"); 
		
		//size mostra o tamanho
		System.out.println("tamanho: " + conjunto.size());
		
		//irá ficar com o mesmo tamho,pois o set não aceita repetição
		conjunto.add("Teste");
		System.out.println("tamanho: " + conjunto.size());
		
		//para  remover um dado
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.size());
		
		//para verificar se um dado pertence ao set
		System.out.println(conjunto.contains(1));
		
		//----------
		HashSet nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//para fazer a união entre conjuntos
		//vai juntar tudo
		conjunto.addAll(nums);
		System.out.println(conjunto);
		
		//para fazer a interceção entre conjuntos
		//só vai resta os valosres em comuns
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		//para limpar um conjunto
		conjunto.clear();
		System.out.println(conjunto);
	}
}
