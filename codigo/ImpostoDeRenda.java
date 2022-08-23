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

    private void setImposto(double imposto) {
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

    public double pagarTaxaFixo() {
        // retorna o valor fixo da taxa para que o jogador pague $200,00 ao banco

        if(getImposto() != 200) {
            setImposto(200);
        }

        return(getImposto());
    }

    public double pagarTaxaPorcentagem(Jogador jogador) {
        // retorna 10% da fortuna do jogador para que o mesmo pague ao banco
        setImposto(jogador.getSaldo()/10);

        return(getImposto());
    }
}
