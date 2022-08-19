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
