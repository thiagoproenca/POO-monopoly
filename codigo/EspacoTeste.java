public class EspacoTeste {
    // classe responsavel pelos testes da classe Espaco e suas sub-classes
    
    public static void main(String[] args) {
        iniciaEspacoImpostoCorreto(5);
    }

    public static void ExecutarTeste() {
        
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
     * para ser iniciado, é passado uma posicao (que sera a sua posicao em 'Tabuleiro')
     * 
     * RETORNO: constroi um objeto do tipo 'ImpostoDeRenda' para ser utilizado como 'Espaco' em 'Tabuleiro'
    */

    public static void iniciaEspacoImpostoCorreto(int posicao) {
        ImpostoDeRenda ir1 = new ImpostoDeRenda(posicao);

        System.out.printf("Posicao: %d\n", ir1.getPosicao());
        System.out.printf("Nome: %s\n", ir1.getNome());
    }
    
    /* TESTES - EstacionamentoGratis */


    
}
