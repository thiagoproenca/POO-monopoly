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
        calcularAtributos(posicao);
      
    }

    /**
     *
     * Métodos Getters e Setters de cada atributo da classe.
     */

    public int getPosicao() 
    {
        return (this.posicao);
    }

    public void setPosicao(int posicao) 
    {
        this.posicao = posicao;
    }

    public String getCor() 
    {
        return (this.cor);
    }

    public void setCor(String cor) 
    {
        this.cor = cor;
    }

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

    public int getPrecodeConstrucao() 
    {
        return (this.precodeConstrucao);
    }

    public void setPrecodeConstrucao(int precodeConstrucao)    
    {
        this.precodeConstrucao = precodeConstrucao;
    }

    public int getPrecoDeAluguelCasaConstruida() 
    {
        return (this.precoDeAluguelCasaConstruida);
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
            
                setCor("Marrom");
                setPreco(60);
                setPrecodeConstrucao(50);
                setPrecoDeAluguel(2);
                setPrecoDeAluguelCasaConstruida(10);
                setPosicao(posicao);
                //getCor();
                //getPrecoDeAluguel();
                break;

            case 4:
                setCor("Marrom");
                setPreco(60);
                setPrecodeConstrucao(50);
                setPrecoDeAluguel(4);
                setPrecoDeAluguelCasaConstruida(20);
                setPosicao(posicao);
                break;

            case 7:
                setCor("Azul Claro");
                setPreco(100);
                setPrecodeConstrucao(50);
                setPrecoDeAluguel(6);
                setPrecoDeAluguelCasaConstruida(30);
                setPosicao(posicao);
                break;

            case 9:
                setCor("Azul Claro");
                setPreco(100);
                setPrecodeConstrucao(50);
                setPrecoDeAluguel(6);
                setPrecoDeAluguelCasaConstruida(30);
                setPosicao(posicao);
                break;

            case 10:
                setCor("Azul Claro");
                setPreco(120);
                setPrecodeConstrucao(50);
                setPrecoDeAluguel(8);
                setPrecoDeAluguelCasaConstruida(40);
                setPosicao(posicao);
                break;

            case 12:
                setCor("Rosa");
                setPreco(140);
                setPrecodeConstrucao(100);
                setPrecoDeAluguel(10);
                setPrecoDeAluguelCasaConstruida(50);
                setPosicao(posicao);
                break;

            case 14:
                setCor("Rosa");
                setPreco(140);
                setPrecodeConstrucao(100);
                setPrecoDeAluguel(10);
                setPrecoDeAluguelCasaConstruida(50);
                setPosicao(posicao);
                break;

            case 15:
                setCor("Rosa");
                setPreco(160);
                setPrecodeConstrucao(100);
                setPrecoDeAluguel(12);
                setPrecoDeAluguelCasaConstruida(60);
                setPosicao(posicao);
                break;

            case 17:
                setCor("Laranja");
                setPreco(180);
                setPrecodeConstrucao(100);
                setPrecoDeAluguel(14);
                setPrecoDeAluguelCasaConstruida(70);
                setPosicao(posicao);
                break;

            case 19:
                setCor("Laranja");
                setPreco(180);
                setPrecodeConstrucao(100);
                setPrecoDeAluguel(14);
                setPrecoDeAluguelCasaConstruida(70);
                setPosicao(posicao);
                break;

            case 20:
                setCor("Laranja");
                setPreco(200);
                setPrecodeConstrucao(100);
                setPrecoDeAluguel(16);
                setPrecoDeAluguelCasaConstruida(80);
                setPosicao(posicao);
                break;

            case 22:
                setCor("Vermelho");
                setPreco(220);
                setPrecodeConstrucao(150);
                setPrecoDeAluguel(18);
                setPrecoDeAluguelCasaConstruida(90);
                setPosicao(posicao);
                break;

            case 24:
                setCor("Vermelho");
                setPreco(220);
                setPrecodeConstrucao(150);
                setPrecoDeAluguel(18);
                setPrecoDeAluguelCasaConstruida(90);
                setPosicao(posicao);
                break;

            case 25:
                setCor("Vermelho");
                setPreco(240);
                setPrecodeConstrucao(150);
                setPrecoDeAluguel(20);
                setPrecoDeAluguelCasaConstruida(100);
                setPosicao(posicao);
                break;

            case 27:
                setCor("Amarelo");
                setPreco(260);
                setPrecodeConstrucao(150);
                setPrecoDeAluguel(22);
                setPrecoDeAluguelCasaConstruida(110);
                setPosicao(posicao);
                
                break;

            case 28:
                setCor("Amarelo");
                setPreco(260);
                setPrecodeConstrucao(150);
                setPrecoDeAluguel(22);
                setPrecoDeAluguelCasaConstruida(110);
                break;

            case 30:
                setCor("Amarelo");
                setPreco(280);
                setPrecodeConstrucao(150);
                setPrecoDeAluguel(24);
                setPrecoDeAluguelCasaConstruida(120);
                setPosicao(posicao);
                break;

            case 32:
                setCor("Verde");
                setPreco(300);
                setPrecodeConstrucao(200);
                setPrecoDeAluguel(26);
                setPrecoDeAluguelCasaConstruida(130);
                setPosicao(posicao);
                break;

            case 33:
                setCor("Verde");
                setPreco(300);
                setPrecodeConstrucao(200);
                setPrecoDeAluguel(26);
                setPrecoDeAluguelCasaConstruida(130);
                setPosicao(posicao);
                break;

            case 35:
                setCor("Verde");
                setPreco(320);
                setPrecodeConstrucao(200);
                setPrecoDeAluguel(28);
                setPrecoDeAluguelCasaConstruida(150);
                setPosicao(posicao);
                break;

            case 38:
                setCor("Azul");
                setPreco(350);
                setPrecodeConstrucao(200);
                setPrecoDeAluguel(35);
                setPrecoDeAluguelCasaConstruida(175);
                setPosicao(posicao);

            case 40:
                setCor("Azul");
                setPreco(400);
                setPrecodeConstrucao(200);
                setPrecoDeAluguel(50);
                setPrecoDeAluguelCasaConstruida(200);
                setPosicao(posicao);
                break;
            default:
                setCor("Sem Cor");
                setPreco(-1);
                setPrecodeConstrucao(-1);
                setPrecoDeAluguel(-1);
                setPrecoDeAluguelCasaConstruida(-1);
                setPosicao(0);
                break;
        }

    }
}