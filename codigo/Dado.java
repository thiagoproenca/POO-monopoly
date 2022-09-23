/*
 * Autor: Renan
 * Descrição da classe: Classe que tem um dado que é lançado de forma aleatória 
 * com ajuda da importando do pacote "Random" do Java.
 * Tem-se o método lancaDado() que, de forma redundante, lança o dado e coloca o valor aleatório na variável resultado.
 */

import java.util.Random;

public class Dado {
    private int resultado;

    public int lancaDado(){
        Random random = new Random();
        this.resultado = random.nextInt(6) + 1;
        return this.resultado;
    }

    public int getResultado() {
        return resultado;
    }

}
