/* Autor: 
 * Maurício Kessongo
 * 
 * Descrição da classe: Classe que implementa uma propriedade "Lote" no "Espaco". Sub-classe de propriedade; essa classe é responsável por calcular
 * o "preço de Aluguel" especificamente para um Lote para que quando um jogador cair no lote de outro, ele consiga chamar o método calcularAluguel()
 * e pague o valor de aluguel certo, conforme está na tabela 1 que nos foi dada. Temos também o métodos calcularAtributos que recebe como parámetro uma
 * variável "posicao" e por meio dessa aloca o valor correto de cada um dos atributos da classe de acordo com o valor de posicao passado como parâmetro.
 */
public class Lote extends Propriedade
{
    //Atributos
    private int posicao;
    private String cor;
    private int preco;
    private int precodeConstrucao;
    private int precoDeAluguel;
    private int precoDeAluguelCasaConstruida;
    //private boolean ehPossuida; 

    //Construtor
    public Lote(Jogador jogador, int posicao)
    {

        /**
         * Construtor da classe Lote. Recebe dois parâmetros, um do tipo referência Jogador e outro do tipo primitivo
         * inteiro. A função super() chama o construtor da superclasse Propriedade e passa como parâmetro uma instância
         * da classe Jogador.
         *
         * É passado também como parâmetro, um valor de tipo primitivo inteiro com o nome de posicao. Esse valor deve
         * ser enviado para que o método calcularAluguel() possa retornar os dados corretos de acordo com a tabela de
         * posições contidas no documento do projeto.
         */

        super(jogador);
        this.posicao = posicao;
        //ehPossuida = false;
    }

    /**
     *
     * Métodos Getters e Setters de cada atributo da classe.
     */
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

    public String getCor() 
    {
        return cor;
    }

    public void setCor(String cor) 
    {
        this.cor = cor;
    }

    public int getPreco() 
    {
        return preco;
    }

    public void setPreco(int preco) 
    {
        this.preco = preco;
    }

    public int getPrecoDeAluguel() 
    {
        return precoDeAluguel;
    }

    public void setPrecoDeAluguel(int precoDeAluguel) 
    {
        this.precoDeAluguel = precoDeAluguel;
    }

    public int getPrecodeConstrucao() 
    {
        return precodeConstrucao;
    }

    public void setPrecodeConstrucao(int precodeConstrucao)    
    {
        this.precodeConstrucao = precodeConstrucao;
    }

    public int getPrecoDeAluguelCasaConstruida() 
    {
        return precoDeAluguelCasaConstruida;
    }

    public void setPrecoDeAluguelCasaConstruida(int precoDeAluguelCasaConstruida) 
    {
        this.precoDeAluguelCasaConstruida = precoDeAluguelCasaConstruida;
    }

    //Métodos

