
package gerenciador_monopoly;

/**
 *
 * @author mauri
 * é possível ter um objeto do tipo de uma classe abstrata?
 * É possível ter atributos do tipo de classes filhas de uma classe pai que tem relação de agregação com uma classe todo? (dentro de jogador ter atributos do tipo utilidade, lote, etacção)
 Fazer downcasting e upcasting? para poder ter objetos do tipo filho na classe pai (ter objetos utilidade, estação e lotes na classe Propriedade (classe pai)
 */
public abstract class Propriedade {//extends Espaco

    //Atributos
    private double preçoDeCompra;
    private String comprador;//O comprador é o jogador, certo? Olhar a classe jogador para relacionar melhor com as outras classes
    Utilidade utilidades[];
    //Métodos
    public abstract void calcularAluguel();

    //Getters and Setters
    public double getPreçoDeCompra() {
        return preçoDeCompra;
    }

    public void setPreçoDeCompra(double preçoDeCompra) {
        this.preçoDeCompra = preçoDeCompra;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public void informarComprador(){
        System.out.println("O proprietário dessa propriedade é: " + comprador);
    }
    
    
    //Faltando os construtores

  
    

    
}
