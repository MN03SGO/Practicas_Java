
package ejerciciowhile;

import java.util.Scanner;

public class EjercicioWhile {

    public static void main(String[] args) {
      //**  int  contador  = 0;
       // while(contador <10){
          //  System.out.println("Estoy en la vueltaL: "+contador);
         //   contador ++;
        //}
        
        
        //BUCLE POR CENTINELA 
        boolean bandera = true;
        Scanner leva = new Scanner (System.in);
        String respue;
         
        while(bandera == true ){
            System.out.println(" EL VALOR DE LA BANDERA ES:  "+bandera);
            System.out.println("ESTAS EN LA SILLA? "+bandera);
            System.out.println("TE QUERES LEVANTAR DE LA SILLA");
            
            respue = leva.next();
            if (respue.equalsIgnoreCase("si") ){
                bandera = false;
                System.out.println("POR QUE QUIERES levantar");
            }
    
           
            
        }
            
            
            
        
 
    }
    
}
