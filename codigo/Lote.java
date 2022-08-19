/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciador_monopoly;

/**
 *
 * @author mauri
 */
public class Lote extends Propriedade{

    private String cor;
    private double preçoDeAluguel;
    private double preçodeConstrução;
    private double preçoDeAluguelCasaConstruida;

    @Override
    public void calcularAluguel() {

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreçoDeAluguel() {
        return preçoDeAluguel;
    }

    public void setPreçoDeAluguel(double preçoDeAluguel) {
        this.preçoDeAluguel = preçoDeAluguel;
    }

    public double getPreçodeConstrução() {
        return preçodeConstrução;
    }

    public void setPreçodeConstrução(double preçodeConstrução) {
        this.preçodeConstrução = preçodeConstrução;
    }

    public double getPreçoDeAluguelCasaConstruida() {
        return preçoDeAluguelCasaConstruida;
    }

    public void setPreçoDeAluguelCasaConstruida(double preçoDeAluguelCasaConstruida) {
        this.preçoDeAluguelCasaConstruida = preçoDeAluguelCasaConstruida;
    }
}

