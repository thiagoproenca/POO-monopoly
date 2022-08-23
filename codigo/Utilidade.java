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
    private int preco;
   

    //Construtor
    public Utilidade(Jogador jogador, int posicao)
    {
        super(jogador);
        calcularAtributos(posicao);
    
    }

    //Métodos
    @Override
    public void calcularAluguel() 
    {
        if(posicao == 13 || posicao == 29)
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
                    jogador.setPosicao(posicao);
                    break;
                case 2:
                    precoDeAluguel = valor * 10;
                    break;
                default:
                    setPrecoDeAluguel(-1);
                    System.out.println("Erro! Só existem 2 Utilidades no Jogo");
                    jogador.setPosicao(posicao);
                    break;
            }
        }
        else
        {
            calcularAtributos(posicao);
        }
    }

    /**
     *
     * Métodos Getters e Setters de cada atributo da classe.
     */
    public int getPreco() 
    {
        return (this.preco);
    }

    public void setPreco(int preco) 
    {
        this.preco = preco;
    }
    public int getPrecoDeAluguel() 
    {
        return (this.precoDeAluguel);
    }

    public void setPrecoDeAluguel(int precoDeAluguel) 
    {
        this.precoDeAluguel = precoDeAluguel;
    }

    public int getUtilidades() 
    {
        return (this.utilidades);
    }

    public void setUtilidades(int utilidades) 
    {
        this.utilidades = utilidades;
    }

    public int getPosicao() 
    {
        return (this.posicao);
    }

    public void setPosicao(int posicao) 
    {
        this.posicao = posicao;
    }

    public void calcularAtributos(int posicao)
    {
        switch (posicao)
        {
    
            case 13:
                setPreco(150);
                System.out.println("O Aluguel foi = " +getPrecoDeAluguel());
                setPosicao(posicao);
            break;
            case 29:
                setPreco(150);
                System.out.println("O Aluguel foi = " +getPrecoDeAluguel());
                setPosicao(posicao);
            break;
            default:
                setPrecoDeAluguel(-1);
                setPosicao(0);
                break;
        }
    }
}
