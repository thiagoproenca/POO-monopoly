/*
 * Autor: Renan Oliveira
 * 
 * Descrição da classe:
 * A classe 'Jogador' comunica-se com várias outras classes. Com algumas mantém um relacionamento de agregação e
 * com outra relacionamento de composição;
 *  'Jogador' é responsável por saber alguns aspectos específicos dos jogadores como nome, saldo, quantidade de propriedades,
 * duplas dos últimos lançamentos dos dados, qual espaço está no tabuleiro ou saber se tem ou não monopólios.
 * De forma precisa, a classe Jogador conta a quantidade de lotes de um grupo de lote. Caso esse valor atinja a quantidade 
 * máxima de lotes por grupo, retorna true, informando que o jogador tem um monopólio de um lote.
 * Outras especificidades podem ser verificadas no corpo do código.
 */

import java.util.ArrayList;

public class Jogador{

    // atributos
    private String nome;
    private float saldo;
    private ArrayList<Propriedade> propriedades;
    private int[] lancamentos;
    private boolean estarNaCadeia;
    private int posicao;
    private int turnosNaCadeia;
    private int monopolio;
    private boolean hotelConstruido;
    private boolean podeConstruirHotel;


    // construtor
    public Jogador(String nome){
        this.nome = nome;
        this.propriedades = new ArrayList<>();
        this.lancamentos = new int[3];
        this.estarNaCadeia = false;
        this.turnosNaCadeia = 0;
        this.monopolio = 0;
        this.hotelConstruido = false;
        this.podeConstruirHotel = false;
    }

    /**
     * Métodos Getters e Setters de cada atributo da classe.
     */
    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setHotelConstruido(boolean hotel){
        this.hotelConstruido = hotel;
    }

    public boolean getHotelConstruido(){
        return this.hotelConstruido;
    }

    public boolean getPodeConstruirHotel(){
        return this.podeConstruirHotel;
    }

    public void setMonopolio(int monopolio){
        this.monopolio = monopolio;
    }

