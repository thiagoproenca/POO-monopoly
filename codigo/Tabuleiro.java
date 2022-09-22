import java.util.ArrayList;

public class Tabuleiro {
    // atributos
    private ArrayList<Espaco> posicao;

    // construtores
    public Tabuleiro() {
        // inicializa os 40 espacos do tabuleiro
        this.posicao = new ArrayList<>();

        for(int i=0; i<40; i++) {
            setPosicao(i+1);
        }
    }

    // getters e setters
    private void setPosicao(int posicao) {
        switch(posicao) {
            case 2, 4, 7, 9, 10, 12, 14, 15, 17, 19, 20, 22, 24, 25, 27, 28, 30, 32, 33, 35, 38, 40:
                this.posicao.add(new Lote(posicao));
                break;
            case 6, 16, 26, 36:
                this.posicao.add(new Estacao_de_Metro(posicao)); 
                break;
            case 13, 29:
                this.posicao.add(new Utilidade(posicao)); 
                break;
            case 1:
                this.posicao.add(new PontoDePartida(posicao)); 
                break;
            case 3, 18, 34:
                this.posicao.add(new EspacoDeCarta(posicao));
                break;
            case 8, 23, 37:
                this.posicao.add(new EspacoDeCarta(posicao));
                break;
            case 5:
                this.posicao.add(new ImpostoDeRenda(posicao)); 
                break;
            case 11:
                this.posicao.add(new Cadeia(posicao));
                break;
            case 21:
                this.posicao.add(new EstacionamentoGratis(posicao));
                break;
            case 31:
                this.posicao.add(new VaParaCadeia(posicao));
                break;
            case 39:
                this.posicao.add(new TaxaDeRiqueza(posicao));
                break;
        }
    }

    public Espaco getEspaco(int posicao) {
        return(this.posicao.get(posicao-1));
    }

    public int getPosicao(int posicao) {
        return(this.posicao.get(posicao-1).getPosicao());
    }

    // public void setPosicao(Espaco espaco, int posicao) {
    //     this.posicao.get(posicao).setPosicao(posicao) = espaco;
    // }

    // metodos
    public void posicionaJogador(Jogador jogador, int posicao) {
        jogador.setPosicao(posicao);
    }

    public void moveJogador(Jogador  jogador, int valorDados){
        if(jogador.getPosicao() + valorDados > 40){
            jogador.setPosicao(jogador.getPosicao() + valorDados - 40);
        }
        else jogador.setPosicao(jogador.getPosicao() + valorDados);
    }
}