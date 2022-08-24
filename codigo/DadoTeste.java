/* Autor: Renan Oliveira de Barros Lima
 * Nome(s) do(s) autor(es)
 *
 */

public class DadoTeste {
    // classe responsavel pelos testes da classe 'Jogador'
    
    public static void main(String[] args) {
        /* nome da classe testada */
        classeTestada("Dado");

        // teste 1
        ExecutarTeste("lancaDado", 1);
        lancaDado();

        // teste 2
        ExecutarTeste("resultado", 2);
        resultado();
    }

    // nome da classe que vai ser testada
    public static void classeTestada(String nomeClasse) {
        System.out.printf("\nClasse testada: %s\n", nomeClasse);
    }

    // nome e numero do teste executado
    public static void ExecutarTeste(String nomeTeste, int numeroTeste) {
        System.out.printf("\nTeste %d - '%s'\n", numeroTeste, nomeTeste);
    }

    /* TESTES - Dado

        /*
         * TESTE 1 - 'lancaDado()'
         * 
         * OBJETIVO: verificar se o dado está sendo lançado corretametente.
         * 
         * METODO TESTADO: lancaDado().
         * 
         * RETORNO: um número entre 1 a 6
         */

        public static void lancaDado() {
            /* SAIDA ESPERADA */
            System.out.printf("Saida esperada: %s\n", "número entre 1 a 6");

            /* TESTE */
            Dado d = new Dado();

            System.out.printf("\tresultado: %f\n", d.lancaDado());
        }

        /* TESTE 2 - 'resultado()'
        * 
        * OBJETIVO: verificar se a classe dado está armazenando o resultado.
        * 
        * METODO TESTADO: getResultado().
        * 
        * RETORNO: Retorna o nome 'João'.
        */

        public static void resultado() {
            /* SAIDA ESPERADA */
            System.out.printf("Saida esperada: %s\n", "um número entre 1 a 6");

            /* TESTE */
            Dado d = new Dado();

            d.lancaDado();
            System.out.printf("\tresultado: %d\n", d.getResultado());
        }
    
    /* TESTES - nome da classe testada */
    
}
