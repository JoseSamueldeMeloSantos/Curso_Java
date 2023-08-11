package stream.desafio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class SegundoDesafioFilter {

    public static void main(String[] args) {

        Predicate<Produto> desconto = p -> p.getDesconto() > 0.30;
        Predicate<Produto> frete = produto -> produto.getFrete() == 0;
        Predicate<Produto> revelancia = produto -> produto.getPreco() >= 500;
        Function<Produto, String> saidaMap = p -> p.getNome() + "..........R$" + p.getPreco();

        Produto p1 = new Produto("Lapis", 1.99, 0.35, 0);
        Produto p2 = new Produto("Notebook", 4899.89, 0.32, 0);
        Produto p3 = new Produto("Caderno", 30, 0.45, 0);
        Produto p4 = new Produto("Impressora", 1200, 0.40, 0);
        Produto p5 = new Produto("IPad", 3100, 0.29, 0);
        Produto p6 = new Produto("Relogio", 1900, 0.12, 0);
        Produto p7 = new Produto("Monitor", 800, 0.31, 0);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        //pipeline em java é metodo depois de outro metodo... e etc
        System.out.println("Oferta Relampago");
        produtos.stream().filter(desconto).filter(frete).filter(revelancia).map(saidaMap).forEach(System.out::println);
    }
}
