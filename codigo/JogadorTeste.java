/* Autor: Renan Oliveira de Barros Lima
 * Nome(s) do(s) autor(es)
 * 
 * Descrição da classe: Jogador é a classe reponsável por representar os jogadores de monopoly
 * durante uma partida.
 */

public class JogadorTeste {
    // classe responsavel pelos testes da classe 'Jogador'
    
    public static void main(String[] args) {
        /* nome da classe testada */
        classeTestada("Jogador");

        // teste 1
        ExecutarTeste("saldoInicial", 1);
        saldoInicial();

        // teste 2
        ExecutarTeste("nomeDoJogador", 2);
        nomeDoJogador();

        // teste 3
        ExecutarTeste("recebeLancamento", 3);
        recebeLancamento();

        // teste 4
        ExecutarTeste("ultimoLancamento", 4);
        ultimoLancamento();

        // teste 5
        ExecutarTeste("ultimoLancamento", 5);
        estarNaCadeia();

        // teste 6
        ExecutarTeste("temDuplas", 6);
        temDuplas();
    }

    // nome da classe que vai ser testada
    public static void classeTestada(String nomeClasse) {
        System.out.printf("\nClasse testada: %s\n", nomeClasse);
    }

    // nome e numero do teste executado
    public static void ExecutarTeste(String nomeTeste, int numeroTeste) {
        System.out.printf("\nTeste %d - '%s'\n", numeroTeste, nomeTeste);
    }

    /* TESTES - Jogador

        /*
         * TESTE 1 - 'saldoInicial()'
         * 
         * OBJETIVO: verificar se a classe Jogador está sendo inicializada com o saldo
         * correto.
         * 
         * METODO TESTADO: getSaldo().
         * 
         * RETORNO: 1500
         */

        public static void saldoInicial() {
            /* SAIDA ESPERADA */
            System.out.printf("Saida esperada: %d\n", 1500);

            /* TESTE */
            Jogador j = new Jogador("João");

            System.out.printf("\tSaldo: %f\n", j.getSaldo());
        }

        /* TESTE 2 - 'nomeDoJogador()'
        * 
        * OBJETIVO: verificar se o jogador tá recebendo o nome no contrutor.
        * 
        * METODO TESTADO: getNome().
        * 
        * RETORNO: Retorna o nome 'João'.
        */

        public static void nomeDoJogador() {
            /* SAIDA ESPERADA */
            System.out.printf("Saida esperada: %s\n", "João");

            /* TESTE */
            Jogador j = new Jogador("João");

            System.out.printf("\tNome: %s\n", j.getNome());
        }

        /* TESTE 3 - 'recebeLancamentos()'
         *
         * OBJETIVO: verificar se o Jogado tá recebendo lançamentos válidos,
         * utilizando a classe Dado.
         *
         * METODO TESTADO: setLancamentos().
         *
         * RETORNO: "true" se for lançamento válido.
         */

        public static void recebeLancamento() {
            /* SAIDA ESPERADA */
            System.out.printf("Saida esperada: %s\n", "true");

            /* TESTE */
            Jogador j = new Jogador("João");
            Dado d = new Dado();

            System.out.printf("\tresultado: %s\n", j.setLancamentos(d.lancaDado()));
        }

        /* TESTE 4 - 'ultimoLancamento()'
         *
         * OBJETIVO: verificar os lançamentos estão sendo armazenados corretametente.
         *
         * METODO TESTADO: getUltimoLancamento().
         *
         * RETORNO: "true" se for lançamento válido.
         */

        public static void ultimoLancamento() {
            /* SAIDA ESPERADA */
            System.out.printf("Saidas esperadas: %s\n", "3, 1, 6");

            /* TESTE */
            Jogador j = new Jogador("João");

            j.setLancamentos(3);
            System.out.printf("\tprimeiro lançamento: %s\n", j.getUltimoLancamento());
            j.setLancamentos(1);
            System.out.printf("\tsegundo lançamento: %s\n", j.getUltimoLancamento());
            j.setLancamentos(6);
            System.out.printf("\tterceiro lançamento: %s\n", j.getUltimoLancamento());
        }

        /* TESTE 5 - 'estarNaCadeia()'
         *
         * OBJETIVO: verificar se o jogador está indo pra cadeia.
         *
         * METODO TESTADO: isEstarNaCadeia() e setEstarNaCadeia().
         *
         * RETORNO: "true" se tiver da cadeia.
         */

        public static void estarNaCadeia() {
            /* SAIDA ESPERADA */
            System.out.printf("Saida esperada: %s\n", "true");

            /* TESTE */
            Jogador j = new Jogador("João");

            j.setEstarNaCadeia(true);
            System.out.printf("\tfoi pra cadeia: %s\n", j.isEstarNaCadeia());
        }

        /* TESTE 6 - 'temDuplas()'
         *
         * OBJETIVO: verificar se a classe jogador sabe se tem duplas.
         *
         * METODO TESTADO: temDuplas().
         *
         * RETORNO: "true" se o jogador tiver duplas.
         */

        public static void temDuplas() {
            /* SAIDA ESPERADA */
            System.out.printf("Saida esperada: %s\n", "true");

            /* TESTE */
            Jogador j = new Jogador("João");

            j.setLancamentos(3);
            j.setLancamentos(1);
            j.setLancamentos(1);
            System.out.printf("\ttem duplas: %s\n", j.temDuplas());
        }
    
    /* TESTES - nome da classe testada */
    
}
