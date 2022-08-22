public class mainTeste {
    public static void main(String[] args){
        //Jogo começou, todos os jogadores possuem 1500.
        PontoDePartida j1 = new PontoDePartida(1);
        PontoDePartida j2 = new PontoDePartida(2);
        PontoDePartida j3 = new PontoDePartida(3);
        PontoDePartida j4 = new PontoDePartida(4);

        double valorJ1 = j1.receberTaxa();
        double valorJ2 = j2.receberTaxa();
        double valorJ3 = j3.receberTaxa();
        double valorJ4 = j4.receberTaxa();


        //Jogador 2 conseguiu percorrer todo o tabuleiro 2 vezes
        j2.deuAVolta();
        valorJ2 += j2.receberTaxa();
        valorJ2 += j2.receberTaxa();

        //Jogador 3 conseguiu percorrer todo o tabuleiro 1 vez
        j3.deuAVolta();
        valorJ3 += j3.receberTaxa();

        //J1 & J4 = 1500. J2 = 1900. J3 = 1700.
        System.out.println("Jogador 1: $"+valorJ1+"\nJogador 2: $"+valorJ2+"\nJogador 3: $"+valorJ3+"\nJogador 4: $"+valorJ4);
        // System.out.println("Jogador 1 posição: "+j1.getNome());
        // System.out.println("Jogador 2 posição: "+j2.getNome());
        // System.out.println("Jogador 3 posição: "+j3.getNome());
        // System.out.println("Jogador 4 posição: "+j4.getNome());

        Cadeia cj1 = new Cadeia(0);
        Cadeia cj2 = new Cadeia(0);
        Cadeia cj3 = new Cadeia(0);
        Cadeia cj4 = new Cadeia(0);

        //Todo mundo entra na cadeia, paga 50 reais e saem da cadeia.
        valorJ1 -= cj1.pagarFianca();
        valorJ2 -= cj2.pagarFianca();
        valorJ3 -= cj3.pagarFianca();
        valorJ4 -= cj4.pagarFianca();

        System.out.println("Jogador 1: $"+valorJ1+"\nJogador 2: $"+valorJ2+"\nJogador 3: $"+valorJ3+"\nJogador 4: $"+valorJ4);

    }
}
