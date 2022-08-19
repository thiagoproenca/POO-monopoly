public class CartaVaParaCadeia extends Carta {
    // atributos
    
    // construtor
    public CartaVaParaCadeia(String tipoCarta, int numCarta) {
        // inicializa a carta como do tipo cofre ou sorte
        inicializaCarta(tipoCarta, numCarta);
    }

    // getters e setters

    // metodos
    private void inicializaCarta(String tipoCarta, int numCarta) {
        // inicializa a carta como cofre
        if(tipoCarta == "COFRE") {
            switch(numCarta) {
                case 16:
                    setEspecificacao(EnumCarta.COFRE_16.getDescricao());
                    break;
            }
        }
        
        // inicializa a carta como sorte
        else if(tipoCarta == "SORTE") {
            switch(numCarta) {
                case 16:
                    setEspecificacao(EnumCarta.SORTE_16.getDescricao());
                    break;
            }
        }
    }

    public int vaParaCadeia() {
        // retorna a posicao da cadeia para o jogador, que atualizara sua posicao

        return(11); // 'hard coded' por enquanto
    }
}
