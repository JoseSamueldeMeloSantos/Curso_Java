package oo.encapsulamento.casaA;

public class Paulo {
    
    Ana esposa = new Ana();
    
    void testeAcessos() {
        /*
         * segredo -> privete
         * focoDentroDeCasa -> pacote
         * formaDeFalar -> protected
         * todosSabem -> public
         */
        
         // System.out.println(esposa.segredo); -> esse não pega pois é privado
        System.out.println(esposa.facoDentroDeCasa);//só pega,pois está no mesmo pacote
        System.out.println(esposa.formaDeFalar);// pega pois está no mesmo pacote(mesmo não sendo uma subclasse)
        System.out.println(esposa.todosSabem);//pega pois é publico
    }
}
