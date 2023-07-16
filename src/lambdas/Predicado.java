package lambdas;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

//      o Predicate recebe um tipo e retorna um valor boolean
        Predicate<Produto> isCaro = produto -> produto.preco * (1 - produto.desconto) >= 750;

        Produto produto = new Produto("Notebook", 3893.89, 0.15);
//      O metodo .test() é o responsavel por rodar o Predicate
        System.out.println(isCaro.test(produto));
    }
}
