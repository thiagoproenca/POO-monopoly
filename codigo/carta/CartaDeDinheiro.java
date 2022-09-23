/*
 * Autor: Ana Beatriz e Thiago Proença
 * 
 * Descrição da classe:
 * Sub-classe de 'Carta' que tem a função de ou adicionar ou remover dinheiro  do saldo dos jogadores;
 * O método inicializaCarta trabalha com dois tipos de cartas:
 * - COFRE 
 * - SORTE
 * O método configura a especificação de cada tipo de carta com a respectiva descrição e também configura a respectiva taxa;
 * 
 */
public class CartaDeDinheiro extends Carta {
    // atributos
    private int taxa;
    
    // construtor
    public CartaDeDinheiro(int tipoCarta, int numCarta) {
        // inicializa a carta como do tipo cofre ou sorte
        inicializaCarta(tipoCarta, numCarta);
    }

    /**
     * Métodos Getters e Setters de cada atributo da classe.
     */
    private int getTaxa() {
        return(this.taxa);
    }

    private void setTaxa(int taxa) {
        this.taxa = taxa;
    }

    // metodos
    private void inicializaCarta(int tipoCarta, int numCarta) {
        // metodo interno
        
        // inicializa a carta como cofre
        if(tipoCarta == 0) {
            switch(numCarta) {
                case 8:
                    setEspecificacao(EnumCarta.COFRE_08.getDescricao());
                    setTaxa(100);
                    break;
                case 9:
                    setEspecificacao(EnumCarta.COFRE_09.getDescricao());
                    setTaxa(10);
                    break;
                case 10:
                    setEspecificacao(EnumCarta.COFRE_10.getDescricao());
                    setTaxa(200);
                    break;
                case 11:
                    setEspecificacao(EnumCarta.COFRE_11.getDescricao());
                    setTaxa(25);
                    break;
                case 12:
                    setEspecificacao(EnumCarta.COFRE_12.getDescricao());
                    setTaxa(-75);
                    break;
                case 13:
                    setEspecificacao(EnumCarta.COFRE_13.getDescricao());
                    setTaxa(-100);
                    break;
                case 14:
                    setEspecificacao(EnumCarta.COFRE_14.getDescricao());
                    setTaxa(100);
                    break;
                case 15:
                    setEspecificacao(EnumCarta.COFRE_15.getDescricao());
                    setTaxa(-45);
                    break;
            }
        }
        
        // inicializa a carta como sorte
        else if(tipoCarta == 1) {
            switch(numCarta) {
                case 8:
                    setEspecificacao(EnumCarta.SORTE_08.getDescricao());
                    setTaxa(-50);
                    break;
                case 9:
                    setEspecificacao(EnumCarta.SORTE_09.getDescricao());
                    setTaxa(75);
                    break;
                case 10:
                    setEspecificacao(EnumCarta.SORTE_10.getDescricao());
                    setTaxa(-50);
                    break;
                case 11:
                    setEspecificacao(EnumCarta.SORTE_11.getDescricao());
                    setTaxa(100);
                    break;
                case 12:
                    setEspecificacao(EnumCarta.SORTE_12.getDescricao());
                    setTaxa(50);
                    break;
                case 13:
                    setEspecificacao(EnumCarta.SORTE_13.getDescricao());
                    setTaxa(150);
                    break;
                case 14:
                    setEspecificacao(EnumCarta.SORTE_14.getDescricao());
                    setTaxa(-40);
                    break;
                case 15:
                    setEspecificacao(EnumCarta.SORTE_15.getDescricao());
                    setTaxa(200);
                    break;
            }
        }
    }

    public int bonusDaCarta() {
        // paga um debito ou recebe um bonus monetario
        return(getTaxa());
    }
}
