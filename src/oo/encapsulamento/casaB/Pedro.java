package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
    
        Ana mae = new Ana();

    void testeAcessos() {
        /*
         * segredo -> privete
         * focoDentroDeCasa -> pacote
         * formaDeFalar -> protected
         * todosSabem -> public
         */
        
         // System.out.println(mae.segredo); -> esse não pega pois pe privado
        //System.out.println(mae.facoDentroDeCasa); -> não pega,pois é nivel pacote
        
        //acessando a partir de uma herança
        System.out.println(formaDeFalar);// pega pois está no mesmo pacote(mesmo não sendo uma subclasse)
        /* se você fizer assim:
         *     System.out.println(mae.formaDeFalar);
         * não pega pois vc tá tentando acessar a partir de uma instancia
         */
        
        System.out.println(mae.todosSabem);//pega pois é publico
    }
}
