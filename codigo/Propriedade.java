

public abstract class Propriedade extends Espaco 
{

    //Atributos
    protected int precoDeCompra;
    protected int precoDeAluguel;
    protected Jogador jogador;//O comprador é o jogador, certo? Olhar a classe jogador para relacionar melhor com as outras classes
    private boolean ehPossuida;//variavel que informa se uma propriedade é possuida por um jogador
    
    //Construtor
    public Propriedade(String nome, int precoDeCompra, int precoDeAluguel)
    {
        this.nome = nome;
        this.precoDeCompra = precoDeCompra;
        this.precoDeAluguel = precoDeAluguel;
        ehPossuida = false;
    }

    //Métodos
    public abstract int calcularAluguel();

    //Getters and Setters

    public void setPrecoDeCompra(int precoDeCompra) 
    {
        this.precoDeCompra = precoDeCompra;//Depois dos testes será eliminado
    }
    public int getPrecoDeCompra() 
    {
        return precoDeCompra;
    }
    public void setPrecoDeAluguel(int precoDeAluguel)
    {
        this.precoDeAluguel = precoDeAluguel;//Depois dos testes será eliminado
    }
    public int getPrecodeAluguel()
    {
        return precoDeAluguel;
    }
    public void setJogador(Jogador jogador) 
    {
        this.jogador = jogador;
    }

    public Jogador getJogador() 
    {
        return jogador;
    }
    
    public boolean getEhPossuida() 
    {
        return ehPossuida;
    }
    public void setEhPossuida()//Pensando em colocar private para dificultar o acesso ao monopolio
    {
        ehPossuida = true;
    }

    
}
