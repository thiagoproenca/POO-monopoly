public class CartaTeste {
    public static void main(String[] args) {
        /* CartaDeDinheiro */
        classeTestada("CartaDeDinheiro");

        // teste 1
        ExecutarTeste("testaCartaValida", 1);
        testaCartaDinheiroValida("COFRE", 8);

        // teste 2s
        ExecutarTeste("testarCartaInvalida", 2);
        testarCartaDinheiroInvalida("ola", 50);
        
        // teste 3s
        ExecutarTeste("testarCartaValidaSorte", 2);
        testarCartaDinheiroValidaSorte("SORTE", 10);

        /* CartaDeMovimento */
        classeTestada("CartaDeMovimento");

        // teste 1
        ExecutarTeste("testaCartaValidaCofre", 1);
        testaCartaValidaMovimentoCofre("COFRE", 2);
 
        // teste 2
        ExecutarTeste("testaCartaValidaSorte", 2);
        testaCartaValidaMovimentoSorte("SORTE", 4);
         
        // teste 3
        ExecutarTeste("testaCartaInvalida", 3);
        testaCartaMovimentoInvalida("surto", -1);

        /* CartaVaParaCadeia */
        classeTestada("CartaVaParaCadeia");

        // teste 1
        ExecutarTeste("testaCartaValidaCofre", 1);
        testaCartaValidaCadeiaCofre("COFRE", 16);

        // teste 2
        ExecutarTeste("testaCartaValidaSorte", 2);
        testaCartaValidaCadeiaSorte("SORTE", 16);
        
        // teste 3
        ExecutarTeste("testaCartaInvalida", 3);
        testaCartaValidaCadeiaSorte("AZAR", 16);
    }

    // nome da classe que vai ser testada
    public static void classeTestada(String nomeClasse) {
        System.out.printf("\nClasse testada: %s\n", nomeClasse);
    }

    // nome e numero do teste executado
    public static void ExecutarTeste(String nomeTeste, int numeroTeste) {
        System.out.printf("\nTeste %d - '%s'\n", numeroTeste, nomeTeste);
    }

    /* CartaDeDinheiro */

        public static void testaCartaDinheiroValida(String tipo, int numcarta) {
            //saída esperada
            System.out.println("Saída esperada: Seu seguro de vida alcança seu estágio mais avançado");
            
            CartaDeDinheiro c1 = new CartaDeDinheiro(tipo, numcarta);
            
            System.out.printf("%s", c1.getEspecificacao());
        }

        public static void testarCartaDinheiroInvalida(String tipo, int numcarta) {
            //caso ainda nao tratado no codigo
            CartaDeDinheiro c2 = new CartaDeDinheiro(tipo, numcarta);
            
            System.out.printf("%s", c2.getEspecificacao());
        }
        
        public static void testarCartaDinheiroValidaSorte(String tipo, int numcarta){
            //saida esperada
            System.out.println("Saida esperada: Taxa de atendimento médico (pague $50 ");
            CartaDeDinheiro c3 = new CartaDeDinheiro(tipo, numcarta);
            //Saida do programa:
            System.out.printf("%s", c3.getEspecificacao());
        }

    /* CartaDeMovimento */
        public static void testaCartaValidaMovimentoCofre(String tipo, int numcarta) {
            //saída esperada
            System.out.println("Saída esperada: Avance para a Rua Oscar Freire");
            
            CartaDeMovimento c1 = new CartaDeMovimento(tipo, numcarta);
            
            System.out.printf("%s", c1.getEspecificacao());
        }
        
        public static void testaCartaValidaMovimentoSorte(String tipo, int numcarta) {

            //saída esperada

            System.out.println("Saída esperada: Avance para a Praça da Sé");
            
            CartaDeMovimento c2 = new CartaDeMovimento(tipo, numcarta);
            
            System.out.printf("%s", c2.getEspecificacao());
        }

            
        public static void testaCartaMovimentoInvalida(String tipo, int numcarta) {
            //caso nao implementado no programa ate o momento
            
            CartaDeMovimento c3 = new CartaDeMovimento(tipo, numcarta);
            
            System.out.printf("%s", c3.getEspecificacao());
        }

    /* CartaVaParaCadeia */

        public static void testaCartaValidaCadeiaCofre(String tipo, int numcarta) {

            //saída esperada

            System.out.println("Saída esperada: Vá diretamente para a cadeia");
            
            CartaVaParaCadeia c1 = new CartaVaParaCadeia(tipo, numcarta);
            
            System.out.printf("%s", c1.getEspecificacao());
        }
        
        public static void testaCartaValidaCadeiaSorte(String tipo, int numcarta) {

            //saída esperada

            System.out.println("Saída esperada: Vá diretamente para a cadeia");
            
            CartaVaParaCadeia c2 = new CartaVaParaCadeia(tipo, numcarta);
            
            System.out.printf("%s", c2.getEspecificacao());
        }

            
        public static void testaCartaCadeiaInvalida(String tipo, int numcarta) {
            //caso nao implementado no programa ate o momento
            
            CartaVaParaCadeia c3 = new CartaVaParaCadeia(tipo, numcarta);
            
            System.out.printf("%s", c3.getEspecificacao());
        }
}
