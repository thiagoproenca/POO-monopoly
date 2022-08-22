public class Utilidade extends Propriedade{

    //Atributos
    private Dado dados;

    //Construtor
    public Utilidade(String nome, Dado dados)
    {
        super(nome, 150, 0);
        this.dados = dados;
    }
    //Metodos
    //Sobrecarga do método calcular aluguel para Utilidade
    @Override
    public int calcularAluguel(int valor) {
        int precoDeAluguel;

        valor = dados.getResultado();

        switch(jogador.Num_Utilidades())
        {
            case 1:
                precoDeAluguel = valor * 4;
                break;
            case 2:
                precoDeAluguel = valor * 10;
                break;
            default:
                precoDeAluguel = -1;//Definir e tratar essa excessão
                break;

        }
        return precoDeAluguel;

    }

}
