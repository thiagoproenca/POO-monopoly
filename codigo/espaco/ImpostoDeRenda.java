/* 
 * Autor: Thiago Proença
 * 
 * Descrição da classe: 
 * Classe que implementa um espaço "ImpostoDeRenda" no "Tabuleiro"; 
 * essa classe tem a responsabilidade de retornar ao "Banco" o valor da 'imposto de renda' para que o jogador pague 
 * essa taxa. 
 * O "Jogador" terá as seguintes opções:
 * - Pagar uma taxa fixa ($200) - método pagarTaxaFixo();
 * - Pagar 10% de sua fortuna total - método pagarTaxaPorcentagem(Jogador jogador).
 * Por fim, temos a inicialização de ImpostoDeRenda que seta deste espaço, usando a posicao como parâmetro
 * estrutura condicional switch-case.
 */

public class ImpostoDeRenda extends Espaco {
    // atributos
    private float imposto;

    // construtor
    public ImpostoDeRenda(int posicao) {
        this.imposto = 200;
        
        inicializaEspaco(posicao);
    }

    /**
     * Métodos Getters e Setters de cada atributo da classe.
     */
    private float getImposto() {
        return(this.imposto);
    }

    private void setImposto(float imposto) {
        this.imposto = imposto;
    }

    // métodos
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
