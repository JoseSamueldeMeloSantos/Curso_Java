package lambdas;

public class CalculoTeste2 {

    public static void main(String[] args) {
//        para usar uma função lambda vc precissa associar essa função
//        a uma determinada interface funcional(essa interface só pode ter um metodo)

//        lambda é uma função sem nome

//      O java irá saber o tipo dos paramentros e o metodo pela interface
//      estrutura:    (parametros) -> { return resultado; };
        Calculo calc = (x, y) -> { return  x + y; };
        System.out.println(calc.executar(2, 3));

//      quando vc omite o par de chaves oque,A lambda só terá uma sentença(linha)
//      de código e o resuldado dela será retornado sem a necessidade do return
        calc = (x, y) -> x * y;
        System.out.println(calc.executar(2, 3));
    }
}
