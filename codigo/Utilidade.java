
public class Utilidade extends Propriedade
{

    private int precoDeAluguel;
    private int utilidades; // Variável que deve ter o valor atribuito pelo construtor. Esse valor deve ser passado pela classe Jogador.
    private int posicao;
    private boolean ehPossuida;

    public Utilidade(Jogador jogador, int utilidades, int posicao)
    {
        super(jogador);
        this.utilidades = utilidades;
        this.posicao = posicao;
        ehPossuida = false;
    }

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
            //erro
            break;
        }
    }

    /**
     *
     * Métodos Get e Set de cada atributo da classe.
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
    public boolean getEhPossuida() 
    {
        return ehPossuida;
    }

    public void setEhPossuida(boolean ehPossuida) 
    {
        this.ehPossuida = ehPossuida;
    }

    public int getPosicao() 
    {
        return posicao;
    }

    public void setPosicao(int posicao) 
    {
        this.posicao = posicao;
    }
}
