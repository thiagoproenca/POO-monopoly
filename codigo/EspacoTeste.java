/* Autor: 
 * Arthur Nitto e Thiago Proença
 * 
 * Descrição da classe: 
 * Classe utilizada para realizar os testes das classes 'Espaco' e todas as suas sub-classes.
 * Cada teste tem a descricao de seu objetivo, metodo testado e o resultado (retorno) do mesmo.
 */

public class EspacoTeste {
    // classe responsavel pelos testes da classe 'Espaco' e suas sub-classes
    
    public static void main(String[] args) {
        /* Espaco */
        // classeTestada("Espaco");
    
        /* PontoDePartida */
        classeTestada("PontoDePartida");

        //teste 1
        ExecutarTeste("iniciaPontoDePartidaCorreto", 1);
        iniciaPontoDePartidaCorreto(1);

        //teste 2
        ExecutarTeste("jogadorRecebeTaxaInicial", 2);
        jogadorRecebeTaxaInicial(1);

        //teste 3
        ExecutarTeste("jogadorRecebeTaxaVolta", 3);
        jogadorRecebeTaxaVolta(1);

        //teste 4
        ExecutarTeste("jogadorRecebeTaxaVoltaErrada", 4);
        jogadorRecebeTaxaVoltaErrada(1);

        //teste 5
        ExecutarTeste("iniciaPontoDePartidaIncorreto", 5);
        iniciaPontoDePartidaIncorreto(5);

        /* VaParaCadeia */
        classeTestada("VaParaCadeia");
    
        //teste 1
        ExecutarTeste("iniciaVaParaCadeia", 1);
        Jogador jogador = new Jogador("nome");
        iniciaVaParaCadeia(jogador);

        //teste 2
        ExecutarTeste("iniciaVaParaCadeiaErrado", 2);
        Jogador jogador2 = new Jogador("Nome");
        iniciaVaParaCadeiaErrado(jogador2);

        //teste 3
        ExecutarTeste("iniciaVaParaCadeiaCorreto", 3);
        iniciaVaParaCadeiaCorreto(jogador);

        //teste 4
        ExecutarTeste("iniciaVaParaCadeiaIncorreto", 4);
        iniciaVaParaCadeiaIncorreto(jogador);

        /* Cadeia */
        classeTestada("Cadeia");
    
        //teste 1
        ExecutarTeste("iniciaCadeiaCorreto", 1);
        iniciaCadeiaCorreto(11);

        //teste 2
        ExecutarTeste("iniciaCadeiaIncorreto", 2);
        iniciaCadeiaCorreto(5);

        //teste 3
        ExecutarTeste("recebeFiancaCadeia", 3);
        recebeFiancaCadeia(11);

        /* EspacoDeCarta */
        classeTestada("EspacoDeCarta");
    
        //teste 1
        ExecutarTeste("iniciaEspacoDeCartaCorreto", 1);
        iniciaEspacoDeCartaCorreto(3);

        //teste 2
        ExecutarTeste("iniciaEspacoDeCartaIncorreto", 2);
        iniciaEspacoDeCartaIncorreto(0);

        //teste 3
        ExecutarTeste("tiraCartaCofre", 3);
        tiraCartaCofre(3);

        //teste 4
        ExecutarTeste("tiraCartaSorte", 4);
        tiraCartaSorte(8);

        //teste 5
        ExecutarTeste("tiraCartaErro", 5);
        tiraCartaErro(0);

        /* TaxaDeRiqueza */
        // classeTestada("TaxaDeRiqueza");

        /* ImpostoDeRenda */
        classeTestada("ImpostoDeRenda");

        // teste 1
        ExecutarTeste("iniciaEspacoImpostoCorreto", 1);
        iniciaEspacoImpostoCorreto(5);

        // teste 2
        ExecutarTeste("iniciaEspacoImpostoIncorreto", 2);
        iniciaEspacoImpostoIncorreto(4);

        // teste 3
        ExecutarTeste("jogadorPagaTaxaFixa", 3);
        jogadorPagaTaxaFixa(1300);

        // teste 4
        ExecutarTeste("jogadorPagaPorcentagemFortuna", 4);
        jogadorPagaPorcentagemFortuna(1000);

        /* EstacionamentoGratis */
        // classeTestada("EstacionamentoGratis");
    }

