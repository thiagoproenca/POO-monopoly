
package gerenciador_monopoly;


public class Estacao_de_Metro extends Propriedade{

    private static double preçoDeAluguel = 25;

    @Override
    public void calcularAluguel() {
        if(preçoDeAluguel <= 200) preçoDeAluguel = preçoDeAluguel * 2;
    }

    public static double getPreçoDeAluguel() {
        return preçoDeAluguel;
    }

    public static void setPreçoDeAluguel(double preçoDeAluguel) {
        Estacao_de_Metro.preçoDeAluguel = preçoDeAluguel;
    }
}
