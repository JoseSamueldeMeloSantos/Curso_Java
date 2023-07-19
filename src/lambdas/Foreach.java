package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {

//        criar uma lista já com seus valores
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Forma tradicional...");
        for (String nome: aprovados) {
            System.out.println(nome);
        }

//      for each como lambda(a lambda é passada como parametro para forEach)
        System.out.println("\nlambda #01");
        aprovados.forEach((nome) -> {
            System.out.println(nome + "!!!");
        });
//        quando a lambda só possui um parametro não é necessário usar os +parênteses

//      for each como referência de metódo
        System.out.println("\nMethod Reference");
//     o aprovados.forEach() irá pecorrer a lista e passar o valor como
//     referência para o println usando o ::(o println irá imprimir o valor de cada indice
//     que foi passado como referência)

//      dessa forma não é possivel imprimir só valor "seco" da variavel
        aprovados.forEach(System.out::println);


//      quando uma expressão lambda fica dentro de um metodo a gente
//      não termina eça com ponto e vírgula
        System.out.println("\nLambda #02...");
        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("\nMethod Reference #02...");
//      para usar method reference com metodo personalizado usando o forEach
//      estrutura de Method Reference:
//
//          NomeClase::NomeMetodo
        aprovados.forEach(Foreach::meuImprimir);
    }

    static void meuImprimir(String nome) {
        System.out.println("Oi! Meu nome é " + nome);
    }
}
