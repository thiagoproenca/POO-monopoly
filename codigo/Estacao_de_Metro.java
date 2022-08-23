public class Estacao_de_Metro extends Propriedade
{

    private int precoDeAluguel = 25; //Valor padrão do aluguel de uma EstaçãoDeMetro.
    private int estacoes; //Variável que deve ter o valor atribuido pelo construtor. Esse valor deve ser passado pela classe Jogador.
    private int posicao;
    private boolean ehPossuida;

    public Estacao_de_Metro(Jogador jogador, int estacoes, int posicao)
    {

        super(jogador);
        this.estacoes = estacoes;//0
        this.posicao = posicao;
        ehPossuida = false;

    }

    @Override
    public void calcularAluguel() 
    {
        /**
         * Método calcularAluguel() implementado pela classe EstaçãoDeMetrô. Esse método usa o valor da variável
         * estacoes para calcular o valor do aluguel, com o uso de uma estrutura condicional Switch - Case.
         */
        estacoes = jogador.Num_Estacoes__de_Metro();
        if(precoDeAluguel < 200 && estacoes <= 4) 
        {

            switch(estacoes)
            {
                case 1:
                    precoDeAluguel *= 1;
                    break;
            
                case 2:
                    precoDeAluguel *= 2;
                    break;
                case 3:
                    precoDeAluguel *= 4;
                    break;
                case 4:
                    precoDeAluguel *= 8;
                    break;
                default:
                    //erro - não temos mais do que 4 estacoes
                    break;
            }
        }

        if(estacoes > 4)
        {
            //erro - não temos mais do que 4 estacoes de metro
            precoDeAluguel = 200;

        }

    }

    /**
     *
     * Métodos Get e Set de cada atributo da classe.
     */

    public int getPrecoDeAluguel() 
    {
        return precoDeAluguel;
    }

    public void setPrecoDeAluguel(int precoDeAluguel) 
    {
        this.precoDeAluguel = precoDeAluguel;
    }

    public int getEstacoes() 
    {
        return estacoes;
    }

    public void setEstacoes(int estacoes) 
    {
        this.estacoes = estacoes;
    }
    public boolean getEhPossuida() 
    {
        return ehPossuida;
    }

    public void setEhPossuida(boolean ehPossuida) 
    {
        this.ehPossuida = ehPossuida;
    }
}

