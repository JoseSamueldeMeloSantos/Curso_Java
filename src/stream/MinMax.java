package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MinMax {

    /*
    min -> retorna o menor obj da stream
    max -> retorna o maior obj da stream

    obs: só é possivel usar o max e min usando um comparator
     */
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 7.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        /*
        Comparetor é uma interface que vai comparar dois objs
        e retorna -1,1,0

        1 -> quando o primeiro parametro é maior do que o segundo
        -1 -> quando o segundo parametro é maior do que primeiro
        0 -> os dois obj são iguais
         */
        Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
            if (aluno1.nota > aluno2.nota) return 1;
            if (aluno1.nota < aluno2.nota) return -1;
            return 0;
        };

        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(melhorNota).get());


        /*
        o comparator tbm pode ser implementado assim
        Comparator<Aluno> alunos = new Comparator<Aluno>() {
            @Override
            public int compare(Aluno aluno, Aluno t1) {
                return 0;
            }
        }
        */
    }
}
