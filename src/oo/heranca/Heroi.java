package oo.heranca;

//o extends define uma herança
public class Heroi extends Jogador {

    /*
     *    construtor com herança
     * 
     * quando se tem um subclasse e é criado um construor na classe mãe
     * se faz necessario usar o super()(equivalente ao this(), porém
     * com herança)dentro de um construtor para chamar 
     * um construor da classe superior criando 
     * uma cadeia de contrutores(se não fizer isso dá erro)
     * 
     * o java faz esse processo inplicitamente quando se mantem o construtor padrão
     * 
     * o super tbm é usador para chamar atributos e metodos da superClasse
     *  ex:
     *      super.metodo()
     *      super.atributo
     *      super() -> construtor
    */
    public Heroi(int x, int y) {
        super(x, y);//chama o construtor da classe jogador
    }

    /*
     * para reescrever um metodo basta você 
     * repetilo(Colocar o mesmo nome e assinatura)
     *
     * e depois fazer oque desejar
     */

    //é comendade usar esse @Override em metodos reescritos
    @Override
	public boolean atacar(Jogador oponente) {
        
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY == 1) {
            oponente.vida -= 20;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 20;
            return true;
        } else {
            return  false;
        }

    }

    /*
     *  para usar um metodo da superclasse é necessário 
     *  usar o super.nomeMetodo 

     boolean atacar(Jogador oponente) {

        //ex:
        super.atacar(oponente);
        super.atacar(oponente);

        return true;
     }
     */
}