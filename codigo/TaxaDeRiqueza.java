public class TaxaDeRiqueza extends Espaco {
    // atributos
    private static int taxa = 200;

    // construtor
    public TaxaDeRiqueza(int posicao) {
        inicializaEspaco(posicao);
    }

    // getters e setters
    private static double getTaxa() {
        return(taxa);
    }

    //metodos
    private void inicializaEspaco(int posicao) {
        switch(posicao) {
            case 39:
                setNome(NomeDoEspaco.TAXA_RIQUEZA.toString());
                setPosicao(posicao);
                break;
        }
    }

    public double pagarTaxa() {
        // o jogador paraga $200,00

        return(getTaxa());
    }
}
