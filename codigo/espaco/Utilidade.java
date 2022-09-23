/* Autor: 
 * Maurício Kessongo
 * 
 * Descrição da classe: Classe que implementa uma propriedade "Utilidade" no "Espaco". Sub-classe de propriedade; essa classe é responsável por calcular
 * o "preço de aluguel" especificamente para uma Utilidade para que quando um(a) jogador(a) cair numa utilidade, ele/a consiga chamar o método calcularAluguel()
 * e pagar o valor de aluguel certo ou ainda pagar o valor de compra correto.
 * Ademais, o cálculo do aluguel das utilidades depende de algumas regras:
 * - É indispesável saber o valor obtido no último lançamento dos dados de um jogador;
 * - É indispensável saber a quantidade de utilidades que um jogador possui;
 * - Caso tenha uma utilidade, o aluguel é calculado, multiplicando o valor obtido nos dados por 4;
 * - Caso tenhas duas utilidades, o aluguel é calculado, multiplicando o valor obtido nos dados por 10;
 */
public class Utilidade extends Propriedade
{
    //Atributos
    private int utilidades; // Variável que deve ter o valor atribuito pelo construtor. Esse valor deve ser passado pela classe Jogador.

    public Utilidade(int posicao){
        calcularAtributos(posicao);
    }
    
    //Métodos
    @Override
    public void calcularAluguel() 
    {
        if(posicao == 13 || posicao == 29)
        {
            /**
            * Implementação do método abstrato calcularAluguel() que não tem um valor como parâmetro, contudo aloca o valor correto no
            * atributo PrecoDeAluguel de acordo com o valor contido na variável utilidades(número de utilidades que um jogador possui no momento
            * que chamar o método em questão) e também de acordo com o valor aleatório do último lançamento dos dados,isso tudo usando 
            * a estrutura condicional switch-case. 
           * É importante destacar que o PrecoDeAluguel, na utilidade, varia de acordo com o número de utilidades que um jogador possui
           * momento e também do valor aleatório do último lançamento dos dados feito pelo mesmo jogador.
           * Além disso, foi possível constatar que temos alguns atributos que estão em falta como: preço de casa/hotel e aluguel com casa. 
           * Isso deve-se ao fato de que não é possível construir uma casa/hotel numa utilidade (ou ainda alugar uma utilidade com casa).
           */
          
            int valor = jogador.getUltimoLancamento();
            utilidades = jogador.Num_Utilidades();
            switch(utilidades)
            {
                case 1:
                    setPrecoDeAluguel(valor * 4);
                    break;
                case 2:
                    setPrecoDeAluguel(valor * 10);
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
    public int getUtilidades() 
    {
        return (this.utilidades);
    }

    public void setUtilidades(int utilidades) 
    {
        this.utilidades = utilidades;
    }

    public void calcularAtributos(int posicao)
    {
        switch (posicao)
        {
            case 13:
                setPreco(150);
                setPosicao(posicao);
                setNome(NomeDoEspaco.COMP_ELETRICA.toString());
            break;
            case 29:
                setPreco(150);
                setPosicao(posicao);
                setNome(NomeDoEspaco.COMP_AGUA.toString());
            break;
        }
    }
}