    @Override
    public void calcularAluguel() 
    {   
        /**
         * Método que chama o método calcularAtributos(), que aloca o valor correto de cada um dos atributos da classe
         * de acordo com o valor de posicao passado como parâmetro.
         */
        calcularAtributos(posicao);

    }
    public void calcularAtributos(int posicao)
    {

        /**
         *
         * Implementação do método calcularAtributos(), que recebe um valor de tipo primitivo inteiro como parâmetro e
         * aloca os valores corretos nos atributos da classe de acordo com o valor contido da variável posicao, usando
         * a estrutura condicional Switch - Case.
         */

        switch (posicao)
        {
    
            case 2:
                cor = "Marrom";
                preco = 60;
                precodeConstrucao = 50;
                precoDeAluguel = 2;
                precoDeAluguelCasaConstruida = 10;
                break;

            case 4:
                cor = "Marrom";
                preco = 60;
                precodeConstrucao = 50;
                precoDeAluguel = 4;
                precoDeAluguelCasaConstruida = 20;
                break;

            case 7:
                cor = "Azul Claro";
                preco = 100;
                precodeConstrucao = 50;
                precoDeAluguel = 6;
                precoDeAluguelCasaConstruida = 30;
                break;

            case 9:
                cor = "Azul Claro";
                preco = 100;
                precodeConstrucao = 50;
                precoDeAluguel = 6;
                precoDeAluguelCasaConstruida = 30;
                break;

            case 10:
                cor = "Azul Claro";
                preco = 120;
                precodeConstrucao = 50;
                precoDeAluguel = 8;
                precoDeAluguelCasaConstruida = 40;
                break;

            case 12:
                cor = "Rosa";
                preco = 140;
                precodeConstrucao = 100;
                precoDeAluguel = 10;
                precoDeAluguelCasaConstruida = 50;
                break;

            case 14:
                cor = "Rosa";
                preco = 140;
                precodeConstrucao = 100;
                precoDeAluguel = 10;
                precoDeAluguelCasaConstruida = 50;
                break;

            case 15:
                cor = "Rosa";
                preco = 160;
                precodeConstrucao = 100;
                precoDeAluguel = 12;
                precoDeAluguelCasaConstruida = 60;
                break;

            case 17:
                cor = "Laranja";
                preco = 180;
                precodeConstrucao = 100;
                precoDeAluguel = 14;
                precoDeAluguelCasaConstruida = 70;
                break;

            case 19:
                cor = "Laranja";
                preco = 180;
                precodeConstrucao = 100;
                precoDeAluguel = 14;
                precoDeAluguelCasaConstruida = 70;
                break;

            case 20:
                cor = "Laranja";
                preco = 200;
                precodeConstrucao = 100;
                precoDeAluguel = 16;
                precoDeAluguelCasaConstruida = 80;
                break;

            case 22:
                cor = "Vermelho";
                preco = 220;
                precodeConstrucao = 150;
                precoDeAluguel = 18;
                precoDeAluguelCasaConstruida = 90;
                break;

            case 24:
                cor = "Vermelho";
                preco = 220;
                precodeConstrucao = 150;
                precoDeAluguel = 18;
                precoDeAluguelCasaConstruida = 90;
                break;

            case 25:
                cor = "Vermelho";
                preco = 240;
                precodeConstrucao = 150;
                precoDeAluguel = 20;
                precoDeAluguelCasaConstruida = 100;
                break;

            case 27:
                cor = "Amarelo";
                preco = 260;
                precodeConstrucao = 150;
                precoDeAluguel = 22;
                precoDeAluguelCasaConstruida = 110;
                break;

            case 28:
                cor = "Amarelo";
                preco = 260;
                precodeConstrucao = 150;
                precoDeAluguel = 22;
                precoDeAluguelCasaConstruida = 110;
                break;

            case 30:
                cor = "Amarelo";
                preco = 280;
                precodeConstrucao = 150;
                precoDeAluguel = 24;
                precoDeAluguelCasaConstruida = 120;
                break;

            case 32:
                cor = "Verde";
                preco = 300;
                precodeConstrucao = 200;
                precoDeAluguel = 26;
                precoDeAluguelCasaConstruida = 130;
                break;

            case 33:
                cor = "Verde";
                preco = 300;
                precodeConstrucao = 200;
                precoDeAluguel = 26;
                precoDeAluguelCasaConstruida = 130;
                break;

            case 35:
                cor = "Verde";
                preco = 320;
                precodeConstrucao = 200;
                precoDeAluguel = 28;
                precoDeAluguelCasaConstruida = 150;
                break;

            case 38:
                cor = "Azul";
                preco = 350;
                precodeConstrucao = 200;
                precoDeAluguel = 35;
                precoDeAluguelCasaConstruida = 175;
                break;

            case 40:
                cor = "Azul";
                preco = 400;
                precodeConstrucao = 200;
                precoDeAluguel = 50;
                precoDeAluguelCasaConstruida = 200;
                break;
            default:
                System.out.println("Erro! Não Temos Lotes Nessa posição " + posicao);
                break;
        }

    }
}