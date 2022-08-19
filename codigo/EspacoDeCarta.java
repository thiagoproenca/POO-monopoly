public class EspacoDeCarta extends Espaco {
    // atributos

    // construtor(es)
    public EspacoDeCarta(int posicao) {
        inicializaEspaco(posicao);
    }

    // getters e setters

    //metodos
    private void inicializaEspaco(int posicao) {
        switch(posicao) {
            case 3:
            case 18:
            case 34:
                setNome(NomeDoEspaco.COFRE.toString());
                setPosicao(posicao);
                break;
            case 8:
            case 23:
            case 37:
                setNome(NomeDoEspaco.SORTE.toString());
                setPosicao(posicao);
                break;
        }
    }
}
