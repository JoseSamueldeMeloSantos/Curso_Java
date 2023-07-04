package oo.heranca.desafio;

public interface Esportivo {
    /*
     * A interface define apenas metodos sem corpo(define apenas a nécessidade de fazer um metodo)
     *
     * uma classe pode herdar de multiplas interfaces
     * 
     * quem herdar uma interface terá a obrigração de implentar o metodo
     * 
     * todo metodo dentro de uma interface é public mesmo inplicitamente
     * 
     * todo metodo de uma interface é um método abstrato(um método que não tem corpo)
     */

    //isso é
    void ligarTurbo();
    //é a mesma coisa que 
    //public abstratic void ligarTurbo();
    void desligarTurbo();
}