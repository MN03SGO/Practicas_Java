
package vectores2;

import java.util.Scanner;

public class Vectores2 {
    public static void main(String[] args) {
       int numeros [] = new int [10];
       Scanner entrada = new Scanner(System.in);
       
       //carga del vector
       for (int i=0; i < numeros.length; i++){
           System.out.println("Ingrese  el numero a cargar en la posicion: "+i);
           numeros[i] = entrada.nextInt();  
       }
       //busqueda mayor 
     
       int mayor = Integer.MIN_VALUE;
       
        for (int i=0; i < numeros.length; i++){
            if (numeros [i] > mayor){
                mayor = numeros[i];
            
            }
        }
        
        // busqueda menor
        
        int menor = Integer.MAX_VALUE;
        for (int i=0; i < numeros.length; i++){
            if (numeros[i] < menor ){
            menor = numeros [i];
            
            }
            
                
        }
        System.out.println(" EL MAYOR ES: "+mayor );
        System.out.println(" EL MENOR ES: "+menor);    
 
    }
    
}
