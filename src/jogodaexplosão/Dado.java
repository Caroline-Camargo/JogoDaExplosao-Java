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

public class Dado{
    private int valor;
    private final int faces;
    
    public Dado(){
        valor = 0;
        faces = 6;
    }
    
    public Dado(int faces){
        valor = 0;
        this.faces = faces;
    }
    
    public void rolar(){
        Random random = new Random();
        valor = random.nextInt(faces) + 1;
    }
    
    public void rolar(int max){
        Random random = new Random();
        valor = random.nextInt(max) + 1;
    }
    
    public int getValor(){
        return valor;
    }

    @Override
    public String toString() {
        if (valor >= 1 && valor <=3) {
            return "" + valor;
        } else if (valor == 4 || valor == 5){
            return "*";
        } else {
            return "?";
        }        
    } 
}