    public static void classeTestada(String nomeClasse) {
        System.out.printf("\nClasse testada: %s\n", nomeClasse);
    }

    public static void ExecutarTeste(String nomeTeste, int numeroTeste) {
        System.out.printf("\nTeste %d - '%s'\n", numeroTeste, nomeTeste);
    }

    /* TESTES - Espaco */
    
    /* TESTES - PontoDePartida */

        /* TESTE 1 - 'iniciaPontoDePartidaCorreto()'
        * 
        * OBJETIVO: verificar se um objeto 'PontoDePartida', sub-classe de 'Espaco' foi iniciado corretamente;
        * os atributos 'nome' e 'posicao' devem ser "Ponto de Partida" e '1', respectivamente.
        * 
        * METODO TESTADO: contrutor - 'PontoDePartida(int posicao)';
        * para ser iniciado, é passado uma posicao (que sera a sua posicao em 'Tabuleiro').
        * 
        * RETORNO: constroi um objeto do tipo 'PontoDePartida' para ser utilizado como 'Espaco' em 'Tabuleiro'.
        */

        public static void iniciaPontoDePartidaCorreto(int posicao) {
            /* SAIDA ESPERADA */
            System.out.printf("Saida esperada: %d, %s\n", 1, "Ponto de Partida");

            /* TESTE */
            PontoDePartida comeco = new PontoDePartida(posicao);

            System.out.printf("\tPosicao: %d\n", comeco.getPosicao());
            System.out.printf("\tNome: %s\n", comeco.getNome());
        }
    
        /* TESTE 2 - 'jogadorRecebeTaxaInicial()'
        * 
        * OBJETIVO: verificar se o jogador recebe o valor inicial no começo da partida;
        * 
        * 
        * METODO TESTADO: 'receberTaxa()';
        * 
        * 
        * RETORNO: o método testado deverá retornar 1500, o valor inicial que todo jogador recebe no início da partida
        */

        public static void jogadorRecebeTaxaInicial(int posicao){
            /* SAÍDA ESPERADA */
            System.out.println("Saída esperada: "+1500);

            /* TESTE */
            PontoDePartida comeco = new PontoDePartida(posicao);

            System.out.printf("Taxa inicial recebida: %d\n",(int) comeco.receberTaxa());
        }

        /* TESTE 3 - 'jogadorRecebeTaxaVolta()'
        * 
        * OBJETIVO: verificar se o jogador recebe o valor apropriado quando realiza uma volta;
        * 
        * 
        * METODO TESTADO: 'deuAVolta()';
        * 
        * 
        * RETORNO: o método testado deverá retornar 200, o valor que o jogador recebe após uma volta completa
        */

        public static void jogadorRecebeTaxaVolta(int posicao){
            /* SAÍDA ESPERADA */
            System.out.println("Saída esperada: "+200);
        
            /* TESTE */
            PontoDePartida comeco = new PontoDePartida(posicao);
            comeco.deuAVolta();
            System.out.printf("Jogador recebe taxa: %d\n",(int)comeco.receberTaxa());
        }

        /* TESTE 4 - 'jogadorRecebeTaxaVoltaErrada()'
        * 
        * OBJETIVO: verificar se o jogador não recebe o valor apropriado quando realiza uma volta quando o método não é utilizado;
        * 
        * 
        * METODO TESTADO: 'deuAVolta()';
        * 
        * 
        * RETORNO: o método testado deverá retornar 1500        
        */

        public static void jogadorRecebeTaxaVoltaErrada(int posicao){
            /* SAÍDA ESPERADA */
            System.out.println("Saída esperada: "+1500);
        
            /* TESTE */
            PontoDePartida comeco = new PontoDePartida(posicao);
            System.out.printf("Jogador recebe taxa: %d\n",(int)comeco.receberTaxa());
        }

        /* TESTE 5 - 'iniciaPontoDePartidaIncorreto()'
        * 
        * OBJETIVO: verificar o que um objeto 'PontoDePartida' entrega quando iniciado incorretamente;
        * o atributo 'nome' deve ser nulo, e o atributo 'posicao' deve ser '1' (um).
        * 
        * METODO TESTADO: contrutor - 'PontoDePartida(int posicao)';
        * neste teste, inicializaremos ele com um numero diferente de '1'.
        * 
        * RETORNO: constroi um objeto do tipo 'PontoDePartida' para ser utilizado como 'Espaco' em 'Tabuleiro'.
        */

