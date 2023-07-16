package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {
//      O consumer recebe apenas um parametro e não retorna nada
        Consumer<Produto> imprimir = produto -> System.out.println("Produto: "+produto.nome);

        Produto p1 = new Produto("Caneta", 12.34, 0.09);
//      O metodo  .accept() é o responsavel por rodar o Consumer
        imprimir.accept(p1);

        Produto p2 = new Produto("Notebook", 2987, 0.25);
        Produto p3 = new Produto("Caderno", 19.34, 0.03);
        Produto p4 = new Produto("Borracha", 2.34, 0.19);
        Produto p5 = new Produto("Lapís", 5.34, 0.19);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

//      não precisa colocar o accept,pois o .forEach o seu valor do parametro já é um Consumer
//      (o metodo já sabe que deve chamar um accept)
        produtos.forEach(imprimir);
//      forma manual
        produtos.forEach(produto -> System.out.println("preço: " + produto.preco));
//      forma por referência
        produtos.forEach(System.out::println);
    }
}
