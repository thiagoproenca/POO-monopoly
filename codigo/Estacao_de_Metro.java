//import java.lang.Override;

public class Estacao_de_Metro extends Propriedade
{

    //Construtor
    public Estacao_de_Metro(String nome)
    {
        super(nome, 200, 0);
    }
    //Métodos
    //Sobrecarga do método calcularaluguel para uma estação de metrô(oVERLOAD)
    
    public int calcularAluguel() 
    {
       int precoDeAluguel;
       switch(jogador.Num_Estacoes__de_Metro())
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
