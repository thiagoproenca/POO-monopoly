/* 
 * Autor: Thiago Proença
 * 
 * Descrição da classe: 
 * Classe que representa um espaço no "Tabuleiro"; "Espaco" apresenta-se como umaclasse genérica
 * que não tem responsabilidade específica, além de fornecer atributos e métodos getters e setter para as sub-classes
 * a fim de preparar os diferentes tipos de espaços.
 * Logo, as classes que possuem responsabilidades específicas no "Tabuleiro" são as sub-classes de "Espaco".
 */

public class Espaco {
    // atributos
    protected int posicao;
    protected String nome;

    /**
     * Métodos Getters e Setters de cada atributo da classe.
     */
    protected int getPosicao() {
        return(this.posicao);
    }

    protected void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    protected String getNome() {
        return(this.nome);
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }
}