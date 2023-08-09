package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class desafioMap {

    public static void main(String[] args) {

        UnaryOperator<String> inverteString = texto -> {
            String strInvertida = "";
            for (int i = texto.length() - 1; i >= 0; i--) {
                strInvertida += texto.charAt(i);
            }
            return strInvertida;
        };

        Function<Integer, String> toBinario = numero -> Integer.toBinaryString(numero);

        Function<String, Integer> toDecimal = numero -> Integer.parseInt(numero, 2);

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        nums.stream().map(toBinario).map(inverteString).map(toDecimal).forEach(System.out::println);

        System.out.println(inverteString.apply("Carro"));
    }
}
