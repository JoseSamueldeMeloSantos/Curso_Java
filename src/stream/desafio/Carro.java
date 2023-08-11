package stream.desafio;

public class Carro {

    private String nome;
    private boolean novo;
    private double preco;

    public Carro(String nome, boolean novo, double preco) {
        this.nome = nome;
        this.novo = novo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
