/* 
 * Autor: Maurício Kessongo
 * Descrição da Classe: Classe que demonstra os testes da classe Propriedade e das suas subclasses
*/


public class PropriedadeTeste 
{

    /*
     * A classe Propriedade não é testada de forma direta. Ela é testada por meio das suas subclasses.
     */
    public static void main(String[] args)
    {
        
    
        //Método Da classe TESTATDA
        

        /* TESTES - Lote */

        /* TESTE 1 - 'iniciaLoteAluguel()'
        * 
        * OBJETIVO: verificar se um objeto da classe "Lote", subclasse de propriedade foi iniciada corretamente e calculou o aluguel corretamente
        * os atributos 'posicao' e 'precodeAluguel' devem ser '2' e '2', respectivamente.
        * 
        * METODO TESTADO: contrutor - 'Lote(jogador, posicao);'
        * para ser iniciado, é passado uma posicao (que sera a sua posicao em 'Tabuleiro') e a referencia ao jogador
        * 
        * RETORNO: constroi um objeto do tipo 'Lote' para ser utilizado como 'Propriedade' em 'Espaçco'.
        */
        

    /* TESTES - Lote */

    /* TESTE 2 - 'iniciaLoteAluguelIncorreto()'
        * 
        * OBJETIVO: verificar o que um objeto 'Lote' entrega quando iniciado incorretamente;
        * o atributo 'precoDeAluguel' deve ser -1, e o atributo 'posicao' deve ser 0.
        * 
        * METODO TESTADO: contrutor - Lote(jogador, posicao);
        * neste teste, inicializaremos ele com um numero  diferente de 2, 3, 4, 7, 9, 10, 12, 14, 15, 17, 19, 20, 22, 24, 25, 27, 29, 30, 32, 33, 35, 28, 40. 
        Pois sendo um desses valores, vai retornar a posição correta e o valor de aluguel correto;
        * 
        * RETORNO: constroi um objeto do tipo 'Lote' para ser utilizado como 'Propriedade' em 'Espaçco'.
        */

        
        //teste 1
        classeTestada("Lote");
        ExecutarTeste("iniciaLoteAluguel", 1);
        iniciaLoteAluguel(2);

        //teste 2
        classeTestada("Lote");
        ExecutarTeste("iniciaLoteAluguelIncorreto", 2);
        iniciaLoteAluguelIncorreto(5);

        //TESTE 3
         /* TESTES - Utilidade */

        /* TESTE 3 - 'iniciautilidadecorreto()'
        * 
        * OBJETIVO: verificar se um objeto da classe "Utilidade", subclasse de propriedade foi iniciada corretamente e calculou o aluguel corretamente
        Os resultados Vão depender do valor obtido nos dados e do numero de utilidades que o jogador tem; Irei setar posicao = 13;
        Numa situação hipotetica:
        valordosdados = 7;
        numUtilidades = 1;
        * os atributos 'posicao' e 'precodeAluguel' devem ser '13' e '28', respectivamente.
        * 
        * METODO TESTADO: contrutor - 'Utilidade(jogador, posicao);'
        * para ser iniciado, é passado uma posicao (que sera a sua posicao em 'Tabuleiro') e a referencia ao jogador;
        * 
        * RETORNO: constroi um objeto do tipo 'Utilidade' para ser utilizado como 'Propriedade' em 'Espaçco'.
        */

        
        //teste 3
        ExecutarTeste("iniciautilidadecorreto", 3);
        iniciautilidadecorreto(13);
        classeTestada("Utilidade");


        
        

        //TESTE 4
         /* TESTES - Utilidade */

        /* TESTE 4 - 'iniciautilidadeincorreto()'
        * 
        * OBJETIVO: verificar se um objeto da classe "Utilidade", subclasse de propriedade foi iniciada incorretamente e calculou o aluguel incorretamente
        Os resultados Vão depender do valor obtido nos dados e do numero de utilidades que o jogador tem; Irei setar posicao diferente de 13 e 29 
        E esse caso vai independer do valor obtido nos dados e do numero de utilidades;
        * os atributos 'posicao' e 'precodeAluguel' devem ser '0' e '-1', respectivamente.
        * 
        * METODO TESTADO: contrutor - 'Utilidade(jogador, posicao);'
        * para ser iniciado, é passado uma posicao (que sera a sua posicao em 'Tabuleiro') e a referencia ao jogador;
        * 
        * RETORNO: constroi um objeto do tipo 'Utilidade' para ser utilizado como 'Propriedade' em 'Espaçco'.
        */

        
        //teste 4
        ExecutarTeste("iniciautilidadecorreto", 4);
        iniciautilidadecorreto(13);
        classeTestada("Utilidade");


        //estacao metro

        //TESTE 5


         /* TESTES - Estacao_de_Metro */

        /* TESTE 5 - 'iniciaestacaodemetrocorreto()'
        * 
        * OBJETIVO: verificar se um objeto da classe "Estacao_de_Metro", subclasse de propriedade foi iniciada corretamente e calculou o aluguel corretamente
        Os resultados Vão depender da quantidade de estações que um jogador possui (no máximo temos 4 estações); Irei setar posicao = 6;
        Numa situação hipotetica:

        estacoes = 2;
        * os atributos 'posicao' e 'precodeAluguel' devem ser '6' e '50', respectivamente.
        * 
        * METODO TESTADO: contrutor - 'Estacao_de_Metro(jogador, posicao);'
        * para ser iniciado, é passado uma posicao (que sera a sua posicao em 'Tabuleiro') e a referencia ao jogador;
        * 
        * RETORNO: constroi um objeto do tipo 'Estacao_de_Metro' para ser utilizado como 'Propriedade' em 'Espaçco'.
        */

        
        //teste 5
        ExecutarTeste("iniciaestacaodemetrocorreto", 5);
        iniciaestacaodemetrocorreto(6);
        classeTestada("Estacao_de_Metro");

        //TESTE 6
         /* TESTES - Estacao_de_Metro */

        /* TESTE 6 - 'iniciaestacaodemetroincorreto()'
        * 
        * OBJETIVO: verificar se um objeto da classe "Estacao_de_Metro", subclasse de propriedade foi iniciada incorretamente e calculou o aluguel incorretamente
        Os resultados Vão depender da quantidade de estações que um jogador possui (no máximo temos 4 estações); Irei setar posicao com um valor diferente de 6, 16, 26 e 36
        Esta situação independe do numero de estações de metro

        
        * os atributos 'posicao' e 'precodeAluguel' devem ser '0' e '-1', respectivamente.
        * 
        * METODO TESTADO: contrutor - 'Estacao_de_Metro(jogador, posicao);'
        * para ser iniciado, é passado uma posicao (que sera a sua posicao em 'Tabuleiro') e a referencia ao jogador;
        * 
        * RETORNO: constroi um objeto do tipo 'Estacao_de_Metro' para ser utilizado como 'Propriedade' em 'Espaçco'.
        */

        
        //teste 6
        ExecutarTeste("iniciaestacaodemetroincorreto", 6);
        iniciaestacaodemetroincorreto(6);
        classeTestada("Estacao_de_Metro");
    }


    

