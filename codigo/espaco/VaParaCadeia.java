/*
 * Autor: Arthur Nitto
 * Descrição da classe:
 * Sub-classe de Espaco;
 * o jogador caindo nesse espaço é considerado preso e movido ppara o espaço "Vá para a cadeia";
 * temos um construtor da classe que inicializa esse espaço por meio da posição recebida no mesmo construtor.
 */
public class VaParaCadeia extends Espaco {
    // atributos
    
    // construtor
    public VaParaCadeia(int posicao){
        inicializaEspaco(posicao);
    }

    // getters e setters

    // métodos
    private void inicializaEspaco(int posicao) {
        switch(posicao) {
            case 31:
                setNome(NomeDoEspaco.VA_PARA_CADEIA.toString());
                setPosicao(posicao);
                break;
        }
    }
}
