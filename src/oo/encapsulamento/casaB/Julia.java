package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
    
    Ana sogra = new Ana();

    void testeAcessos() {
        /*
         * segredo -> privete
         * foco DentroDeCasa -> pacote
         * formaDeFalar -> protected
         * todosSabem -> public
         */
        
        /* 
        System.out.println(sogra.segredo); -> esse não pega pois é privado
        System.out.println(sogra.facoDentroDeCasa); -> não pega,pois é nivel pacote
        System.out.println(sogra.formaDeFalar); -> não pega pois  não está no mesmo pacote e nem uma subclasse
        */
        
        System.out.println(sogra.todosSabem);//pega pois é publico
    }
}
