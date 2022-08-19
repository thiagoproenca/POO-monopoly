public class ImpostoDeRenda extends Espaco {
    // atributos
    private double imposto;

    // construtor
    public ImpostoDeRenda(int posicao) {
        this.imposto = 200;
        
        inicializaEspaco(posicao);
    }

    // getters e setters
    private double getImposto() {
        return(this.imposto);
    }

    //metodos
    private void inicializaEspaco(int posicao) {
        switch(posicao) {
            case 5:
                setNome(NomeDoEspaco.IMPOSTO.toString());
                setPosicao(posicao);
                break;
        }
    }

    public double pagarTaxaFixo() {
        // o jogador pagara $200,00

        return(getImposto());
    }
}
