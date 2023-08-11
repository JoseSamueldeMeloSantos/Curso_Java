package stream.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PrimeiroDesafioFIlter {

    public static void main(String[] args) {

        Predicate<Carro> iscaro = c -> c.getPreco() >= 30_000_000;
        Predicate<Carro> isNovo = c -> c.isNovo();
        Function<Carro, String> carroNovoMap = c -> c.getNome() + " é um carro novo";
        Function<Carro, String> carroCaroMap = c -> c.getNome() + " é um carro caro";

        Carro c1 = new Carro("Uno", true, 20_000);
        Carro c2 = new Carro("Ferrari", true, 70_000_000);
        Carro c3 = new Carro("Celta", false, 7_000);
        Carro c4 = new Carro("Porche", true, 30_000_000);
        Carro c5 = new Carro("Gol", false, 9_000);

        List<Carro> carros = Arrays.asList(c1, c2, c3, c4, c5);

        carros.stream().filter(isNovo).map(carroNovoMap).forEach(System.out::println);
        carros.stream().filter(iscaro).map(carroCaroMap).forEach(System.out::println);
    }
}
