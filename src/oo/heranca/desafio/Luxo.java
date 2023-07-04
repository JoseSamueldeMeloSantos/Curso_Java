package oo.heranca.desafio;

public interface Luxo {
    
    void ligarAr();
    void desligarAr();

    //implementação padrão(default)
    //classe que herdar essa interface não será 
    //obrigada a definir esse método
    default int nivelDoAr() {
        return 1;
    }
}
