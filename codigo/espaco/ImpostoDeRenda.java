/* Autor: 
 * Thiago Proença
 * 
 * Descrição da classe: 
 * Classe que implementa um espaco "ImpostoDeRenda" no "Tabuleiro"; essa classe tem a responsabilidade de
 * retornar ao "Banco" o valor da 'imposto de renda' para que o jogador pague essa taxa.
 * O "Jogador" tera a opcao de pagar uma taxa fixa ou 10% da sua fortuna.
 */

public class ImpostoDeRenda extends Espaco {
    // atributos
    private float imposto;

    // construtor
    public ImpostoDeRenda(int posicao) {
        this.imposto = 200;
        
        inicializaEspaco(posicao);
    }

    // getters e setters
    private float getImposto() {
        return(this.imposto);
    }

    private void setImposto(float imposto) {
        this.imposto = imposto;
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

    public float pagarTaxaFixo() {
        // retorna o valor fixo da taxa para que o jogador pague $200,00 ao banco

        if(getImposto() != 200) {
            setImposto(200);
        }

        return(getImposto());
    }

    public float pagarTaxaPorcentagem(Jogador jogador) {
        return jogador.getFortuna();
    }
}
