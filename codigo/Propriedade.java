/*
 * Responsável: Maurício Kessongo
 * Descrição: 
 */


public abstract class Propriedade extends Espaco 
{

    //Atributos    
        private int precoDeCompra;
        protected Jogador jogador;
    
        //Construtor
        public Propriedade(Jogador jogador)
        {
    
            /**
             * Construtor da classe abstrata Propriedade, que recebe uma instância da classe Jogador.
             */
    
            this.jogador = jogador;
        }
    
        /**
         * Método abstrato que deverá ser implementado por todas as classes que herdam da classe Propriedade.
         */
    
        public abstract void calcularAluguel();
    
        /**
         *
         * Métodos Getters e Setters de todos os atributos que a classe Propriedade possui.
         */
    
        public int getPrecoDeCompra() 
        {
            return precoDeCompra;
        }
    
        public void setPrecoDeCompra(int precoDeCompra) 
        {
            this.precoDeCompra = precoDeCompra;
        }
    
        public Jogador getJogador() 
        {
            return jogador;
        }
    
        public void setJogador(Jogador jogador) 
        {
            this.jogador = jogador;
        }
        /*public void informarComprador()
        {
            System.out.println("O proprietário dessa propriedade é: " + jogador);
        }
        */
    }
    
    