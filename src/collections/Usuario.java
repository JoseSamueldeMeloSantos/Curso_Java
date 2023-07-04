package collections;

import java.util.Objects;

public class Usuario {
	
	String nome;
	
	Usuario(String nome) {
		this.nome = nome;
	}
	
	//com objeto é necessario definir um toString para 
	//retornar algo no metodo .get()
	public String toString() {
		return "nome: " + this.nome;
	}
	
	public int hashCode() {
		return Objects.hash(nome);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}
}
