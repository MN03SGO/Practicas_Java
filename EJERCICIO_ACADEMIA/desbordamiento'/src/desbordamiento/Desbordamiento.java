
package desbordamiento;

import java.util.Scanner;

public class Desbordamiento {

    public static void main(String[] args) {
        String nombres [] = new String[8];
        Scanner entrada = new Scanner (System.in);
        
        for (int i = 0; i  < nombres.length; i++){
            System.out.println("Ingrese nombre a guardar en el indice: "+i);
            nombres[i]= entrada.nextLine();
        }
        
           for (int i = 0; i  < nombres.length; i++){
            System.out.println("Indice: "+i+" Nombre guardados: "+nombres[i]);
            
           
        }

        
        
        
     

    }
    
}
