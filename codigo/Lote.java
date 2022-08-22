

public class Lote extends Propriedade{

    //Atributos
    private String cor;
    private int precoDeAluguel1;
    private int precoDeAluguel2;
    private int precoDeAluguel3;
    private int precoDeAluguel4;
    private int precoDeAluguelHotel;
    private int numCasas;

    //Construtor
    public Lote(String nome, int precoDeCompra, int precoDeAluguel, int precoDeAluguel1, int precoDeAluguel2, int precoDeAluguel3, int precoDeAluguel4, int precoDeAluguelHotel)
    {
        super(nome, precoDeCompra, precoDeAluguel);
        this.precoDeAluguel1 = precoDeAluguel1;
        this.precoDeAluguel2 = precoDeAluguel2;
        this.precoDeAluguel3 = precoDeAluguel3;
        this.precoDeAluguel4 = precoDeAluguel4;
        this.precoDeAluguelHotel = precoDeAluguelHotel;
    }
    //Metodos, getters, setters
    public int getPrecoDeAluguel1() 
    {
        return precoDeAluguel1;
    }

    public void setPrecoDeAluguel1(int precoDeAluguel1) 
    {
        this.precoDeAluguel1 = precoDeAluguel1;
    }

    public int getPrecoDeAluguel2() 
    {
        return precoDeAluguel2;
    }

    public void setPrecoDeAluguel2(int precoDeAluguel2) 
    {
        this.precoDeAluguel2 = precoDeAluguel2;
    }

    public int getPrecoDeAluguel3() 
    {
        return precoDeAluguel3;
    }

    public void setPrecoDeAluguel3(int precoDeAluguel3) 
    {
        this.precoDeAluguel3 = precoDeAluguel3;
    }

    public int getPrecoDeAluguel4() 
    {
        return precoDeAluguel4;
    }

    public void setPrecoDeAluguel4(int precoDeAluguel4) 
    {
        this.precoDeAluguel4 = precoDeAluguel4;
    }

    public int getPrecoDeAluguelHotel() 
    {
        return precoDeAluguelHotel;
    }

    public void setPrecoDeAluguelHotel(int precoDeAluguelHotel) 
    {
        this.precoDeAluguelHotel = precoDeAluguelHotel;
    }

    public int getNumCasas() {
        return numCasas;
    }

    public void setNumCasas(int numCasas) {
        this.numCasas = numCasas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) 
    {
        this.cor = cor;
    }

    @Override
    public int calcularAluguel() //Questionar se faz sentido ter o numero de casas como parametro
    {
        int precoDeAluguel = 0;
        switch(numCasas)
        {
            case 0:
            precoDeAluguel = super.getPrecodeAluguel();
                if(getEhPossuida())
                {
                    precoDeAluguel = precoDeAluguel * 2;//precoDeAluguel = precoDeAluguel * 5
                }
                break;
            case 1:
                precoDeAluguel = precoDeAluguel1;
                break;
            case 2:
                precoDeAluguel = precoDeAluguel2;
                break;
            case 3:
                precoDeAluguel = precoDeAluguel3;
                break;
            case 4:
                precoDeAluguel = precoDeAluguel4;
                break;
            case 5:
                precoDeAluguel = precoDeAluguelHotel;
                break;
            default:
                precoDeAluguel = -1; //ver como tratar essa excessão
                break;
        }

        return precoDeAluguel;
    }
}

