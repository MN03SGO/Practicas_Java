
package ejercicio_vectores;

import java.util.Scanner;

public class Ejercicio_vectores {

    public static void main(String[] args) {
     
        double notas [][] = new double [3][4];
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i<notas.length; i++){
            System.out.println("Ingrese las notas a almacenar el vector inicial: "+i);
            notas[i][i] = entrada.nextDouble();
            
        }
        
    }
    
}
