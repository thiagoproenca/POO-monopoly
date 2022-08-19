public class CartaDeMovimento extends Carta {
    // atributos
    private int movimento;
    
    // construtor
    public CartaDeMovimento(String tipoCarta, int numCarta) {
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

    // metodos
    private void inicializaCarta(String tipoCarta, int numCarta) {
        // inicializa a carta como cofre
        if(tipoCarta == "COFRE") {
            switch(numCarta) {
                case 1:
                    setEspecificacao(EnumCarta.COFRE_01.getDescricao());
                    setMovimento(0);
                    break;
                case 2:
                    setEspecificacao(EnumCarta.COFRE_02.getDescricao());
                    setMovimento(0);
                    break;
                case 3:
                    setEspecificacao(EnumCarta.COFRE_03.getDescricao());
                    setMovimento(0);
                    break;
                case 4:
                    setEspecificacao(EnumCarta.COFRE_04.getDescricao());
                    setMovimento(0);
                    break;
                case 5:
                    setEspecificacao(EnumCarta.COFRE_05.getDescricao());
                    setMovimento(0);
                    break;
                case 6:
                    setEspecificacao(EnumCarta.COFRE_06.getDescricao());
                    setMovimento(0);
                    break;
                case 7:
                    setEspecificacao(EnumCarta.COFRE_07.getDescricao());
                    setMovimento(0);
                    break;
            }
        }
        
        // inicializa a carta como sorte
        else if(tipoCarta == "SORTE") {
            switch(numCarta) {
                case 1:
                    setEspecificacao(EnumCarta.SORTE_01.getDescricao());
                    setMovimento(0);
                    break;
                case 2:
                    setEspecificacao(EnumCarta.SORTE_02.getDescricao());
                    setMovimento(0);
                    break;
                case 3:
                    setEspecificacao(EnumCarta.SORTE_03.getDescricao());
                    setMovimento(0);
                    break;
                case 4:
                    setEspecificacao(EnumCarta.SORTE_04.getDescricao());
                    setMovimento(0);
                    break;
                case 5:
                    setEspecificacao(EnumCarta.SORTE_05.getDescricao());
                    setMovimento(0);
                    break;
                case 6:
                    setEspecificacao(EnumCarta.SORTE_06.getDescricao());
                    setMovimento(0);
                    break;
                case 7:
                    setEspecificacao(EnumCarta.SORTE_07.getDescricao());
                    setMovimento(0);
                    break;
            }
        }
    }

    public int bonusDeMovimento() {
        // indica quantas casas (para frente ou para tras) o jogador movimentara

        return(getMovimento());
    }
}