    //Classe Testada
    public static void classeTestada(String nomeClasse)
        {
            System.out.printf("\nClasse testada: %s\n", nomeClasse);
        }
        //Executar
        public static void ExecutarTeste(String nomeTeste, int numeroTeste) 
        {
            System.out.printf("\nTeste %d - %s\n", numeroTeste, nomeTeste);
        }


        //IniciaLoteAluguel
        public static void iniciaLoteAluguel(int posicao) 
        {
            /* SAIDA ESPERADA */
            System.out.printf("Saida esperada: Posicao = %d, Aluguel = %d\n", 2, 2);

            /* TESTE */
            Lote lotes = new Lote(jogador, posicao);

            System.out.printf("\tPosicao: %d\n", lotes.getPosicao());
            System.out.printf("\tAluguel: %d\n", lotes.calcularAluguel());
        }
        

        //iniciaLoteAluguelIncorreto
        public static void iniciaLoteAluguelIncorreto(int posicao) {
            /* SAIDA ESPERADA */
            System.out.printf("Saida esperada: Posicao = %d, Aluguel = %d\n", 0, -1);

            /* TESTE */
        Lote lotes = new Lote(jogador, posicao);

        System.out.printf("\tPosicao: %d\n", lotes.getPosicao());
        System.out.printf("\tAluguel: %d\n", lotes.calcularAluguel());
    }


    public static void iniciautilidadecorreto(int posicao) 
        {
            /* SAIDA ESPERADA */
            System.out.printf("Saida esperada: %d, %d\n", 13, 28);

            /* TESTE */
        Utilidade utilidades = new Utilidade(jogador, posicao);

        System.out.printf("\tPosicao: %d\n", utilidades.getPosicao());
        System.out.printf("\tAluguel: %d\n", utilidades.calcularAluguel());
        }


        public static void iniciautilidadeincorreto(int posicao) 
        {
            /* SAIDA ESPERADA */
            System.out.printf("Saida esperada: Posicao = %d, Aluguel = %d\n", 0, -1);

            /* TESTE */
            Utilidade utilidades = new Utilidade(jogador, posicao);

            System.out.printf("\tPosicao: %d\n", utilidades.getPosicao());
            System.out.printf("\tAluguel: %d\n", utilidades.calcularAluguel());
        }


        public static void iniciaestacaodemetrocorreto(int posicao) 
        {
            /* SAIDA ESPERADA */
            System.out.printf("Saida esperada: Posicao = %d, Aluguel = %d\n", 6, 50);

            /* TESTE */
        Estacao_de_Metro estacoesmetro = new Estacao_de_Metro(jogador, posicao);

        System.out.printf("\tPosicao: %d\n", estacoesmetro.getPosicao());
        System.out.printf("\tAluguel: %d\n", estacoesmetro.calcularAluguel());
        }


        public static void iniciaestacaodemetroincorreto(int posicao) 
        {
            /* SAIDA ESPERADA */
            System.out.printf("Saida esperada: %d, %d\n", 0, -1);

            /* TESTE */
        Estacao_de_Metro estacoesmetro = new Estacao_de_Metro(jogador, posicao);
        System.out.printf("\tPosicao: %d\n", estacoesmetro.getPosicao());
        System.out.printf("\tAluguel: %d\n", estacoesmetro.calcularAluguel());
        }

}