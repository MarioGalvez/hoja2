/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja2;

/**
 *
 * @author Mario Fernando
 */
public class Calcu implements Calculadora{

    private int resultado;
    private Stack<Integer> Vector;
    private String cadena;
    private boolean esnumero;
    private String cadena2[];
    
    public Calcu(){
       resultado=0;
       cadena="";
       Vector = new StackArrayVector<Integer>(); 
    }
    
    public void setString(String linea) {
        cadena = linea;
        System.out.println(cadena);
        cadena2 = cadena.split(" ");
    }

    
    public void meterVector() {
        
    }

    
    public boolean calcularVector() {
        for(String numero: cadena2){
                esnumero=true;
            try
            {
                Integer.parseInt(numero);
            }catch(NumberFormatException e){
                esnumero=false;
            }
        }
        
        return esnumero;
    }

    
    public int getResultado() {
        for(String numero: cadena2){
    
                if(numero.equals("+")){
                    Vector.push(Sumar(Vector.pop(),Vector.pop())); 
                    System.out.println(resultado);
                    resultado=0;
                }if(numero.equals("*")){
                    Vector.push(Multiplicar(Vector.pop(),Vector.pop())); 
                    System.out.println(resultado);
                    resultado=0;
                    
                }if(numero.equals("-")){
                    Vector.push(Restar(Vector.pop(),Vector.pop())); 
                    System.out.println(resultado);
                    resultado=0;
                    
                }if(numero.equals("/")){
                    Vector.push(Dividir(Vector.pop(),Vector.pop())); 
                    System.out.println(resultado);
                    resultado=0;
                    
                }  
            }
        return resultado;
        }
    
    public int Sumar(int num1, int num2){
       return resultado=num1+num2;
    }
    
    public int Restar(int num1, int num2){
        return resultado=num2-num1;
    }
    public int Multiplicar(int num1, int num2){
       return resultado=num1*num2;
        
    }
   
    public int Dividir(int num1, int num2){ 
       int denominador, numerador;
        denominador=num1;
        numerador = num2;
        return resultado = numerador/denominador;
    }

}
    

