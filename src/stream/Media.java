package stream;

public class Media {

    private double total;
    private int quantiade;

    //quando vc retorna o proprio obj é possivel fazer encadeamento de metodo
    public Media adicionar(double valor) {
        total += valor;
        quantiade++;
        return this;
    }

    public double getValor() {
        return total / quantiade;
    }

    public static Media combinar(Media m1, Media m2) {
        Media resultante = new Media();
        resultante.total = m1.total + m2.total;
        resultante.quantiade = m1.quantiade + m2.quantiade;
        return resultante;
    }
}
