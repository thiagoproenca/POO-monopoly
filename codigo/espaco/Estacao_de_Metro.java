/* Autor: 
 * Maurício Kessongo
 * 
 * Descrição da classe: Classe que implementa uma propriedade "Estacao_de_Metro" no "Espaco". Sub-classe de propriedade; essa classe é responsável por calcular
 * o "preço de aluguel" especificamente para uma estacção de metró para que quando um jogador cair na estação de metró de outro, ele consiga chamar o método
 * calcularAluguel() e pague o valor de aluguel certo. 
 * Além disso, o cálculo do aluguel das estações de metró depende de algumas regras:
 * - O aluguel começa com $25;
 * - o aluguel dobra a cada nova estação adquirida pelo mesmo jogador
 * - Depende do número de estações adquiridas pelo mesmo jogador
 * - O valor de aluguel varia de $25 até $200
  */

  public class Estacao_de_Metro extends Propriedade
  {
  
      //protected int precoDeAluguel = 25; //Valor padrão do aluguel de uma EstaçãoDeMetro.
      private int estacoes; //Variável que deve ter o valor atribuido pelo construtor. Esse valor deve ser passado pela classe Jogador.
  
      //Construtor
      public Estacao_de_Metro(int posicao){
        calcularAtributos(posicao);
      }
  
      //Métodos
      @Override
      public void calcularAluguel() 
      {
          /**
           * Método calcularAluguel() implementado pela classe EstaçãoDeMetrô. Esse método usa o valor da variável
           * estacoes para calcular o valor do aluguel, com o uso de uma estrutura condicional Switch - Case.
           */
  
          if(posicao == 6 || posicao == 16 || posicao == 26 || posicao ==36)
          {
              estacoes = jogador.Num_Estacoes__de_Metro();
                switch(estacoes)
                {
                      case 1:
                          setPrecoDeAluguel(25);
                          break;
                  
                      case 2:
                          setPrecoDeAluguel(50);
                          break;
                      case 3:
                          setPrecoDeAluguel(100);
                          break;
                      case 4:
                          setPrecoDeAluguel(200);
                          break;
                      default:
                          // :D
                          calcularAtributos(posicao);
                          break;
                }
              
          }
          else
          {
              calcularAtributos(posicao); 
          }
  
      }
  
      /**
       *
       * Métodos Getters e Setters de cada atributo da classe.
       */
  
      public int getEstacoes() 
      {
          return estacoes;
      }
  
      public void setEstacoes(int estacoes) 
      {
          this.estacoes = estacoes;
      }
  
      public void calcularAtributos(int posicao)
      {
  
          switch (posicao)
          {
      
              case 6:
                  setPreco(200);
                  //System.out.println("O Aluguel foi = " +getPrecoDeAluguel());
                  setPosicao(posicao);
                  setNome(NomeDoEspaco.METRO_MARACANA.toString());
              break;
              case 16:
                  setPreco(200);
                  //System.out.println("O Aluguel foi = " +getPrecoDeAluguel());
                  setPosicao(posicao);
                  setNome(NomeDoEspaco.METRO_CARIOCA.toString());
              break;
              case 26:
                  setPreco(200);
                  //System.out.println("O Aluguel foi = " +getPrecoDeAluguel());
                  setPosicao(posicao);
                  setNome(NomeDoEspaco.METRO_CONSOLACAO.toString());
              break;
              case 36:
                  setPreco(200);
                  //System.out.println("O Aluguel foi = " +getPrecoDeAluguel());
                  setPosicao(posicao);
                  setNome(NomeDoEspaco.METRO_REPUBLICA.toString());
              break;
          }
      }
      
  }
  