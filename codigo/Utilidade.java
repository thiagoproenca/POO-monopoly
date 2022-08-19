/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciador_monopoly;

/**
 *
 * @author mauri
 */
public class Utilidade extends Propriedade{

    private double preçoDeAluguel;

    @Override
    public void calcularAluguel() {

        preçoDeAluguel = preçoDeAluguel * 4;
    }

    public double getPreçoDeAluguel() {
        return preçoDeAluguel;
    }

    public void setPreçoDeAluguel(double preçoDeAluguel) {
        this.preçoDeAluguel = preçoDeAluguel;
    }

}
