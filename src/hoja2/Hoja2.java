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
     static int resultado;
    
    public static void main(String[] args) throws IOException {
       
        Calcu cal = new Calcu();
        LeerArchivo();
        cal.setString(cadena);
        cal.meterVector();
        cal.calcularVector();
        resultado = cal.getResultado();
        System.out.println(resultado);
        
        
    }
    public static void LeerArchivo() throws FileNotFoundException, IOException{   
        //Aqui se coloca la direccion del Archivo completa 
        BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Mario Fernando\\Desktop\\123.txt"));
        cadena=bf.readLine();         
      }
    
    
}
