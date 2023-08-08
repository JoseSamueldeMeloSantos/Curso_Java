package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {

        Consumer<Object> print = System.out::print;

        //Criando Streams
        Stream<String> langs = Stream.of("Java", "lua","JS\n");
        langs.forEach(print);

        String[] maisLangs = {"Python", "Lisp", "Perl", "Go\n"};
        //Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);//cria a partir de um array
        Arrays.stream(maisLangs, 1,4).forEach(print);//cria a partir de um array limitando os indices

        List<String>  outrasLangs = Arrays.asList("C", "PHP", "Kotlin\n");
        outrasLangs.stream().forEach(print);//cria uma stream a partir de uma collection
        outrasLangs.parallelStream().forEach(print);//cria uma stream paralela a partir de uma collection

        Stream.generate(() -> "a").forEach(print);//cria uma stream infinita que não tem ordenação
             //primeiro numro  | regra para geração
        Stream.iterate(0, n -> n + 1).forEach(print);//cria uma stream infinita com ordenção
    }
}
