/* Autor: 
 * Thiago Proença
 * 
 * Descrição da classe: 
 * Classe que implementa "EstacionamentoGratis" no "Tabuleiro". Essa classe nao tem nenhuma resposabilidade;
 * ela implementa um "Espaco" no "Tabuleiro" que nao tem nenhuma funcao.
 */

public class EstacionamentoGratis extends Espaco {
    // atributos

    // construtor
    public EstacionamentoGratis(int posicao) {
        inicializaEspaco(posicao);
    }
    
    // getters e setters

    //metodos
    private void inicializaEspaco(int posicao) {
        switch(posicao) {
            case 21:
                setNome(NomeDoEspaco.ESTACIONAMENTO.toString());
                setPosicao(posicao);
                break;
        }
    }
}
