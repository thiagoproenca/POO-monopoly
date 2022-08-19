public class Tabuleiro {
    // atributos
    private Espaco[] posicao;

    // construtores
    public Tabuleiro() {
        // inicializa os 40 espacos do tabuleiro
        this.posicao = new Espaco[40];

        for(int i=0; i<40; i++) {
            setPosicao(i+1);
        }
    }

    // getters e setters
    private void setPosicao(int posicao) {
        switch(posicao) {
            case 2, 4, 7, 9, 10, 12, 14, 15, 17, 19, 20, 22, 24, 25, 27, 28, 30, 32, 33, 35, 38, 40:
                // inicializa propriedade
                break;
            case 1:
                this.posicao[posicao-1] = new PontoDePartida(posicao);
                break;
            case 3, 18, 34:
                this.posicao[posicao-1] = new EspacoDeCarta(posicao);
                break;
            case 8, 23, 37:
                this.posicao[posicao-1] = new EspacoDeCarta(posicao);
                break;
            case 5:
                this.posicao[posicao-1] = new ImpostoDeRenda(posicao);
                break;
            case 11:
                this.posicao[posicao-1] = new Cadeia(posicao);
                break;
            case 21:
                this.posicao[posicao-1] = new EstacionamentoGratis(posicao);
                break;
            case 31:
                this.posicao[posicao-1] = new VaParaCadeia(posicao);
                break;
            case 39:
                this.posicao[posicao-1] = new TaxaDeRiqueza(posicao);
                break;
        }
    }

    // metodos
}