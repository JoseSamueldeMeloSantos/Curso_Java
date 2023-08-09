package stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    //O Map vai pecorrer toda a stream de forma interna e criar uma nova de acordo
    //com o requisitado
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW", "Audi", "Honda");
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        //UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
        //UnaryOperator<String> grito = n -> n + "!!!";

        System.out.println("\nUsando Composição...");
        marcas.stream()
                .map(Utilitarios.maiuscula)
                .map(primeiraLetra)
                .map(Utilitarios::grito)
                .forEach(print);

    }
}
