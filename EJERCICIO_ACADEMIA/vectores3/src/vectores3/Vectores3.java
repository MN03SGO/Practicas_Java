
package vectores3;

import java.util.Scanner;

public class Vectores3 {

    public static void main(String[] args) {
      int numeros [] = new int [15];
      Scanner entrada = new Scanner(System.in);
      
      for (int i = 0; i <numeros.length; i++){
          System.out.println("Ingrese el numero que se cargara en la posicion: "+i);
          numeros [i] = entrada.nextInt();
          
      }
      
      //contar numeros 3
      int cont3 = 0;
       for (int i = 0; i <numeros.length; i++){
           if (numeros[i]==3 || numeros[i] == -3){
               cont3 = cont3+1;
           }
           
       }
         System.out.println("La cantidad de 3 es de: "+cont3);
      
    }
    
}
