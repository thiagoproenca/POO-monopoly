public class Cadeia extends Espaco {
    // atributos
    private static int valorFianca = 50;

    // construtor
    public Cadeia(int posicao) {
        inicializaEspaco(posicao);
    }
    
    // getters e setters
    private static int getValorFianca() {
        return(valorFianca);
    }

    //metodos
    private void inicializaEspaco(int posicao) {
        switch(posicao) {
            case 11:
                setNome(NomeDoEspaco.CADEIA.toString());
                setPosicao(posicao);
                break;
        }
    }

    public int pagarFianca() {
        // o jogador paga a fianca
        
        return(getValorFianca());
    }
}
