/* Autor: 
 * Arthur Nitto e Thiago Proença
 * 
 * Descrição da classe: Classe responsável por determinar as regras do jogo, controlando os métodos
 * getters/setters públicos, métodos públicos de outras classes com quem mantém relacionamento.
 * Tem-se dentro do jogo um tabuleiro os diferentes espaços, tem-se um arrayList 
 * de jogadores, um vetor para dados, uma variável do tipo Banco, 
 * uma do tipo DeckDeCartas deckcofre e DeckDeCartas deckcsorte.
 * 
 */

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Jogo {
    // atibutos
    private Tabuleiro tabuleiro;
    private int quantidadeJogadores;
    private ArrayList<Jogador> jogadores;
    private Dado dados[];
    private Banco banco;
    private DeckDeCartas deckCofre;
    private DeckDeCartas deckSorte;

    // construtores
    public Jogo(Jogador j1, Jogador j2) {
        /* constroi a classe com 2 jogadores */
        this.quantidadeJogadores = 2;

        // inicializa os dois jogadores em ordem aleatoria
        this.jogadores = new ArrayList<>();
        this.jogadores.add(j1);
        this.jogadores.add(j2);
        Collections.shuffle(jogadores);

        // inicializa os outros atibutos
        inicializaAtributos();
    }

    public Jogo(Jogador j1, Jogador j2, Jogador j3) {
        /* constroi a classe com 3 jogadores */
        this.quantidadeJogadores = 3;

        // inicializa os tres jogadores em ordem aleatoria
        this.jogadores = new ArrayList<>();
        this.jogadores.add(j1);
        this.jogadores.add(j2);
        this.jogadores.add(j3);
        Collections.shuffle(jogadores);

        // inicializa os outros atibutos
        inicializaAtributos();
    }

    public Jogo(Jogador j1, Jogador j2, Jogador j3, Jogador j4) {
        /* constroi a classe com 4 jogadores */
        this.quantidadeJogadores = 4;

        // inicializa os quatro jogadores em ordem aleatoria
        this.jogadores = new ArrayList<>();
        this.jogadores.add(j1);
        this.jogadores.add(j2);
        this.jogadores.add(j3);
        this.jogadores.add(j4);
        Collections.shuffle(jogadores);

        // inicializa os outros atibutos
        inicializaAtributos();
    }

    // metodos especiais
    private void inicializaAtributos() {
        /* metodo interno para facilitar a leitura do construtor
         * inicializa os atributos que não são relacionados ao jogador
        */
        
        // inicializa o tabuleiro
        this.tabuleiro = new Tabuleiro();

        // inicializa os dados
        this.dados = new Dado[2];
        this.dados[0] = new Dado();
        this.dados[1] = new Dado();

        // inicializa o banco
        this.banco = new Banco();

        // inicializa os decks de cartas
        this.deckCofre = new DeckDeCartas(0);
        this.deckSorte = new DeckDeCartas(1);
    }

    private int getQuantidadeJogadores() {
        return(this.quantidadeJogadores);
    }

    private void setQuantidadeJogadores(int quantidade) {
        this.quantidadeJogadores = quantidade;
    }

    /*
     * devolve um jogador baseado nos turnos
     */
    private Jogador getTurnoJogador(int rodada) {
        int jogador = rodada % getQuantidadeJogadores(); // logica para saber de qual jogador e o turno 

        return(this.jogadores.get(jogador));
    }

    /*
     * devolve um jogador baseado na ordem dos jogadores
     */
    private Jogador getJogador(int jogador) {
        return(this.jogadores.get(jogador));
    }

    private Dado getDado(int numeroDado) {
        return(this.dados[numeroDado]);
    }

    private void lancarDados() {
        for(int i=0; i<2; i++) {
            getDado(i).lancaDado();
        }
    }

    /*
     * apresenta o jogador e suas informações
    **/
    private void apresentaJogador(Jogador jogador) {
        System.out.println("---------------------------------------------------");
        System.out.println("Turno de "+jogador.getNome()); // nome
        System.out.printf("Saldo: $%.2f\n", jogador.getSaldo()); // saldo

        System.out.println("---------------------------------------------------");
        System.out.println();
    }

    /*
     * apresenta o espaco atual que o jogador esta apos se movimentar
    **/
    private void apresentaEspaco(Espaco espaco) {
        System.out.println("---------------------------------------------------");

        // checa se o espaço é um lote; nesse caso, mostrará a cor do espaço
        if(espaco instanceof Lote) {
            System.out.printf("Espaço atual: %d [ %s | %s ]\n", espaco.getPosicao(), ((Lote)espaco).getCor(), espaco.getNome());
        }
        // mostrará uma posição sem cor
        else {
            System.out.printf("Espaço atual: %d [ %s ]\n", espaco.getPosicao(), espaco.getNome());
        }

        // checa se tem proprietario
        if(espaco instanceof Propriedade) {
            // tem dono
            if(((Propriedade)espaco).getJogador() != null) {
                ((Propriedade)espaco).calcularAluguel();
                System.out.println("Dono da propriedade: "+((Propriedade)espaco).getJogador().getNome());
                System.out.println("Aluguel da propriedade: $"+((Propriedade)espaco).getPrecoDeAluguel());
            }

            // nao tem dono
            else {
                System.out.println("Proriedade sem dono");
            }
        }

        System.out.println("---------------------------------------------------");
        System.out.println();
    }

    /*
     * paga um jogador que deu a volta
     */
    private void deuAVolta(Jogador jogador) {
        // paga o jogador por ter dado a volta
        Espaco espaco = tabuleiro.getEspaco(1);
        ((PontoDePartida)espaco).deuAVolta();
        
        banco.pagarTaxa(jogador, ((PontoDePartida)espaco).receberTaxa());
        System.out.println(jogador.getNome() + " completou uma volta e recebeu $200!");
    }

    /*
     * movimenta o jogador no inicio de cada turno
     */
    private void movimentaJogador(int rodada, int dado1, int dado2) {

        // guarda a posicao antes do movimento
        int posicaoAnterior = getTurnoJogador(rodada).getPosicao();

        // controla a condicao de 'dupla' nos dados
        int vezesJogadas = 0;

        // movimenta o jogador
        do {
            vezesJogadas++;

            // jogador tirou 3 duplas e vai para a cadeia
            if(vezesJogadas == 4) {
                getTurnoJogador(rodada).setPosicao(11);
                getTurnoJogador(rodada).setTurnosNaCadeia(-1);
                getTurnoJogador(rodada).setEstarNaCadeia(true);

                System.out.println(getTurnoJogador(rodada).getNome()+" foi para a cadeia!");
                System.out.println();

                // impede a execucao da checagem de 'deu a volta'
                break;
            }

            lancarDados();
            dado1 = getDado(0).getResultado();
            dado2 = getDado(1).getResultado();
            // mostrar os valores dos dados
            System.out.printf("%s tirou %d e %d nos dados.\n", getTurnoJogador(rodada).getNome(), dado1, dado2);


            // guardando valor de dados
            getTurnoJogador(rodada).setLancamentos(dado1 + dado2);

            // move o jogador
            tabuleiro.moveJogador(getTurnoJogador(rodada), (dado1 + dado2));

            // mostra se o jogador tirou uma dupla
            if(dado1 == dado2) {
                System.out.println("O jogador tirou uma dupla e jogará outra vez!");
            }
            System.out.println();
        } while(dado1 == dado2);

        // checa se o jogador deu a volta
        if(posicaoAnterior + (dado1 + dado2) >40) {
            deuAVolta(getTurnoJogador(rodada));
        }
    }
    
    private void propriedadeSemDono(Propriedade propriedade) {
        // opcoes da propriedade sem dono
        System.out.println("1. Comprar a propriedade ($" + propriedade.getPreco() +")"); // comprar
        System.out.printf("2. Comprar a propriedade e construir casa ($%d + %d)\n", propriedade.getPreco(), propriedade.getPrecodeConstrucao()); // comprar com casa/hotel
        System.out.println("3. Não comprar propriedade");
    }

    private void estacaoSemDono(Propriedade propriedade){
        // opcoes da estação de metro sem dono
        System.out.println("1. Comprar a propriedade ($" + propriedade.getPreco() +")"); // comprar
        System.out.println("2. Não comprar propriedade");
    }

    private void propriedadeComDono(Propriedade propriedade) {
        // opcoes da propriedade com dono
        System.out.println("1. Oferecer preço para comprar propriedade de "+propriedade.getJogador().getNome());
        System.out.println("2. Continuar com o jogo.");
    }

    private void espacoLote(Jogador jogador, Lote lote, int rodada) {
        Scanner scan = new Scanner(System.in);
        int opc = 0;
        
        // propriedade sem dono
        if(lote.getJogador() == null) {
            // opcoes do jogador
            System.out.println("O que você gostaria de fazer, " + getTurnoJogador(rodada).getNome() + "?");
            
            do {
                propriedadeSemDono(lote);
                try{
                    System.out.printf("> ");
                    opc = scan.nextInt();
                }catch(InputMismatchException e){
                    System.out.println("Digite um valor válido!\n");
                    scan = new Scanner(System.in);
                    continue;
                }

                // comprar propriedade
                if(opc == 1) {
                    // tem saldo suficiente
                    if(jogador.getSaldo() > lote.getPreco()) {
                        banco.pagarTaxa(jogador, -(lote.getPreco()) );
                        lote.calcularAluguel();
                        jogador.setPropriedade(lote);
                        lote.setJogador(jogador);

                        System.out.println("Propriedade adquirida!");

                        if(jogador.monopolio(lote.getCor())){
                            System.out.println(jogador.getNome()+" conquistou um Monopólio!");
                        }
                    }

                    // nao tem saldo suficiente
                    else {
                        System.out.println("Saldo insuficiente! Continuando o jogo.");
                    }
                }

                // comprar propriedade e construir casa
                else if(opc == 2) {
                    // tem saldo suficiente
                    if(jogador.getSaldo() > lote.getPreco() + lote.getPrecodeConstrucao()) {
                        banco.pagarTaxa(jogador, -(lote.getPreco()) );
                        banco.pagarTaxa(jogador, -(lote.getPrecodeConstrucao()) );
                        lote.setCasaConstruida(true);
                        lote.calcularAluguel();
                        jogador.setPropriedade(lote);
                        lote.setJogador(jogador);

                        System.out.println("Propriedade adquirida e casa construida!");
                                
                        if(jogador.monopolio(lote.getCor())){
                            System.out.println(jogador.getNome()+" conquistou o Monopólio " +lote.getCor()+"!");
                        }
                    }

                    // nao tem saldo suficiente
                    else {
                        System.out.println("Saldo insuficiente! Continuando o jogo.");
                    }
                }

                // nao comprar propriedade
                else if (opc == 3) {
                    System.out.println("Ok! Continuando o jogo.");
                    return;
                }

                // opcao invalida
                else {
                    System.out.println("Opção inválida!");
                }

            } while(opc<1 || opc>3);
        }

        // propriedade com dono
        else if(lote.getJogador() != jogador) {
            lote.calcularAluguel();

            // verifica se tem monopolio; caso tenha, pagara x2 o preco do aluguel
            if(lote.getJogador().getMonopolio() == 1) {
                // jogador pagou o aluguel ao dono da propriedade
                if(banco.pagarTaxa(jogador, -(lote.getPrecoDeAluguel() * 2))) {
                    System.out.println(jogador.getNome()+" pagou $"+(lote.getPrecoDeAluguel()*2)+" para "+lote.getJogador().getNome());
                }

                // jogador foi a falencia
                else {
                    jogadores.remove(jogador);
                    setQuantidadeJogadores(getQuantidadeJogadores() - 1);

                    // encerra a execucao do metodo
                    return;
                }
            }

            // valor padrao do aluguel
            else {
                // jogador pagou o aluguel ao dono da propriedade
                if(lote.getJogador().isEstarNaCadeia()){
                    if(!banco.pagarTaxa(jogador, -lote.getPrecoDeAluguel())){
                        jogadores.remove(jogador);
                        setQuantidadeJogadores(getQuantidadeJogadores() - 1);
                    }
                }

                else if(banco.pagarTaxa(jogador, lote.getJogador(), (lote.getPrecoDeAluguel()))) {
                    System.out.println(jogador.getNome()+" pagou $"+(lote.getPrecoDeAluguel())+" para "+lote.getJogador().getNome());
                }

                // jogador foi a falencia
                else {
                    jogadores.remove(jogador);
                    setQuantidadeJogadores(getQuantidadeJogadores() - 1);

                    // encerra a execucao do metodo
                    return;
                }
            }

            // opcoes do jogador
            System.out.println("O que você gostaria de fazer, " + getTurnoJogador(rodada).getNome() + "?");

            do {
                // jogador podera dar infinitas ofertas e dono podera recusa-las
                while(true) {
                    propriedadeComDono(lote);
                  
                    try{
                        System.out.printf("> ");
                        opc = scan.nextInt();
                    }catch(InputMismatchException e){
                        System.out.println("Digite um valor válido!\n");
                        scan = new Scanner(System.in);
                        continue;
                    }
                    // fazer oferta pela propriedade
                    if(opc == 1) {
                        scan = new Scanner(System.in);

                        if(lote.getJogador().isEstarNaCadeia()){
                            System.out.println("Proprietário está na cadeia! Impossível negociar.");
                            return;
                        }

                        // oferta do jogador ao dono da propriedade
                        System.out.printf("Digite a sua oferta: ");
                        float oferta = 0;
                        try{
                            System.out.printf("> ");
                            oferta = scan.nextFloat();
                        }catch(InputMismatchException e){
                            System.out.println("Digite um valor válido!\n");
                            scan = new Scanner(System.in);
                            continue;
                        }
                        // saldo insuficiente
                        if(oferta > jogador.getSaldo()) {
                            System.out.println("Saldo insuficiente! Continuando o jogo.");

                            // jogador nao podera ofertar mais
                            return;
                        }

                        // saldo suficiente
                        int n = 0;
                        
                        do {
                            System.out.println(lote.getJogador().getNome()+", você aceita a oferta?");
                            System.out.println("1. Sim");
                            System.out.println("2. Não");

                            scan = new Scanner(System.in);
                            try{
                                System.out.printf("> ");
                                n = scan.nextInt();
                            }catch(InputMismatchException e){
                                System.out.println("Digite um valor válido!\n");
                                scan = new Scanner(System.in);
                                continue;
                            }
                            // jogador aceita a oferta
                            if(n == 1) {
                                System.out.println("Propriedade comprada!");
                                
                                // Caso o vendedor tinha monopólio
                                if(lote.getJogador().getMonopolio() == 1){
                                    System.out.println(lote.getJogador().getNome()+" não tem mais Monopólio "+lote.getCor());
                                    lote.getJogador().setMonopolio(0);
                                }

                                // Transferindo propriedade
                                banco.pagarTaxa(jogador, lote.getJogador(), oferta);
                                lote.getJogador().getPropriedade().remove(lote);
                                jogador.setPropriedade(lote);
                                lote.setJogador(jogador);
                                lote.setCasaConstruida(false);

                                // Caso o jogador comprou a propriedade e conquistou um Monopólio
                                if(jogador.monopolio(lote.getCor())){
                                    System.out.println(jogador.getNome()+" conquistou um Monopólio "+lote.getCor());
                                }

                                // volta para a execucao do jogo
                                return;
                            }

                            // jogador recusa a oferta
                            else if(n == 2) {
                                System.out.println("O proprietário recusou a sua oferta.");
                            }   

                            // opcao invalida
                            else {
                                System.out.println("Opção inválida!");
                            }
                        } while(n < 1 || n > 2);
                        
                    }

                    // continua o jogo
                    else if(opc == 2) {
                        System.out.println("Ok! Continuando o jogo.");
                        

                        // volta para a execucao do jogo
                        return;
                    }

                    // opcao invalida
                    else {
                        System.out.println("Opção inválida!");
                    }
                }
            } while(opc<1 || opc>2);
        }

        // jogador dono da propriedade
        else {
            System.out.println("Você entrou na sua propriedade!");
            System.out.println();
            // checa se a casa foi construida
            do {

                // Se não tem a casa construida no lote.
                if(!lote.getCasaConstruida()){
                    System.out.println("1. Construir uma casa ($"+lote.getPrecodeConstrucao()+").");
                    System.out.println("2. Continuar com o jogo.");

                    try{
                        System.out.printf("> ");
                        opc = scan.nextInt();
                    }catch(InputMismatchException e){
                        System.out.println("Digite um valor válido!\n");
                        scan = new Scanner(System.in);
                        continue;
                    }
                    
                    // construir uma casa
                    if(opc == 1) {
                        // nao possui saldo
                        if(jogador.getSaldo() < lote.getPrecodeConstrucao()) {

                            System.out.println("Saldo insuficiente!");
                        }
                        
                        // possui saldo
                        else {
                            System.out.println("Casa construída!");
                            banco.pagarTaxa(jogador, -(lote.getPrecodeConstrucao()));
                            lote.setCasaConstruida(true);
                        }
                    }

                    // continuar o jogo
                    else if(opc == 2) {
                        System.out.println("OK! Continuando com o jogo.");
                        return;
                    }

                    else {
                        System.out.println("Por favor digite uma opção válida!");
                    }
                }

                // opção de construir hotel
                else if(jogador.getPodeConstruirHotel()){
                    System.out.println("1. Construir um hotel ($"+lote.getPrecodeConstrucao()+").");
                    System.out.println("2. Continuar com o jogo.");

                    try{
                        opc = scan.nextInt();
                    }catch(InputMismatchException e){
                        System.out.println("Digite um valor válido!\n");
                        scan = new Scanner(System.in);
                        continue;
                    }
                    
                    // construir uma casa
                    if(opc == 1) {
                        // nao possui saldo
                        if(jogador.getSaldo() < lote.getPrecodeConstrucao()) {

                            System.out.println("Saldo insuficiente!");
                        }
                        
                        // possui saldo
                        else {
                            System.out.println("Hotel construído!");
                            banco.pagarTaxa(jogador, -(lote.getPrecodeConstrucao()));
                            jogador.setHotelConstruido(true);
                        }
                    }

                    // continuar o jogo
                    else if(opc == 2) {
                        System.out.println("OK! Continuando com o jogo.");
                        return;
                    }

                    else {
                        System.out.println("Por favor digite uma opção válida!");
                    }
                }
                // Casa construída sem monopólio
                else{
                    System.out.println("O jogador não possui um monopólio e não pode construir um hotel");
                    return;
                }

            } while(opc < 1 || opc > 2);
        }
    }

    private void espacoMetro(Jogador jogador, Estacao_de_Metro metro, int rodada) {
        Scanner scan = new Scanner(System.in);
        int opc = 0;
        
        // propriedade sem dono
        if(metro.getJogador() == null) {
            // opcoes do jogador
            System.out.println("O que você gostaria de fazer, " + getTurnoJogador(rodada).getNome() + "?");
            
            do {
                estacaoSemDono(metro);
                try{
                    System.out.printf("> ");
                    opc = scan.nextInt();
                }catch(InputMismatchException e){
                    System.out.println("Digite um valor válido!\n");
                    scan = new Scanner(System.in);
                    continue;
                }

                // comprar propriedade
                if(opc == 1) {
                    // tem saldo suficiente
                    if(jogador.getSaldo() > metro.getPreco()) {
                        banco.pagarTaxa(jogador, -(metro.getPreco()) );
                        jogador.setPropriedade(metro);
                        metro.setJogador(jogador);

                        System.out.println("Propriedade adquirida!");
                    }

                    // nao tem saldo suficiente
                    else {
                        System.out.println("Saldo insuficiente! Continuando o jogo.");
                    }
                }

                // nao comprar propriedade
                else if(opc == 2) {
                    System.out.println("Ok! Continuando o jogo.");
                    return;
                }
                
                // opcao invalida
                else {
                    System.out.println("Opção inválida!");
                }

            } while(opc<1 || opc>2);
        }
        
        // propriedade com dono
        else if(metro.getJogador() != jogador) {
            metro.calcularAluguel();

            // jogador pagou o aluguel ao dono da propriedade
            if(metro.getJogador().isEstarNaCadeia()){
                if(!banco.pagarTaxa(jogador, -metro.getPrecoDeAluguel())){
                    jogadores.remove(jogador);
                    setQuantidadeJogadores(getQuantidadeJogadores() - 1);          
                }
            }

            else if(banco.pagarTaxa(jogador, metro.getJogador(),(metro.getPrecoDeAluguel()))) {
                System.out.println(jogador.getNome()+" pagou $"+(metro.getPrecoDeAluguel())+" para "+metro.getJogador().getNome());
            }

            // jogador foi a falencia
            else {
                jogadores.remove(jogador);
                setQuantidadeJogadores(getQuantidadeJogadores() - 1);

                // encerra a execucao do metodo
                return;
            }
            

            // opcoes do jogador
            System.out.println("O que você gostaria de fazer, " + getTurnoJogador(rodada).getNome() + "?");

            do {
                //propriedadeComDono(metro);

                // jogador podera dar infinitas ofertas e dono podera recusa-las
                while(true) {

                    propriedadeComDono(metro);

                    try{
                        System.out.printf("> ");
                        opc = scan.nextInt();
                    }catch(InputMismatchException e){
                        System.out.println("Digite um valor válido!\n");
                        scan = new Scanner(System.in);
                        continue;
                    }
                    // fazer oferta pela propriedade
                    if(opc == 1) {
                        scan = new Scanner(System.in);

                        if(metro.getJogador().isEstarNaCadeia()){
                            System.out.println("Proprietário está na cadeia! Impossível negociar.");
                            return;
                        }

                        // oferta do jogador ao dono da propriedade
                        System.out.printf("Digite a sua oferta: ");
                        float oferta = 0;
                        try{
                            System.out.printf("> ");
                            oferta = scan.nextFloat();
                        }catch(InputMismatchException e){
                            System.out.println("Digite um valor válido!\n");
                            scan = new Scanner(System.in);
                            continue;
                        }
                        // saldo insuficiente
                        if(oferta > jogador.getSaldo()) {
                            System.out.println("Saldo insuficiente! Continuando o jogo.");

                            // jogador nao podera ofertar mais
                            return;
                        }

                        // saldo suficiente
                        int n = 0;
                        
                        do {
                            System.out.println(metro.getJogador().getNome()+", você aceita a oferta?");
                            System.out.println("1. Sim");
                            System.out.println("2. Não");

                            scan = new Scanner(System.in);
                            try{
                                System.out.printf("> ");
                                n = scan.nextInt();
                            }catch(InputMismatchException e){
                                System.out.println("Digite um valor válido!\n");
                                scan = new Scanner(System.in);
                                continue;
                            }
                            // jogador aceita a oferta
                            if(n == 1) {
                                System.out.println("Propriedade comprada!");
                                
                                // Transferindo propriedade
                                banco.pagarTaxa(jogador, metro.getJogador(), oferta);
                                metro.getJogador().getPropriedade().remove(metro);
                                jogador.setPropriedade(metro);
                                metro.setJogador(jogador);

                                // volta para a execucao do jogo
                                return;
                            }

                            // jogador recusa a oferta
                            else if(n == 2) {
                                System.out.println("O proprietário recusou a sua oferta.");
                            }   

                            // opcao invalida
                            else {
                                System.out.println("Opção inválida!");
                            }
                        } while(n < 1 || n > 2);
                        
                    }

                    // continua o jogo
                    else if(opc == 2) {
                        System.out.println("Ok! Continuando o jogo.");
                        
                        // volta para a execucao do jogo
                        return;
                    }

                    // opcao invalida
                    else {
                        System.out.println("Opção inválida!");
                    }
                }
            } while(opc<1 || opc>2);
        }

        // jogador dono da propriedade
        else {
            System.out.println("Você entrou na sua propriedade!");
            System.out.println("OK! Continuando com o jogo.");
            System.out.println();
            return;
        }
        
    }

    private void espacoUtilidade(Jogador jogador, Utilidade utilidade, int rodada) {
        Scanner scan = new Scanner(System.in);
        int opc = 0;
        
        // propriedade sem dono
        if(utilidade.getJogador() == null) {
            // opcoes do jogador
            System.out.println("O que você gostaria de fazer, " + getTurnoJogador(rodada).getNome() + "?");
            
            do {
                estacaoSemDono(utilidade);
                try{
                    System.out.printf("> ");
                    opc = scan.nextInt();
                }catch(InputMismatchException e){
                    System.out.println("Digite um valor válido!\n");
                    scan = new Scanner(System.in);
                    continue;
                }

                // comprar propriedade
                if(opc == 1) {
                    // tem saldo suficiente
                    if(jogador.getSaldo() > utilidade.getPreco()) {
                        banco.pagarTaxa(jogador, -(utilidade.getPreco()) );
                        jogador.setPropriedade(utilidade);
                        utilidade.setJogador(jogador);

                        System.out.println("Propriedade adquirida!");
                    }

                    // nao tem saldo suficiente
                    else {
                        System.out.println("Saldo insuficiente! Continuando o jogo.");
                    }
                }

                // nao comprar propriedade
                else if(opc == 2) {
                    System.out.println("Ok! Continuando o jogo.");
                    return;
                }
                
                // opcao invalida
                else {
                    System.out.println("Opção inválida!");
                }

            } while(opc<1 || opc>2);
        }
        
        // propriedade com dono
        else if(utilidade.getJogador() != jogador) {
            utilidade.calcularAluguel();

            if(utilidade.getJogador().isEstarNaCadeia()){
                if(!banco.pagarTaxa(jogador, utilidade.getPrecoDeAluguel())){
                    jogadores.remove(jogador);
                    setQuantidadeJogadores(getQuantidadeJogadores() - 1);             
                }
            }

            // jogador pagou o aluguel ao dono da propriedade
            else if(banco.pagarTaxa(jogador, utilidade.getJogador(), (utilidade.getPrecoDeAluguel()))) {
                System.out.println(jogador.getNome()+" pagou $"+(utilidade.getPrecoDeAluguel())+" para "+utilidade.getJogador().getNome());
            }

            // jogador foi a falencia
            else {
                jogadores.remove(jogador);
                setQuantidadeJogadores(getQuantidadeJogadores() - 1);

                // encerra a execucao do metodo
                return;
            }
            

            // opcoes do jogador
            System.out.println("O que você gostaria de fazer, " + getTurnoJogador(rodada).getNome() + "?");

            do {
                // jogador podera dar infinitas ofertas e dono podera recusa-las
                while(true) {

                    propriedadeComDono(utilidade);

                    try{
                        System.out.printf("> ");
                        opc = scan.nextInt();
                    }catch(InputMismatchException e){
                    System.out.println("Digite um valor válido!\n");
                    scan = new Scanner(System.in);
                    continue;
                    }
                    // fazer oferta pela propriedade
                    if(opc == 1) {
                        scan = new Scanner(System.in);

                        if(utilidade.getJogador().isEstarNaCadeia()){
                            System.out.println("O proprietário está na cadeia! Impossível negociar.");
                            return;
                        }

                        // oferta do jogador ao dono da propriedade
                        System.out.printf("Digite a sua oferta: ");
                        float oferta = 0;
                        try{
                            System.out.printf("> ");
                            oferta = scan.nextFloat();
                        }catch(InputMismatchException e){
                            System.out.println("Digite um valor válido!\n");
                            scan = new Scanner(System.in);
                            continue;
                        }
                        // saldo insuficiente
                        if(oferta > jogador.getSaldo()) {
                            System.out.println("Saldo insuficiente! Continuando o jogo.");

                            // jogador nao podera ofertar mais
                            return;
                        }

                        // saldo suficiente
                        int n = 0;
                        
                        do {
                            System.out.println(utilidade.getJogador().getNome()+", você aceita a oferta?");
                            System.out.println("1. Sim");
                            System.out.println("2. Não");

                            scan = new Scanner(System.in);
                            try{
                                System.out.printf("> ");
                                n = scan.nextInt();
                            }catch(InputMismatchException e){
                                System.out.println("Digite um valor válido!\n");
                                scan = new Scanner(System.in);
                                continue;
                            }
                            // jogador aceita a oferta
                            if(n == 1) {
                                System.out.println("Propriedade comprada!");
                                
                                // Transferindo propriedade
                                banco.pagarTaxa(jogador, utilidade.getJogador(), oferta);
                                utilidade.getJogador().getPropriedade().remove(utilidade);
                                jogador.setPropriedade(utilidade);
                                utilidade.setJogador(jogador);

                                // volta para a execucao do jogo
                                return;
                            }

                            // jogador recusa a oferta
                            else if(n == 2) {
                                System.out.println("O proprietário recusou a sua oferta.");
                            }   

                            // opcao invalida
                            else {
                                System.out.println("Opção inválida!");
                            }
                        } while(n < 1 || n > 2);
                        
                    }

                    // continua o jogo
                    else if(opc == 2) {
                        System.out.println("Ok! Continuando o jogo.");

                        // volta para a execucao do jogo
                        return;
                    }

                    // opcao invalida
                    else {
                        System.out.println("Opção inválida!");
                    }
                }
            } while(opc<1 || opc>2);
        }

        // jogador dono da propriedade
        else {
            System.out.println("Você entrou na sua propriedade!");
            System.out.println();
            System.out.println("OK! Continuando com o jogo.");
            return;
        }
    }

    /*
     * retorna o espaco atual em que o jogador se encontra apos a movimentacao para que a interacao ocorra corretamente
     */
    private void espacoAtual(Jogador jogador, int rodada) {
        Scanner scan = new Scanner(System.in);
        int opc = 0;
        Espaco espaco = tabuleiro.getEspaco(jogador.getPosicao());

        switch(espaco.getPosicao()) {
            // ponto de partida
            case 1: {
                apresentaEspaco(espaco);
                break;
            }

            // lote
            case 2, 4, 7, 9, 10, 12, 14, 15, 17, 19, 20, 22, 24, 25, 27, 28, 30, 32, 33, 35, 38, 40: {
                // verificacoes do espaco de lote
                apresentaEspaco(espaco);
                espacoLote(jogador, ((Lote)espaco), rodada);
                break;
            }
            
            //estação de metrô
            case 6, 16, 26, 36:{
                apresentaEspaco(espaco);
                espacoMetro(jogador, ((Estacao_de_Metro)espaco), rodada);
                break;
            }

            //utilidade
            case 13, 29:{
                apresentaEspaco(espaco);
                espacoUtilidade(jogador, ((Utilidade)espaco), rodada);
                break;
            }

            //cofre
            case 3, 18, 34: {
                Carta carta = deckCofre.retirarCarta();
                
                apresentaEspaco(espaco);
                System.out.println("=-=-=-=-=-=- CARTA DE COFRE -=-=-=-=-=-=");
                System.out.println(carta.getEspecificacao());
                System.out.println();

                // carta de dinheiro do tipo cofre
                if(carta instanceof CartaDeDinheiro) {
                    // checa se foi a falencia
                    if(!banco.pagarTaxa(jogador, ((CartaDeDinheiro)carta).bonusDaCarta())){
                        jogadores.remove(jogador);
                        setQuantidadeJogadores(getQuantidadeJogadores() - 1);
                    }
                }

                // carta de movimento do tipo cofre
                else if(carta instanceof CartaDeMovimento) {
                    //carta de movimento especial
                    if(((CartaDeMovimento)carta).bonusDeMovimento() == 0 && ((CartaDeMovimento)carta).movimentaParaEspaco() == 0) {
                        // companhia eletrica
                        if(jogador.getPosicao() < 13) {
                            tabuleiro.posicionaJogador(jogador, 13);
                            espacoAtual(jogador, rodada);
                        }

                        // companhia de agua
                        else if(jogador.getPosicao() < 29) {
                            tabuleiro.posicionaJogador(jogador, 29);
                            espacoAtual(jogador, rodada);
                        }

                        // companhia eletrica
                        else {
                            deuAVolta(jogador);
                            tabuleiro.posicionaJogador(jogador, 13);
                            espacoAtual(jogador, rodada);
                        }
                    }
                    // movimenta diretamente para um espaco
                    else if(((CartaDeMovimento)carta).bonusDeMovimento() == 0) {
                        // checa se o jogador deu a volta
                        if(jogador.getPosicao() - ((CartaDeMovimento)carta).movimentaParaEspaco() > 0) {
                            deuAVolta(jogador);
                        }
                        
                        tabuleiro.posicionaJogador(jogador, ((CartaDeMovimento)carta).movimentaParaEspaco());
                        espacoAtual(jogador, rodada);
                    }

                    // se movimenta de acordo com um bonus de movimento
                    else {
                        // checa se o jogador dei a volta
                        if(jogador.getPosicao() + ((CartaDeMovimento)carta).bonusDeMovimento() > 40) {
                            deuAVolta(jogador);
                        }
                        
                        tabuleiro.moveJogador(jogador, ((CartaDeMovimento)carta).bonusDeMovimento());
                        espacoAtual(jogador, rodada);
                    }
                }

                // carta 'va para cadeia' do tipo cofre
                else if(carta instanceof CartaVaParaCadeia) {
                    tabuleiro.posicionaJogador(jogador, 11);
                    jogador.setTurnosNaCadeia(0);
                    jogador.setEstarNaCadeia(true);

                    System.out.println(jogador.getNome()+" foi para a cadeia!");
                    System.out.println();
                }

                break;
            }

            //sorte
            case 8, 23, 37: {
                Carta carta = deckSorte.retirarCarta();
                
                apresentaEspaco(espaco);
                System.out.println("=-=-=-=-=-=-=-=-=- CARTA DE SORTE -=-=-=-=-=-=-=-=-=");
                System.out.println(carta.getEspecificacao());
                System.out.println();

                // carta de dinheiro do tipo sorte
                if(carta instanceof CartaDeDinheiro) {
                    if(!banco.pagarTaxa(jogador, ((CartaDeDinheiro)carta).bonusDaCarta())){
                        jogadores.remove(jogador);
                        setQuantidadeJogadores(getQuantidadeJogadores() - 1);
                    }
                }

                // carta de movimento do tipo sorte
                else if(carta instanceof CartaDeMovimento) {
                    //carta de movimento especial
                    if(((CartaDeMovimento)carta).bonusDeMovimento() == 0 && ((CartaDeMovimento)carta).movimentaParaEspaco() == 0) {
                        // estacao maracana
                        if(jogador.getPosicao() >= 1 && jogador.getPosicao() < 6) {
                            tabuleiro.posicionaJogador(jogador, 6);
                            espacoAtual(jogador, rodada);
                        }

                        // estacao  carioca
                        else if(jogador.getPosicao() >= 6 && jogador.getPosicao() < 16) {
                            tabuleiro.posicionaJogador(jogador, 16);
                            espacoAtual(jogador, rodada);
                        }

                        // estacao consolacao
                        else if(jogador.getPosicao() >= 16 && jogador.getPosicao() < 26) {
                            tabuleiro.posicionaJogador(jogador, 26);
                            espacoAtual(jogador, rodada);
                        }

                        // estacao republica
                        else if(jogador.getPosicao() >= 26 && jogador.getPosicao() < 36) {
                            tabuleiro.posicionaJogador(jogador, 36);
                            espacoAtual(jogador, rodada);
                        }

                        // estacao maracana + deu a volta
                        else {
                            deuAVolta(jogador);
                            tabuleiro.posicionaJogador(jogador, 6);
                            espacoAtual(jogador, rodada);
                        }
                    }

                    // movimenta diretamente para um espaco
                    else if(((CartaDeMovimento)carta).bonusDeMovimento() == 0) {
                        // checa se o jogador deu a volta
                        if(jogador.getPosicao() < ((CartaDeMovimento)carta).movimentaParaEspaco() && ((CartaDeMovimento)carta).movimentaParaEspaco() > 1) {
                            deuAVolta(jogador);
                        }
                        
                        tabuleiro.posicionaJogador(jogador, ((CartaDeMovimento)carta).movimentaParaEspaco());
                        espacoAtual(jogador, rodada);
                    }

                    // se movimenta de acordo com um bonus de movimento
                    else {
                        // checa se o jogador dei a volta
                        if(jogador.getPosicao() + ((CartaDeMovimento)carta).bonusDeMovimento() > 40) {
                            deuAVolta(jogador);
                        }
                        
                        tabuleiro.moveJogador(jogador, ((CartaDeMovimento)carta).bonusDeMovimento());
                        espacoAtual(jogador, rodada);
                    }
                }

                // carta 'va para cadeia' do tipo sorte
                else if(carta instanceof CartaVaParaCadeia) {
                    tabuleiro.posicionaJogador(jogador, 11);
                    jogador.setTurnosNaCadeia(0);
                    jogador.setEstarNaCadeia(true);

                    System.out.println(jogador.getNome()+" foi para a cadeia!");
                    System.out.println();
                }
                
                break;
            }

            //imposto de renda
            case 5:{
                apresentaEspaco(espaco);
                System.out.println("Escolha o método de pagamento:");
                System.out.println("1. Pagar taxa fixa ($ 200).");
                System.out.println("2. Pagar 10% da fortuna ($ "+((ImpostoDeRenda)espaco).pagarTaxaPorcentagem(jogador)+").");

                int n = 0;
                boolean sucesso = false;
                
                while(true){
                    System.out.printf("> ");
                    n = scan.nextInt();
                    switch(n){
                        // Pagar taxa fixa
                        case 1:{
                            sucesso = banco.pagarTaxa(jogador, -((ImpostoDeRenda)espaco).pagarTaxaFixo());
                            if(sucesso){
                                System.out.println("Taxa paga!");
                            }
                            else{
                                jogadores.remove(jogador);
                                setQuantidadeJogadores(getQuantidadeJogadores() - 1);
                            }
                            break;
                        }
                        //Pagar 10% da fortuna
                        case 2:{
                            sucesso = banco.pagarTaxa(jogador, -((ImpostoDeRenda)espaco).pagarTaxaPorcentagem(jogador));
                            if(sucesso){
                                System.out.println("Taxa paga!");
                            }
                            else{
                                jogadores.remove(jogador);
                                setQuantidadeJogadores(getQuantidadeJogadores() - 1);
                            }
                            break;
                        }

                        default:{
                            System.out.println("Por favor digite uma opção válida!");
                            break;
                        }
                    }

                    if(n==1 || n==2) break; // sai do loop
                }
                break;
            }

            //cadeia
            case 11:{
                apresentaEspaco(espaco);
                // Caso o jogador foi mandado para a cadeia (está preso) 
                if(jogador.isEstarNaCadeia()){
                    // jogador tirou 3 duplas de dados
                    if(jogador.getTurnosNaCadeia() == -1) {
                        jogador.setTurnosNaCadeia(0);
                    }

                    // Jogador ainda tem escolhas
                    else if(jogador.getTurnosNaCadeia() < 2){
                        System.out.println("O que você deseja fazer? Escolha:");
                        System.out.println("1. Pagar $ 50 ao Banco.");
                        System.out.println("2. Lançar os dados e tentar tirar uma dupla.");
                        
                        System.out.printf("> ");
                        opc = scan.nextInt();
                        
                        int d0 = 0, d1 = 0;
                        lancarDados();
                        d0 = getDado(0).getResultado();
                        d1 = getDado(1).getResultado();
                        jogador.setLancamentos(d0+d1);

                        switch(opc){
                            // Caso jogador pague para sair
                            case 1:{
                                if(banco.pagarTaxa(jogador, -50)){
                                    System.out.println("Saindo da cadeia.");
                                    movimentaJogador(rodada, d0, d1);
                                    espacoAtual(jogador, rodada);
                                }
                                else{
                                    jogadores.remove(jogador);
                                    setQuantidadeJogadores(getQuantidadeJogadores() - 1);
                                }
                                break;
                            }
                            // Jogador tentando tirar dupla para sair
                            case 2:{
                                

                                // Caso jogador tente conseguir uma dupla.
                                if(d0 == d1){
                                    System.out.println("Dupla! Saindo da cadeia.");
                                    jogador.setEstarNaCadeia(false);
                                    jogador.setTurnosNaCadeia(0);
                                    movimentaJogador(rodada, d0, d1);
                                }else{
                                    jogador.setTurnosNaCadeia(jogador.getTurnosNaCadeia()+1);
                                    System.out.println("Falha! "+jogador.getTurnosNaCadeia()+"º turno na cadeia!");
                                }
                                break;
                            }

                            default:{
                                System.out.println("Por favor digite uma opção válida.");
                                break;
                            }
                        }
                    }
                    // Jogador não tem escolha
                    else if(jogador.getTurnosNaCadeia() < 3){
                        System.out.println("A 3ª vez é o charme: lançando os dados!");
                        int d0 = 0, d1 = 0;
                                d0 = dados[0].lancaDado();
                                d1 = dados[1].lancaDado();
                                jogador.setLancamentos(d0+d1);

                                // Caso jogador tente conseguir uma dupla.
                                if(d0 == d1){
                                    // sucesso, saindo da cadeia
                                    System.out.println("Dupla! Saindo da cadeia.");
                                    jogador.setEstarNaCadeia(false);
                                    jogador.setTurnosNaCadeia(0);
                                    tabuleiro.moveJogador(jogador, (d0+d1));
                                }else{
                                    System.out.println("Não foi dessa vez. Pagando os $50.");
                                    // Caso tenha dinheiro para pagar, sai da cadeia normal
                                    if(banco.pagarTaxa(jogador, -50)){
                                        jogador.setEstarNaCadeia(false);
                                        jogador.setTurnosNaCadeia(0);
                                        tabuleiro.moveJogador(jogador, (d0+d1));
                                    }
                                    // Jogador perde 
                                    else{
                                        jogadores.remove(jogador);
                                        setQuantidadeJogadores(getQuantidadeJogadores() - 1);
                                    }
                                }
                    }
                    
                }

                // Jogador está visitando a cadeia
                else{
                    System.out.println("Apenas visitando a cadeia!");
                    System.out.println();
                }

                break;
            }

            //estacionamento grátis
            case 21:{
                apresentaEspaco(espaco);
                System.out.println();
                break;
            }

            //vá para cadeia
            case 31:{
                apresentaEspaco(espaco);
                jogador.setEstarNaCadeia(true);
                jogador.setTurnosNaCadeia(0);
                tabuleiro.posicionaJogador(jogador, 11);
                System.out.println("Você está indo para a cadeia!");
                break;
            }

            //taxa de riqueza
            case 39:{
                System.out.println("Taxa de Riqueza - $200 extraídos.");

                if(banco.pagarTaxa(jogador, -((TaxaDeRiqueza)espaco).pagarTaxa())){
                    System.out.println("Taxa paga!");
                }

                // Jogador perde
                else{
                    jogadores.remove(jogador);
                    setQuantidadeJogadores(getQuantidadeJogadores() - 1);
                }
                break;
            }
        }
    }

    private void iniciaJogo() {
        // posiciona os jogadores na primeira posicao (ponto de partida) e da para cada um $1500
        for(int i=0; i<getQuantidadeJogadores(); i++) {
            // referencia a instancia de 'Ponto de partida'
            Espaco espaco = tabuleiro.getEspaco(1);

            // posiciona o jogador no inicio do tabuleiro e seu saldo inicial
            tabuleiro.posicionaJogador(getJogador(i), ((PontoDePartida)espaco).getPosicao());
            banco.pagarTaxa(getJogador(i), ((PontoDePartida)espaco).receberTaxa());
        }
    }

    // metodos
    public void Jogar() {
        /* variavel 'rodada' serve apenas para calculo de turno dos jogadores */
        int rodada = 0; // inicia com 0 para que o calculo do turno seja executado corretamente
        int dado1 = 0;
        int dado2 = 0;

        iniciaJogo();

        // jogo
        while(true) {

            // Vitória 1: apenas 1 jogador restou.
            if(getQuantidadeJogadores() == 1){
                System.out.println("Parabéns "+getTurnoJogador(rodada).getNome()+", você venceu!");
                return;
            }

            // apresenta o turno do jogador
            // System.out.println("Turno de " + getTurnoJogador(rodada).getNome() + ".");
            apresentaJogador(getTurnoJogador(rodada));


            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                //e.printStackTrace();
            }

            // movimenta o jogador e verifica a condicao de 'dupla' nos dados
            // movimenta o jogador caso ele não esteja preso
            if(!getTurnoJogador(rodada).isEstarNaCadeia())
                movimentaJogador(rodada, dado1, dado2);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    //e.printStackTrace();
            }

            // interage com o espaco no qual o jogador esta
            espacoAtual(getTurnoJogador(rodada), rodada);

            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                //e.printStackTrace();
            }

            //Vitória 2: 2 Monopólios conquistados.
            if(getTurnoJogador(rodada).getMonopolio() == 2){
                System.out.println("Parabéns "+getTurnoJogador(rodada).getNome()+", você venceu!");
                return;
            }

            //Vitória 3: Monopólio c/ Hotel conquistado.
            if(getTurnoJogador(rodada).getHotelConstruido()){
                System.out.println("Parabéns "+getTurnoJogador(rodada).getNome()+", você venceu!");
                return;
            }
            // passa para a proxima rodada
            rodada++;
        }
    }


}
