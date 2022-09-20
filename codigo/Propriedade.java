/* Autor: 
 * Maurício Kessongo
 * 
 * Descrição da classe: Classe abstrata que representa uma propriedade no "Espaco"; sub-classe da classe "Espaco". Essa é uma classe genérica que contém
 * um método abstrato "calcularAluguel()" que não é implementado nessa classe, mas sim, nas suas sub-classes e esta implementação depende do tipo de propriedade. 
 * Logo, a classe "Propriedade" não tem responsabilidade alguma. Essa responsabilidade é delegada para as sub-classes.
 */

public abstract class Propriedade extends Espaco 
{

    //Atributos    
        protected Jogador jogador;
        protected int posicao;
        protected int preco;
        protected int precodeConstrucao;
        protected int precoDeAluguel;
        protected int precoDeAluguelCasaConstruida;
    
        //Construtor
        public Propriedade(Jogador jogador)
        {
    
            /**
             * Construtor da classe abstrata Propriedade, que recebe uma instância da classe Jogador.
             */
    
            this.jogador = jogador;
        }

        public Propriedade(){
            
        }
    
        /**
         * Método abstrato que deverá ser implementado por todas as classes que herdam da classe Propriedade.
         */
    
        public abstract void calcularAluguel();
    
        /**
         *
         * Métodos Getters e Setters de todos os atributos que a classe Propriedade possui.
         */
    
    
        public Jogador getJogador() 
        {
            return jogador;
        }
    
        public void setJogador(Jogador jogador) 
        {
            this.jogador = jogador;
        }
        public int getPosicao() 
    {
        return (this.posicao);
    }

    public void setPosicao(int posicao) 
    {
        this.posicao = posicao;
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
    
}
    
    