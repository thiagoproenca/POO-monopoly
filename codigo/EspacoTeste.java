public class EspacoTeste {
    // classe responsavel pelos testes da classe 'Espaco' e suas sub-classes
    
    public static void main(String[] args) {

        /* ImpostoDeRenda */
        classeTestada("ImpostoDeRenda");

        // teste 1
        ExecutarTeste("iniciaEspacoImpostoCorreto", 1);
        iniciaEspacoImpostoCorreto(5);

        // teste 2
        ExecutarTeste("iniciaEspacoImpostoIncorreto", 2);
        iniciaEspacoImpostoIncorreto(4);
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
            // saida esperada
            System.out.println();

            // teste
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
            // saida esperada
            System.out.println();

            // teste
            ImpostoDeRenda ir1 = new ImpostoDeRenda(posicao);

            System.out.printf("\tPosicao: %d\n", ir1.getPosicao());
            System.out.printf("\tNome: %s\n", ir1.getNome());
        }
    
    /* TESTES - EstacionamentoGratis */


    
}
