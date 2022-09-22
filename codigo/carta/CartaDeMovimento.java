public class CartaDeMovimento extends Carta {
    // atributos
    private int movimento;
    private int posicaoTabuleiro;
    
    // construtor
    public CartaDeMovimento(int tipoCarta, int numCarta) {
        // inicializa a carta como do tipo cofre ou sorte
        inicializaCarta(tipoCarta, numCarta);
    }

    // getters e setters
    private int getMovimento() {
        return(this.movimento);
    }

    private void setMovimento(int movimento) {
        this.movimento = movimento;
    }

    private int getPosicaoTabuleiro() {
        return(this.posicaoTabuleiro);
    }

    private void setPosicaoTabuleiro(int posicao) {
        this.posicaoTabuleiro = posicao;
    }

    // metodos
    private void inicializaCarta(int tipoCarta, int numCarta) {
        // inicializa a carta como cofre
        if(tipoCarta == 0) {
            switch(numCarta) {
                case 1:
                    setEspecificacao(EnumCarta.COFRE_01.getDescricao());
                    setMovimento(0);
                    setPosicaoTabuleiro(14);
                    break;
                case 2:
                    setEspecificacao(EnumCarta.COFRE_02.getDescricao());
                    setMovimento(0);
                    setPosicaoTabuleiro(40);
                    break;
                case 3:
                    setEspecificacao(EnumCarta.COFRE_03.getDescricao());
                    setMovimento(0);
                    setPosicaoTabuleiro(7);
                    break;
                case 4:
                    setEspecificacao(EnumCarta.COFRE_04.getDescricao());
                    setMovimento(0);
                    setPosicaoTabuleiro(24);
                    break;
                case 5:
                    setEspecificacao(EnumCarta.COFRE_05.getDescricao());
                    setMovimento(2);
                    setPosicaoTabuleiro(0);
                    break;
                case 6:
                    setEspecificacao(EnumCarta.COFRE_06.getDescricao());
                    setMovimento(-4);
                    setPosicaoTabuleiro(0);
                    break;
                case 7:
                    setEspecificacao(EnumCarta.COFRE_07.getDescricao());
                    setMovimento(0);
                    setPosicaoTabuleiro(0);
                    break;
            }
        }
        
        // inicializa a carta como sorte
        else if(tipoCarta == 1) {
            switch(numCarta) {
                case 1:
                    setEspecificacao(EnumCarta.SORTE_01.getDescricao());
                    setMovimento(0);
                    setPosicaoTabuleiro(1);
                    break;
                case 2:
                    setEspecificacao(EnumCarta.SORTE_02.getDescricao());
                    setMovimento(0);
                    setPosicaoTabuleiro(33);
                    break;
                case 3:
                    setEspecificacao(EnumCarta.SORTE_03.getDescricao());
                    setMovimento(0);
                    setPosicaoTabuleiro(17);
                    break;
                case 4:
                    setEspecificacao(EnumCarta.SORTE_04.getDescricao());
                    setMovimento(0);
                    setPosicaoTabuleiro(4);
                    break;
                case 5:
                    setEspecificacao(EnumCarta.SORTE_05.getDescricao());
                    setMovimento(5);
                    setPosicaoTabuleiro(0);
                    break;
                case 6:
                    setEspecificacao(EnumCarta.SORTE_06.getDescricao());
                    setMovimento(-3);
                    setPosicaoTabuleiro(0);
                    break;
                case 7:
                    setEspecificacao(EnumCarta.SORTE_07.getDescricao());
                    setMovimento(0);
                    setPosicaoTabuleiro(0);
                    break;
            }
        }
    }

    public int bonusDeMovimento() {
        // indica quantas casas (para frente ou para tras) o jogador movimentara

        return(getMovimento());
    }

    public int movimentaParaEspaco() {
        // vai direto para um espaco

        return(getPosicaoTabuleiro());
    }
}
