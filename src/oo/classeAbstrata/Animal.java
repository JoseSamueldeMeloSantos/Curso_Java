package oo.classeAbstrata;

public abstract class Animal {
//só é possivel ter um método abstrato na classe 
//se se essa classe for abstrata
    
    public String  respirar() {
        return "Usando oxigênio";
    }

    //um método abstrato não tem corpo
    public abstract String mover();
}
