package oo.classeAbstrata;

public class Cachorro extends Mamifero {
    
    //caso vc defina um método abstrato na classe
    //generica, vc é obrigado a implementar esse método
    //na classe especifica(quando chegar em uma classe não
    //abstrata vc será obrigado a implementar todos os métodos
    //que ainda não foram implementados)

    @Override
    public String mover() {
        return "Usando as patas";
    }
    
    @Override
    public String mamar() {
        return "Usando leito";
    }
}
