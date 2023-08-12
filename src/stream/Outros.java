package stream;

import java.util.Arrays;
import java.util.List;

public class Outros {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 7.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);
        Aluno a5 = new Aluno("Ana", 7.1);
        Aluno a6 = new Aluno("Pedro", 7.1);
        Aluno a7 = new Aluno("Gui", 8.1);
        Aluno a8 = new Aluno("Maria", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        //para pegar todos os valores menos os duplicados
        //(por padrão ele vai comparar endereço de memoria)
        System.out.println("distinct...");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/lomit");
        alunos.stream()
                //vai pular a quantidade elementos passado pelo parametro na stream da esquerda para direita(retorna o uma nova stream)
                .skip(2)
                //vai deixar de pegar a quantidade de elementos passodos pelo parametro da direta para esquerda(retorna uma nova stream)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\ntakeWhile");
        alunos.stream()
                .distinct()
                //vai pegar os elemetos enquanto a condição for verdadeira(gera uma stream)
                //(se a condição for falsa ele não pegar o resto da stream,para alí mesmo)
                .takeWhile(a -> a.nota >= 7)
                .forEach(System.out::println);
    }
}
