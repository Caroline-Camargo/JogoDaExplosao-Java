/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogodaexplosão;

/**
 *
 * @author Caroline Souza Camargo e Yasmin Souza Camargo
 */
public class Imobilizar extends Instantaneo{
    private int numJogador;
    
    public Imobilizar(int numJogador){
        super("Imobilizar");
        this.numJogador = numJogador;
    }
    
    public int getImobilizarJogador(){
        return numJogador;
    }

    @Override
    public String toString() {
        return super.toString(); 
    }
}
