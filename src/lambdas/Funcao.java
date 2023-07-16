package lambdas;

import java.util.function.Function;
//quanto maior é uma função mais dificil é reutilizar ela em outro local(tamanho não é documento)
public class Funcao {

    public static void main(String[] args) {
//      A Function recebe um valor e retorna outro diferente
        Function<Integer, String> parOuImpar =
                numero -> numero % 2 == 0 ? "Par" : "Ímpar";

//      O metodo .apply é o responsavel por rodar o Function
        System.out.println(parOuImpar.apply(32));

        Function<String, String> oResultadoE =
                valor -> "O resultado é: " + valor;

        Function<String, String> empolgado = valor -> valor + "!!!";

        Function<String, String> duvida = valor -> valor + "???";
//      composição de função
        System.out.println(oResultadoE.apply(parOuImpar.apply(32)));
//      ou

//      ele vai chamar o parOuImpar e depois(atraves do andThen()) irá chamar oResultadoE e
//      depois irá chamar o empolgado(tbm atraves do andThen())
//      e o valor passado será o 32(atraves do apply que pertence ao parOuImpar)
        String resultadoFinal1 = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);
//      ordem: parOuImpar -> oResultadoE -> empolgado
        System.out.println(resultadoFinal1);

        String resultadoFinal2 = parOuImpar.andThen(oResultadoE).andThen(duvida).apply(33);

        System.out.println(resultadoFinal2);
    }
}
