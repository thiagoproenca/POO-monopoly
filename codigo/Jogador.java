public class Jogador{

    private String nome;
    private float saldo;
//  private Propriedade[] propriedades;
    private int[] lancamentos;
    private boolean estarNaCadeia;

    public Jogador(String nome){
        this.nome = nome;
        this.saldo = 1500;
        this.lancamentos = new int[3];
        this.estarNaCadeia = false;
    }

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
        if(numero <= 0 || numero > 6){
            return false;
        } else {
            lancamentos[0] = lancamentos[1];
            lancamentos[1] = lancamentos[2];
            lancamentos[2] = numero;

            return true;
        }
    }

    public int getUltimoLancamento(){
        return lancamentos[2];
    }

    public boolean temDuplas() {
        return lancamentos[0] == lancamentos[1] || lancamentos[0] == lancamentos[2] || lancamentos[1] == lancamentos[2];
    }

    public boolean isEstarNaCadeia() {
        return estarNaCadeia;
    }

    public void setEstarNaCadeia(boolean estarNaCadeia) {
        this.estarNaCadeia = estarNaCadeia;
    }
}
