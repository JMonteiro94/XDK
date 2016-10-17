

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
public class Servidor extends Thread{

       public static void main(String args[]) {

            xdkAcelerometro xdk1 = new xdkAcelerometro();
            xdkTemperatura xdk2 = new xdkTemperatura();
            Cliente x= new Cliente("Nuno ");
            Cliente y= new Cliente("Monteiro ");
            //2A
            /*xdk1.registerObserver(x);
            xdk1.registerObserver(y);  
            Thread c =new Thread(xdk1);
            c.start();*/
            //2B
            xdk2.registerObserver(x);
            xdk2.registerObserver(y);
            Thread t = new Thread(xdk2);
            t.start();
       }

}
    
    

