package lambdas;

import com.sun.source.tree.ReturnTree;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

    public static void main(String[] args) {

//      o BinaryOperator Recebe dois valores do mesmo tipo
//      que retorna um resultado do mesmo tipo
        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;

//      o metodo apply() é o responsavel por executar o BinaryOperator
        System.out.println(media.apply(6.0, 8.0));

//      BitFunction recebe dois valores diferente e retorna outro diferente
        BiFunction<Double, Double, String> resultado =
                (n1, n2) -> {
                    Double media2 = (n1 + n2) / 2;
                    return  media2 >= 7 ? "Aprovado" : "Reprovado";
                };
//      o metodo apply() é responsavel por executar o BitFunction
        System.out.println(resultado.apply(9.7, 5.1));

        Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(media.andThen(conceito).apply(9.7, 4.1));
    }
}
