
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NMVC
 */
public class xdkAcelerometro extends Thread implements Observable{
     
    ArrayList<Observer> observers = new ArrayList<>();
    xdk xdk = new xdk();
    
    
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
        String s;
        try{
            while(true){
                s=xdk.getAcelerometro();
                 System.out.println("XDK: "+s);
                notifyObservers(s);
                Thread.sleep(1000);
            }  
        }catch(InterruptedException e){    
            System.out.println("got interrupted!");
        }
    }
       
}

    

