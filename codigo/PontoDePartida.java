public class PontoDePartida extends Espaco {
    // atributos
    private double taxa;

    // construtor(es)
    public PontoDePartida() {
        this.taxa = 1500;
    }

    // getters e setters
    private double getTaxa() {
        return(this.taxa);
    }

    private void setTaxa(double valor) {
        this.taxa = valor;
    }

    //metodos
    public void deuAVolta() {
        // atualiza o valor da taxa que o jogador recebera
        
        setTaxa(200);
    }

    public double receberTaxa() {
        // o jogador recebera a taxa do ponto de partida

        return(getTaxa());
    }
}
