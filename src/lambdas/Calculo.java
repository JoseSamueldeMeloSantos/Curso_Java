package lambdas;

//essa anotação server para indicar que uma interace será usadda para função lambda
//ela tbm forca a interface ter um único metodo
@FunctionalInterface
public interface Calculo {
    //     uma interface funcional é uma interface que só possui um metodo
    double executar(double a, double b);

/*
    mesmo a interface sendo uma FunctionalInterface
    é possivel adicionar mais de um metodo,porém esses
    metodos devem ser DEFAULT ou STATIC
 */
}
