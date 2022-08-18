public class Cadeia extends Espaco {
    // atributos
    private static double valorFianca = 50;
    private int rodadasPreso;

    // construtor(es)
    public Cadeia(Boolean visitando){
        if(!visitando){
            this.rodadasPreso = 3;
        }
        
        else {
            this.rodadasPreso = 0;
        }
    }
    // getters e setters

    //metodos
    public void sairCadeia() {
        // se alguma condicao que libera da cadeia for cumprida, saira da cadeia
        if(rodadasPreso )
    }
}