        public static void iniciaPontoDePartidaIncorreto(int posicao) {
            /* SAIDA ESPERADA */
            System.out.printf("Saida esperada: %d, %s\n", 0, "null");

            /* TESTE */
            PontoDePartida comeco = new PontoDePartida(posicao);

            System.out.printf("\tPosicao: %d\n", comeco.getPosicao());
            System.out.printf("\tNome: %s\n", comeco.getNome());
        }

    /* TESTES - VaParaCadeia */

        /* TESTE 1 - 'iniciaVaParaCadeia()'
        * 
        * OBJETIVO: verificar se o método VaParaCadeia manda o jogador para a cadeia;
        * 
        * 
        * METODO TESTADO: 'cadeia(Jogador jogador)';
        * para ser iniciado, é passado um jogador
        * 
        * RETORNO: o jogador entra na cadeia.
        */

        public static void iniciaVaParaCadeia(Jogador jogador) {
            /* SAIDA ESPERADA */
            System.out.printf("Saida esperada: %s, %d\n", "true", 11);

            /* TESTE */
            VaParaCadeia j1 = new VaParaCadeia(jogador);
            System.out.println("O jogador está preso: "+jogador.isEstarNaCadeia());
            System.out.println("Posição: "+jogador.getPosicao());
        }

        /* TESTE 2 - 'iniciaVaParaCadeiaErrado()'
        * 
        * OBJETIVO: verificar o que acontece caso o jogador errado é passado como parâmetro;
        * 
        * 
        * METODO TESTADO: 'cadeia(Jogador jogador)';
        * para ser iniciado, é passado um jogador
        * 
        * RETORNO: o jogador mostrado não será preso
        */

        public static void iniciaVaParaCadeiaErrado(Jogador jogador) {
            /* SAIDA ESPERADA */
            System.out.printf("Saida esperada: %s, %d\n", "false", 1);

            Jogador jogador2 = new Jogador("Nome");

            /* TESTE */
            VaParaCadeia j1 = new VaParaCadeia(jogador2);
            System.out.println("O jogador está preso: "+jogador.isEstarNaCadeia());
            System.out.println("Posição: "+jogador.getPosicao());
        }

        /* TESTE 3 - 'iniciaVaParaCadeiaCorreto()'
        * 
        * OBJETIVO: verificar se um objeto 'VaParaCadeia', sub-classe de 'Espaco' foi iniciado corretamente;
        * os atributos 'nome' e 'posicao' devem ser "Vá para a Cadeia" e '31', respectivamente.
        * 
        * METODO TESTADO: contrutor - 'VaParaCadeia(Jogador jogador)';
        * para ser iniciado, é passado um jogador.
        * 
        * RETORNO: constroi um objeto do tipo 'VaParaCadeia' para ser utilizado como 'Espaco' em 'Tabuleiro'.
        */

        public static void iniciaVaParaCadeiaCorreto(Jogador jogador){
            /* SAIDA ESPERADA */
            System.out.printf("Saida esperada: %d, %s\n", 31, "Vá para a cadeia");
            jogador.setPosicao(31);
            /* TESTE */
            VaParaCadeia cadeia = new VaParaCadeia(jogador);

            System.out.printf("\tPosicao: %d\n", cadeia.getPosicao());
            System.out.printf("\tNome: %s\n", cadeia.getNome());
        }

        /* TESTE 4 - 'iniciaVaParaCadeiaIncorreto()'
        * 
        * OBJETIVO: verificar o que um objeto 'VaParaCadeia' entrega quando iniciado incorretamente;
        * o atributo 'nome' deve ser nulo, e o atributo 'posicao' deve ser '0' (zero).
        * 
        * METODO TESTADO: contrutor - 'VaParaCadeia(Jogador jogador)';
        * neste teste, inicializaremos ele com um numero diferente de '31'.
        * 
        * RETORNO: constroi um objeto do tipo 'VaParaCadeia' para ser utilizado como 'Espaco' em 'Tabuleiro'.
        */

        public static void iniciaVaParaCadeiaIncorreto(Jogador jogador){
            /* SAIDA ESPERADA */
            System.out.printf("Saida esperada: %d, %s\n", 0, "null");
            jogador.setPosicao(5);
            /* TESTE */
            VaParaCadeia cadeia = new VaParaCadeia(jogador);

            System.out.printf("\tPosicao: %d\n", cadeia.getPosicao());
            System.out.printf("\tNome: %s\n", cadeia.getNome());
        }
    
