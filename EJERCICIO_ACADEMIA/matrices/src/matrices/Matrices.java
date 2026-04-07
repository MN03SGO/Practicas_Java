
package matrices;

import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        int matriz [] [] = new int [3][4 ];
        Scanner  entra = new Scanner(System.in);
        
        System.out.println("TAMANO: "+matriz.length);
        System.out.println("TAMANO Columna: "+matriz[0].length);
        
        
        for(int f=0; f <matriz.length; f++){
            for( int c = 0; c < matriz[0].length; c++){
                System.out.println("INGRESE EL VALOR DE LA FILA: "+ f +" COLUMNA "+ c ) ;
                matriz [f][c] = entra.nextInt();
            }
        }
        
        //recorrido de la muestra
        
        for (int  f =0; f < matriz.length; f ++){
            for (int c=0; c < 3; c++){
                System.out.println("Fila: "+ f +" Columna: "+ c + " Valor: " + matriz[f][c]);
                
            
        }
        }

    
            
        
        
        
        
     
    }
    
}
