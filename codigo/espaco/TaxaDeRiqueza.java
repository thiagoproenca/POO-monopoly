/* 
 * Autor: Thiago Proença
 * 
 * Descrição da classe: 
 * Classe que implementa um espaco "TaxaDeRiqueza" no "Tabuleiro". Essa classe é responsável por fazer
 * o/a "Jogadora" pagar uma taxa ao "Banco", caso este/a caia nesse esoaço.
 * O valor que o "Jogador" deverá pagar ao "Banco" é $200.
 * Temos também:
 * - A inicialização deste espaço no método inicializaEspaco(int posicao);
 * - O método pagarTaxa() que retorna o valor da taxa que o "Jogador" deve pagar ao "Banco".
 */

public class TaxaDeRiqueza extends Espaco {
    // atributos
    private float taxa;

    // construtor
    public TaxaDeRiqueza(int posicao) {
        this.taxa = 200;

        inicializaEspaco(posicao);
    }

    // getters e setters
    private float getTaxa() {
        return(taxa);
    }

    // métodos
    private void inicializaEspaco(int posicao) {
        switch(posicao) {
            case 39:
                setNome(NomeDoEspaco.TAXA_RIQUEZA.toString());
                setPosicao(posicao);
                break;
        }
    }

    public float pagarTaxa() {
        // retorna o valor da taxa para que o jogador pague $200,00 ao banco

        return(this.getTaxa());
    }
}
