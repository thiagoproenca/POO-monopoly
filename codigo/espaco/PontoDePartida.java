/*
 * Autor: Thiago Proença
 * 
 * Descrição da classe:
 * Classe filha de Espaco que representa o espaço inicial do jogo;
 * cada jogador começa o jogo nesse espaço com 1500 no seu estoque;
 * cada jogador recebe um valor atualizado ao voltar a este espaço.
 * o método deuAVolta() atualiza o valor da taxa que o jogador receberá;
 * o método receberTaxa() retorna a taxa do ponto de partida ao jogador;
 */
public class PontoDePartida extends Espaco {
    // atributos
    private float taxa;

    // construtor(es)
    public PontoDePartida(int posicao) {
        this.taxa = 1500;

        inicializaEspaco(posicao);
    }

    /**
     * Métodos Getters e Setters de cada atributo da classe.
     */
    private float getTaxa() {
        return(this.taxa);
    }

    private void setTaxa(float valor) {
        this.taxa = valor;
    }

    // métodos
    private void inicializaEspaco(int posicao) {
        switch(posicao) {
            case 1:
                setNome(NomeDoEspaco.PONTO_PARTIDA.toString());
                setPosicao(posicao);
                break;
        }
    }
    
    public void deuAVolta() {
        // atualiza o valor da taxa que o jogador recebera
        
        setTaxa(200);
    }
    
    public float receberTaxa() {
        // o jogador recebera a taxa do ponto de partida

        return(getTaxa());
    }
}
