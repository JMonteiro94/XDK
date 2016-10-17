/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NMVC
 */
public class Cliente implements Observer{
        
    String nome;
    
    public Cliente(String n){
        this.nome=n;
    }
        
    @Override
    public void update(String x){
        System.out.println("Cliente "+this.nome+" Sensor: "+x);
    }
    
}
