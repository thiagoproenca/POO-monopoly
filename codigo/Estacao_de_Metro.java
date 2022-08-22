/*
 *Autor: Maurício Kessongo

 */

public class Estacao_de_Metro extends Propriedade
{

    //Construtor
    public Estacao_de_Metro(String nome, int precoDeCompra, int precoDeAluguel)
    {
        super(nome, precoDeCompra, precoDeAluguel);
    }
    //Métodos
    //Sobrecarga do método calcularaluguel para uma estação de metrô
    @Override
    public int calcularAluguel() 
    { 
        int Num_Estacoes__de_Metro = jogador.Num_Estacoes__de_Metro();
        int precoDeAluguel;
       switch(Num_Estacoes__de_Metro)
       {
            case 1:
                precoDeAluguel = 25;
                break;
            case 2:
                precoDeAluguel = 50;
                break;
            case 3:
                precoDeAluguel = 100;
                break;
            case 4:
                precoDeAluguel = 200;
                break;
            default:
            precoDeAluguel = -1;//Ver qual vlor vai ser padrão no caso de erro;
       }
       return precoDeAluguel;
    }
}
