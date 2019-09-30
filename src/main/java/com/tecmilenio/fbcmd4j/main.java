/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecmilenio.fbcmd4j;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 *
 * @author Carlos
 */
public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sBuffer = new StringBuffer();
        
        String commandLine = "";
              
        main clase = new main();
        while(clase.identificaComando(commandLine)!=0){
            System.out.println("Escriba un comando:");
            commandLine = (String) bReader.readLine();
        }
    }
    
    private int identificaComando(String paramCommandLine){
        
        String[] commandLine = paramCommandLine.split("--", 0);
        String command = commandLine[0];
        String commandParam = "0";
        
        if (commandLine.length > 1) {
            commandParam = commandLine[1];
        }
        
        switch(command.toUpperCase()){
            case "HELP":
                help();
                break;
            case "FBGETNEWS":
                getNewsFeed(Integer.parseInt(commandParam));
                break;
            case "FBGETWALL":
                getWall(Integer.parseInt(commandParam));
                break;
            case "FBSETSTATE":
                setWallState(commandParam);
                break;
            case "FBSETLINK":
                setWallLink(commandParam);
                break;
            case "EXIT":
                return 0;
            default:
                break;
        }
        
        return 1;
    }
        
    private void help(){
        
        System.out.println("");
        System.out.println("");
        System.out.println("Sintaxis: command --parameter");
        System.out.println("Ejemplo: fbgetnews --5");
        System.out.println("--------------------------------------------------");
        System.out.println("Comandos disponibles:");
        System.out.println("");
        System.out.println("exit                    Cerrar el programa.");
        System.out.println("fbgetnews --N           Obtiene las últimas N publicaciones de Facebook");
        System.out.println("fbgetwall --N           Obtiene las últimas N publicaciones del usuario en su muro.");
        System.out.println("fbsetstate --'Text'     Publica un estado en el muro.");
        System.out.println("fbsetlink  --'' ");
        System.out.println("help                    Ayuda");
        System.out.println("");
        System.out.println("");
    }
    
    private void createFile(String filename) throws IOException{
        try{
            int count = 0;
            File nfile = new File(filename + ".txt");

            while(nfile.exists()){
                count++;
                nfile = new File(filename + "[" + count + "].txt");
            }

            BufferedWriter bw;

            bw = new BufferedWriter(new FileWriter(nfile));
            bw.write("ok!");
            bw.close();
        }
        catch(IOException ioe){
            System.out.println("Error al crear el archivo de datos.");
        }
    }
    
    private HashMap getConf(){
        BufferedReader br = null;
        FileReader fr = null;
        HashMap<String,String> config = new HashMap<String, String>();
        
        try{
            fr = new FileReader("fbcmdj.conf");
            br = new BufferedReader(fr);
            for(String line; (line = br.readLine()) != null;){
                String[] confItem = line.split("=",0);
                config.put(confItem[0], confItem[1]);
                System.out.println(confItem[0] + " " + confItem[1]);
            }
        } catch(IOException ex){
            System.out.println("Error al obtener la configuración del programa.");
        }
        
        return config;
    }
    
    private void getNewsFeed(int quantity){
        try{
            createFile("fb_newsfeed");
        }catch(IOException ioe){
            System.out.println("Error");
        }
    }
    
    private void getWall(int quantity){
        try{
            createFile("fb_newsfeed");
        }catch(IOException ioe){
            System.out.println("Error");
        }
    }
    
    private void setWallState(String state){
        try{
            createFile("fb_newsfeed");
        }catch(IOException ioe){
            System.out.println("Error");
        }
    }
    
    private void setWallLink(String link){
        try{
            createFile("fb_newsfeed");
        }catch(IOException ioe){
        
        }
    }
}
