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
