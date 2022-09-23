/*
* Autor: Arthur Nitto
* 
* Descrição da classe: 
* Classe que representa o espaço ”Na cadeia”, e possui o valor da fiança a ser paga por jogadores que estiverem presos
* nesse espaço.
* De forma sucinta, temos o método inicializaEspaco(int posicao) que configura o nome do respectivo espaço, 
* por meio do parâmetro 'posicao', usado também na estrutura condicional switch - case.
* Por fim, temos método pagarFianca() que simplesmente retorna o valor da fiança.
* O jogador irá para cadeia em 3 situações, nomeadamente: 
* - Caso o jogador caia no espaço denominado “Vá para a cadeia”;
* - caso o jogador tire a carta “Vá para a cadeia”;
* - caso o jogador tire uma dupla nos dados três vezes seguidas.
*/
public class Cadeia extends Espaco {
    // atributos
    private static int valorFianca = 50;

    // construtor
    public Cadeia(int posicao) {
        inicializaEspaco(posicao);
    }
    
    /**
     * Métodos Getters e Setters de cada atributo da classe.
     */
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
