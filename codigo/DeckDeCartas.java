/* Autor: 
 * Nome(s) do(s) autor(es)
 * 
 * Descrição da classe: 
 * descrição.
 */

import java.util.Random;

public class DeckDeCartas {
    // atributos
    private Carta deck[];
    private int topoDeck;

    // construtores
    public DeckDeCartas(int tipoDeDeck) {
        // inicia um deck de cartas com 16 cartas
        this.deck = new Carta[16];
        deck = ordemCartaAlearotia(tipoDeDeck, 16);

        // o topo do deck comeca na primeira posicao
        this.topoDeck = 0;
    }

    // metodos especiais
    private Carta[] ordemCartaAlearotia(int tipoDeDeck, int quantidade) {
        /* metodo interno para facilitar a leitura do construtor
         * define uma ordem aleatoria para o as cartas do deck
        */

        // inicializa um vetor que define a ordem dos turnos dos jogadores
        Random random = new Random();
        int[] ordemAleatoria = new int[quantidade];
        Carta[] deckOrdemAleatoria = new Carta[quantidade];

        // define uma ordem aleatoria
        for(int i=quantidade-1; i>0; i--) {
            int j = random.nextInt(i+1);

            int temp = ordemAleatoria[i];
            ordemAleatoria[i] = ordemAleatoria[j];
            ordemAleatoria[j] = temp;
        }

        // atribui as cartas ao deck
        for(int i=0; i<quantidade; i++) {
            // cartas de movimento
            if(ordemAleatoria[i] < 8) {
                deckOrdemAleatoria[i] = new CartaDeMovimento(tipoDeDeck, ordemAleatoria[i]);
            }

            // cartas de dinheiro
            else if(ordemAleatoria[i] < 16) {
                deckOrdemAleatoria[i] = new CartaDeDinheiro(tipoDeDeck, ordemAleatoria[i]);
            }

            // carta 'VaParaCadeia'
            else {
                deckOrdemAleatoria[i] = new CartaVaParaCadeia(tipoDeDeck, ordemAleatoria[i]);
            }
        }

        // retorna a ordem dos jogadores
        return(deckOrdemAleatoria);
    }

    private Carta getCarta(int posicaoNoDeck) {
        return(this.deck[posicaoNoDeck]);
    }

    private int getTopoDeck() {
        return(this.topoDeck);
    }

    private void atualizaTopoDeck() {
        // checa se o topo chegou na ultima carta
        if(getTopoDeck() < 15) {
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
