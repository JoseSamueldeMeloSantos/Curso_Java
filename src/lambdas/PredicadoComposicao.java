package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

    public static void main(String[] args) {

        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 99;

//      a composição com o predicate é como se fosse uma operação com
//      os operadores lógicos: or , and e negate

//      metodos usados na composição do predicate:
//      and(), or() e negate()

//      estrutura:
//          metodo1.and(metodo2).or(metodo3).test(valor)
//      o valor passado será usado em todos as lambdas e feito a comparação com os metodos "logicos"
//      (diferente do Function,que será usado no primeiro e o resultado repassado para os outros)
        System.out.println(isPar.and(isTresDigitos).test(123));
//      a mesma coisa escrita de forma diferente
        System.out.println(isPar.test(123) && isTresDigitos.test(123));
    }
}
