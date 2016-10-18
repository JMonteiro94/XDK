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
import java.util.Random;
 

public class xdk{
    
    public String resposta;
    
    public String getAcelerometro(){
        Random rand = new Random();
        int x = rand.nextInt(64000+1)+ (-32000);
        int y = rand.nextInt(64000+1)+ (-32000);
        int z = rand.nextInt(64000+1)+ (-32000);
        return ("Acelerometro | X: "+x+" | Y: "+y+"| Z :"+z+" |");
    }
    
    public String getGiroscopio(){
        Random rand = new Random();
        int x = rand.nextInt(64000+1)+ (-32000);
        int y = rand.nextInt(64000+1)+ (-32000);
        int z = rand.nextInt(64000+1)+ (-32000);
        return "Giroscopio |X:"+x+"| Y:"+y+"| Z:"+z;
    }
    
    public String getMagnetometro(){
        Random rand = new Random();
        int r= rand.nextInt(400+1)+ (-200);
        return "Magnetometro "+r+"nT";
    }
    
    public String getHumidade(){
        Random rand = new Random();
        int r= rand.nextInt(100+1)+ 0;
        return "Humidade"+r+"%";
    }
    
    public String getPressao(){
        Random rand = new Random();
        int r= rand.nextInt(1950)+ 870;
        return "Pressao "+r+"hPa";
    }
    
    public String getTemperatura(){
        Random rand = new Random();
            int r= rand.nextInt(100+1)+ (-50);
            return "Temperatura "+r+"Cº";
    }
    
    public String getAcustica(){
        Random rand = new Random();
        int r= rand.nextInt(140+1)+ (0);
        return "Acustica "+r+"dB";
    }
    
    public String getLuz(){
        Random rand = new Random();
        int r= rand.nextInt(1100)+ 300;
        return "Luz "+r+"nm";
    }
 
}
