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
    private boolean bandera;
    
    public Calcu(){
       resultado=0;
       cadena="";
       Vector = new StackArrayVector<Integer>(); 
       bandera = true;
    }
    
    public void setString(String linea) {
        cadena = linea;
        cadena2 =cadena.split(" ");
        System.out.println(cadena);
    }

    
    public void meterVector() {
        calcularVector();
    }

    
    public boolean calcularVector() {
        for(String numero: cadena2){
            boolean esnumero=true;
            try
            {
                Integer.parseInt(numero);
            }catch(NumberFormatException e){
                esnumero=false;
            }
            if(esnumero){

                Vector.push(Integer.parseInt(numero));

            }    
            else{
                if( Vector.size()<= 1 || Vector.size()>= 4){
                    bandera = false;
                }

                else{
                    if(numero.equals("+")){
                    Vector.push(Sumar(Vector.pop(),Vector.pop())); 
                    
                    
                }if(numero.equals("*")){
                    Vector.push(Multiplicar(Vector.pop(),Vector.pop())); 
                    
                    
                    
                }if(numero.equals("-")){
                    Vector.push(Restar(Vector.pop(),Vector.pop())); 
                   
                    
                    
                }if(numero.equals("/")){
                    Vector.push(Dividir(Vector.pop(),Vector.pop())); 
                                    
                }   
                }  
            }
        }
        return bandera;
     }
    

    
    public int getResultado() {
        
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
    

