/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jogodaexplosão;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author Caroline Souza Camargo e Yasmin Souza Camargo
 */

public class JogoExplosão extends javax.swing.JFrame {
    private final ArrayList<Jogador> jogadores;
    private final Tabuleiro tabuleiro;
    private final Dado dado; 
    private int numJogadores;
    private int jogadorAtual;
    
    public JogoExplosão() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
      
        dado = new Dado();
        tabuleiro = new Tabuleiro(20);
        jogadores = new ArrayList<Jogador>();
        InicializaçãoJogoExplosão();
        explosao.setVisible(false);
    }
    
    private void InicializaçãoJogoExplosão() {
        //Lê a quantidade de jogadores que vai ter no jogo
        try {
            numJogadores = Integer.valueOf(JOptionPane.showInputDialog("Digite a quantidade de jogadores:", ""));
        } catch (NumberFormatException e) {
            numJogadores = 2;
        }
        
        //No mínimo 2 jogadores e no máximo 4
        if (numJogadores > 4){
            numJogadores = 4;
        }
        if (numJogadores < 2){
            numJogadores = 2;
        }
        
        //Começa pelo jogador 1
        jogadorAtual = 1;
        
        //Seta as posições iniciais de cada jogador (em que torre cada jogador começa) e adiciona eles no ArrayList
        int tempPosicaoJogador = 0;
        if (numJogadores == 2){ //Se for dois jogadores apenas eles começam em torres opostas
            Jogador novoJogador = new Jogador("Jogador " + 1, 0, 1);
            try {
                jogadores.add(novoJogador);
            } catch (Exception e) {
                System.err.println("ERRO Ao adiconar jogador no ArrayList");
            }
            
            novoJogador = new Jogador("Jogador " + 2, 10, 2);
            try {
                jogadores.add(novoJogador);
            } catch (Exception e) {
                System.err.println("ERRO Ao adiconar jogador no ArrayList");
            }
        } else {
            for (int i = 1; i <= numJogadores; i++){
                Jogador novoJogador = new Jogador("Jogador " + i, tempPosicaoJogador, i);
                try {
                    jogadores.add(novoJogador);
                } catch (Exception e) {
                    System.err.println("ERRO Ao adiconar jogador no ArrayList");
                }
                tempPosicaoJogador += 5;
            }
        }
        
        //Coloca esses jogadores no tabuleiro
        inicializarJogadores();
        atualizaTabuleiro();
     }
    
    //Coloca os jogadores no tabuleiro
    private void inicializarJogadores(){  
        for (int i = 1; i <= numJogadores; i++){
            try {
                tabuleiro.setPosicaoJogador(i, jogadores.get(i - 1).getPosicaoAtual(), "" + i);
            } catch (Exception e) {
                System.err.println("ERRO Ao inicializar jogadores");
            }
        }
    }
    
    /*
    Toda vez que for feito uma atualização no tabuleiro precisa atualizar a interface gráfica do jogo 
    Cor amarela: ponte contruida
    Cor cinza: não há ponte construida
    */
    private void atualizaTabuleiro(){
        for (int i = 0; i < tabuleiro.getTamanho(); i++) {
            if(tabuleiro.getConteudo(i).equals("=")){   //É uma ponte
               if (i == 1){
                   ponte1.setBackground(Color.yellow);
               }
               if (i == 2){
                   ponte2.setBackground(Color.yellow);
               }
               if (i == 3){
                   ponte3.setBackground(Color.yellow);
               }
               if (i == 4){
                   ponte4.setBackground(Color.yellow);
               }
               if (i == 6){
                   ponte6.setBackground(Color.yellow);
               }
               if (i == 7){
                   ponte7.setBackground(Color.yellow);
               }
               if (i == 8){
                   ponte8.setBackground(Color.yellow);
               }
               if (i == 9){
                   ponte9.setBackground(Color.yellow);
               }
               if (i == 11){
                   ponte11.setBackground(Color.yellow);
               }
               if (i == 12){
                   ponte12.setBackground(Color.yellow);
               }
               if (i == 13){
                   ponte13.setBackground(Color.yellow);
               }
               if (i == 14){
                   ponte14.setBackground(Color.yellow);
               }
               if (i == 16){
                   ponte16.setBackground(Color.yellow);
               }
               if (i == 17){
                   ponte17.setBackground(Color.yellow);
               }
               if (i == 18){
                   ponte18.setBackground(Color.yellow);
               }
               if (i == 19){
                   ponte19.setBackground(Color.yellow);
               } 
            }
            
            if(tabuleiro.getConteudo(i).equals("_")){   //Não possui ponte construida
               if (i == 1){
                   ponte1.setBackground(new Color(242,242,242));
               }
               if (i == 2){
                   ponte2.setBackground(new Color(242,242,242));
               }
               if (i == 3){
                   ponte3.setBackground(new Color(242,242,242));
               }
               if (i == 4){
                   ponte4.setBackground(new Color(242,242,242));
               }
               if (i == 6){
                   ponte6.setBackground(new Color(242,242,242));
               }
               if (i == 7){
                   ponte7.setBackground(new Color(242,242,242));
               }
               if (i == 8){
                   ponte8.setBackground(new Color(242,242,242));
               }
               if (i == 9){
                   ponte9.setBackground(new Color(242,242,242));
               }
               if (i == 11){
                   ponte11.setBackground(new Color(242,242,242));
               }
               if (i == 12){
                   ponte12.setBackground(new Color(242,242,242));
               }
               if (i == 13){
                   ponte13.setBackground(new Color(242,242,242));
               }
               if (i == 14){
                   ponte14.setBackground(new Color(242,242,242));
               }
               if (i == 16){
                   ponte16.setBackground(new Color(242,242,242));
               }
               if (i == 17){
                   ponte17.setBackground(new Color(242,242,242));
               }
               if (i == 18){
                   ponte18.setBackground(new Color(242,242,242));
               }
               if (i == 19){
                   ponte19.setBackground(new Color(242,242,242));
               } 
            }
        }
        atualizaTabuleiroPosicaoJogador();
    }
    
    private void atualizaTabuleiroPosicaoJogador(){
        atualizaTabuleiroJogador1();
        atualizaTabuleiroJogador2();
        atualizaTabuleiroJogador3();
        atualizaTabuleiroJogador4();
    }
    
    //Atualiza posição do jogador 1 na insterface gráfica
    private void atualizaTabuleiroJogador1(){
        String temp;
        for (int i = 0; i < tabuleiro.getTamanho(); i++) {
            if (tabuleiro.getPosicoesJogadoresTabuleiro(1, i).equals("" + 1)){
               temp = "1";
            } else{
               temp = " ";
            }
            
            if (i == 0) {
                indicadorJodador1_Posicao0.setText("" + temp);
            }
            if (i == 1) {
                indicadorJodador1_Posicao1.setText("" + temp);
            }
            if (i == 2) {
                indicadorJodador1_Posicao2.setText("" + temp);
            }
            if (i == 3) {
                indicadorJodador1_Posicao3.setText("" + temp);
            }
            if (i == 4) {
                indicadorJodador1_Posicao4.setText("" + temp);
            }
            if (i == 5) {
                indicadorJodador1_Posicao5.setText("" + temp);
            }
            if (i == 6) {
                indicadorJodador1_Posicao6.setText("" + temp);
            }
            if (i == 7) {
                indicadorJodador1_Posicao7.setText("" + temp);
            }
            if (i == 8) {
                indicadorJodador1_Posicao8.setText("" + temp);
            }
            if (i == 9) {
                indicadorJodador1_Posicao9.setText("" + temp);
            }
            if (i == 10) {
                indicadorJodador1_Posicao10.setText("" + temp);
            }
            if (i == 11) {
                indicadorJodador1_Posicao11.setText("" + temp);
            }
            if (i == 12) {
                indicadorJodador1_Posicao12.setText("" + temp);
            }
            if (i == 13) {
                indicadorJodador1_Posicao13.setText("" + temp);
            }
            if (i == 14) {
                indicadorJodador1_Posicao14.setText("" + temp);
            }
            if (i == 15) {
                indicadorJodador1_Posicao15.setText("" + temp);
            }
            if (i == 16) {
                indicadorJodador1_Posicao16.setText("" + temp);
            }
            if (i == 17) {
                indicadorJodador1_Posicao17.setText("" + temp);
            }
            if (i == 18) {
                indicadorJodador1_Posicao18.setText("" + temp);
            }
            if (i == 19) {
                indicadorJodador1_Posicao19.setText("" + temp);
            }
        }
    }
    
    //Atualiza posição do jogador 2 na insterface gráfica
    private void atualizaTabuleiroJogador2(){
        String temp;
        for (int i = 0; i < tabuleiro.getTamanho(); i++) {
            if (tabuleiro.getPosicoesJogadoresTabuleiro(2, i).equals("" + 2)){
               temp = "2";
            } else{
               temp = " ";
            }
            
            if (i == 0) {
                indicadorJodador2_Posicao0.setText("" + temp);
            }
            if (i == 1) {
                indicadorJodador2_Posicao1.setText("" + temp);
            }
            if (i == 2) {
                indicadorJodador2_Posicao2.setText("" + temp);
            }
            if (i == 3) {
                indicadorJodador2_Posicao3.setText("" + temp);
            }
            if (i == 4) {
                indicadorJodador2_Posicao4.setText("" + temp);
            }
            if (i == 5) {
                indicadorJodador2_Posicao5.setText("" + temp);
            }
            if (i == 6) {
                indicadorJodador2_Posicao6.setText("" + temp);
            }
            if (i == 7) {
                indicadorJodador2_Posicao7.setText("" + temp);
            }
            if (i == 8) {
                indicadorJodador2_Posicao8.setText("" + temp);
            }
            if (i == 9) {
                indicadorJodador2_Posicao9.setText("" + temp);
            }
            if (i == 10) {
                indicadorJodador2_Posicao10.setText("" + temp);
            }
            if (i == 11) {
                indicadorJodador2_Posicao11.setText("" + temp);
            }
            if (i == 12) {
                indicadorJodador2_Posicao12.setText("" + temp);
            }
            if (i == 13) {
                indicadorJodador2_Posicao13.setText("" + temp);
            }
            if (i == 14) {
                indicadorJodador2_Posicao14.setText("" + temp);
            }
            if (i == 15) {
                indicadorJodador2_Posicao15.setText("" + temp);
            }
            if (i == 16) {
                indicadorJodador2_Posicao16.setText("" + temp);
            }
            if (i == 17) {
                indicadorJodador2_Posicao17.setText("" + temp);
            }
            if (i == 18) {
                indicadorJodador2_Posicao18.setText("" + temp);
            }
            if (i == 19) {
                indicadorJodador2_Posicao19.setText("" + temp);
            }
        }
    }
    
    //Atualiza posição do jogador 3 na insterface gráfica
    private void atualizaTabuleiroJogador3(){
        String temp;
        for (int i = 0; i < tabuleiro.getTamanho(); i++) {
            if (tabuleiro.getPosicoesJogadoresTabuleiro(3, i).equals("" + 3)){
               temp = "3";
            } else {
               temp = " ";
            }
            
            if (i == 0) {
                indicadorJodador3_Posicao0.setText("" + temp);
            }
            if (i == 1) {
                indicadorJodador3_Posicao1.setText("" + temp);
            }
            if (i == 2) {
                indicadorJodador3_Posicao2.setText("" + temp);
            }
            if (i == 3) {
                indicadorJodador3_Posicao3.setText("" + temp);
            }
            if (i == 4) {
                indicadorJodador3_Posicao4.setText("" + temp);
            }
            if (i == 5) {
                indicadorJodador3_Posicao5.setText("" + temp);
            }
            if (i == 6) {
                indicadorJodador3_Posicao6.setText("" + temp);
            }
            if (i == 7) {
                indicadorJodador3_Posicao7.setText("" + temp);
            }
            if (i == 8) {
                indicadorJodador3_Posicao8.setText("" + temp);
            }
            if (i == 9) {
                indicadorJodador3_Posicao9.setText("" + temp);
            }
            if (i == 10) {
                indicadorJodador3_Posicao10.setText("" + temp);
            }
            if (i == 11) {
                indicadorJodador3_Posicao11.setText("" + temp);
            }
            if (i == 12) {
                indicadorJodador3_Posicao12.setText("" + temp);
            }
            if (i == 13) {
                indicadorJodador3_Posicao13.setText("" + temp);
            }
            if (i == 14) {
                indicadorJodador3_Posicao14.setText("" + temp);
            }
            if (i == 15) {
                indicadorJodador3_Posicao15.setText("" + temp);
            }
            if (i == 16) {
                indicadorJodador3_Posicao16.setText("" + temp);
            }
            if (i == 17) {
                indicadorJodador3_Posicao17.setText("" + temp);
            }
            if (i == 18) {
                indicadorJodador3_Posicao18.setText("" + temp);
            }
            if (i == 19) {
                indicadorJodador3_Posicao19.setText("" + temp);
            }
        }
    }
    
    //Atualiza posição do jogador 4 na insterface gráfica
    private void atualizaTabuleiroJogador4(){
        String temp;
        for (int i = 0; i < tabuleiro.getTamanho(); i++) {
            if (tabuleiro.getPosicoesJogadoresTabuleiro(4, i).equals("" + 4)){
               temp = "4";
            } else{
               temp = " ";
            }
            
            if (i == 0) {
                indicadorJodador4_Posicao0.setText("" + temp);
            }
            if (i == 1) {
                indicadorJodador4_Posicao1.setText("" + temp);
            }
            if (i == 2) {
                indicadorJodador4_Posicao2.setText("" + temp);
            }
            if (i == 3) {
                indicadorJodador4_Posicao3.setText("" + temp);
            }
            if (i == 4) {
                indicadorJodador4_Posicao4.setText("" + temp);
            }
            if (i == 5) {
                indicadorJodador4_Posicao5.setText("" + temp);
            }
            if (i == 6) {
                indicadorJodador4_Posicao6.setText("" + temp);
            }
            if (i == 7) {
                indicadorJodador4_Posicao7.setText("" + temp);
            }
            if (i == 8) {
                indicadorJodador4_Posicao8.setText("" + temp);
            }
            if (i == 9) {
                indicadorJodador4_Posicao9.setText("" + temp);
            }
            if (i == 10) {
                indicadorJodador4_Posicao10.setText("" + temp);
            }
            if (i == 11) {
                indicadorJodador4_Posicao11.setText("" + temp);
            }
            if (i == 12) {
                indicadorJodador4_Posicao12.setText("" + temp);
            }
            if (i == 13) {
                indicadorJodador4_Posicao13.setText("" + temp);
            }
            if (i == 14) {
                indicadorJodador4_Posicao14.setText("" + temp);
            }
            if (i == 15) {
                indicadorJodador4_Posicao15.setText("" + temp);
            }
            if (i == 16) {
                indicadorJodador4_Posicao16.setText("" + temp);
            }
            if (i == 17) {
                indicadorJodador4_Posicao17.setText("" + temp);
            }
            if (i == 18) {
                indicadorJodador4_Posicao18.setText("" + temp);
            }
            if (i == 19) {
                indicadorJodador4_Posicao19.setText("" + temp);
            }
        }
    }
    
    //Atualiza PowerUp do jogador na insterface gráfica
    private void atualizaPowerUp(){
        mostraPowerups.removeAllItems();
        mostraPowerups.addItem("Item Passivo: " + jogadores.get(jogadorAtual - 1).getNomeItemPassivo());
        mostraPowerups.addItem("Item Instantaneo: " + jogadores.get(jogadorAtual - 1).getNomeItemInstantaneo());
    }
    
    //Verifica qual é o próximo jogador da rodada
    private void atualizaProximoJogador(){
        if (jogadorAtual < numJogadores){
            jogadorAtual++;
        } else{
            jogadorAtual = 1;
        }
        vezJogador.setText(""+jogadorAtual);
    }
    
    //Quando é tirado número 4 ou 5 no dado(explosão)
    private void explosão(){
        explosao.setVisible(true);  //coloca figura da explosao
        
        //Escolhe aleatoriamente um lado do tabuleiro para explodir
        Random random = new Random();
        int lado = random.nextInt(4) + 1;   //Pode ser um número de 1 a 4
        
        if(lado == 1){
            tabuleiro.setPosicaoTabuleiro(1, "_");
            tabuleiro.setPosicaoTabuleiro(2, "_");
            tabuleiro.setPosicaoTabuleiro(3, "_");
            tabuleiro.setPosicaoTabuleiro(4, "_");
            VerificaSeExisteJogadorNaPonte(1, 4);
        } else if(lado == 2){
            tabuleiro.setPosicaoTabuleiro(6, "_");
            tabuleiro.setPosicaoTabuleiro(7, "_");
            tabuleiro.setPosicaoTabuleiro(8, "_");
            tabuleiro.setPosicaoTabuleiro(9, "_");
            VerificaSeExisteJogadorNaPonte(6, 9);
        } else if(lado == 3){
            tabuleiro.setPosicaoTabuleiro(11, "_");
            tabuleiro.setPosicaoTabuleiro(12, "_");
            tabuleiro.setPosicaoTabuleiro(13, "_");
            tabuleiro.setPosicaoTabuleiro(14, "_");
            VerificaSeExisteJogadorNaPonte(11, 14);
        } else{
            tabuleiro.setPosicaoTabuleiro(16, "_");
            tabuleiro.setPosicaoTabuleiro(17, "_");
            tabuleiro.setPosicaoTabuleiro(18, "_");
            tabuleiro.setPosicaoTabuleiro(19, "_");
            VerificaSeExisteJogadorNaPonte(16, 19);
        }
        
        atualizaTabuleiro();
    }
    
    //Caso exista um jogador na ponte coloca na torre mais anterior a ele
    private void VerificaSeExisteJogadorNaPonte(int inicio, int fim){
        for (int i = inicio; i <= fim; i++) {
            if (tabuleiro.getPosicoesJogadoresTabuleiro(1, i).equals("" + 1)){  //Testa para saber se existe jogador na ponte
                if (jogadores.get(0).getNomeItemPassivo().equals("Asas de Icaro")){ //Testa para saber o jogador possui asas de ícaro
                    tabuleiro.setPosicaoJogador(1, i, " "); 
                    if (fim == 19){ //Testa se é a última ponte
                        tabuleiro.setPosicaoJogador(1, 0, "" + 1); // Vai para torre seguinte
                        jogadores.get(0).setPosicaoAtual(0); 
                    } else {
                        tabuleiro.setPosicaoJogador(1, fim + 1, "" + 1); // Vai para torre seguinte
                        jogadores.get(0).setPosicaoAtual(fim + 1); 
                    }
                    
                    //Tira Asas de ícaro do inventário do jogador
                    jogadores.get(0).retiraItemPassivo();
                    atualizaPowerUp();
                    logJogo.append("Jogador 1: estava na ponte explodida, mas o jogador tinha o item asas de ícaro e voou para próxima torre \n");
                } else {    // Volta para torre anterior 
                    tabuleiro.setPosicaoJogador(1, i, " ");
                    tabuleiro.setPosicaoJogador(1, inicio - 1, "" + 1);
                    jogadores.get(0).setPosicaoAtual(inicio - 1); 
                }
                
            } else if (tabuleiro.getPosicoesJogadoresTabuleiro(2, i).equals("" + 2)){
                if (jogadores.get(1).getNomeItemPassivo().equals("Asas de Icaro")){
                    tabuleiro.setPosicaoJogador(2, i, " ");
                    if (fim == 19){
                        tabuleiro.setPosicaoJogador(2, 0, "" + 2);
                        jogadores.get(1).setPosicaoAtual(0);
                    } else {
                        tabuleiro.setPosicaoJogador(2, fim + 1, "" + 2);
                        jogadores.get(1).setPosicaoAtual(fim + 1);
                    }
                    
                    //Tira Asas de ícaro do inventário do jogador
                    jogadores.get(1).retiraItemPassivo();
                    atualizaPowerUp();
                    logJogo.append("Jogador 2: estava na ponte explodida, mas o jogador tinha o item asas de ícaro e voou para próxima torre \n");
                } else {
                    tabuleiro.setPosicaoJogador(2, i, " ");
                    tabuleiro.setPosicaoJogador(2, inicio - 1, "" + 2);
                    jogadores.get(1).setPosicaoAtual(inicio - 1); 
                }
                
            } else if (tabuleiro.getPosicoesJogadoresTabuleiro(3, i).equals("" + 3)){
                if (jogadores.get(2).getNomeItemPassivo().equals("Asas de Icaro")){
                    tabuleiro.setPosicaoJogador(3, i, " ");
                    if (fim == 19){
                        tabuleiro.setPosicaoJogador(3, 0, "" + 3);
                        jogadores.get(2).setPosicaoAtual(0); 
                    } else {
                        tabuleiro.setPosicaoJogador(3, fim + 1, "" + 3);
                        jogadores.get(2).setPosicaoAtual(fim + 1); 
                    }
                    
                    //Tira Asas de ícaro do inventário do jogador
                    jogadores.get(2).retiraItemPassivo();
                    atualizaPowerUp();
                    logJogo.append("Jogador 3: estava na ponte explodida, mas o jogador tinha o item asas de ícaro e voou para próxima torre \n");
                } else {
                    tabuleiro.setPosicaoJogador(3, i, " ");
                    tabuleiro.setPosicaoJogador(3, inicio - 1, "" + 3);
                    jogadores.get(2).setPosicaoAtual(inicio - 1);
                }
                
            } else if (tabuleiro.getPosicoesJogadoresTabuleiro(4, i).equals("" + 4)){
                if (jogadores.get(3).getNomeItemPassivo().equals("Asas de Icaro")){
                    tabuleiro.setPosicaoJogador(4, i, " ");
                    if (fim == 19){
                        tabuleiro.setPosicaoJogador(4, 0, "" + 4);
                        jogadores.get(3).setPosicaoAtual(0); 
                    } else {
                        tabuleiro.setPosicaoJogador(4, fim + 1, "" + 4);
                        jogadores.get(3).setPosicaoAtual(fim + 1); 
                    }
                    
                    //Tira Asas de ícaro do inventário do jogador
                    jogadores.get(3).retiraItemPassivo();
                    atualizaPowerUp();
                    logJogo.append("Jogador 4: estava na ponte explodida, mas o jogador tinha o item asas de ícaro e voou para próxima torre \n");
                } else {
                    tabuleiro.setPosicaoJogador(4, i, " ");
                    tabuleiro.setPosicaoJogador(4, inicio - 1, "" + 4);
                    jogadores.get(3).setPosicaoAtual(inicio - 1); 
                }
            }
        }
    }
    
    //Gera um PowerUp aleatório
    private int geraPowerUp(){
        Random random = new Random();
        int codigo = random.nextInt(6) + 1;
        String nomePowerUp = jogadores.get(jogadorAtual - 1).criaItem(codigo, numJogadores);
        atualizaPowerUp();
        JOptionPane.showMessageDialog(null, jogadores.get(jogadorAtual - 1).toString() + ": você ganhou um item \n\t--- " + nomePowerUp + " ---");
        return codigo;
    }
    
    
    //Verifica se existe algum jogador que possui o item sabotar 
    private int verificaSabotar(){
        for (int i = 0; i < numJogadores; i++) {
            if (jogadores.get(i).getNomeItemInstantaneo().equals("Sabotar")) {
                if (jogadores.get(i) != jogadores.get(jogadorAtual - 1)){ //Jogador não sabota a si mesmo
                    return (i + 1);
                }
            }
        }
        return -1;
    }
    
    //Verifica se existe algum jogador que possui o item Imobilizar e se o jogador imobilizado é o jogador atual 
    private int verificaImobilizar(){
        for (int i = 0; i < numJogadores; i++) {
            if (jogadores.get(i).getNomeItemInstantaneo().equals("Imobilizar") && jogadores.get(i).testaItemInstantaneo_Imobilizar() != null){
                if (jogadores.get(i).testaItemInstantaneo_Imobilizar().getImobilizarJogador() == jogadorAtual) {
                    return (i + 1);
                }
            }
        }
        return -1;
    }
    
    
    //verifica se o jogador pode empurrar alguem do tabuleiro
    private void empurraJogador(int novaPosicao){
        if (verificaEmpurrar(jogadores.get(jogadorAtual - 1).getPosicaoAtual(), novaPosicao) && jogadores.get(jogadorAtual - 1).getNomeItemPassivo().equals("Empurrar")){
            int [] pessoasParaEmpurrar = escolheEmpurrar(jogadores.get(jogadorAtual - 1).getPosicaoAtual(), novaPosicao);
            String temNomes = "";
            
            if (pessoasParaEmpurrar.length == 1) { //Se tiver apenas um jogador para empurrar faz direto 
                if (jogadores.get(pessoasParaEmpurrar[0] - 1).getNomeItemPassivo().equals("Escudo")){    // verifica se o jogador possui escudo
                    jogadores.get(pessoasParaEmpurrar[0] - 1).retiraItemPassivo();
                    logJogo.append("Jogador " + jogadorAtual + " empurrou jogador "+ pessoasParaEmpurrar[0] +", mas o jogador usou seu escudo \n");
                 } else {
                    //Empurra o jogador uma posição para trás
                    tabuleiro.setPosicaoJogador(pessoasParaEmpurrar[0], jogadores.get(pessoasParaEmpurrar[0] - 1).getPosicaoAtual(), " ");
                    tabuleiro.setPosicaoJogador(pessoasParaEmpurrar[0], jogadores.get(pessoasParaEmpurrar[0] - 1).getPosicaoAtual() - 1, "" + pessoasParaEmpurrar[0]);

                    //Tira empurrar do inventário do jogador
                    jogadores.get(jogadorAtual - 1).retiraItemPassivo();
                    logJogo.append("Jogador " + jogadorAtual + " empurrou jogador " + pessoasParaEmpurrar[0] + "\n");
                }
                
            } else { //Se tiver mais um jogador para empurrar pergunta para o usuário qual jogador quer empurrar
                for (int i = 0; i < pessoasParaEmpurrar.length; i++) {
                        temNomes = temNomes + "" + pessoasParaEmpurrar[i] + ", ";
                }

                // controle de erro: jogador empurrado deve estar na ponte e o número digitado deve estar correto
                 int jogadorEmpurrado = 0;
                 do { 
                     String tempjogadorEmpurrado = JOptionPane.showInputDialog("Jogador "+ jogadorAtual +", digite o jogador que voce deseja empurrar: ", temNomes);
                     while (tempjogadorEmpurrado == null) { //Não deixa clicar no botão cancelar
                         tempjogadorEmpurrado = JOptionPane.showInputDialog("Jogador "+ jogadorAtual +", digite o jogador que voce deseja empurrar: ", temNomes);
                     }

                     try {
                         jogadorEmpurrado = Integer.valueOf(tempjogadorEmpurrado);
                     } catch (NumberFormatException e) {
                         jogadorEmpurrado = -1;
                     }
                 } while (verificaSejogadorEstaNaponte_Empurrar(pessoasParaEmpurrar, jogadorEmpurrado) == false);
                 
                 if (jogadores.get(jogadorEmpurrado - 1).getNomeItemPassivo().equals("Escudo")){    // verifica se o jogador possui escudo
                    jogadores.get(jogadorEmpurrado - 1).retiraItemPassivo();
                    logJogo.append("Jogador " + jogadorAtual + " empurrou jogador "+ jogadorEmpurrado +", mas o jogador usou seu escudo \n");
                 } else {
                    //Empurra o jogador digitado uma posição para trás
                    tabuleiro.setPosicaoJogador(jogadorEmpurrado, jogadores.get(jogadorEmpurrado - 1).getPosicaoAtual(), " ");
                    tabuleiro.setPosicaoJogador(jogadorEmpurrado, jogadores.get(jogadorEmpurrado - 1).getPosicaoAtual() - 1, "" + jogadorEmpurrado);

                    //Tira empurrar do inventário do jogador
                    jogadores.get(jogadorAtual - 1).retiraItemPassivo();
                    logJogo.append("Jogador " + jogadorAtual + " empurrou jogador " + jogadorEmpurrado + "\n");
                 } 
            }
        }
    }
    
    //Verifica se o jogador digitado é um jogador que pode ser empurrado
    private boolean verificaEmpurrar(int posicaoAntes, int novaPosicao){
        boolean jogadoresParaEmpurrar = false;
        
        for (int k = posicaoAntes; k <= novaPosicao; k++){ // percorre tabuleiro procurando jogador  
            for (int i = 0; i < numJogadores; i++){ // testa se existe algum jogador na ponte  
                if (!(tabuleiro.getPosicoesJogadoresTabuleiro(i + 1, k).equals(" ")) && i + 1 != jogadorAtual){
                    jogadoresParaEmpurrar = true;
                }
            }
        }
        return jogadoresParaEmpurrar;
    }
    
    //Busca pelos jogadores que o jogador atual passou na rodada e coloca em um vetor
    private int [] escolheEmpurrar(int posicaoAntes, int novaPosicao){
        boolean [] jogadoresParaEmpurrar = new boolean[numJogadores];
        int quantidade = 0;
        
         for (int k = posicaoAntes; k <= novaPosicao; k++){ // percorre tabuleiro procurando jogador  
            for (int i = 0; i < numJogadores; i++){ // testa se existe algum jogador na mesma ponte  
                if (!(tabuleiro.getPosicoesJogadoresTabuleiro(i + 1, k).equals(" ")) && i + 1 != jogadorAtual){
                    jogadoresParaEmpurrar[i] = true;
                    quantidade++;
                }
            }
        }
         
        int [] jogadores = new int[quantidade];
        int j = 0;
        for (int i = 0; i < numJogadores; i++){
            if (jogadoresParaEmpurrar[i]){
                jogadores[j] = i + 1;
                j++;
            } 
        }
        
        return jogadores;
    }
    
    //Verifica se o jogador escolhido está mesmo na ponte
    private boolean verificaSejogadorEstaNaponte_Empurrar(int []vetJogadores, int jogadorRemovido){
        if (jogadorRemovido < 0){
            return false;
        }
        for (int i = 0; i < vetJogadores.length; i++){
             if (jogadorRemovido == vetJogadores[i]){
                 return true;
             }
        }
        return false;
    }
    
    // Testa se algum jogador ganhou o jogo
    private void ganhou(int codigoGanhou){
        if (codigoGanhou == -999){
            botaoRodarDado.setEnabled(false);
            logJogo.append("Jogador " + jogadorAtual + " Ganhou o jogo ");
            logJogo.append("\n----------------------\n FIM DE JOGO");
            atualizaTabuleiro();  
            atualizaPowerUp();
            JOptionPane.showMessageDialog(null,"Jogador "+ jogadorAtual + " GANHOU!!!");
            System.exit(0);
        }
    }
    
    private void testesDaRodada(){
        dado.rolar();
        numeroSorteadoDado.setText(dado.toString()); //Mostra o número sorteado na interface gráfica
        if(dado.getValor() == 6){   // É um powerup
            logJogo.append("Jogador " + jogadorAtual + " ganhou um powerup \n");
            int powerUp = geraPowerUp();
            if (powerUp == 5){  //Velocidade
                dado.rolar(3);  //Rola o dado novamente e um número que esteja entre 1 e 3 é sorteado e depois duplica o valor
                int novaPosicao = tabuleiro.setPosicaoTabuleiro(jogadores.get(jogadorAtual - 1).getPosicaoAtual(), jogadores.get(jogadorAtual - 1).getposicaoInicial(), dado.getValor() * 2 , jogadorAtual);
                
                ganhou(novaPosicao); // verifica se algum jogador já ganhou
                
                jogadores.get(jogadorAtual - 1).setPosicaoAtual(novaPosicao);

                //Tira velocidade do inventário do jogador
                jogadores.get(jogadorAtual - 1).retiraItemInstantaneo();
                atualizaPowerUp();

                logJogo.append("Jogador " + jogadorAtual + " construiu " + dado.getValor()*2 + " pontes\n");
            } 

        } else if(dado.getValor() >= 1 && dado.getValor() <= 3){ //É um número
           int novaPosicao = tabuleiro.setPosicaoTabuleiro(jogadores.get(jogadorAtual - 1).getPosicaoAtual(), jogadores.get(jogadorAtual - 1).getposicaoInicial(), dado.getValor(), jogadorAtual);
           
           ganhou(novaPosicao); // verifica se algum jogador já ganhou
           
           empurraJogador(novaPosicao);
           jogadores.get(jogadorAtual - 1).setPosicaoAtual(novaPosicao); 
           logJogo.append("Jogador " + jogadorAtual + " construiu " + dado + " pontes\n");
           
        } else if(dado.getValor() == 4 || dado.getValor() == 5){ //É uma explosão
            logJogo.append("Jogador " + jogadorAtual + " tirou uma explosão \n");
            int temp = verificaSabotar();
            if(temp > 0){
                //Tira sabotar do inventário do jogador
                jogadores.get(temp - 1).retiraItemInstantaneo();
                if (jogadores.get(jogadorAtual - 1).getNomeItemPassivo().equals("Escudo")){    // verifica se o jogador possui escudo
                    jogadores.get(jogadorAtual - 1).retiraItemPassivo();
                    logJogo.append("Jogador " + temp + " sabotou a explosão do jogador "+jogadorAtual+", mas o jogador usou seu escudo \n");
                    explosão(); //Explode um lado do tabuleiro
                } else{ 
                    logJogo.append("Jogador " + temp + " sabotou a explosão \n");
                }
                atualizaPowerUp();
            } else { //Explode um lado do tabuleiro
                explosão();
            }
        } 
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFundo = new javax.swing.JPanel();
        painelFundoJogo = new javax.swing.JPanel();
        torre5 = new javax.swing.JPanel();
        indicadorJodador2_Posicao5 = new javax.swing.JLabel();
        indicadorJodador3_Posicao5 = new javax.swing.JLabel();
        indicadorJodador1_Posicao5 = new javax.swing.JLabel();
        indicadorJodador4_Posicao5 = new javax.swing.JLabel();
        ponte6 = new javax.swing.JPanel();
        indicadorJodador2_Posicao6 = new javax.swing.JLabel();
        indicadorJodador3_Posicao6 = new javax.swing.JLabel();
        indicadorJodador1_Posicao6 = new javax.swing.JLabel();
        indicadorJodador4_Posicao6 = new javax.swing.JLabel();
        ponte7 = new javax.swing.JPanel();
        indicadorJodador2_Posicao7 = new javax.swing.JLabel();
        indicadorJodador3_Posicao7 = new javax.swing.JLabel();
        indicadorJodador1_Posicao7 = new javax.swing.JLabel();
        indicadorJodador4_Posicao7 = new javax.swing.JLabel();
        ponte8 = new javax.swing.JPanel();
        indicadorJodador2_Posicao8 = new javax.swing.JLabel();
        indicadorJodador3_Posicao8 = new javax.swing.JLabel();
        indicadorJodador1_Posicao8 = new javax.swing.JLabel();
        indicadorJodador4_Posicao8 = new javax.swing.JLabel();
        ponte9 = new javax.swing.JPanel();
        indicadorJodador2_Posicao9 = new javax.swing.JLabel();
        indicadorJodador3_Posicao9 = new javax.swing.JLabel();
        indicadorJodador1_Posicao9 = new javax.swing.JLabel();
        indicadorJodador4_Posicao9 = new javax.swing.JLabel();
        torre10 = new javax.swing.JPanel();
        indicadorJodador2_Posicao10 = new javax.swing.JLabel();
        indicadorJodador3_Posicao10 = new javax.swing.JLabel();
        indicadorJodador1_Posicao10 = new javax.swing.JLabel();
        indicadorJodador4_Posicao10 = new javax.swing.JLabel();
        torre0 = new javax.swing.JPanel();
        indicadorJodador1_Posicao0 = new javax.swing.JLabel();
        indicadorJodador3_Posicao0 = new javax.swing.JLabel();
        indicadorJodador2_Posicao0 = new javax.swing.JLabel();
        indicadorJodador4_Posicao0 = new javax.swing.JLabel();
        ponte19 = new javax.swing.JPanel();
        indicadorJodador2_Posicao19 = new javax.swing.JLabel();
        indicadorJodador3_Posicao19 = new javax.swing.JLabel();
        indicadorJodador1_Posicao19 = new javax.swing.JLabel();
        indicadorJodador4_Posicao19 = new javax.swing.JLabel();
        ponte18 = new javax.swing.JPanel();
        indicadorposicao18 = new javax.swing.JLabel();
        indicadorJodador2_Posicao18 = new javax.swing.JLabel();
        indicadorJodador3_Posicao18 = new javax.swing.JLabel();
        indicadorJodador1_Posicao18 = new javax.swing.JLabel();
        indicadorJodador4_Posicao18 = new javax.swing.JLabel();
        ponte17 = new javax.swing.JPanel();
        indicadorJodador2_Posicao17 = new javax.swing.JLabel();
        indicadorJodador3_Posicao17 = new javax.swing.JLabel();
        indicadorJodador1_Posicao17 = new javax.swing.JLabel();
        indicadorJodador4_Posicao17 = new javax.swing.JLabel();
        ponte16 = new javax.swing.JPanel();
        indicadorposicao16 = new javax.swing.JLabel();
        indicadorJodador2_Posicao16 = new javax.swing.JLabel();
        indicadorJodador3_Posicao16 = new javax.swing.JLabel();
        indicadorJodador1_Posicao16 = new javax.swing.JLabel();
        indicadorJodador4_Posicao16 = new javax.swing.JLabel();
        ponte1 = new javax.swing.JPanel();
        indicadorJodador2_Posicao1 = new javax.swing.JLabel();
        indicadorJodador3_Posicao1 = new javax.swing.JLabel();
        indicadorJodador1_Posicao1 = new javax.swing.JLabel();
        indicadorJodador4_Posicao1 = new javax.swing.JLabel();
        ponte3 = new javax.swing.JPanel();
        indicadorJodador2_Posicao3 = new javax.swing.JLabel();
        indicadorJodador3_Posicao3 = new javax.swing.JLabel();
        indicadorJodador1_Posicao3 = new javax.swing.JLabel();
        indicadorJodador4_Posicao3 = new javax.swing.JLabel();
        ponte4 = new javax.swing.JPanel();
        indicadorJodador2_Posicao4 = new javax.swing.JLabel();
        indicadorJodador3_Posicao4 = new javax.swing.JLabel();
        indicadorJodador1_Posicao4 = new javax.swing.JLabel();
        indicadorJodador4_Posicao4 = new javax.swing.JLabel();
        torre15 = new javax.swing.JPanel();
        indicadorJodador2_Posicao15 = new javax.swing.JLabel();
        indicadorJodador3_Posicao15 = new javax.swing.JLabel();
        indicadorJodador1_Posicao15 = new javax.swing.JLabel();
        indicadorJodador4_Posicao15 = new javax.swing.JLabel();
        ponte14 = new javax.swing.JPanel();
        indicadorJodador2_Posicao14 = new javax.swing.JLabel();
        indicadorJodador3_Posicao14 = new javax.swing.JLabel();
        indicadorJodador1_Posicao14 = new javax.swing.JLabel();
        indicadorJodador4_Posicao14 = new javax.swing.JLabel();
        ponte13 = new javax.swing.JPanel();
        indicadorJodador2_Posicao13 = new javax.swing.JLabel();
        indicadorJodador3_Posicao13 = new javax.swing.JLabel();
        indicadorJodador1_Posicao13 = new javax.swing.JLabel();
        indicadorJodador4_Posicao13 = new javax.swing.JLabel();
        ponte12 = new javax.swing.JPanel();
        indicadorJodador2_Posicao12 = new javax.swing.JLabel();
        indicadorJodador3_Posicao12 = new javax.swing.JLabel();
        indicadorJodador1_Posicao12 = new javax.swing.JLabel();
        indicadorJodador4_Posicao12 = new javax.swing.JLabel();
        ponte11 = new javax.swing.JPanel();
        indicadorJodador2_Posicao11 = new javax.swing.JLabel();
        indicadorJodador3_Posicao11 = new javax.swing.JLabel();
        indicadorJodador1_Posicao11 = new javax.swing.JLabel();
        indicadorJodador4_Posicao11 = new javax.swing.JLabel();
        ponte2 = new javax.swing.JPanel();
        indicadorJodador2_Posicao2 = new javax.swing.JLabel();
        indicadorJodador3_Posicao2 = new javax.swing.JLabel();
        indicadorJodador1_Posicao2 = new javax.swing.JLabel();
        indicadorJodador4_Posicao2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        explosao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        botaoRodarDado = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        numeroSorteadoDado = new javax.swing.JLabel();
        nomedado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mostraPowerups = new javax.swing.JComboBox<>();
        vezJogador = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        logJogo = new javax.swing.JTextArea();
        vezJogador1 = new javax.swing.JLabel();
        nomeJogadorAtual = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo Da Explosão");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1270, 670));
        setMinimumSize(new java.awt.Dimension(1270, 670));
        setPreferredSize(new java.awt.Dimension(1270, 670));

        painelFundo.setBackground(new java.awt.Color(255, 255, 255));
        painelFundo.setFont(new java.awt.Font("Goudy Stout", 0, 12)); // NOI18N
        painelFundo.setMaximumSize(new java.awt.Dimension(1270, 670));
        painelFundo.setMinimumSize(new java.awt.Dimension(1270, 670));
        painelFundo.setPreferredSize(new java.awt.Dimension(1270, 670));
        painelFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelFundoJogo.setBackground(new java.awt.Color(255, 0, 51));
        painelFundoJogo.setMaximumSize(new java.awt.Dimension(660, 660));
        painelFundoJogo.setMinimumSize(new java.awt.Dimension(660, 660));
        painelFundoJogo.setPreferredSize(new java.awt.Dimension(660, 660));
        painelFundoJogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        torre5.setBackground(new java.awt.Color(153, 153, 153));
        torre5.setPreferredSize(new java.awt.Dimension(150, 150));

        indicadorJodador2_Posicao5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador2_Posicao5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador2_Posicao5.setText("2");

        indicadorJodador3_Posicao5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador3_Posicao5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador3_Posicao5.setText("3");

        indicadorJodador1_Posicao5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador1_Posicao5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador1_Posicao5.setText("1");

        indicadorJodador4_Posicao5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador4_Posicao5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador4_Posicao5.setText("4");

        javax.swing.GroupLayout torre5Layout = new javax.swing.GroupLayout(torre5);
        torre5.setLayout(torre5Layout);
        torre5Layout.setHorizontalGroup(
            torre5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(torre5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(torre5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, torre5Layout.createSequentialGroup()
                        .addComponent(indicadorJodador1_Posicao5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(indicadorJodador2_Posicao5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, torre5Layout.createSequentialGroup()
                        .addComponent(indicadorJodador4_Posicao5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(indicadorJodador3_Posicao5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        torre5Layout.setVerticalGroup(
            torre5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(torre5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(torre5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador2_Posicao5)
                    .addComponent(indicadorJodador1_Posicao5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(torre5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador3_Posicao5)
                    .addComponent(indicadorJodador4_Posicao5))
                .addContainerGap())
        );

        painelFundoJogo.add(torre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 6, 96, 91));

        ponte6.setBackground(new java.awt.Color(255, 255, 0));
        ponte6.setPreferredSize(new java.awt.Dimension(150, 150));

        indicadorJodador2_Posicao6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador2_Posicao6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador2_Posicao6.setText("2");

        indicadorJodador3_Posicao6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador3_Posicao6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador3_Posicao6.setText("3");

        indicadorJodador1_Posicao6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador1_Posicao6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador1_Posicao6.setText("1");

        indicadorJodador4_Posicao6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador4_Posicao6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador4_Posicao6.setText("4");

        javax.swing.GroupLayout ponte6Layout = new javax.swing.GroupLayout(ponte6);
        ponte6.setLayout(ponte6Layout);
        ponte6Layout.setHorizontalGroup(
            ponte6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ponte6Layout.createSequentialGroup()
                        .addComponent(indicadorJodador1_Posicao6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(indicadorJodador2_Posicao6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ponte6Layout.createSequentialGroup()
                        .addComponent(indicadorJodador4_Posicao6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(indicadorJodador3_Posicao6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ponte6Layout.setVerticalGroup(
            ponte6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador2_Posicao6)
                    .addComponent(indicadorJodador1_Posicao6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ponte6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador3_Posicao6)
                    .addComponent(indicadorJodador4_Posicao6))
                .addContainerGap())
        );

        painelFundoJogo.add(ponte6, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 109, 96, 91));

        ponte7.setBackground(new java.awt.Color(255, 255, 0));
        ponte7.setPreferredSize(new java.awt.Dimension(150, 150));

        indicadorJodador2_Posicao7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador2_Posicao7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador2_Posicao7.setText("2");

        indicadorJodador3_Posicao7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador3_Posicao7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador3_Posicao7.setText("3");

        indicadorJodador1_Posicao7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador1_Posicao7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador1_Posicao7.setText("1");

        indicadorJodador4_Posicao7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador4_Posicao7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador4_Posicao7.setText("4");

        javax.swing.GroupLayout ponte7Layout = new javax.swing.GroupLayout(ponte7);
        ponte7.setLayout(ponte7Layout);
        ponte7Layout.setHorizontalGroup(
            ponte7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ponte7Layout.createSequentialGroup()
                        .addComponent(indicadorJodador1_Posicao7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(indicadorJodador2_Posicao7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ponte7Layout.createSequentialGroup()
                        .addComponent(indicadorJodador4_Posicao7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(indicadorJodador3_Posicao7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ponte7Layout.setVerticalGroup(
            ponte7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador2_Posicao7)
                    .addComponent(indicadorJodador1_Posicao7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ponte7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador3_Posicao7)
                    .addComponent(indicadorJodador4_Posicao7))
                .addContainerGap())
        );

        painelFundoJogo.add(ponte7, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 212, 96, 91));

        ponte8.setPreferredSize(new java.awt.Dimension(150, 150));

        indicadorJodador2_Posicao8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador2_Posicao8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador2_Posicao8.setText("2");

        indicadorJodador3_Posicao8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador3_Posicao8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador3_Posicao8.setText("3");

        indicadorJodador1_Posicao8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador1_Posicao8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador1_Posicao8.setText("1");

        indicadorJodador4_Posicao8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador4_Posicao8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador4_Posicao8.setText("4");

        javax.swing.GroupLayout ponte8Layout = new javax.swing.GroupLayout(ponte8);
        ponte8.setLayout(ponte8Layout);
        ponte8Layout.setHorizontalGroup(
            ponte8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ponte8Layout.createSequentialGroup()
                        .addComponent(indicadorJodador1_Posicao8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(indicadorJodador2_Posicao8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ponte8Layout.createSequentialGroup()
                        .addComponent(indicadorJodador4_Posicao8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(indicadorJodador3_Posicao8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ponte8Layout.setVerticalGroup(
            ponte8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador2_Posicao8)
                    .addComponent(indicadorJodador1_Posicao8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ponte8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador3_Posicao8)
                    .addComponent(indicadorJodador4_Posicao8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelFundoJogo.add(ponte8, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 315, 96, 91));

        ponte9.setPreferredSize(new java.awt.Dimension(150, 150));

        indicadorJodador2_Posicao9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador2_Posicao9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador2_Posicao9.setText("2");

        indicadorJodador3_Posicao9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador3_Posicao9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador3_Posicao9.setText("3");

        indicadorJodador1_Posicao9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador1_Posicao9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador1_Posicao9.setText("1");

        indicadorJodador4_Posicao9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador4_Posicao9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador4_Posicao9.setText("4");

        javax.swing.GroupLayout ponte9Layout = new javax.swing.GroupLayout(ponte9);
        ponte9.setLayout(ponte9Layout);
        ponte9Layout.setHorizontalGroup(
            ponte9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ponte9Layout.createSequentialGroup()
                        .addComponent(indicadorJodador1_Posicao9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(indicadorJodador2_Posicao9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ponte9Layout.createSequentialGroup()
                        .addComponent(indicadorJodador4_Posicao9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(indicadorJodador3_Posicao9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ponte9Layout.setVerticalGroup(
            ponte9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador2_Posicao9)
                    .addComponent(indicadorJodador1_Posicao9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ponte9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador3_Posicao9)
                    .addComponent(indicadorJodador4_Posicao9))
                .addContainerGap())
        );

        painelFundoJogo.add(ponte9, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 418, 96, 91));

        torre10.setBackground(new java.awt.Color(153, 153, 153));
        torre10.setPreferredSize(new java.awt.Dimension(150, 150));

        indicadorJodador2_Posicao10.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador2_Posicao10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador2_Posicao10.setText("2");

        indicadorJodador3_Posicao10.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador3_Posicao10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador3_Posicao10.setText("3");

        indicadorJodador1_Posicao10.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador1_Posicao10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador1_Posicao10.setText("1");

        indicadorJodador4_Posicao10.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador4_Posicao10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador4_Posicao10.setText("4");

        javax.swing.GroupLayout torre10Layout = new javax.swing.GroupLayout(torre10);
        torre10.setLayout(torre10Layout);
        torre10Layout.setHorizontalGroup(
            torre10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(torre10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(torre10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, torre10Layout.createSequentialGroup()
                        .addComponent(indicadorJodador1_Posicao10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(indicadorJodador2_Posicao10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, torre10Layout.createSequentialGroup()
                        .addComponent(indicadorJodador4_Posicao10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(indicadorJodador3_Posicao10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        torre10Layout.setVerticalGroup(
            torre10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(torre10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(torre10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador2_Posicao10)
                    .addComponent(indicadorJodador1_Posicao10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(torre10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador3_Posicao10)
                    .addComponent(indicadorJodador4_Posicao10))
                .addContainerGap())
        );

        painelFundoJogo.add(torre10, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 521, 96, 91));

        torre0.setBackground(new java.awt.Color(153, 153, 153));
        torre0.setToolTipText("");
        torre0.setPreferredSize(new java.awt.Dimension(150, 150));

        indicadorJodador1_Posicao0.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador1_Posicao0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador1_Posicao0.setText("1");

        indicadorJodador3_Posicao0.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador3_Posicao0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador3_Posicao0.setText("3");

        indicadorJodador2_Posicao0.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador2_Posicao0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador2_Posicao0.setText("2");

        indicadorJodador4_Posicao0.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador4_Posicao0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador4_Posicao0.setText("4");

        javax.swing.GroupLayout torre0Layout = new javax.swing.GroupLayout(torre0);
        torre0.setLayout(torre0Layout);
        torre0Layout.setHorizontalGroup(
            torre0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(torre0Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(torre0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(torre0Layout.createSequentialGroup()
                        .addComponent(indicadorJodador1_Posicao0, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(indicadorJodador2_Posicao0, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(torre0Layout.createSequentialGroup()
                        .addComponent(indicadorJodador4_Posicao0, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(indicadorJodador3_Posicao0, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        torre0Layout.setVerticalGroup(
            torre0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(torre0Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(torre0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador2_Posicao0)
                    .addComponent(indicadorJodador1_Posicao0))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(torre0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador3_Posicao0)
                    .addComponent(indicadorJodador4_Posicao0))
                .addContainerGap())
        );

        painelFundoJogo.add(torre0, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 96, 91));

        ponte19.setPreferredSize(new java.awt.Dimension(150, 150));

        indicadorJodador2_Posicao19.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador2_Posicao19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador2_Posicao19.setText("2");

        indicadorJodador3_Posicao19.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador3_Posicao19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador3_Posicao19.setText("3");

        indicadorJodador1_Posicao19.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador1_Posicao19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador1_Posicao19.setText("1");

        indicadorJodador4_Posicao19.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador4_Posicao19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador4_Posicao19.setText("4");

        javax.swing.GroupLayout ponte19Layout = new javax.swing.GroupLayout(ponte19);
        ponte19.setLayout(ponte19Layout);
        ponte19Layout.setHorizontalGroup(
            ponte19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ponte19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(indicadorJodador4_Posicao19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indicadorJodador1_Posicao19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(ponte19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(indicadorJodador3_Posicao19, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(indicadorJodador2_Posicao19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ponte19Layout.setVerticalGroup(
            ponte19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador2_Posicao19)
                    .addComponent(indicadorJodador1_Posicao19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ponte19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador3_Posicao19)
                    .addComponent(indicadorJodador4_Posicao19))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelFundoJogo.add(ponte19, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 109, 96, 91));

        ponte18.setPreferredSize(new java.awt.Dimension(150, 150));

        indicadorposicao18.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorposicao18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorposicao18.setText(" ");

        indicadorJodador2_Posicao18.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador2_Posicao18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador2_Posicao18.setText("2");

        indicadorJodador3_Posicao18.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador3_Posicao18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador3_Posicao18.setText("3");

        indicadorJodador1_Posicao18.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador1_Posicao18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador1_Posicao18.setText("1");

        indicadorJodador4_Posicao18.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador4_Posicao18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador4_Posicao18.setText("4");

        javax.swing.GroupLayout ponte18Layout = new javax.swing.GroupLayout(ponte18);
        ponte18.setLayout(ponte18Layout);
        ponte18Layout.setHorizontalGroup(
            ponte18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(indicadorJodador1_Posicao18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indicadorJodador4_Posicao18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(ponte18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(indicadorJodador2_Posicao18, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(indicadorJodador3_Posicao18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indicadorposicao18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        ponte18Layout.setVerticalGroup(
            ponte18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador2_Posicao18)
                    .addComponent(indicadorJodador1_Posicao18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ponte18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorposicao18)
                    .addComponent(indicadorJodador3_Posicao18)
                    .addComponent(indicadorJodador4_Posicao18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelFundoJogo.add(ponte18, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 212, 96, 91));

        ponte17.setPreferredSize(new java.awt.Dimension(150, 150));

        indicadorJodador2_Posicao17.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador2_Posicao17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador2_Posicao17.setText("2");

        indicadorJodador3_Posicao17.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador3_Posicao17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador3_Posicao17.setText("3");

        indicadorJodador1_Posicao17.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador1_Posicao17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador1_Posicao17.setText("1");

        indicadorJodador4_Posicao17.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador4_Posicao17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador4_Posicao17.setText("4");

        javax.swing.GroupLayout ponte17Layout = new javax.swing.GroupLayout(ponte17);
        ponte17.setLayout(ponte17Layout);
        ponte17Layout.setHorizontalGroup(
            ponte17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(indicadorJodador4_Posicao17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indicadorJodador1_Posicao17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(ponte17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(indicadorJodador3_Posicao17, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(indicadorJodador2_Posicao17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ponte17Layout.setVerticalGroup(
            ponte17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador2_Posicao17)
                    .addComponent(indicadorJodador1_Posicao17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ponte17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador3_Posicao17)
                    .addComponent(indicadorJodador4_Posicao17))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelFundoJogo.add(ponte17, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 315, 96, 91));

        ponte16.setPreferredSize(new java.awt.Dimension(150, 150));

        indicadorposicao16.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorposicao16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        indicadorJodador2_Posicao16.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador2_Posicao16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador2_Posicao16.setText("2");

        indicadorJodador3_Posicao16.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador3_Posicao16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador3_Posicao16.setText("3");

        indicadorJodador1_Posicao16.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador1_Posicao16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador1_Posicao16.setText("1");

        indicadorJodador4_Posicao16.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador4_Posicao16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador4_Posicao16.setText("4");

        javax.swing.GroupLayout ponte16Layout = new javax.swing.GroupLayout(ponte16);
        ponte16.setLayout(ponte16Layout);
        ponte16Layout.setHorizontalGroup(
            ponte16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ponte16Layout.createSequentialGroup()
                        .addComponent(indicadorJodador4_Posicao16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(indicadorposicao16, javax.swing.GroupLayout.DEFAULT_SIZE, 8, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ponte16Layout.createSequentialGroup()
                        .addComponent(indicadorJodador1_Posicao16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(ponte16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(indicadorJodador2_Posicao16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ponte16Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(indicadorJodador3_Posicao16, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ponte16Layout.setVerticalGroup(
            ponte16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador2_Posicao16)
                    .addComponent(indicadorJodador1_Posicao16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ponte16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(indicadorposicao16)
                    .addGroup(ponte16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(indicadorJodador3_Posicao16)
                        .addComponent(indicadorJodador4_Posicao16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelFundoJogo.add(ponte16, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 418, 96, 91));

        ponte1.setToolTipText("");
        ponte1.setName(""); // NOI18N
        ponte1.setPreferredSize(new java.awt.Dimension(150, 150));

        indicadorJodador2_Posicao1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador2_Posicao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador2_Posicao1.setText("2");

        indicadorJodador3_Posicao1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador3_Posicao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador3_Posicao1.setText("3");

        indicadorJodador1_Posicao1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador1_Posicao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador1_Posicao1.setText("1");

        indicadorJodador4_Posicao1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador4_Posicao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador4_Posicao1.setText("4");

        javax.swing.GroupLayout ponte1Layout = new javax.swing.GroupLayout(ponte1);
        ponte1.setLayout(ponte1Layout);
        ponte1Layout.setHorizontalGroup(
            ponte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(indicadorJodador4_Posicao1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indicadorJodador1_Posicao1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(ponte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(indicadorJodador2_Posicao1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indicadorJodador3_Posicao1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        ponte1Layout.setVerticalGroup(
            ponte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte1Layout.createSequentialGroup()
                .addGroup(ponte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ponte1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(ponte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(indicadorJodador3_Posicao1)
                            .addComponent(indicadorJodador4_Posicao1)))
                    .addGroup(ponte1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ponte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(indicadorJodador2_Posicao1)
                            .addComponent(indicadorJodador1_Posicao1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelFundoJogo.add(ponte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 6, 96, 91));

        ponte3.setPreferredSize(new java.awt.Dimension(150, 150));

        indicadorJodador2_Posicao3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador2_Posicao3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador2_Posicao3.setText("2");

        indicadorJodador3_Posicao3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador3_Posicao3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador3_Posicao3.setText("3");

        indicadorJodador1_Posicao3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador1_Posicao3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador1_Posicao3.setText("1");

        indicadorJodador4_Posicao3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador4_Posicao3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador4_Posicao3.setText("4");

        javax.swing.GroupLayout ponte3Layout = new javax.swing.GroupLayout(ponte3);
        ponte3.setLayout(ponte3Layout);
        ponte3Layout.setHorizontalGroup(
            ponte3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ponte3Layout.createSequentialGroup()
                        .addComponent(indicadorJodador4_Posicao3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(indicadorJodador3_Posicao3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ponte3Layout.createSequentialGroup()
                        .addComponent(indicadorJodador1_Posicao3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(indicadorJodador2_Posicao3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ponte3Layout.setVerticalGroup(
            ponte3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador2_Posicao3)
                    .addComponent(indicadorJodador1_Posicao3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ponte3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador3_Posicao3)
                    .addComponent(indicadorJodador4_Posicao3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelFundoJogo.add(ponte3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 6, 96, 91));

        ponte4.setPreferredSize(new java.awt.Dimension(150, 150));

        indicadorJodador2_Posicao4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador2_Posicao4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador2_Posicao4.setText("2");

        indicadorJodador3_Posicao4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador3_Posicao4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador3_Posicao4.setText("3");

        indicadorJodador1_Posicao4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador1_Posicao4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador1_Posicao4.setText("1");

        indicadorJodador4_Posicao4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador4_Posicao4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador4_Posicao4.setText("4");

        javax.swing.GroupLayout ponte4Layout = new javax.swing.GroupLayout(ponte4);
        ponte4.setLayout(ponte4Layout);
        ponte4Layout.setHorizontalGroup(
            ponte4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ponte4Layout.createSequentialGroup()
                        .addComponent(indicadorJodador4_Posicao4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(indicadorJodador3_Posicao4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ponte4Layout.createSequentialGroup()
                        .addComponent(indicadorJodador1_Posicao4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(indicadorJodador2_Posicao4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ponte4Layout.setVerticalGroup(
            ponte4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador2_Posicao4)
                    .addComponent(indicadorJodador1_Posicao4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ponte4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador3_Posicao4)
                    .addComponent(indicadorJodador4_Posicao4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelFundoJogo.add(ponte4, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 6, 96, 91));

        torre15.setBackground(new java.awt.Color(153, 153, 153));
        torre15.setPreferredSize(new java.awt.Dimension(150, 150));

        indicadorJodador2_Posicao15.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador2_Posicao15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador2_Posicao15.setText("2");

        indicadorJodador3_Posicao15.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador3_Posicao15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador3_Posicao15.setText("3");

        indicadorJodador1_Posicao15.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador1_Posicao15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador1_Posicao15.setText("1");

        indicadorJodador4_Posicao15.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador4_Posicao15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador4_Posicao15.setText("4");

        javax.swing.GroupLayout torre15Layout = new javax.swing.GroupLayout(torre15);
        torre15.setLayout(torre15Layout);
        torre15Layout.setHorizontalGroup(
            torre15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(torre15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(torre15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(indicadorJodador1_Posicao15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indicadorJodador4_Posicao15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(torre15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(indicadorJodador3_Posicao15, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(indicadorJodador2_Posicao15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        torre15Layout.setVerticalGroup(
            torre15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(torre15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(torre15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador2_Posicao15)
                    .addComponent(indicadorJodador1_Posicao15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(torre15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador3_Posicao15)
                    .addComponent(indicadorJodador4_Posicao15))
                .addContainerGap())
        );

        painelFundoJogo.add(torre15, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 521, 96, 91));

        ponte14.setPreferredSize(new java.awt.Dimension(150, 150));

        indicadorJodador2_Posicao14.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador2_Posicao14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador2_Posicao14.setText("2");

        indicadorJodador3_Posicao14.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador3_Posicao14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador3_Posicao14.setText("3");

        indicadorJodador1_Posicao14.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador1_Posicao14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador1_Posicao14.setText("1");

        indicadorJodador4_Posicao14.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador4_Posicao14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador4_Posicao14.setText("4");

        javax.swing.GroupLayout ponte14Layout = new javax.swing.GroupLayout(ponte14);
        ponte14.setLayout(ponte14Layout);
        ponte14Layout.setHorizontalGroup(
            ponte14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte14Layout.createSequentialGroup()
                .addGroup(ponte14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ponte14Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(indicadorJodador1_Posicao14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(ponte14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(indicadorJodador4_Posicao14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(ponte14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(indicadorJodador3_Posicao14, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(indicadorJodador2_Posicao14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ponte14Layout.setVerticalGroup(
            ponte14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador2_Posicao14)
                    .addComponent(indicadorJodador1_Posicao14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ponte14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador3_Posicao14)
                    .addComponent(indicadorJodador4_Posicao14))
                .addContainerGap())
        );

        painelFundoJogo.add(ponte14, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 521, 96, 91));

        ponte13.setPreferredSize(new java.awt.Dimension(150, 150));

        indicadorJodador2_Posicao13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador2_Posicao13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador2_Posicao13.setText("2");

        indicadorJodador3_Posicao13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador3_Posicao13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador3_Posicao13.setText("3");

        indicadorJodador1_Posicao13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador1_Posicao13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador1_Posicao13.setText("1");

        indicadorJodador4_Posicao13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador4_Posicao13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador4_Posicao13.setText("4");

        javax.swing.GroupLayout ponte13Layout = new javax.swing.GroupLayout(ponte13);
        ponte13.setLayout(ponte13Layout);
        ponte13Layout.setHorizontalGroup(
            ponte13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(indicadorJodador1_Posicao13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indicadorJodador4_Posicao13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(ponte13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(indicadorJodador3_Posicao13, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(indicadorJodador2_Posicao13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ponte13Layout.setVerticalGroup(
            ponte13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ponte13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador2_Posicao13)
                    .addComponent(indicadorJodador1_Posicao13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ponte13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador3_Posicao13)
                    .addComponent(indicadorJodador4_Posicao13))
                .addContainerGap())
        );

        painelFundoJogo.add(ponte13, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 521, 96, 91));

        ponte12.setPreferredSize(new java.awt.Dimension(150, 150));

        indicadorJodador2_Posicao12.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador2_Posicao12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador2_Posicao12.setText("2");

        indicadorJodador3_Posicao12.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador3_Posicao12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador3_Posicao12.setText("3");

        indicadorJodador1_Posicao12.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador1_Posicao12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador1_Posicao12.setText("1");

        indicadorJodador4_Posicao12.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador4_Posicao12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador4_Posicao12.setText("4");

        javax.swing.GroupLayout ponte12Layout = new javax.swing.GroupLayout(ponte12);
        ponte12.setLayout(ponte12Layout);
        ponte12Layout.setHorizontalGroup(
            ponte12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ponte12Layout.createSequentialGroup()
                        .addComponent(indicadorJodador1_Posicao12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(indicadorJodador2_Posicao12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ponte12Layout.createSequentialGroup()
                        .addComponent(indicadorJodador4_Posicao12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(indicadorJodador3_Posicao12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ponte12Layout.setVerticalGroup(
            ponte12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador2_Posicao12)
                    .addComponent(indicadorJodador1_Posicao12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ponte12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador3_Posicao12)
                    .addComponent(indicadorJodador4_Posicao12))
                .addContainerGap())
        );

        painelFundoJogo.add(ponte12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 521, 96, 91));

        ponte11.setPreferredSize(new java.awt.Dimension(150, 150));

        indicadorJodador2_Posicao11.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador2_Posicao11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador2_Posicao11.setText("2");

        indicadorJodador3_Posicao11.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador3_Posicao11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador3_Posicao11.setText("3");

        indicadorJodador1_Posicao11.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador1_Posicao11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador1_Posicao11.setText("1");

        indicadorJodador4_Posicao11.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador4_Posicao11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador4_Posicao11.setText("4");

        javax.swing.GroupLayout ponte11Layout = new javax.swing.GroupLayout(ponte11);
        ponte11.setLayout(ponte11Layout);
        ponte11Layout.setHorizontalGroup(
            ponte11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ponte11Layout.createSequentialGroup()
                        .addComponent(indicadorJodador1_Posicao11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(indicadorJodador2_Posicao11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ponte11Layout.createSequentialGroup()
                        .addComponent(indicadorJodador4_Posicao11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(indicadorJodador3_Posicao11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ponte11Layout.setVerticalGroup(
            ponte11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador2_Posicao11)
                    .addComponent(indicadorJodador1_Posicao11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ponte11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador3_Posicao11)
                    .addComponent(indicadorJodador4_Posicao11))
                .addContainerGap())
        );

        painelFundoJogo.add(ponte11, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 521, 96, 91));

        ponte2.setPreferredSize(new java.awt.Dimension(150, 150));

        indicadorJodador2_Posicao2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador2_Posicao2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador2_Posicao2.setText("2");

        indicadorJodador3_Posicao2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador3_Posicao2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador3_Posicao2.setText("3");

        indicadorJodador1_Posicao2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador1_Posicao2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador1_Posicao2.setText("1");

        indicadorJodador4_Posicao2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        indicadorJodador4_Posicao2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicadorJodador4_Posicao2.setText("4");

        javax.swing.GroupLayout ponte2Layout = new javax.swing.GroupLayout(ponte2);
        ponte2.setLayout(ponte2Layout);
        ponte2Layout.setHorizontalGroup(
            ponte2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ponte2Layout.createSequentialGroup()
                        .addComponent(indicadorJodador4_Posicao2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(indicadorJodador3_Posicao2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ponte2Layout.createSequentialGroup()
                        .addComponent(indicadorJodador1_Posicao2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(indicadorJodador2_Posicao2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ponte2Layout.setVerticalGroup(
            ponte2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponte2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ponte2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador2_Posicao2)
                    .addComponent(indicadorJodador1_Posicao2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ponte2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indicadorJodador3_Posicao2)
                    .addComponent(indicadorJodador4_Posicao2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelFundoJogo.add(ponte2, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 6, 96, 91));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        explosao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodaexplosão/explosao.png"))); // NOI18N
        explosao.setText("   ");
        explosao.setRequestFocusEnabled(false);
        jPanel2.add(explosao, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 470, 260));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodaexplosão/bomba3png.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(250, 250));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 180, 190));

        painelFundoJogo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 109, 420, 400));

        painelFundo.add(painelFundoJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 652, 618));

        titulo.setFont(new java.awt.Font("Ravie", 0, 26)); // NOI18N
        titulo.setText("JOGO DA EXPLOSÃO");
        painelFundo.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(817, 54, -1, -1));

        botaoRodarDado.setBackground(new java.awt.Color(0, 0, 0));
        botaoRodarDado.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        botaoRodarDado.setForeground(new java.awt.Color(255, 255, 255));
        botaoRodarDado.setText("Sortear número");
        botaoRodarDado.setActionCommand("Rodar dado");
        botaoRodarDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRodarDadoActionPerformed(evt);
            }
        });
        painelFundo.add(botaoRodarDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 500, 126, 44));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        numeroSorteadoDado.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        numeroSorteadoDado.setText("1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(numeroSorteadoDado)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(numeroSorteadoDado)
                .addGap(36, 36, 36))
        );

        painelFundo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 340, -1, -1));

        nomedado.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        nomedado.setText("DADO");
        painelFundo.add(nomedado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 310, -1, -1));

        jLabel4.setFont(new java.awt.Font("Wide Latin", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText(">>>");
        painelFundo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 137, -1, -1));

        mostraPowerups.setMaximumRowCount(2);
        mostraPowerups.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item Passivo: não possui", "Item Instantaneo: não possui" }));
        mostraPowerups.setToolTipText("");
        painelFundo.add(mostraPowerups, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 130, 330, 47));

        vezJogador.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        vezJogador.setText("1");
        painelFundo.add(vezJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 135, 28, -1));

        logJogo.setEditable(false);
        logJogo.setColumns(20);
        logJogo.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        logJogo.setRows(5);
        jScrollPane1.setViewportView(logJogo);

        painelFundo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 331, 380));

        vezJogador1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        vezJogador1.setText("Log do Jogo:");
        painelFundo.add(vezJogador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 132, -1));

        nomeJogadorAtual.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        nomeJogadorAtual.setText("Jogador");
        painelFundo.add(nomeJogadorAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(747, 135, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoRodarDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRodarDadoActionPerformed
        explosao.setVisible(false); // remove figura da explosao
        
        int tempI = verificaImobilizar();
        if (tempI > 0){
            //Tira imobilizar do inventário do jogador e o jogo vai para o próximo jogador se não possuir escudo
            jogadores.get(tempI - 1).retiraItemInstantaneo();
            if (jogadores.get(jogadorAtual - 1).getNomeItemPassivo().equals("Escudo")){    // verifica se o jogador possui escudo
                jogadores.get(jogadorAtual - 1).retiraItemPassivo();
                logJogo.append("Jogador " + jogadorAtual + " foi imobilizado pelo jogador " + tempI + ", mas o jogador usou seu escudo \n");
                testesDaRodada(); //Jogador pode jogar
            } else{
                logJogo.append("Jogador " + jogadorAtual + " nao joga, pois foi imobilizado pelo jogador " + tempI + "\n");
            }
            atualizaPowerUp();
        } else { //Jogador pode jogar
            testesDaRodada();
        }
        
        atualizaTabuleiro();    
        atualizaProximoJogador();
        atualizaPowerUp();
    }//GEN-LAST:event_botaoRodarDadoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JogoExplosão.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoExplosão.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoExplosão.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoExplosão.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoExplosão().setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoRodarDado;
    public javax.swing.JLabel explosao;
    private javax.swing.JLabel indicadorJodador1_Posicao0;
    private javax.swing.JLabel indicadorJodador1_Posicao1;
    private javax.swing.JLabel indicadorJodador1_Posicao10;
    private javax.swing.JLabel indicadorJodador1_Posicao11;
    private javax.swing.JLabel indicadorJodador1_Posicao12;
    private javax.swing.JLabel indicadorJodador1_Posicao13;
    private javax.swing.JLabel indicadorJodador1_Posicao14;
    private javax.swing.JLabel indicadorJodador1_Posicao15;
    private javax.swing.JLabel indicadorJodador1_Posicao16;
    private javax.swing.JLabel indicadorJodador1_Posicao17;
    private javax.swing.JLabel indicadorJodador1_Posicao18;
    private javax.swing.JLabel indicadorJodador1_Posicao19;
    private javax.swing.JLabel indicadorJodador1_Posicao2;
    private javax.swing.JLabel indicadorJodador1_Posicao3;
    private javax.swing.JLabel indicadorJodador1_Posicao4;
    private javax.swing.JLabel indicadorJodador1_Posicao5;
    private javax.swing.JLabel indicadorJodador1_Posicao6;
    private javax.swing.JLabel indicadorJodador1_Posicao7;
    private javax.swing.JLabel indicadorJodador1_Posicao8;
    private javax.swing.JLabel indicadorJodador1_Posicao9;
    private javax.swing.JLabel indicadorJodador2_Posicao0;
    private javax.swing.JLabel indicadorJodador2_Posicao1;
    private javax.swing.JLabel indicadorJodador2_Posicao10;
    private javax.swing.JLabel indicadorJodador2_Posicao11;
    private javax.swing.JLabel indicadorJodador2_Posicao12;
    private javax.swing.JLabel indicadorJodador2_Posicao13;
    private javax.swing.JLabel indicadorJodador2_Posicao14;
    private javax.swing.JLabel indicadorJodador2_Posicao15;
    private javax.swing.JLabel indicadorJodador2_Posicao16;
    private javax.swing.JLabel indicadorJodador2_Posicao17;
    private javax.swing.JLabel indicadorJodador2_Posicao18;
    private javax.swing.JLabel indicadorJodador2_Posicao19;
    private javax.swing.JLabel indicadorJodador2_Posicao2;
    private javax.swing.JLabel indicadorJodador2_Posicao3;
    private javax.swing.JLabel indicadorJodador2_Posicao4;
    private javax.swing.JLabel indicadorJodador2_Posicao5;
    private javax.swing.JLabel indicadorJodador2_Posicao6;
    private javax.swing.JLabel indicadorJodador2_Posicao7;
    private javax.swing.JLabel indicadorJodador2_Posicao8;
    private javax.swing.JLabel indicadorJodador2_Posicao9;
    private javax.swing.JLabel indicadorJodador3_Posicao0;
    private javax.swing.JLabel indicadorJodador3_Posicao1;
    private javax.swing.JLabel indicadorJodador3_Posicao10;
    private javax.swing.JLabel indicadorJodador3_Posicao11;
    private javax.swing.JLabel indicadorJodador3_Posicao12;
    private javax.swing.JLabel indicadorJodador3_Posicao13;
    private javax.swing.JLabel indicadorJodador3_Posicao14;
    private javax.swing.JLabel indicadorJodador3_Posicao15;
    private javax.swing.JLabel indicadorJodador3_Posicao16;
    private javax.swing.JLabel indicadorJodador3_Posicao17;
    private javax.swing.JLabel indicadorJodador3_Posicao18;
    private javax.swing.JLabel indicadorJodador3_Posicao19;
    private javax.swing.JLabel indicadorJodador3_Posicao2;
    private javax.swing.JLabel indicadorJodador3_Posicao3;
    private javax.swing.JLabel indicadorJodador3_Posicao4;
    private javax.swing.JLabel indicadorJodador3_Posicao5;
    private javax.swing.JLabel indicadorJodador3_Posicao6;
    private javax.swing.JLabel indicadorJodador3_Posicao7;
    private javax.swing.JLabel indicadorJodador3_Posicao8;
    private javax.swing.JLabel indicadorJodador3_Posicao9;
    private javax.swing.JLabel indicadorJodador4_Posicao0;
    private javax.swing.JLabel indicadorJodador4_Posicao1;
    private javax.swing.JLabel indicadorJodador4_Posicao10;
    private javax.swing.JLabel indicadorJodador4_Posicao11;
    private javax.swing.JLabel indicadorJodador4_Posicao12;
    private javax.swing.JLabel indicadorJodador4_Posicao13;
    private javax.swing.JLabel indicadorJodador4_Posicao14;
    private javax.swing.JLabel indicadorJodador4_Posicao15;
    private javax.swing.JLabel indicadorJodador4_Posicao16;
    private javax.swing.JLabel indicadorJodador4_Posicao17;
    private javax.swing.JLabel indicadorJodador4_Posicao18;
    private javax.swing.JLabel indicadorJodador4_Posicao19;
    private javax.swing.JLabel indicadorJodador4_Posicao2;
    private javax.swing.JLabel indicadorJodador4_Posicao3;
    private javax.swing.JLabel indicadorJodador4_Posicao4;
    private javax.swing.JLabel indicadorJodador4_Posicao5;
    private javax.swing.JLabel indicadorJodador4_Posicao6;
    private javax.swing.JLabel indicadorJodador4_Posicao7;
    private javax.swing.JLabel indicadorJodador4_Posicao8;
    private javax.swing.JLabel indicadorJodador4_Posicao9;
    private javax.swing.JLabel indicadorposicao16;
    private javax.swing.JLabel indicadorposicao18;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea logJogo;
    private javax.swing.JComboBox<String> mostraPowerups;
    private javax.swing.JLabel nomeJogadorAtual;
    private javax.swing.JLabel nomedado;
    private javax.swing.JLabel numeroSorteadoDado;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JPanel painelFundoJogo;
    private javax.swing.JPanel ponte1;
    private javax.swing.JPanel ponte11;
    private javax.swing.JPanel ponte12;
    private javax.swing.JPanel ponte13;
    private javax.swing.JPanel ponte14;
    private javax.swing.JPanel ponte16;
    private javax.swing.JPanel ponte17;
    private javax.swing.JPanel ponte18;
    private javax.swing.JPanel ponte19;
    private javax.swing.JPanel ponte2;
    private javax.swing.JPanel ponte3;
    private javax.swing.JPanel ponte4;
    private javax.swing.JPanel ponte6;
    private javax.swing.JPanel ponte7;
    private javax.swing.JPanel ponte8;
    private javax.swing.JPanel ponte9;
    private javax.swing.JLabel titulo;
    private javax.swing.JPanel torre0;
    private javax.swing.JPanel torre10;
    private javax.swing.JPanel torre15;
    private javax.swing.JPanel torre5;
    private javax.swing.JLabel vezJogador;
    private javax.swing.JLabel vezJogador1;
    // End of variables declaration//GEN-END:variables
}
