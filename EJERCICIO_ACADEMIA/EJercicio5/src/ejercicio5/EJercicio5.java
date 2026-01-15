t/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

import java.util.Scanner;

/**
 *
 * @author sigaran
 */
public class EJercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidad ;
        double costo, montoTOTA1;
     
        
        //* REQUERIEMIENTO 1 
         System.out.println("INGRESE  LAS CANTIDAD DE PAQUETES");
         Scanner entrada1 = new Scanner(System.in);
         cantidad = entrada1.nextInt();
         
         
         
         if (cantidad<5){
             if  (cantidad<0){
                 System.out.println("NO SE PERMITEN COMPRAS NEGATIVAS");
             }else{
                 System.out.println("NO SE PERMITEN COMPRAS INFERIORES A  5 PRODUCTOS");
             }
         }else if(cantidad>=5 && cantidad<=15){
             
                          
          //* REQUERIEMIENTO 2
          System.out.println("INGRESE EL COSTO DE LA COMPRA");
          entrada1 = new Scanner(System.in);
          costo = entrada1.nextDouble();
          
          double costoSUMA= (costo +10);
          
         System.out.println("EL COSTO DE ENVIO ES DE $10");
          if(costoSUMA<100){
           montoTOTA1 = (100-costo);
              System.out.println("** LE HACEN FALTA $"+montoTOTA1+" PARA PODER ENTRAR A UNA PROMO");
             
  
          }
          else if(costoSUMA>100 && costo<300){
              // DESCUENTO DEL 5%
              System.out.println("SU COSTO FUE DEL: $"+costo);
              double totaFINAL1  = (0.05*costoSUMA); 
              System.out.println("** POSEE UN DESCUENTO  DEL 5% SOBRE EL TOTAL QUE EQUIVALE A: "+totaFINAL1 );
              
              double precioDescuento1= (costoSUMA-totaFINAL1);
              System.out.println("*** SU NUEVO TOTAL CON DESCUENTO ES DE: $"+precioDescuento1);
              

          }else if (costoSUMA>300){
              
              // DESCUENTO DEL 10%
              double totaFINAL2  = (0.10*costoSUMA); 
              System.out.println("** POSEE UN DESCUENTO DEL 10% QUE EQUIVALE A: "+totaFINAL2);
              double precioDescuento2=(totaFINAL2-0.10);
              System.out.println("*** SU NUEVO TOTAL CON DESCUENTO ES DE : $"+precioDescuento2);
          }
        
          
 
    
         }
         else{
             System.out.println("EL COSTO DE ENVIO ES GRATIS");
         }
  
    }
    
}
