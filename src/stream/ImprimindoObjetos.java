package stream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos  {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");

        System.out.println("Usando o foreach...");
        for (String aluno: aprovados) {
            System.out.println(aluno);
        }

//      geralmente se usa while com interator
        System.out.println("\nUsando Iterator...");
        Iterator<String> it = aprovados.iterator();//-> converteu uma lista para  Interator
        while (it.hasNext()) {//-> .hasNext() -> verifica se tem um proximo elemento
            System.out.println(it.next());
            //.next() pega o proximo elemento(depois que ele usa o next, ele passa para o proximo elemento
        }


//      Stream é um conjunto de obj que a interação ocorre de forma interna
        System.out.println("\nUsando Stream..");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);
    }
}
