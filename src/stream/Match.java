package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    /*
        verifica a condição de uma stream

        allMatch() -> retorna true se todos os elementos da stream baterem
                      com a condição

        noneMatch() -> retorna true se nenhum dos elementos da stream baterem
                      com a condição

        anyMatch() -> retorna true se qualquer um dos elementos da stream baterem
                      com a condição
     */

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 7.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovados = a -> a.nota >= 7;
        Predicate<Aluno> reprovado = aprovados.negate();

        //verifica se todos os alunos foram aprovados
        System.out.println(alunos.stream().allMatch(aprovados));

        //verifica se pelomenos um aluno foi aprovado
        System.out.println(alunos.stream().anyMatch(aprovados));

        //verifica se nenhum dos alunos foram aprovaodos
        System.out.println(alunos.stream().noneMatch(reprovado));
    }
}
