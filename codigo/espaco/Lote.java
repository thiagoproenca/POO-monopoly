/* Autor: 
 * Maurício Kessongo
 * 
 * Descrição da classe: Classe que implementa uma propriedade "Lote" no "Espaco". Sub-classe de propriedade; essa classe é responsável por calcular
 * o "preço de Aluguel" especificamente para um Lote para que quando um jogador cair no lote de outro, ele consiga chamar o método calcularAluguel()
 * e pague o valor de aluguel certo, conforme está na tabela 1 que nos foi dada. Temos também o métodos calcularAtributos que recebe como parámetro uma
 * variável "posicao" e por meio dessa aloca o valor correto de cada um dos atributos da classe de acordo com o valor de posicao passado como parâmetro.
 */
public class Lote extends Propriedade
{
    //Atributos
    private String cor;

    // construtor
    public Lote(int posicao){
        calcularAtributos(posicao);
    }

    /**
     *
     * Métodos Getters e Setters de cada atributo da classe.
     */

    public String getCor() 
    {
        return (this.cor);
    }

    public void setCor(String cor) 
    {
        this.cor = cor;
    }

    //Métodos

    @Override
    public void calcularAluguel()
    {   
        switch(getPosicao()) {
            case 2:
                // aluguel com casa construida
                if(getCasaConstruida()) {
                    setPrecoDeAluguel(10);
                }
                // aluguel sem casa construida
                else {
                    setPrecoDeAluguel(2);
                }
                
                break;

            case 4:
                // aluguel com casa construida
                if(getCasaConstruida()) {
                    setPrecoDeAluguel(20);
                }
                // aluguel sem casa construida
                else {
                    setPrecoDeAluguel(4);
                }
                break;

            case 7:
                // aluguel com casa construida
                if(getCasaConstruida()) {
                    setPrecoDeAluguel(30);
                }
                // aluguel sem casa construida
                else {
                    setPrecoDeAluguel(6);
                }
                break;

            case 9:
                // aluguel com casa construida
                if(getCasaConstruida()) {
                    setPrecoDeAluguel(30);
                }
                // aluguel sem casa construida
                else {
                    setPrecoDeAluguel(6);
                }
                break;

            case 10:
                // aluguel com casa construida
                if(getCasaConstruida()) {
                    setPrecoDeAluguel(40);
                }
                // aluguel sem casa construida
                else {
                    setPrecoDeAluguel(8);
                }
                break;

            case 12:
                // aluguel com casa construida
                if(getCasaConstruida()) {
                    setPrecoDeAluguel(50);
                }
                // aluguel sem casa construida
                else {
                    setPrecoDeAluguel(10);
                }
                break;

            case 14:
                // aluguel com casa construida
                if(getCasaConstruida()) {
                    setPrecoDeAluguel(50);
                }
                // aluguel sem casa construida
                else {
                    setPrecoDeAluguel(10);
                }
                break;

            case 15:
                // aluguel com casa construida
                if(getCasaConstruida()) {
                    setPrecoDeAluguel(60);
                }
                // aluguel sem casa construida
                else {
                    setPrecoDeAluguel(12);
                }
                break;

            case 17:
                // aluguel com casa construida
                if(getCasaConstruida()) {
                    setPrecoDeAluguel(70);
                }
                // aluguel sem casa construida
                else {
                    setPrecoDeAluguel(14);
                }
                break;

            case 19:
                // aluguel com casa construida
                if(getCasaConstruida()) {
                    setPrecoDeAluguel(70);
                }
                // aluguel sem casa construida
                else {
                    setPrecoDeAluguel(14);
                }
                break;

            case 20:
                // aluguel com casa construida
                if(getCasaConstruida()) {
                    setPrecoDeAluguel(80);
                }
                // aluguel sem casa construida
                else {
                    setPrecoDeAluguel(16);
                }
                break;

            case 22:
                // aluguel com casa construida
                if(getCasaConstruida()) {
                    setPrecoDeAluguel(90);
                }
                // aluguel sem casa construida
                else {
                    setPrecoDeAluguel(18);
                }
                break;

            case 24:
                // aluguel com casa construida
                if(getCasaConstruida()) {
                    setPrecoDeAluguel(90);
                }
                // aluguel sem casa construida
                else {
                    setPrecoDeAluguel(18);
                }
                break;

            case 25:
                // aluguel com casa construida
                if(getCasaConstruida()) {
                    setPrecoDeAluguel(100);
                }
                // aluguel sem casa construida
                else {
                    setPrecoDeAluguel(20);
                }
                break;

            case 27:
                // aluguel com casa construida
                if(getCasaConstruida()) {
                    setPrecoDeAluguel(110);
                }
                // aluguel sem casa construida
                else {
                    setPrecoDeAluguel(22);
                }
                
                break;

            case 28:
                // aluguel com casa construida
                if(getCasaConstruida()) {
                    setPrecoDeAluguel(110);
                }
                // aluguel sem casa construida
                else {
                    setPrecoDeAluguel(22);
                }
                break;

            case 30:
                // aluguel com casa construida
                if(getCasaConstruida()) {
                    setPrecoDeAluguel(120);
                }
                // aluguel sem casa construida
                else {
                    setPrecoDeAluguel(24);
                }
                break;

            case 32:
                // aluguel com casa construida
                if(getCasaConstruida()) {
                    setPrecoDeAluguel(130);
                }
                // aluguel sem casa construida
                else {
                    setPrecoDeAluguel(26);
                }
                break;

            case 33:
                // aluguel com casa construida
                if(getCasaConstruida()) {
                    setPrecoDeAluguel(130);
                }
                // aluguel sem casa construida
                else {
                    setPrecoDeAluguel(26);
                }
                break;

            case 35:
                // aluguel com casa construida
                if(getCasaConstruida()) {
                    setPrecoDeAluguel(150);
                }
                // aluguel sem casa construida
                else {
                    setPrecoDeAluguel(28);
                }
                break;

            case 38:
                // aluguel com casa construida
                if(getCasaConstruida()) {
                    setPrecoDeAluguel(175);
                }
                // aluguel sem casa construida
                else {
                    setPrecoDeAluguel(35);
                }

            case 40:
                // aluguel com casa construida
                if(getCasaConstruida()) {
                    setPrecoDeAluguel(200);
                }
                // aluguel sem casa construida
                else {
                    setPrecoDeAluguel(50);
                }
                break;
        }

    }
    public void calcularAtributos(int posicao)
    {

        /**
         *
         * Implementação do método calcularAtributos(), que recebe um valor de tipo primitivo inteiro como parâmetro e
         * aloca os valores corretos nos atributos da classe de acordo com o valor contido da variável posicao, usando
         * a estrutura condicional Switch - Case.
         */
        
        setCasaConstruida(false);

        switch (posicao)
        {

            case 2:
                setNome(NomeDoEspaco.AV_SUMARE.toString());
                setCor("Marrom");
                setPreco(60);
                setPrecodeConstrucao(50);
                setPrecoDeAluguel(2);
                setPosicao(posicao);
                break;

            case 4:
                setNome(NomeDoEspaco.PRACA_SE.toString());
                setCor("Marrom");
                setPreco(60);
                setPrecodeConstrucao(50);
                setPrecoDeAluguel(4);
                setPosicao(posicao);
                break;

            case 7:
                setNome(NomeDoEspaco.RUA_25_MARCO.toString());
                setCor("Azul Claro");
                setPreco(100);
                setPrecodeConstrucao(50);
                setPrecoDeAluguel(6);
                setPosicao(posicao);
                break;

            case 9:
                setNome(NomeDoEspaco.AV_SAO_JOAO.toString());
                setCor("Azul Claro");
                setPreco(100);
                setPrecodeConstrucao(50);
                setPrecoDeAluguel(6);
                setPosicao(posicao);
                break;

            case 10:
                setNome(NomeDoEspaco.AV_PAULISTA.toString());
                setCor("Azul Claro");
                setPreco(120);
                setPrecodeConstrucao(50);
                setPrecoDeAluguel(8);
                setPosicao(posicao);
                break;

            case 12:
                setNome(NomeDoEspaco.AV_VIEIRA_SOUTO.toString());
                setCor("Rosa");
                setPreco(140);
                setPrecodeConstrucao(100);
                setPrecoDeAluguel(10);
                setPosicao(posicao);
                break;

            case 14:
                setNome(NomeDoEspaco.NITEROI.toString());
                setCor("Rosa");
                setPreco(140);
                setPrecodeConstrucao(100);
                setPrecoDeAluguel(10);
                setPosicao(posicao);
                break;

            case 15:
                setNome(NomeDoEspaco.AV_ATLANTICA.toString());
                setCor("Rosa");
                setPreco(160);
                setPrecodeConstrucao(100);
                setPrecoDeAluguel(12);
                setPosicao(posicao);
                break;

            case 17:
                setNome(NomeDoEspaco.AV_PRES_JUSCELINO.toString());
                setCor("Laranja");
                setPreco(180);
                setPrecodeConstrucao(100);
                setPrecoDeAluguel(14);
                setPosicao(posicao);
                break;

            case 19:
                setNome(NomeDoEspaco.AV_ENG_LUIS.toString());
                setCor("Laranja");
                setPreco(180);
                setPrecodeConstrucao(100);
                setPrecoDeAluguel(14);
                setPosicao(posicao);
                break;

            case 20:
                setNome(NomeDoEspaco.AV_BRIGADEIRO.toString());
                setCor("Laranja");
                setPreco(200);
                setPrecodeConstrucao(100);
                setPrecoDeAluguel(16);
                setPosicao(posicao);
                break;

            case 22:
                setNome(NomeDoEspaco.IPANEMA.toString());
                setCor("Vermelho");
                setPreco(220);
                setPrecodeConstrucao(150);
                setPrecoDeAluguel(18);
                setPosicao(posicao);
                break;

            case 24:
                setNome(NomeDoEspaco.LEBLON.toString());
                setCor("Vermelho");
                setPreco(220);
                setPrecodeConstrucao(150);
                setPrecoDeAluguel(18);
                setPosicao(posicao);
                break;

            case 25:
                setNome(NomeDoEspaco.COPACABANA.toString());
                setCor("Vermelho");
                setPreco(240);
                setPrecodeConstrucao(150);
                setPrecoDeAluguel(20);
                setPosicao(posicao);
                break;

            case 27:
                setNome(NomeDoEspaco.AV_CIDADE_JARDIM.toString());
                setCor("Amarelo");
                setPreco(260);
                setPrecodeConstrucao(150);
                setPrecoDeAluguel(22);
                setPosicao(posicao);
                
                break;

            case 28:
                setNome(NomeDoEspaco.PACAEMBU.toString());
                setCor("Amarelo");
                setPreco(260);
                setPrecodeConstrucao(150);
                setPrecoDeAluguel(22);
                break;

            case 30:
                setNome(NomeDoEspaco.IBIRAPUERA.toString());
                setCor("Amarelo");
                setPreco(280);
                setPrecodeConstrucao(150);
                setPrecoDeAluguel(24);
                setPosicao(posicao);
                break;

            case 32:
                setNome(NomeDoEspaco.BARRA_DA_TIJUCA.toString());
                setCor("Verde");
                setPreco(300);
                setPrecodeConstrucao(200);
                setPrecoDeAluguel(26);
                setPosicao(posicao);
                break;

            case 33:
                setNome(NomeDoEspaco.JARDIM_BOTANICO.toString());
                setCor("Verde");
                setPreco(300);
                setPrecodeConstrucao(200);
                setPrecoDeAluguel(26);
                setPosicao(posicao);
                break;

            case 35:
                setNome(NomeDoEspaco.LAGOA_RODRIGO.toString());
                setCor("Verde");
                setPreco(320);
                setPrecodeConstrucao(200);
                setPrecoDeAluguel(28);
                setPosicao(posicao);
                break;

            case 38:
                setNome(NomeDoEspaco.AV_MORUMBI.toString());
                setCor("Azul");
                setPreco(350);
                setPrecodeConstrucao(200);
                setPrecoDeAluguel(35);
                setPosicao(posicao);

            case 40:
                setNome(NomeDoEspaco.RUA_OSCAR_FREIRE.toString());
                setCor("Azul");
                setPreco(400);
                setPrecodeConstrucao(200);
                setPrecoDeAluguel(50);
                setPosicao(posicao);
                break;
        }

    }
}