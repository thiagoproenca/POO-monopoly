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
    
    