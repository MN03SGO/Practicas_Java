
package practico;

import java.util.Scanner;

public class Practico {
    public static void main(String[] args) {
        System.out.println("** PARQUEO **");
        
        String placa = ""; 
        Scanner entra = new Scanner(System.in);
        
        
        while (!placa.equalsIgnoreCase("fin")){
            System.out.println("- Ingrese la placa");
            placa = entra.nextLine();
            
            
            System.out.println("- Ingrese el tipo de servicio");
            System.out.println("1- Por hora");
            System.out.println("2- Media jornada (5 horas)");
            System.out.println("3- Jornada completa (10 horas)");
            
            
            int servicio ;
            entra = new Scanner(System.in);
            servicio = entra.nextInt();
            
            if (servicio<0 ||servicio>3){
                System.out.println("Tipo de servicio invalido");
            }else{
                if (servicio ==1){
                    System.out.println(" **- SERVICIO SELECCIONADO: POR HORA -**");
                    System.out.println("- Ingrese cant Horas por el servicio");
                    entra = new Scanner(System.in);
                    int cantHoras = entra.nextInt();
                    int TotaPagar = (cantHoras*3); 
                    System.out.println("** EL MONTO A PAGAR ES DE: "+cantHoras);
                }else if( servicio == 2){
                    System.out.println("**- SERVICIO SELECCIONADO: MEDIA JORNADA -**");
                    System.out.println("");
                    
                }
                    
                    
                    
            }
              
            
            
            
            
            
           
          
            
            
            
            
            
            
            
          
           
        
        }
        
  
        
 
           
        
        
        
        
        
       
    }
    
}
