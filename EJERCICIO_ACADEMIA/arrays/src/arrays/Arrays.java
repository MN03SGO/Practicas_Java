
package arrays;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);
        int numeros [] = new int  [5];
        numeros [0] = 15;
        numeros [1] = 34;
        numeros [2] = 12;
        numeros [3] = 32;
        numeros [4] = 54;
        
       
      
        
        
        for (int i=0; i<numeros.length; i++){
            System.out.println("INGRE V FOR I: "+i);
            numeros [i] = teclado.nextInt();
        } 
    }
    
}
