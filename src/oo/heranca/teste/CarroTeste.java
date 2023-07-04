package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Uno;

public class CarroTeste {
    
    public static void main(String[] args) {
        //os métodos chamados serão da intância criada
        Carro carroNormal = new Uno(120);

        //vc só terá acesso aos metodos definidos na interface se
        // se vc definir a variavel com o dipo da classe que implemta
        //essa interfa
        Ferrari carroEsportivo = new Ferrari(400);

        
        System.out.println("Carro normal");

        carroNormal.acelerar();
        System.out.println(carroNormal);

        carroNormal.acelerar();
        System.out.println(carroNormal);

        carroNormal.acelerar();
        System.out.println(carroNormal);

        carroNormal.fear();
        System.out.println(carroNormal);

        System.out.println("Carro esportivo");
        
        carroEsportivo.ligarTurbo();
        carroEsportivo.ligarAr();
        carroEsportivo.desligarAr();

        carroEsportivo.acelerar();
        System.out.println(carroEsportivo);

        carroEsportivo.acelerar();
        System.out.println(carroEsportivo);

        carroEsportivo.acelerar();
        System.out.println(carroEsportivo);

        carroEsportivo.fear();
        System.out.println(carroEsportivo);
    }
}
