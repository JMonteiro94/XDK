/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xdkcliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class XdkCliente {

public static void main(String[] args) {
    
    try{
        String add,sensor;
        Scanner s = new Scanner(System.in);
        OutputStream os;
        System.out.println("Please enter the server address.");
        BufferedReader in;
        PrintWriter out;
        add=s.nextLine();
        Socket socket = new Socket(add,6063);

        os = socket.getOutputStream();
        out = new PrintWriter(os,true);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        sensor=in.readLine();
        
        while(!"ok".equals(sensor)){
            sensor=in.readLine();
            if("nada".equals(sensor)){
               //System.out.println("Valor Inalterado..."); 
            }
            else{
                System.out.println("Sensor: "+sensor);
                //sensor=in.readLine();
            }
        }
       /*
        sensor=in.readLine();
        System.out.println(sensor);
        System.out.println("Cliente");*/
        } catch (IOException e) {
            
        }
    }
}
    

