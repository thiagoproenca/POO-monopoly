/* Autor: 
 * Nome(s) do(s) autor(es)
 * 
 * Descrição da classe: 
 * descrição.
 */

public class templateTeste {
    // classe responsavel pelos testes da classe 'Espaco' e suas sub-classes
    
    public static void main(String[] args) {
        /* nome da classe testada */
        classeTestada("nome da classe testada");

        // teste 1
        ExecutarTeste("nomeDoTeste1", 1);
        nomeDoTeste1();

        // teste 2
        ExecutarTeste("nomeDoTeste2", 2);
        nomeDoTeste2(4);
    }

    // nome da classe que vai ser testada
    public static void classeTestada(String nomeClasse) {
        System.out.printf("\nClasse testada: %s\n", nomeClasse);
    }

    // nome e numero do teste executado
    public static void ExecutarTeste(String nomeTeste, int numeroTeste) {
        System.out.printf("\nTeste %d - '%s'\n", numeroTeste, nomeTeste);
    }

    /* TESTES - nome da classe testada */

        /* TESTE 1 - 'nomeDoTeste1()'
        * 
        * OBJETIVO: objetivo do teste.
        * 
        * METODO TESTADO: metodo que foi testado.
        * 
        * RETORNO: o que o teste fez.
        */

        public static void nomeDoTeste1() {

        }

        /* TESTE 2 - 'nomeDoTeste2()'
        * 
        * OBJETIVO: objetivo do teste.
        * 
        * METODO TESTADO: metodo que foi testado.
        * 
        * RETORNO: o que o teste fez.
        */

        public static void nomeDoTeste2(int variavel) {

        }
    
    /* TESTES - nome da classe testada */
    
}
