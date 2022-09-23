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
    private int utilidades; // Variável que deve ter o valor atribuito pelo construtor. Esse valor deve ser passado pela classe Jogador.
    //Construtor
    // public Utilidade(Jogador jogador, int posicao)
    // {
    //     super(jogador);
    //     calcularAtributos(posicao);
    
    // }

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
             * Método calcularAluguel() implementado pela classe Utilidade. Aqui usamos o valor da variável utilidades como
             * referência para uso na estrutura Switch - Case, que determina como deve ser calculado o aluguel de uma
             * Utilidade.
             */
            int valor = jogador.getUltimoLancamento();
            utilidades = jogador.Num_Utilidades();
            switch(utilidades)
            {
                case 1:
                    setPrecoDeAluguel(valor * 4);
                    jogador.setPosicao(posicao);
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
                //System.out.println("O Aluguel foi = " +getPrecoDeAluguel());
                setPosicao(posicao);
                setNome(NomeDoEspaco.COMP_ELETRICA.toString());
            break;
            case 29:
                setPreco(150);
                //System.out.println("O Aluguel foi = " +getPrecoDeAluguel());
                setPosicao(posicao);
                setNome(NomeDoEspaco.COMP_AGUA.toString());
            break;
        }
    }
}