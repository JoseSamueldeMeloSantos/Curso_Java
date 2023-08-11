package stream.desafio;

public class Produto {

    private String nome;
    private  double preco;
    private double frete;
    private double desconto;

    public Produto(String nome, double preco, double desconto, double frete) {
        this.nome = nome;
        this.preco = preco;
        this.frete = frete;
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return  preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
