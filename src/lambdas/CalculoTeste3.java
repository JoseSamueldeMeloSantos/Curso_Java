package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

    public static void main(String[] args) {
        /*
            BinaryOperator

            Representa uma operação em dois operandos do mesmo tipo,
            produzindo um resultado do mesmo tipo que os operandos

            é necessário especificar o tipo dos operandos no diamont operator(deve ser um objeto)

            o metodo que irá executar a função é: apply()
         */
        BinaryOperator<Double> calc = (x, y) -> { return x + y; };
        System.out.println(calc.apply(2.0, 3.0));

        calc = (x, y) -> x * y;
        System.out.println(calc.apply(2.0, 3.0));
    }
}
