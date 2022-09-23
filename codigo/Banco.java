/*
 * Autor: Arthur Naoto
 * Descrição da classe:
 * Classe que lida com as operações monetárias do jogo.
 * De forma resumida, o Banco tem a responsabilidade de pagar o jogador, receber dinheiro do jogador ou atuar como intermediador
 * entre jogadores que estiverem transacionando;
 * A especificidade dos métodos da classe 'Banco' está detalhado no corpo de cada método.
 */

public class Banco{

    public Banco(){
    }

   // True: operação sucesso!  False: faliu... 
    public boolean pagarTaxa(Jogador jogador, float taxa){
        if(jogador.getSaldo() < (taxa * (-1))){
            falencia(jogador);
            return false;
        }
        jogador.setSaldo(jogador.getSaldo() + taxa);
        return true;
    }

    //jogador: paga    jogador2: recebe
    public boolean pagarTaxa(Jogador jogador, Jogador jogador2, float taxa){
        if(jogador.getSaldo() < taxa){
            falencia(jogador, jogador2);
            return false;
        }
        jogador.setSaldo(jogador.getSaldo() - taxa);
        recebeTaxa(jogador2, taxa);
        return true;
    }

    private void recebeTaxa(Jogador jogador, float taxa){
        jogador.setSaldo(jogador.getSaldo() + taxa);
    }

    // Falência para o banco
    private void falencia(Jogador jogador){
        // retira o jogador como dono das propriedades
        for(int i=0; i<jogador.getPropriedade().size(); i++) {
            jogador.getPropriedade().get(i).setJogador(null);
        }
        // retira as propriedades do jogador
        jogador.getPropriedade().clear();

        
        System.out.println("O jogador "+jogador.getNome()+" chegou à falência...");
        System.out.println("Transferindo propriedades ao Banco.");
    }

    // Jogador é o falido, jogador2 é quem recebe as propriedades
    private void falencia(Jogador jogador, Jogador jogador2){
        jogador2.setSaldo(jogador2.getSaldo() + jogador.getSaldo());
        
        for(int i=0; i<jogador.getPropriedade().size(); i++){
            jogador.getPropriedade().get(i).setJogador(jogador2);
            jogador2.setPropriedade(jogador.getPropriedade().get(i));
        }

        System.out.println("Jogador "+jogador.getNome()+" chegou à falência...");
        System.out.println("Transferindo propriedades para "+jogador2.getNome());
    }
}