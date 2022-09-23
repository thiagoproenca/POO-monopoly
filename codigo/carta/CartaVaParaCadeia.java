/*
 * Autor:
 * Descrição da classe: Ana Beatriz e Thiago Proença
 * 
 * Sub-classe de 'Carta' que tem a função movimentar não possui atributos prórios;
 * O método inicializaCarta trabalha com dois tipos de cartas:
 * - COFRE 
 * - SORTE
 * A classe é responsável por mandar o jogador para a cadeia;
 * 
 */
public class CartaVaParaCadeia extends Carta {
    
    // construtor
    public CartaVaParaCadeia(int tipoCarta, int numCarta) {
        // inicializa a carta como do tipo cofre ou sorte
        inicializaCarta(tipoCarta, numCarta);
    }

    // métodos
    private void inicializaCarta(int tipoCarta, int numCarta) {
        // inicializa a carta como cofre
        if(tipoCarta == 0) {
            switch(numCarta) {
                case 16:
                    setEspecificacao(EnumCarta.COFRE_16.getDescricao());
                    break;
            }
        }
        
        // inicializa a carta como sorte
        else if(tipoCarta == 1) {
            switch(numCarta) {
                case 16:
                    setEspecificacao(EnumCarta.SORTE_16.getDescricao());
                    break;
            }
        }
    }

    public int vaParaCadeia() {
        // retorna a posicao da cadeia para o jogador, que atualizara sua posicao

        return(11);
    }
}
