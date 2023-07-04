package oo.encapsulamento;

public class PessoaTeste {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("josé", "Melo", 20);
        p1.setIdade(30);
        
        System.out.println(p1.getNome());
        System.out.println(p1.getSobreNome());
        System.out.println(p1.getIdade());

        System.out.println(p1.getNomeCompleto());
    }
}