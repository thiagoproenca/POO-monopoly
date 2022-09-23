/* 
 * Autor: Thiago Proença
 * 
 * Descrição da classe: 
 * Sub-classe de 'Espaco';
 * classe que implementa "EstacionamentoGratis" no "Tabuleiro". Essa classe não tem nenhuma resposabilidade;
 * ela implementa um "Espaco" no "Tabuleiro" que não tem alguma função, pois nada acontece nesse espaço.
 * Logo, fizemos a inicialização deste espaço, setando o nome do mesmo, por meio da posicao contida na estrutura condicional 
 * switch-case.
 */

public class EstacionamentoGratis extends Espaco {
    // atributos

    // construtor
    public EstacionamentoGratis(int posicao) {
        inicializaEspaco(posicao);
    }

    // métodos
    private void inicializaEspaco(int posicao) {
        switch(posicao) {
            case 21:
                setNome(NomeDoEspaco.ESTACIONAMENTO.toString());
                setPosicao(posicao);
                break;
        }
    }
}
