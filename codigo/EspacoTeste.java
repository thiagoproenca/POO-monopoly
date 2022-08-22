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
        // classeTestada("PontoDePartida");
    
        /* VaParaCadeia */
        // classeTestada("VaParaCadeia");
    
        /* Cadeia */
        // classeTestada("Cadeia");
    
        /* EspacoDeCarta */
        // classeTestada("EspacoDeCarta");
    
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
    
    /* TESTES - VaParaCadeia */
    
    /* TESTES - Cadeia */
    
    /* TESTES - EspacoDeCarta */
    
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