    /* TESTES - Cadeia */

        /* TESTE 1 - 'iniciaCadeiaCorreto()'
        * 
        * OBJETIVO: verificar se o objeto 'Cadeia' foi iniciado corretamente;
        * 
        * 
        * METODO TESTADO: construtor - Cadeia(int posicao);
        * para ser iniciado, é passado uma posição (que será a sua posição no Tabuleiro)
        * 
        * RETORNO: constroi um objeto do tipo 'Cadeia' para ser utilizado como 'Espaco' em 'Tabuleiro'.
        */

        public static void iniciaCadeiaCorreto(int posicao){
            /* SAIDA ESPERADA */
            System.out.printf("Saida esperada: %d, %s\n", 11, "Na cadeia");
            /* TESTE */

            Cadeia cadeia = new Cadeia(posicao);

            System.out.printf("\tPosicao: %d\n", cadeia.getPosicao());
            System.out.printf("\tNome: %s\n", cadeia.getNome());
        }

        /* TESTE 2 - 'iniciaCadeiaIncorreto()'
        * 
        * OBJETIVO: verificar o que um objeto 'Cadeia' entrega quando iniciado incorretamente;
        * o atributo 'nome' deve ser nulo, e o atributo 'posicao' deve ser '0' (zero).
        * 
        * METODO TESTADO: contrutor - 'Cadeia(Jogador jogador)';
        * neste teste, inicializaremos ele com um numero diferente de '11'.
        * 
        * RETORNO: constroi um objeto do tipo 'Cadeia' para ser utilizado como 'Espaco' em 'Tabuleiro'.
        */

        public static void iniciaCadeiaIncorreto(int posicao){
            /* SAIDA ESPERADA */
            System.out.printf("Saida esperada: %d, %s\n", 0, "null");

            /* TESTE */
            Cadeia cadeia = new Cadeia(posicao);

            System.out.printf("\tPosicao: %d\n", cadeia.getPosicao());
            System.out.printf("\tNome: %s\n", cadeia.getNome());
        }

        /* TESTE 3 - 'recebeFiancaCadeia()'
        * 
        * OBJETIVO: verificar se a função está retornando o valor esperado;
        * o atributo 'valorFianca' deverá ser 50.
        * 
        * METODO TESTADO: 'pagarFianca()';
        * 
        * 
        * RETORNO: retorna o valor da fiança da cadeia.
        */

        public static void recebeFiancaCadeia(int posicao){
            /* SAIDA ESPERADA */
            System.out.println("Saída esperada: "+50);

            /* TESTE */
            Cadeia cadeia = new Cadeia(posicao);
            System.out.println("Fiança de cadeia: "+cadeia.pagarFianca());
        }
    
    /* TESTES - EspacoDeCarta */

        /* TESTE 1 - 'iniciaEspacoDeCartaCorreto()'
        * 
        * OBJETIVO: verificar se o objeto 'EspacoDeCarta' foi iniciado corretamente;
        * 
        * 
        * METODO TESTADO: construtor - EspacoDeCarta(int posicao);
        * para ser iniciado, é passado uma posição (que será a sua posição no Tabuleiro)
        * 
        * RETORNO: constroi um objeto do tipo 'EspacoDeCarta' para ser utilizado como 'Espaco' em 'Tabuleiro'.
        */

        public static void iniciaEspacoDeCartaCorreto(int posicao){
            /* SAIDA ESPERADA */
            System.out.printf("Saida esperada: %d, %s\n", 3, "Cofre");
            /* TESTE */

            EspacoDeCarta carta = new EspacoDeCarta(posicao);

            System.out.printf("\tPosicao: %d\n", carta.getPosicao());
            System.out.printf("\tNome: %s\n", carta.getNome());
        }

        /* TESTE 2 - 'iniciaEspacoDeCartaIncorreto()'
        * 
        * OBJETIVO: verificar o que um objeto 'EspacoDeCarta' entrega quando iniciado incorretamente;
        * o atributo 'nome' deve ser nulo, e o atributo 'posicao' deve ser '0' (cinco).
        * 
        * METODO TESTADO: contrutor - 'EspacoDeCarta(int posicao)';
        * neste teste, inicializaremos ele com um numero diferente do conjunto de Sorte e Cofre.
        * 
        * RETORNO: constroi um objeto do tipo 'EspacoDeCarta' para ser utilizado como 'Espaco' em 'Tabuleiro'.
        */

