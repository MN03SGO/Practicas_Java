
package practicaarra;

import java.util.Scanner;

public class PracticaArra {

    public static void main(String[] args) {
    int numeros [] = new int [8];
    
        /*numeros[0] = 15;
        numeros[1] = 3;
        numeros[2] = 45;
        numeros[3] = 67;
        numeros[4] = 17;
        numeros[5] = 54;
        numeros[6] = 87;
        numeros[7] = 32;*/
        
        Scanner entra = new Scanner(System.in);
        
        
        for (int i = 0; i<numeros.length; i++ ){
            
            System.out.println("INGRESE VALOR PARA EL INDICE: "+i);
            
            numeros[i] = entra.nextInt();

        }
        System.out.println("Estoy en el indice  mi valor es: ");
        
         for (int i = 0; i<numeros.length; i++ ){
             System.out.println("indice: "+i+"valor: "+numeros[i]);

        }
         

    }
    
   
    
}
