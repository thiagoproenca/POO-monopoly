/* Autor: 
 * Maurício Kessongo
 * 
 * Descrição da classe: Classe que implementa uma propriedade "Estacao_de_Metro" no "Espaco". Sub-classe de propriedade; essa classe é responsável por calcular
 * o "preço de aluguel" especificamente para uma estacção de metró para que quando um jogador cair na estação de metró de outro, ele consiga chamar o método
 * calcularAluguel() e pague o valor de aluguel certo. 
 * Além disso, o cálculo do aluguel das estações de metró depende de algumas regras:
 * - O aluguel começa com $25;
 * - o aluguel dobra a cada nova estação adquirida pelo mesmo jogador
 * - Depende do número de estações adquiridas pelo mesmo jogador
 * - O valor de aluguel varia de $25 até $200
  */

public class Estacao_de_Metro extends Propriedade
{

    private int precoDeAluguel = 25; //Valor padrão do aluguel de uma EstaçãoDeMetro.
    private int estacoes; //Variável que deve ter o valor atribuido pelo construtor. Esse valor deve ser passado pela classe Jogador.
    private int posicao;
    //private boolean ehPossuida;
    
    //Construtor
    public Estacao_de_Metro(Jogador jogador, int estacoes, int posicao)
    {

        super(jogador);
        this.estacoes = 0;
        this.posicao = posicao;
        //ehPossuida = false;

    }

    //Métodos
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
                    System.out.println("Erro! Só existem 4 estações no Jogo! Não é possível  Calcular o aluguel de uma Estação Nesses termos! Nao temos " + estacoes +" Estações");
                    break;
            }
        }

        if(estacoes > 4)
        {
            //erro - não temos mais do que 4 estacoes de metro
            System.out.println("Erro! Só existem 4 estações no Jogo! Não é possível Calcular o aluguel de uma Estação Nesses termos! Nao temos " + estacoes +" Estações");

        }

    }

    /**
     *
     * Métodos Getters e Setters de cada atributo da classe.
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
    /*public boolean getEhPossuida() 
    {
        return ehPossuida;
    }

    public void setEhPossuida(boolean ehPossuida) 
    {
        this.ehPossuida = ehPossuida;
    }*/
}

