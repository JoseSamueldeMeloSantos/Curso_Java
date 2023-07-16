package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    public static void main(String[] args) {

        Produto produto = new Produto("IPad", 3235.89, 0.13);

        Function<Produto, Double> desconto = p -> p.getPreco() * (1 - p.getDesconto());

        UnaryOperator<Double> descontoMunicipal =
                preco -> preco >= 2500 ?  preco * 1.085 : preco;

        UnaryOperator<Double> calcularFrete = preco -> preco >= 3000 ? preco + 100 : preco + 50;

        UnaryOperator<Double> arredondarPreco = preco -> Math.round(preco * 100) / 100.0;

        Function<Double, String> formatarPreco = preco -> String.format("R$%.2f", preco);

        System.out.println(desconto.andThen(descontoMunicipal).andThen(calcularFrete)
                .andThen(arredondarPreco).andThen(formatarPreco).apply(produto));
    }
}
