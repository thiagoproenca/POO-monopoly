/* Autor: 
 * Thiago Proença
 * 
 * Descrição da classe: 
 * 
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Gerenciador {
    public static void main(String[] args) {
        int quantidadeJogadores = 0;
        Jogador jogadores[];
        Jogo jogo;

        // inicializa os jogadores e o jogo
        Scanner scan = new Scanner(System.in);

        // inicia a interacao com os jogadores
        while(!(quantidadeJogadores >= 2 && quantidadeJogadores <= 4)) {
            try {
                do {
                    System.out.printf("Informe a quantidade de jogadores: ");
                    quantidadeJogadores = scan.nextInt();
                    if(quantidadeJogadores >= 2 && quantidadeJogadores <= 4) {
                        break; // quantidade de jogadores definida
                    }
    
                    else {
                        System.out.println("Número de jogadores inválido!\n");
                        System.out.println("Para iniciar o jogo, são necessarios 2 à 4 jogadores.");
                    }
                } while(!(quantidadeJogadores >= 2 && quantidadeJogadores <= 4));
            } catch (InputMismatchException e) {
                System.out.println("Digite um valor válido!\n");
                System.out.println("Para iniciar o jogo, são necessarios 2 à 4 jogadores.");
                scan = new Scanner(System.in);
            }
        }
        
        scan = new Scanner(System.in); // evita que o valor da variavel seja lida no proximo scan

        // inicializa os jogadores
        jogadores = new Jogador[quantidadeJogadores];
        for(int i=0; i<quantidadeJogadores; i++) {
            System.out.printf("Nome do jogador: ", i+1);

            jogadores[i] = new Jogador(scan.nextLine());
        }

        // 2 jogadores
        if(quantidadeJogadores == 2) {
            jogo = new Jogo(jogadores[0], jogadores[1]);
        }

        // 3 jogadores
        else if(quantidadeJogadores == 3) {
            jogo = new Jogo(jogadores[0], jogadores[1], jogadores[2]);
        }

        // 4 jogadores
        else {
            jogo = new Jogo(jogadores[0], jogadores[1], jogadores[2], jogadores[3]);
        }

        // inicia jogo
        jogo.Jogar();
        
    }
}
