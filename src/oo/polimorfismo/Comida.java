package oo.polimorfismo;

//abstract define uma classe abstrata
public abstract class Comida {
//uma classe abstrata não pode ser instânciada
    
    private double peso;

    public Comida(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        if(peso >= 0)
            this.peso = peso;
    }
    
   
}
