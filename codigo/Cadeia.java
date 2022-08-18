public class Cadeia extends Espaco {
    // atributos
    private static double valorFianca = 50;
    private int rodadasPreso;
    private boolean visitando;

    // construtor(es)
    public Cadeia(boolean visitando){
        this.visitando = visitando;

        if(!visitando){
            this.rodadasPreso = 3;
        }
        
        else {
            this.rodadasPreso = 0;
        }
    }
    // getters e setters
    private int getRodadasPreso() {
        return(this.rodadasPreso);
    }

    private void setRodadasPreso(int rodadasPreso) {
        this.rodadasPreso = rodadasPreso;
    }

    //metodos
    public void sairCadeia() {
        // se alguma condicao que libera da cadeia for cumprida, saira da cadeia
        if(getRodadasPreso() > 0) {
            // podera sair se pagar
            // podera sair se uma dupla de dados
        }
        
        else if(getRodadasPreso() == 0 && !visitando) {
            // o jogador estado devendo pro banco; o jogador perdeu o jogo
        }
    }
}
