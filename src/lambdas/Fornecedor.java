package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

    public static void main(String[] args) {

        //não recebe nenhum parametro e recebe alguma coisa
        //dentro do generic vai o valor que deseja retornar
        //quando não se recebe nenhum parametro o uso do parenteses
        // sem nada é obrigatorio
        Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");

        //o metodo .get() é o responsavel por rodar o Supplier
        System.out.println(umaLista.get());

        //não é possivel usar composição de função com o Supplier
    }
}
