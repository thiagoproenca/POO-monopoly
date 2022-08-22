public class Utilidade extends Propriedade{

    //Construtor
    public Utilidade(String nome, int precoDeCompra, int precoDeAluguel)
    {
        super(nome, precoDeCompra, precoDeAluguel);
    }
    //Metodos
    //Sobrecarga do método calcular aluguel para Utilidade
    @Override
    public int calcularAluguel() 
    {
        int precoDeAluguel;

        int valor = jogador.getUltimoLancamento();
        int num_utilidades = jogador.Num_Utilidades();

        switch(num_utilidades)
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
