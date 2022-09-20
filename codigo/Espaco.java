/* Autor: 
 * Thiago Proença
 * 
 * Descrição da classe: 
 * Classe que representa um espaco no "Tabuleiro"; classe generica que nao tem responsabilidade alguma.
 * As classes que possuem responsabilidades no "Tabuleiro" sao as sub-classes de "Espaco".
 */

public class Espaco {
    // atributos
    protected int posicao;
    protected String nome;

    // construtor

    // getters e setters
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

    //metodos
    
}