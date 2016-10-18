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
public class Servidor {


       public static void main(String args[]) {
         
            NoiseXDK n1 = new NoiseXDK("1");
            NoiseXDK n2 = new NoiseXDK("2");
            NoiseXDK n3 = new NoiseXDK("3");
            NoiseMonitor N1 = new NoiseMonitor();
            NoiseMonitor N2 = new NoiseMonitor();
            NoiseMonitor N3 = new NoiseMonitor();

            n1.registerObserver(N1);
            Thread t1 = new Thread(n1);
            t1.start();
            n2.registerObserver(N2);
            Thread t2= new Thread(n2);
            t2.start();
            n3.registerObserver(N3);
            Thread t3 = new Thread(n3);
            t3.start();
       }

}

