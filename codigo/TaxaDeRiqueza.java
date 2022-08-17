public class TaxaDeRiqueza extends Espaco {
    // atributos
    private static int taxa = 200;

    // construtor(es)

    // getters e setters
    private static double getTaxa() {
        return(taxa);
    }

    //metodos
    public double pagarTaxa(double valor) {
        // o jogador paraga $200,00

        return(valor - getTaxa());
    }
}
