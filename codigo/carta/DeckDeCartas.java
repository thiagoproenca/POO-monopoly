/* Autor: 
 * Nome(s) do(s) autor(es)
 * 
 * Descrição da classe: 
 * descrição.
 */

import java.util.ArrayList;
import java.util.Collections;

public class DeckDeCartas {
    // atributos
    private ArrayList<Carta> deck;
    private int topoDeck;

    // construtores
    public DeckDeCartas(int tipoDeDeck) {
        // inicializa o deck
        this.deck = new ArrayList<>();
        
        for(int i=1; i<=16; i++) {
            // carta de movimento
            if(i < 8) {
                deck.add(new CartaDeMovimento(tipoDeDeck, i));
            }

            // carta de dinheiro
            else if(i < 16) {
                deck.add(new CartaDeDinheiro(tipoDeDeck, i));
            }

            // carta 'va para cadeia'
            else {
                deck.add(new CartaVaParaCadeia(tipoDeDeck, i));
            }
        }
        
        // embaralha o deck
        Collections.shuffle(deck);

        // o topo do deck comeca na primeira posicao
        this.topoDeck = 0;
    }

    // metodos especiais
    private Carta getCarta(int posicaoNoDeck) {
        return(this.deck.get(posicaoNoDeck));
    }

    private int getTopoDeck() {
        return(this.topoDeck);
    }

    private void atualizaTopoDeck() {
        // checa se o topo chegou na ultima carta
        if(getTopoDeck() < 16) {
            this.topoDeck++;
        }

        // a ultima carta acabou de ser retirada do topo; o deck deve voltar a ordem original
        else {
            this.topoDeck = 0;
        }
    }

    // metodos
    public Carta retirarCarta() {
        // funcao que retorna a carta no topo do deck
        Carta cartaNoTopo = getCarta(getTopoDeck());

        // atualiza o topo do deck
        atualizaTopoDeck();

        // retorna a carta no topo
        return(cartaNoTopo);
    }
}
