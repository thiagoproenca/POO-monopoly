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
 * 
  */

public class Estacao_de_Metro extends Propriedade
{

    protected int precoDeAluguel = 25; //Valor padrão do aluguel de uma EstaçãoDeMetro.
    private int estacoes; //Variável que deve ter o valor atribuido pelo construtor. Esse valor deve ser passado pela classe Jogador.

    //Construtor
    public Estacao_de_Metro(Jogador jogador, int posicao)
    {
        //se passar um tipo que nao seja jogador e posicao, acho que podemos capturar e propagar essas excecoes e tratar todas entrada invalidas de uma unica vez em classes mais gerais
         //lancar um throw em calcularAtribtos e em calcularAluguel e tratar no construtor de cada classe filha
        super(jogador);
        calcularAtributos(posicao);
    
    }

    //Métodos
    @Override
    public void calcularAluguel() 
    {
        /**
         * Método calcularAluguel() implementado pela classe EstaçãoDeMetrô. Esse método usa o valor da variável
         * estacoes para calcular o valor do aluguel, com o uso de uma estrutura condicional Switch - Case.
         */

        if(posicao == 6 || posicao == 16 || posicao == 26 || posicao ==36)
        {
            estacoes = jogador.Num_Estacoes__de_Metro();
            if(precoDeAluguel < 200 && estacoes <= 4) //esse if statement eh desnecessario e redundante, se o numero de estacoes form maior do que 4, cair[a no default e podemos capturar e lancar. tratar a excecao no default]
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
                        //capturar e lancar a excecao de que so temos no maximo 4 estacoes de metro no Monopoly/ excedeu o numero de estacoes de metro
                         //nao usaremos calcularAtributos
                        calcularAtributos(posicao);
                        break;
                }
            }
            else if(estacoes > 4)
            {
                //capturar e lancar a excecao de que so temos no maximo 4 estacoes de metro no Monopoly / excedeu o numero de estacoes de metro
                //nao usaremos calcularAtributos
                calcularAtributos(posicao);

            }
        }
        else
        {
            calcularAtributos(posicao); //calcularAtributos lanca uma excecao sobre a posicao fornecida nao ser de uma estacao de metro
        }

    }

    /**
     *
     * Métodos Getters e Setters de cada atributo da classe.
     */

    public int getEstacoes() 
    {
        return estacoes;
    }

    public void setEstacoes(int estacoes) 
    {
        this.estacoes = estacoes;
    }

    public void calcularAtributos(int posicao)
    {

        switch (posicao)
        {
    
            case 6:
                setPreco(200);
                System.out.println("O Aluguel foi = " +getPrecoDeAluguel());
                setPosicao(posicao);
            break;
            case 16:
                setPreco(200);
                System.out.println("O Aluguel foi = " +getPrecoDeAluguel());
                setPosicao(posicao);
            break;
            case 26:
                setPreco(200);
                System.out.println("O Aluguel foi = " +getPrecoDeAluguel());
                setPosicao(posicao);
            break;
            case 36:
                setPreco(200);
                System.out.println("O Aluguel foi = " +getPrecoDeAluguel());
                setPosicao(posicao);
            break;
            default:
            //capturar / tratar exce'ao aqui, caso a posicao fornecida nao seja a de uma estacao de metro, disparar essa excecao
                setPrecoDeAluguel(-1);    
                setPosicao(0);
                break;
        }
    }
    
}