        public static void iniciaEspacoDeCartaIncorreto(int posicao){
            /* SAIDA ESPERADA */
            System.out.printf("Saida esperada: %d, %s\n", 0, "null");

            /* TESTE */
            EspacoDeCarta carta = new EspacoDeCarta(posicao);

            System.out.printf("\tPosicao: %d\n", carta.getPosicao());
            System.out.printf("\tNome: %s\n", carta.getNome());
        }
    
        /* TESTE 3 - 'tiraCartaCofre()'
        * 
        * OBJETIVO: verificar se o método retorna 'Cofre' como resposta, ao inicializar o método com
        * uma carta de tipo Cofre.
        * 
        * METODO TESTADO: tipoDeCarta();
        *
        * 
        * RETORNO: O método retorna 1 (valor estabelecido para Cofre);
        */

        public static void tiraCartaCofre(int posicao){
            /* SAIDA ESPERADA */
            System.out.println("Saída esperada: "+1+", Cofre");

            /* TESTE */
            EspacoDeCarta carta = new EspacoDeCarta(posicao);
            System.out.println(carta.tipoDeCarta());
            System.out.println("Carta: "+carta.getNome());
        }

        /* TESTE 4 - 'tiraCartaSorte()'
        * 
        * OBJETIVO: verificar se o método retorna 'Sorte' como resposta, ao inicializar o método com
        * uma carta de tipo Sorte.
        * 
        * METODO TESTADO: tipoDeCarta();
        *
        * 
        * RETORNO: O método retorna 0 (valor estabelecido para Sorte);
        */

        public static void tiraCartaSorte(int posicao){
            /* SAIDA ESPERADA */
            System.out.println("Saída esperada: "+0+", Sorte");

            /* TESTE */
            EspacoDeCarta carta = new EspacoDeCarta(posicao);
            System.out.println(carta.tipoDeCarta());
            System.out.println("Carta: "+carta.getNome());
        }

        /* TESTE 3 - 'tiraCartaErro()'
        * 
        * OBJETIVO: verificar se o método retorna -1 como resposta, ao inicializar o método com
        * uma posição inválida
        * 
        * METODO TESTADO: tipoDeCarta();
        *
        * 
        * RETORNO: O método retorna -1 (valor estabelecido para posição inválida);
        */

        public static void tiraCartaErro(int posicao){
            /* SAIDA ESPERADA */
            System.out.println("Saída esperada: "+-1+", null");

            /* TESTE */
            EspacoDeCarta carta = new EspacoDeCarta(posicao);
            System.out.println(carta.tipoDeCarta());
            System.out.println("Carta: "+carta.getNome());

        }


    /* TESTES - TaxaDeRiqueza */
    
    /* TESTES - ImpostoDeRenda */

        /* TESTE 1 - 'iniciaEspacoImpostoCorreto()'
        * 
        * OBJETIVO: verificar se um objeto 'ImpostoDeRenda', sub-classe de 'Espaco' foi iniciado corretamente;
        * os atributos 'nome' e 'posicao' devem ser "Imposto de Renda" e '5', respectivamente.
        * 
        * METODO TESTADO: contrutor - 'ImpostoDeRenda(int posicao)';
        * para ser iniciado, é passado uma posicao (que sera a sua posicao em 'Tabuleiro').
        * 
        * RETORNO: constroi um objeto do tipo 'ImpostoDeRenda' para ser utilizado como 'Espaco' em 'Tabuleiro'.
        */

        public static void iniciaEspacoImpostoCorreto(int posicao) {
            /* SAIDA ESPERADA */
            System.out.printf("Saida esperada: %d, %s\n", 5, "Imposto de Renda");

            /* TESTE */
            ImpostoDeRenda ir1 = new ImpostoDeRenda(posicao);

            System.out.printf("\tPosicao: %d\n", ir1.getPosicao());
            System.out.printf("\tNome: %s\n", ir1.getNome());
        }

