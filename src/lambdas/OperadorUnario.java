package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

    public static void main(String[] args) {

        //o tipo do valor que entra é o mesmo valor que sai
        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

//      o metodo apply é o responsavel por rodar o UnaryOperator
        int resultado1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);
        System.out.println(resultado1);

//      o compose é equivalente ao andThen,porém ele executa da direita para esqueda
//      emquanto o andthen é da esquerda para direita
        int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);
        System.out.println(resultado2);
    }
}
