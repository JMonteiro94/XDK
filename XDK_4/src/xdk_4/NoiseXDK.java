/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xdk_4;

/**
 *
 * @author User
 */
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class NoiseXDK extends Thread implements Observable{
    
    ArrayList<Observer> observers = new ArrayList<>();
    xdk xdk = new xdk();
    String nome;
    
    public NoiseXDK(String x){
        this.nome=x;
    }
    
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

      
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String x) {
        for (Observer ob : observers) {
            ob.update(x);
        }
    }
    
    @Override
    public void run(){
        String sensor;
        try{
            while(true){
                sensor=xdk.getAcustica();
                //System.out.println("XDK: "+sensor);
                sensor+=" "+this.nome;
                notifyObservers(sensor);
                Thread.sleep(15000);
                
            }  
        }catch(InterruptedException e){    
            System.out.println("got interrupted!");
        }
    }
}