    public int getMonopolio(){
        return this.monopolio;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean setLancamentos(int numero) {
        if (numero <= 0 || numero > 6) {
            return false;
        } else {
            lancamentos[0] = lancamentos[1];
            lancamentos[1] = lancamentos[2];
            lancamentos[2] = numero;

            return true;
        }
    }

    public int getUltimoLancamento() {
        switch (lancamentos.length){
            case 0:
                return 0;
            case 1:
                return lancamentos[0];
            case 2:
                return lancamentos[1];
            default:
                return lancamentos[2];
        }
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public boolean isEstarNaCadeia() {
        return estarNaCadeia;
    }

    public void setEstarNaCadeia(boolean estarNaCadeia) {
        this.estarNaCadeia = estarNaCadeia;
    }

    public void setTurnosNaCadeia(int turnos){
        this.turnosNaCadeia = turnos;
    }

    public int getTurnosNaCadeia(){
        return this.turnosNaCadeia;
    }

    public void setPropriedade(Propriedade propriedade){
        this.propriedades.add(propriedade);
    }

    public ArrayList<Propriedade> getPropriedade() {
        return this.propriedades;
    }


    // métodos
    public boolean temDuplas() {
        switch (lancamentos.length){
            case 0:
            case 1:
                return false;
            case 2:
                return lancamentos[0] == lancamentos[1];
            default:
                return lancamentos[0] == lancamentos[1] || lancamentos[0] == lancamentos[2] || lancamentos[1] == lancamentos[2];
        }
    }

    public int Num_Estacoes__de_Metro(){
        int Num_Estacoes__de_Metro = 0;
        for(Propriedade item : propriedades){
            if(item instanceof Estacao_de_Metro){
                Num_Estacoes__de_Metro++;
            }
        }

        return Num_Estacoes__de_Metro;
    }

    public int Num_Utilidades(){
        int Num_Utilidades = 0;
        for(Propriedade item : propriedades){
            if(item instanceof Utilidade){
                Num_Utilidades++;
            }
        }

        return Num_Utilidades;
    }

    public float getFortuna(){
        float fortuna = 0;

        for(int i=0; i<this.propriedades.size(); i++){
            fortuna += this.propriedades.get(i).preco;
            if(this.propriedades.get(i).getCasaConstruida()){
                fortuna += this.propriedades.get(i).getPrecodeConstrucao();
            }
        }

        fortuna += getSaldo();
        return fortuna;
    }

    public void retirarPropriedade(Propriedade propriedade){
        this.propriedades.remove(propriedade);
    }

    public boolean monopolio(String cor){
        int i = 0;
        int count = 0;
        int countHotel = 0;
        for(i=0; i<this.propriedades.size(); i++){
            if(propriedades.get(i) instanceof Lote){
                Espaco espaco = propriedades.get(i);
                if(((Lote)espaco).getCor() == cor){
                    count++;
                }
            }
        }

        switch(cor){
            case "Marrom":{
                if(count == 2){ 
                    this.monopolio++;

                    for(i=0;i<this.propriedades.size();i++){
                        if(this.propriedades.get(i) instanceof Lote){
                            Espaco espaco = propriedades.get(i);
                            if(((Lote)espaco).getCor() == "Marrom" && ((Lote)espaco).getCasaConstruida()){
                                countHotel++;
                            }
                        }
                    }

                    if(countHotel == 2){
                        this.podeConstruirHotel = true;
                    }

                    return true;
                }
                else return false;
            }
            case "Azul Claro":{
                if(count == 3){ 
                    this.monopolio++;

                    for(i=0;i<this.propriedades.size();i++){
                        if(this.propriedades.get(i) instanceof Lote){
                            Espaco espaco = propriedades.get(i);
                            if(((Lote)espaco).getCor() == "Azul Claro" && ((Lote)espaco).getCasaConstruida()){
                                countHotel++;
                            }
                        }
                    }

                    if(countHotel == 2){
                        this.podeConstruirHotel = true;
                    }
                    return true;
                }
                else return false;
            }
            case "Rosa":{
                if(count == 3){ 
                    this.monopolio++;

                    for(i=0;i<this.propriedades.size();i++){
                        if(this.propriedades.get(i) instanceof Lote){
                            Espaco espaco = propriedades.get(i);
                            if(((Lote)espaco).getCor() == "Rosa" && ((Lote)espaco).getCasaConstruida()){
                                countHotel++;
                            }
                        }
                    }

                    if(countHotel == 2){
                        this.podeConstruirHotel = true;
                    }
                    return true;
                }
                else return false;
            }
            case "Laranja":{
                if(count == 3){ 
                    this.monopolio++;

                    for(i=0;i<this.propriedades.size();i++){
                        if(this.propriedades.get(i) instanceof Lote){
                            Espaco espaco = propriedades.get(i);
                            if(((Lote)espaco).getCor() == "Laranja" && ((Lote)espaco).getCasaConstruida()){
                                countHotel++;
                            }
                        }
                    }

                    if(countHotel == 2){
                        this.podeConstruirHotel = true;
                    }
                    return true;
                }
                else return false;
            }
            case "Vermelho":{
                if(count == 3){ 
                    this.monopolio++;

                    for(i=0;i<this.propriedades.size();i++){
                        if(this.propriedades.get(i) instanceof Lote){
                            Espaco espaco = propriedades.get(i);
                            if(((Lote)espaco).getCor() == "Vermelho" && ((Lote)espaco).getCasaConstruida()){
                                countHotel++;
                            }
                        }
                    }

                    if(countHotel == 2){
                        this.podeConstruirHotel = true;
                    }
                    return true;
                }
                else return false;
            }
            case "Amarelo":{
                if(count == 3){ 
                    this.monopolio++;

                    for(i=0;i<this.propriedades.size();i++){
                        if(this.propriedades.get(i) instanceof Lote){
                            Espaco espaco = propriedades.get(i);
                            if(((Lote)espaco).getCor() == "Amarelo" && ((Lote)espaco).getCasaConstruida()){
                                countHotel++;
                            }
                        }
                    }

                    if(countHotel == 2){
                        this.podeConstruirHotel = true;
                    }
                    return true;
                }
                else return false;
            }
            case "Verde":{
                if(count == 3){ 
                    this.monopolio++;

                    for(i=0;i<this.propriedades.size();i++){
                        if(this.propriedades.get(i) instanceof Lote){
                            Espaco espaco = propriedades.get(i);
                            if(((Lote)espaco).getCor() == "Verde" && ((Lote)espaco).getCasaConstruida()){
                                countHotel++;
                            }
                        }
                    }

                    if(countHotel == 2){
                        this.podeConstruirHotel = true;
                    }
                    return true;
                }
                else return false;
            }
            case "Azul":{
                if(count == 2){ 
                    this.monopolio++;

                    for(i=0;i<this.propriedades.size();i++){
                        if(this.propriedades.get(i) instanceof Lote){
                            Espaco espaco = propriedades.get(i);
                            if(((Lote)espaco).getCor() == "Azul" && ((Lote)espaco).getCasaConstruida()){
                                countHotel++;
                            }
                        }
                    }

                    if(countHotel == 2){
                        this.podeConstruirHotel = true;
                    }
                    return true;
                }
                else return false;
            }
        }
        return false;
    }

}