package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovados = a -> a.nota >= 7;
        Function<Aluno, Double> apenasNota = a -> a.nota;

        BiFunction<Media, Double, Media> calcularMedia =
                (media, nota) -> media.adicionar(nota);

        BinaryOperator<Media> combinarMedia =
                (m1, m2) -> Media.combinar(m1, m2);

        //o combiner é obrigatorio nesse reduce pois a entrada do acumuladar
        //tem dois valores distintos
        alunos.stream()
                .filter(aprovados)
                .map(apenasNota)
                //      valor inicial | função acumuladora | combinador(deve ser binaryOperator)
                .reduce(new Media(), calcularMedia, combinarMedia);

                /*
                combiner:
                é aplicado em paralelo em um fluxo de várias threads. O combinador combina
                os resultados parciais de diferentes subfluxos ao processar o fluxo em paralelo.
                 Se você estiver trabalhando com um fluxo sequencial, esse parâmetro não será necessário.
                 */
    }
}
