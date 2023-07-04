package oo.heranca.desafio;

public class Carro {
    
    public final int VELOCIDADE_MAXIMA;
    protected int velocidade;
    private int delta = 5;

    protected Carro(int velociadadeMaxima) {
        this.VELOCIDADE_MAXIMA = velociadadeMaxima;
    }

    
    public void acelerar() {
        
        if(velocidade + getDelta() > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		} else {			
			velocidade += getDelta();
		}
    }
    
    public void fear() {
        
        if (velocidade >= 5) {
			velocidade -= 5;			
		} else {
			velocidade = 0;
		}
    }

    
    public String toString() {
        return "velociade = " + this.velocidade + "Km/h.";
    }

    public int getVelociadeMaxima() {
        return VELOCIDADE_MAXIMA;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int numero) {
        this.delta = numero;
    }
    
}
