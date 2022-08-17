public class ImpostoDeRenda extends Espaco {
    // atributos
    private double imposto;

    // construtor(es)
    public ImpostoDeRenda() {
        this.imposto = 200;
    }

    // getters e setters
    private double getImposto() {
        return(this.imposto);
    }

    private void setImposto(double imposto) {
        this.imposto = imposto;
    }

    //metodos
    public double pagarTaxaFixo(double valor) {
        // o jogador pagara $200,00
        if(getImposto() != 200) {
            setImposto(200);
        }

        return(valor - getImposto());
    }

    public double pagarTaxaPorcento(double fortuna) {
        // o jogador pagara 10% da fortuna total
        setImposto(fortuna/10);
        
        return(fortuna - getImposto());
    }
}
