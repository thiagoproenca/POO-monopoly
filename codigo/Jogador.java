public class Jogador{

    // atributos
    private String nome;
    private float saldo;
    //private Propriedade[] propriedades;
    private int[] lancamentos;
    private boolean estarNaCadeia;
    private int posicao;
    private int turnosNaCadeia;

    // construtor
    public Jogador(String nome){
        this.nome = nome;
        this.saldo = 1500;
        this.lancamentos = new int[3];
        this.estarNaCadeia = false;
        this.posicao = 1;
        this.turnosNaCadeia = 0;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean setLancamentos(int numero) {
        if (numero <= 0 || numero > 6) {
            return false;
        } else {
            lancamentos[0] = lancamentos[1];
            lancamentos[1] = lancamentos[2];
            lancamentos[2] = numero;

            return true;
        }
    }

    public int getUltimoLancamento() {
        switch (lancamentos.length){
            case 0:
                return 0;
            case 1:
                return lancamentos[0];
            case 2:
                return lancamentos[1];
            default:
                return lancamentos[2];
        }
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public boolean isEstarNaCadeia() {
        return estarNaCadeia;
    }

    public void setEstarNaCadeia(boolean estarNaCadeia) {
        this.estarNaCadeia = estarNaCadeia;
    }

    public void setTurnosNaCadeia(int turnos){
        this.turnosNaCadeia = turnos;
    }

    public int getTurnosNaCadeia(){
        return this.turnosNaCadeia;
    }

    // métodos
    public boolean temDuplas() {
        switch (lancamentos.length){
            case 0:
            case 1:
                return false;
            case 2:
                return lancamentos[0] == lancamentos[1];
            default:
                return lancamentos[0] == lancamentos[1] || lancamentos[0] == lancamentos[2] || lancamentos[1] == lancamentos[2];
        }
    }

    public int Num_Estacoes__de_Metro(){
        int Num_Estacoes__de_Metro = 0;
        for(Propriedade item : propriedades){
            if(item instanceof Estacao_de_Metro){
                Num_Estacoes__de_Metro++;
            }
        }

        return Num_Estacoes__de_Metro;
    }

    public int Num_Utilidades(){
        int Num_Utilidades = 0;
        for(Propriedade item : propriedades){
            if(item instanceof Utilidade){
                Num_Utilidades++;
            }
        }

        return Num_Utilidades;
    }
}