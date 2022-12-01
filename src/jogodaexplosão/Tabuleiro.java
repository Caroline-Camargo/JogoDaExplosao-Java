/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogodaexplosão;
import javax.swing.JOptionPane;

/**
 *
 * @author Caroline Souza Camargo e Yasmin Souza Camargo
 */

public class Tabuleiro {
    private final int tamanho;
    private String [] tabuleiro; //Referente as pontes (se existe pontes contruidas ou não)
    
    //Referente aos jogadores (se existe jogadores naquela posição ou não)
    private String []   posicaoTabuleiroJogador_1, 
                        posicaoTabuleiroJogador_2, 
                        posicaoTabuleiroJogador_3, 
                        posicaoTabuleiroJogador_4;
    
    
    public Tabuleiro(){
        tamanho = 20;
        tabuleiro = new String[tamanho];
        
        posicaoTabuleiroJogador_1 = new String[tamanho];
        posicaoTabuleiroJogador_2 = new String[tamanho];
        posicaoTabuleiroJogador_3 = new String[tamanho];
        posicaoTabuleiroJogador_4 = new String[tamanho];
        
        for (int i = 0; i < tamanho; i++){
            tabuleiro[i] = "_"; //Não existe nenhuma ponte ainda no tabuleiro

            //Não existe nenhum jogador no tabuleiro
            posicaoTabuleiroJogador_1[i] = " ";
            posicaoTabuleiroJogador_2[i] = " ";
            posicaoTabuleiroJogador_3[i] = " ";
            posicaoTabuleiroJogador_4[i] = " ";
        }
        
        //Coloca as Torres
        tabuleiro[0] = "T";
        tabuleiro[5] = "T";
        tabuleiro[10] = "T";
        tabuleiro[15] = "T";
    }
    
    public Tabuleiro(int tamanho){
        this.tamanho = tamanho;
        tabuleiro = new String[tamanho];
        
        posicaoTabuleiroJogador_1 = new String[tamanho];
        posicaoTabuleiroJogador_2 = new String[tamanho];
        posicaoTabuleiroJogador_3 = new String[tamanho];
        posicaoTabuleiroJogador_4 = new String[tamanho];
        
        for (int i = 0; i < tamanho; i++){
            tabuleiro[i] = "_"; //Não existe nenhuma ponte ainda no tabuleiro

            //Não existe nenhum jogador no tabuleiro
            posicaoTabuleiroJogador_1[i] = " ";
            posicaoTabuleiroJogador_2[i] = " ";
            posicaoTabuleiroJogador_3[i] = " ";
            posicaoTabuleiroJogador_4[i] = " ";
        }
        
        //Coloca as Torres
        tabuleiro[0] = "T";
        tabuleiro[5] = "T";
        tabuleiro[10] = "T";
        tabuleiro[15] = "T";
    }
    
    //Coloca uma ponte/joagdor em uma posição específica
    public void setPosicaoTabuleiro(int indice, String valor){
        if (indice < 0 && indice > tamanho){
            return ;
        }
        tabuleiro[indice] = valor;
    }
    
    //Coloca n pontes nas posições vagas
    public int setPosicaoTabuleiro(int indiceAtual, int indiceInicial, int quant, int jogadorAtual){
        int i, nPontes = 0;
        for (i = indiceAtual + 1; i != indiceInicial; i++){
            //Verifica se já chegou no fim do vetor, se já chegou volta para o íncio do vetor
            if (i > 19 || i < 0){
                i = 0;
            }
            
            //Verifica se já completou uma volta no tabuleiro (se sim, jogador ganhou)
            if(i == indiceInicial){
                return -999;
            } 
   
            //Se nao tem ponte nesse local pode colocar uma nova ponte
            if (verifica(i)){
                tabuleiro[i] = "=";
                nPontes++;
            }
            
            //Verifica se já colocou todas pontes 
            if (nPontes == quant){
                break;
            }
        }
        
        //Verifica novamente se o jogador já completou uma volta no tabuleiro
        if(i == indiceInicial){
            return -999;
        }
        
        //Atualiza posição atual do jogador no tabuleiro
        if(i < 0 && i > 19){
            System.out.println("errooo posiçao");
        }
        setPosicaoJogador(indiceAtual, jogadorAtual, i);
      
        return i;
    }
    
    //Adiciona jogador no tabuleiro em uma posição específica 
    public void setPosicaoJogador(int jogador, int indice, String valor){
        if (indice < 0 && indice > tamanho){
            return ;
        }
        if (jogador == 1){
            posicaoTabuleiroJogador_1[indice] = valor;
        }
        if (jogador == 2){
            posicaoTabuleiroJogador_2[indice] = valor;
        }
        if (jogador == 3){
            posicaoTabuleiroJogador_3[indice] = valor;
        }
        if (jogador == 4){
            posicaoTabuleiroJogador_4[indice] = valor;
        }
        
    }
    
    //Atualiza posição atual do jogador no tabuleiro, limpando a posição anterior que estava
    public void setPosicaoJogador(int indiceAtual, int jogadorAtual, int indice){
        if (indice < 0 && indice > tamanho){
            return ;
        }
      
        if(jogadorAtual == 1){
            for (int i = 0; i != tamanho; i++) {
                 posicaoTabuleiroJogador_1[i] = " ";
            }
            posicaoTabuleiroJogador_1[indice] = "" + jogadorAtual;
        }

        if(jogadorAtual == 2){
            for (int i = 0; i != tamanho; i++) {
                 posicaoTabuleiroJogador_2[i] = " ";
            }
            posicaoTabuleiroJogador_2[indice] = "" + jogadorAtual;
        }

        if(jogadorAtual == 3){
             for (int i = 0; i != tamanho; i++) {
                  posicaoTabuleiroJogador_3[i] = " ";
            }

                posicaoTabuleiroJogador_3[indice] = "" + jogadorAtual;

        }
        if(jogadorAtual == 4){
            for (int i = 0; i != tamanho; i++) {
                  posicaoTabuleiroJogador_4[i] = " ";
            }
                posicaoTabuleiroJogador_4[indice] = "" + jogadorAtual;
        }
    }
    
    //Verifica se existe um lugar vago para construir uma ponte
    private boolean verifica(int indice){
        if (indice < 0 && indice > tamanho){
            return false;
        }
        if (tabuleiro[indice].equals("_")){
            return true;
        }
        return false;
    }
    
    public int getTamanho(){
        return tamanho;
    }
    
    public String getConteudo(int indice){
        if (indice < 0 && indice > tamanho){
            return null;
        }
        return tabuleiro[indice];
    }
    
    public String getPosicoesJogadoresTabuleiro(int jogador,int indice){
        if (indice < 0 && indice > tamanho){
            return null;
        }
        if (jogador == 1){
            return posicaoTabuleiroJogador_1[indice];
        }
        if (jogador == 2){
            return posicaoTabuleiroJogador_2[indice];
        }
        if (jogador == 3){
            return posicaoTabuleiroJogador_3[indice];
        }
        if (jogador == 4){
            return posicaoTabuleiroJogador_4[indice];
        } 
        return null;
    }
}


