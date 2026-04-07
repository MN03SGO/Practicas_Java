
package vectores4;

import java.util.Scanner;

public class Vectores4 {
    public static void main(String[] args) {
    double sueldo [] = new double [12];
    Scanner entrada = new Scanner(System.in);
    
    for (int i =0; i<sueldo.length; i++){
        System.out.println("Ingrese la cantidad de sus sueldos para cargar a la posicion: "+i);
        sueldo [i] = entrada.nextDouble();
    }
    
    //SUMA DE SUELDOS
    double suma = 0;
    for (int i =0; i<sueldo.length; i++){
        suma = suma + sueldo[i];
        
    }
    //Promedio 
    
    double promedio = suma/sueldo.length;
        System.out.println("La suma de los sueldos es: "+ suma);
        System.out.println("El promedi de sueldos es de: "+ promedio+" dolares");
           
       
    
    }
    
}
