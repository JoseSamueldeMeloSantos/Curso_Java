package oo.classeAbstrata;

public abstract class Mamifero extends Animal {
    //não é obrigado implementar um metodo abstrato 
    //de uma classe génerica se a classe espécifica tbm for
    //outra classe abstrata

    public abstract String mamar();
    
    /*
        um método final não pode ser sobrescrito
        na subClasse

        ex:
            public final String mover() {
                return "Sanindo do lugar";
            }
    */
}
