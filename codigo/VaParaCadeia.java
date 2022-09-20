public class VaParaCadeia extends Espaco {
    // atributos
    
    // construtor
    public VaParaCadeia(int posicao){
        inicializaEspaco(posicao);
    }

    public VaParaCadeia(Jogador jogador) {
        inicializaEspaco(jogador.getPosicao());
        cadeia(jogador);
    }

    // getters e setters

    // metodos
    private void inicializaEspaco(int posicao) {
        switch(posicao) {
            case 31:
                setNome(NomeDoEspaco.VA_PARA_CADEIA.toString());
                setPosicao(posicao);
                break;
        }
    }

    private void cadeia(Jogador jogador){
        jogador.setEstarNaCadeia(true);
        jogador.setPosicao(11);
    }
}
