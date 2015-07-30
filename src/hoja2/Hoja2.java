/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Mario Fernando
 */
public class Hoja2 {

     static String cadena;
    
    public static void main(String[] args) {
       
        Calcu cal = new Calcu();
        LeerArchivo();
        cal.setString(cadena);
        
    }
    public static void LeerArchivo() throws FileNotFoundException, IOException{   
        //Aqui se coloca la direccion del Archivo completa 
        BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Mario Fernando\\Documents\\tabajos uvg\\7mo semestre\\progra\\calculadora\\src\\calculadora\\prueba.txt"));
        cadena=bf.readLine();         
      }
    
    
}
