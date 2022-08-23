/* Autor: 
 * Maurício Kessongo
 * 
 * Descrição da classe: Classe que implementa uma propriedade "Utilidade" no "Espaco". Sub-classe de propriedade; essa classe é responsável por calcular
 * o "preço de aluguel" especificamente para uma Utilidade para que quando um jogador cair na Utilidade de outro, ele consiga chaar o método calcularAluguel()
 * e pague o valor de aluguel certo.
 * Ademais, o cálculo do aluguel das utilidades depende de algumas regras:
 * -É indispesável saber o valor obtido nos dados;
 * - É indispensável saber a quantidade de utilidades que um jogador tem;
 * - Caso tenha uma utilidade, o aluguel é calculado, multiplicando o valor obtido nos dados por 4;
 * - Caso tenhas duas utilidades, o aluguel é calculado, multiplicando o valor obtido nos dados por 10;
 */
public class Utilidade extends Propriedade
{
    //Atributos
    private int precoDeAluguel;
    private int utilidades; // Variável que deve ter o valor atribuito pelo construtor. Esse valor deve ser passado pela classe Jogador.
    private int posicao;
    //private boolean ehPossuida;

    //Construtor
    public Utilidade(Jogador jogador, int utilidades, int posicao)
    {
        super(jogador);
        this.utilidades = utilidades;
        this.posicao = posicao;
        //ehPossuida = false;
    }

    //Métodos
    @Override
    public void calcularAluguel() 
    {

        /**
         * Método calcularAluguel() implementado pela classe Utilidade. Aqui usamos o valor da variável utilidades como
         * referência para uso na estrutura Switch - Case, que determina como deve ser calculado o aluguel de uma
         * Utilidade.
         */
        int valor = jogador.getUltimoLancamento();
        utilidades = jogador.Num_Utilidades();
        switch(utilidades)
        {
            case 1:
                precoDeAluguel = valor * 4;
                break;
            case 2:
                precoDeAluguel = valor * 10;
                break;
            default:
            System.out.println("Erro! Só existem 2 Utilidades no Jogo");
            break;
        }
    }

    /**
     *
     * Métodos Getters e Setters de cada atributo da classe.
     */

    public int getPreçoDeAluguel() 
    {
        return precoDeAluguel;
    }

    public void setPrecoDeAluguel(int precoDeAluguel) 
    {
        this.precoDeAluguel = precoDeAluguel;
    }

    public int getUtilidades() 
    {
        return utilidades;
    }

    public void setUtilidades(int utilidades) 
    {
        this.utilidades = utilidades;
    }
    /*public boolean getEhPossuida() 
    {
        return ehPossuida;
    }

    public void setEhPossuida(boolean ehPossuida) 
    {
        this.ehPossuida = ehPossuida;
    }*/

    public int getPosicao() 
    {
        return posicao;
    }

    public void setPosicao(int posicao) 
    {
        this.posicao = posicao;
    }
}
