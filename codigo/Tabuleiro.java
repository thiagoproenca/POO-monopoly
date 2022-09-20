import java.util.Scanner;
public class Tabuleiro {
    // atributos
    private Espaco[] posicao;

    // construtores
    public Tabuleiro() {
        // inicializa os 40 espacos do tabuleiro
        this.posicao = new Espaco[40];

        for(int i=0; i<40; i++) {
            setPosicao(i+1);
        }
    }

    // getters e setters
    private void setPosicao(int posicao) {
        switch(posicao) {
            case 2, 4, 7, 9, 10, 12, 14, 15, 17, 19, 20, 22, 24, 25, 27, 28, 30, 32, 33, 35, 38, 40:
                this.posicao[posicao-1] = new Lote(posicao);
                break;
            case 6, 16, 26, 36:
                this.posicao[posicao-1] = new Estacao_de_Metro(posicao);
                break;
            case 13, 29:
                this.posicao[posicao-1] = new Utilidade(posicao);
                break;
            case 1:
                this.posicao[posicao-1] = new PontoDePartida(posicao);
                break;
            case 3, 18, 34:
                this.posicao[posicao-1] = new EspacoDeCarta(posicao);
                break;
            case 8, 23, 37:
                this.posicao[posicao-1] = new EspacoDeCarta(posicao);
                break;
            case 5:
                this.posicao[posicao-1] = new ImpostoDeRenda(posicao);
                break;
            case 11:
                this.posicao[posicao-1] = new Cadeia(posicao);
                break;
            case 21:
                this.posicao[posicao-1] = new EstacionamentoGratis(posicao);
                break;
            case 31:
                this.posicao[posicao-1] = new VaParaCadeia(posicao);
                break;
            case 39:
                this.posicao[posicao-1] = new TaxaDeRiqueza(posicao);
                break;
        }
    }

    // metodos

    public void moveJogador(Jogador  jogador, int valorDados){
        if(jogador.getPosicao() + valorDados > 39){
            //Caso ele deu a volta, estou colocando hard-coded aqui, mas vou perguntar!
            jogador.setPosicao(jogador.getPosicao() + valorDados - 40);
            //jogador.setSaldo(jogador.getSaldo()+200);
        }
        else jogador.setPosicao(jogador.getPosicao() + valorDados);

        switch(jogador.getPosicao()) {
            case 2, 4, 7, 9, 10, 12, 14, 15, 17, 19, 20, 22, 24, 25, 27, 28, 30, 32, 33, 35, 38, 40:
                // opera na propriedade?
                break;
            case 1:
                // por enquanto não faço nada? Pq o moveJogador() já está dando o valor.
                break;
            case 3, 18, 34:
                // chama deck de cartas para puxar COFRE
                break;
            case 8, 23, 37:
                // mesma coisa do case de cima, mas com SORTE
                break;
            case 5:
                System.out.println("1. Pagar fixo\n2. Pagar porcentagem");
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                ImpostoDeRenda imposto = new ImpostoDeRenda(jogador.getPosicao()-1);

                if(n == 1){
                    jogador.setSaldo(jogador.getSaldo() - (float) imposto.pagarTaxaFixo());
                    if(jogador.getSaldo() < 0){
                        //Chama função de falência
                    }
                }

                if(n == 2){
                    jogador.setSaldo(jogador.getSaldo() - (float) imposto.pagarTaxaPorcentagem(jogador));
                }
                break;
            case 11:
                if(!jogador.isEstarNaCadeia())
                    System.out.println("Visitando a cadeia");
                else{
                    Scanner in1 = new Scanner(System.in);
                    if(jogador.getTurnosNaCadeia() < 3){
                        System.out.println("1. Pague $50 e saia da cadeia normalmente\n2. Tente sua sorte (se tirar duplas você sai da cadeia)");
                        int n1 = in1.nextInt();
                        Cadeia c = new Cadeia(jogador.getPosicao());
                        switch(n1){
                            case 1:
                                //Chama a função de jogar dado
                                jogador.setSaldo(jogador.getSaldo() - (float) c.pagarFianca());
                                if(jogador.getSaldo() < 0){
                                    //Chama função de falência
                                }else{
                                    //moveJogador(jogador, valorDados);
                                }
                            break;

                            case 2:
                                //Chama função de jogar dado. Duplas? Chama moveJogador();
                                //if Não duplas:
                                jogador.setTurnosNaCadeia(jogador.getTurnosNaCadeia()+1);
                            break;
                            
                            default:
                                System.out.println("Opção inválida!");
                            break;
                        }
                    }else{
                        //Chama função de jogar dado
                        //Se duplas, chama moveJogador();
                        //Se não, verifica se tem $50 para pagar. Tem? Chama moveJogador()
                        //Não tem? Chama função de falência
                    }
                }
                
                
                break;
            case 21:
                //Não acontece nada
                System.out.println("Estacionamento grátis");
                break;
            case 31:
                VaParaCadeia cadeia = new VaParaCadeia(jogador);
                break;
            case 39:
                TaxaDeRiqueza taxa = new TaxaDeRiqueza(jogador.getPosicao() - 1);
                jogador.setSaldo(jogador.getSaldo() - (float) taxa.pagarTaxa());
                if(jogador.getSaldo() < 0){
                    //Chama função de falência
                }
                break;
        }
    }
}