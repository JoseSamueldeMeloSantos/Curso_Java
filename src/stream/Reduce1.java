package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Reduce1 {

    //O reduce é uma função terminadora
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

        //para pegar o resultado gerado é necessário usar a função get
        int total = nums.stream().reduce(soma).get();
        System.out.println(total);

        //            valorInicial | soma
        int total2 = nums.stream().reduce(100, soma);//quando vc define o valor inicial não é necessário usar o get
        System.out.println();

        nums.stream()
                .filter(n -> n >= 5)
                .reduce(soma)
                //o ifPresente é um metodo que só vai ser executado se existir elementos na stream
                .ifPresent(System.out::println);
    }
}
