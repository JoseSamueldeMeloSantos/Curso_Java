package oo.enumerator;

public enum EnumComValores {
    //um enum pode implementar uma interface
    //não pode fazer herança com enum
    
    /*
    Para atribuir valor a um enum é necessário utilizar 
    um construtor  e atributo(s)
    */

    //o enum vai funcionar tipo um construtor
    VERDE(1), AZUL(2), BRANCO(3);

    //os atributos de um enum se refere a quantidade de
    //atribuidos do enum
    private int valor;

    //não precissa do public pois construtor do enum opera de forma interna
    EnumComValores(int valor) {
        this.valor = valor;//
    }

    public int getValor(){
        return valor;
    }

}
