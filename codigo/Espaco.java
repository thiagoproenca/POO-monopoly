public class Espaco {
    // atributos
    private int posicao;
    private String nome;
    private Espaco tipo;
    private double preco;
    private double precoCasa;
    private double aluguel;
    private double aluguelCasa;

    // construtor(es)
    public Espaco() {
        this.posicao = 0;
        this.nome = "";
        this.preco = 0;
        this.precoCasa = 0;
        this.aluguel = 0;
        this.aluguelCasa = 0;
    }

    public Espaco(int posicao, String nome, double preco, double precoCasa, double aluguel, double aluguelCasa) {
        this.posicao = posicao;
        this.nome = nome;
        this.preco = preco;
        this.precoCasa = precoCasa;
        this.aluguel = aluguel;
        this.aluguelCasa = aluguelCasa;
    }

    // getters e setters


    //metodos
}