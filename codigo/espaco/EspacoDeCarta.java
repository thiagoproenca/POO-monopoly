/*
 * Autor: Thiago Proença
 * 
 * Descrição da classe:
 * Sub-classe da classe 'Espaco'; EspacoDeCarta representa o espaço ”Cofre”; 
 * esta classe, de forma resumida, utiliza o método inicializaEspaco() que inicializa os espacos de cofre,
 * por meio da variável 'posicao' dada como parâmetro na estrutura condicional switch - case. 
 * É preciso informar que temos dois tipos de cartas e razão pela qual implementamos o método tipoDeCarta() que retorna
 * ou 'COFRE' ou 'SORTE'.
 * Assim, teremos as seguintes situações:
 * - Caso a carta for do tipo COFRE, retorna 1;
 * - Caso a carta for do tipo SORTE, retorna 0;
 * - Caso a inicialização falhe, retorna -1.
 */
public class EspacoDeCarta extends Espaco {
    // atributos

    // construtor(es)
    public EspacoDeCarta(int posicao) {
        inicializaEspaco(posicao);
    }

    // métodos
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

    public int tipoDeCarta(){
        if(getNome() == NomeDoEspaco.COFRE.toString())
            return 1;
        else if(getNome() == NomeDoEspaco.SORTE.toString()) 
            return 0;
        else return -1;
    }
}