        /* TESTE 2 - 'iniciaEspacoImpostoIncorreto()'
        * 
        * OBJETIVO: verificar o que um objeto 'ImpostoDeRenda' entrega quando iniciado incorretamente;
        * o atributo 'nome' deve ser nulo, e o atributo 'posicao' deve ser '0' (zero).
        * 
        * METODO TESTADO: contrutor - 'ImpostoDeRenda(int posicao)';
        * neste teste, inicializaremos ele com um numero diferente de '5'.
        * 
        * RETORNO: constroi um objeto do tipo 'ImpostoDeRenda' para ser utilizado como 'Espaco' em 'Tabuleiro'.
        */

        public static void iniciaEspacoImpostoIncorreto(int posicao) {
            /* SAIDA ESPERADA */
            System.out.printf("Saida esperada: %d, %s\n", 0, null);

            /* TESTE */
            ImpostoDeRenda ir1 = new ImpostoDeRenda(posicao);

            System.out.printf("\tPosicao: %d\n", ir1.getPosicao());
            System.out.printf("\tNome: %s\n", ir1.getNome());
        }

        /* TESTE 3 - 'jogadorPagaTaxaFixa()'
        * 
        * OBJETIVO: mostrar que um objeto 'ImpostoDeRenda' passa o valor correto para que
        * um objeto do tipo "Jogador" pague a taxa;
        * o pagamento deve ser controlado pelo objeto "Banco", mas aqui nao sera usado.
        * Para ilustrar, daremos um saldo inicial ao "Jogador" e 'pagaremos' a taxa;
        * iremos supor que o jogador tem saldo o suficente para continuar no jogo.
        * 
        * METODO TESTADO: metodo publico - 'double pagarTaxaFixo()';
        * o saldo inicial sera '$1300' e apos pagar a taxa, devera ter o saldo de '$1100'.
        * 
        * RETORNO: retorna o valor '200' como 'double' e retira o valor do saldo de 'Jogador'.
        */

        public static void jogadorPagaTaxaFixa(double saldoJogador) {
            /* SAIDA ESPERADA */
            System.out.printf("Saida esperada: $%.2f\n", 1100.0);

            /* TESTE */
            // declaração das classes usadas no teste
            Jogador j1 = new Jogador("Everton");
            ImpostoDeRenda ir1 = new ImpostoDeRenda(5);

            // jogador recebe o saldo inicial de '$1300'
            j1.setSaldo((float) saldoJogador);

            // jogador paga '$200' da taxa de "ImpostoDeRenda"
            j1.setSaldo((float) (j1.getSaldo() - ir1.pagarTaxaFixo()));

            System.out.printf("\tSaldo: $%.2f\n", j1.getSaldo());
        }

        /* TESTE 4 - 'jogadorPagaPorcentagemFortuna()'
        * 
        * OBJETIVO: mostrar que um objeto 'ImpostoDeRenda' passa o valor correto para que
        * um objeto do tipo "Jogador" pague 10% de sua como taxa de "ImpostoDeRenda";
        * o pagamento deve ser controlado pelo objeto "Banco", mas aqui nao sera usado.
        * Para ilustrar, daremos um saldo inicial ao "Jogador" e 'pagaremos' a taxa.
        * 
        * METODO TESTADO: metodo publico - 'double pagarTaxaPorcentagem(Jogador jogador)';
        * o saldo inicial sera '$1000' e apos pagar a taxa, devera ter o saldo de '$900'.
        * 
        * RETORNO: retorna 10% da fortuna de "Jogador" como 'double' e retina esse valor do saldo do mesmo.
        */

        public static void jogadorPagaPorcentagemFortuna(double saldoJogador) {
            /* SAIDA ESPERADA */
            System.out.printf("Saida esperada: $%.2f\n", 900.0);

            /* TESTE */
            // declaração das classes usadas no teste
            Jogador j1 = new Jogador("Rodnaldo");
            ImpostoDeRenda ir1 = new ImpostoDeRenda(5);

            // jogador recebe o saldo inicial de '$1300'
            j1.setSaldo((float) saldoJogador);

            // jogador paga 10% da fortuna ('$100') como taxa de "ImpostoDeRenda"
            j1.setSaldo((float) (j1.getSaldo() - ir1.pagarTaxaPorcentagem(j1)));

            System.out.printf("\tSaldo: $%.2f\n", j1.getSaldo());
        }
    
    /* TESTES - EstacionamentoGratis */
    
}
