public class VaParaCadeia extends Espaco {
    // atributos
    
    // construtor
    public VaParaCadeia(int posicao){
        inicializaEspaco(posicao);
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
}
