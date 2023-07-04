package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	//a coluna da chave é um conjunto
	public static void main(String[] args) {
		//   chave    valor
		Map<Integer, String> usuarios = new HashMap<>();

		//adiciona uma valor e seu elemento ao Map 
		//           K    V
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Carlos");
		// como a chame é a mesma o valor vai ser alterado
		usuarios.put(1, "Samuel");
		
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		//para acessar a chave
		System.out.println(usuarios.keySet());
		//para acessar os valores
		System.out.println(usuarios.values());
		//para pegar as chave e o valor ao mesmo tempo
		System.out.println(usuarios.entrySet());
		
		
		//para verificar se um chave existe no Map
		System.out.println(usuarios.containsKey(1));
		//para verificar se um valor existe no Map
		System.out.println(usuarios.containsValue("Samuel"));
		
		//para obter o valor a partir de uma chave
		System.out.println(usuarios.get(1));
		//para remover a partir da chave
		System.out.println(usuarios.remove(1));
		
		//para percorrer um Map
		
		//pecorrendo as chaves
		for (Integer chave: usuarios.keySet()) {
			System.out.println("Chave: " + chave);
		}
		System.out.println();
	
		//para pecorrer os valores
		for (String valor: usuarios.values()) {
			System.out.println("Valor: " + valor);
		}
		System.out.println();
		
		//para pecorrer a chave e o valor ao mesmo tempo
		for (Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro.getKey() + " | " + registro.getValue());
		}
	}
}
