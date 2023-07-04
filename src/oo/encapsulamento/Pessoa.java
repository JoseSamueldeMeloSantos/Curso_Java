package oo.encapsulamento;

public class Pessoa {

    private String nome;
    private String sobreNome;
    private int idade;

    public Pessoa(String nome, String sobreNome, int idade) {
        this.setNome(nome);
        this.setSobreNome(sobreNome);
        this.setIdade(idade);
    }


    public String getNome() {
        return this.nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getSobreNome() {
        return this.sobreNome;
    }


    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }


    public int getIdade() {
        return this.idade;
    }


    public void setIdade(int idade) {
        if(idade >= 0 && idade <= 120)
            this.idade = idade;
    }


    public String getNomeCompleto() {
        //atributo calculado
        return getNome() + " " + getSobreNome();
    }
}