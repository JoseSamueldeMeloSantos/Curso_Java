package array;

public class Usuario {
	
	String nome;
	String email;
	String senha;
	int id;
	
	
	public boolean equals(Object objeto) {
		
		//verifica se o obj é uma instância da classe Usuario
		if (objeto instanceof Usuario) {
		//é necessário converter para comparar
			Usuario outro = (Usuario) objeto;
			
			//sempre use o equals quando puder inves do ==
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			boolean senhaIgual = outro.senha.equals(this.senha);
			boolean idIgual = outro.id == this.id;
			
			return nomeIgual && emailIgual && senhaIgual && idIgual;
		} else {
			return false;
		}
	}
}
