/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogodaexplosão;

/**
 *
 * @author Caroline Souza Camargo e Yasmin Souza Camargo
 */

public abstract class Item {
    private String nome;
    
    public Item(String nome){
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return nome; 
    }
}
