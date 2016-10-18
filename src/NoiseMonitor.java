
import java.util.ArrayList;
import java.util.Calendar;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class NoiseMonitor implements Observer{
    
    ArrayList<String> valores = new ArrayList<>();
    String nome;
    
    public NoiseMonitor(){
        
    }
        
    @Override
    public void update(String x){
        //ArrayList<String> valores = new ArrayList<>();
        String[] tokens = x.split(" ");
        String valor,name,t="";
        Calendar now =  Calendar.getInstance();
        //System.out.println(x);
        String aux="";
        valor = tokens[1];
        name = tokens[2];
        valores.add(valor);
        for(int i =0; i<valores.size();i++){
            aux+=", "+valores.get(i);
        }
        System.out.println("Sensor "+name+":("+now.get(Calendar.HOUR_OF_DAY)+":"+now.get(Calendar.MINUTE)+"),"+aux);
    }
}
