package oo.heranca.desafio;

//o implents é usado quando uma classe deve implementar uma interface
public class Ferrari extends Carro implements Esportivo, Luxo {

    private boolean ligarTurbo;
    private boolean ligarAr;

    public Ferrari(int velociadeMaxima) {
        super(velociadeMaxima);
        setDelta(15);
    }
    
    @Override
    public void ligarTurbo() {
        this.ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        this.ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        this.ligarAr = true;
    }

    @Override
    public void desligarAr() {
        this.ligarAr = false;
    }

    @Override
    public int getDelta() {
        if (ligarTurbo && !ligarAr) {
            return 35;
        } else if(ligarTurbo && ligarAr) {
            return 30;
        } else if (!ligarTurbo && !ligarAr) {
            return 20;
        } else {
            return 15;
        }
    }
    /*
    //um metodo final não pode ser sobreescritro
    @Override
    public void acelerar() {
        
        if (this.velocidade <= this.VELOCIDADE_MAXIMA); 
            this.velocidade += 15;
    }
     */
}
