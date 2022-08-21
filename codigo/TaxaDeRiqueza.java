public class TaxaDeRiqueza extends Espaco {
    // atributos
    private double taxa;

    // construtor
    public TaxaDeRiqueza(int posicao) {
        this.taxa = 200;

        inicializaEspaco(posicao);
    }

    // getters e setters
    private double getTaxa() {
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
        // retorna o valor da taxa para que o jogador pague $200,00 ao banco

        return(this.getTaxa());
    }
}
