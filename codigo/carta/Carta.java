/*
 * Autor: Ana Beatriz e Thiago Proença
 * 
 * Descrição da classe:
 * Classe Pai com 3 sub-classes, sendo que cada carta possui uma descrição que é definida, usando o arquivo java já fornecido
 * EnumCarta.java;
 * Os 3 tipos de cartas que temos são:
 * - Cartd de Movimento;
 * - carta Vá para Cadeia;
 * - carta de dinheiro.
 * Classe Carta não tem responsabilidades tão específicas, sendo que as sub-classes tomam conta dessa parte.
 */
public class Carta {
    // atributos
    protected String especificacao;

    /**
     * Métodos Getters e Setters de cada atributo da classe.
     */
    protected String getEspecificacao() {
        return(this.especificacao);
    }

    protected void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }
}