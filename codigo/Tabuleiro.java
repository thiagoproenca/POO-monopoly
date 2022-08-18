public class Tabuleiro {
    // atributos
    private Espaco[] posicao;

    // construtores
    public Tabuleiro() {
        // inicializa os 40 espacos do tabuleiro
        this.posicao = new Espaco[40];

        setPosicao(NomeDoEspaco.PONTO_PARTIDA.toString(), 0);
    }

    // getters e setters
    private void setPosicao(String nomePosicao, int posicao) {
        Espaco espaco = new Espaco(posicao+1, nomePosicao, 0, 0, 0, 0);

        this.posicao[posicao] = espaco;
    }

    // metodos
}