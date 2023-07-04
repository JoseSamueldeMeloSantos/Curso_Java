package oo.enumerator;

public class TesteEnum {

    public static void main(String[] args) {
        
        //metodos

        //  .values
        EnumComValores[] enumerator = EnumComValores.values();

        for(EnumComValores e: enumerator) {
            System.out.println(e); 
        }

        System.out.println();
        
        //  .valueOf()
        EnumComValores enumerator2 = EnumComValores.valueOf(EnumComValores.class, "AZUL");
        System.out.println(enumerator2);
    }
    
}
