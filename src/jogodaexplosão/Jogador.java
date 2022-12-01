/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogodaexplosão;
import java.util.Random;

/**
 *
 * @author Caroline Souza Camargo e Yasmin Souza Camargo
 */

public class Jogador {
    private final int id;
    private final String nome;
    private final int posicaoInicial;
    private int posicaoAtual;
    private Item itemPassivo;
    private Item itemInstantaneo;
    
    public Jogador(String nome, int posicao, int id){
        this.nome = nome;
        posicaoInicial = posicao;
        this.id = id;
        posicaoAtual = posicao;
    }
    
    //Adiciona um item ao iventário do jogador
    public String criaItem(int codigo, int quantidadeJogadores){
        if (codigo == 1){
            itemPassivo = new AsasDeIcaro();
            return itemPassivo.toString();
        } 
        else if (codigo == 2){
            itemPassivo = new Escudo();
            return itemPassivo.toString();
        } 
        else if (codigo == 3){
            itemPassivo = new Empurrar();
            return itemPassivo.toString();
        } 
        else if (codigo == 4){
            //Escolhe aleatóriamente um jogador para imobilizar
            Random random = new Random();
            int num = 0;
            do { 
                num = random.nextInt(quantidadeJogadores) + 1;
            } while (num == id);
            
            itemInstantaneo = new Imobilizar(num);
            return itemInstantaneo.toString();
        } 
        else if (codigo == 5){
            itemInstantaneo = new Velocidade();
            return itemInstantaneo.toString();
        }
        else if (codigo == 6){
            itemInstantaneo = new Sabotar();
            return itemInstantaneo.toString();
        }
        return null;
    }
    
    public String getNomeItemPassivo(){
        try {
            return itemPassivo.toString();
        } catch (NullPointerException e) {
            return "Não possui";
        }
    }
    
    public String getNomeItemInstantaneo(){
        try {
            return itemInstantaneo.toString();
        } catch (NullPointerException e) {
            return "Não possui";
        }
    }
    
    public Imobilizar testaItemInstantaneo_Imobilizar(){
        try {
            return (Imobilizar) itemInstantaneo;
        } catch (ClassCastException e) {
            return null;
        }
    }
      
    public int getPosicaoAtual(){
        return posicaoAtual;
    }
    
    public int getposicaoInicial(){
        return posicaoInicial;
    }
    
    public void setPosicaoAtual(int posicaoAtual){
        this.posicaoAtual = posicaoAtual;
    }
    
    public void retiraItemPassivo(){
        itemPassivo = null;
    }
    
    public void retiraItemInstantaneo(){
        itemInstantaneo = null;
    }
    
    @Override
    public String toString(){
        return this.nome;
    }
}
