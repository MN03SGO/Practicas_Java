
package ejercicio_ternario;

import java.util.Scanner;

public class Ejercicio_ternario {

    public static void main(String[] args) {
        //MENOR QUE 5
        // MAYOR O IGUAL A 5  PERO MENOR O IGUAL A 15
        // MAYOR A 15
        //CADA PAQUETE VALE $10
        
        
        int cantidad, precioPROMO;
       
        double precioFIN, precioNECE, totaGASTADO,descuento1,descuento2,precioDES1,precioDES2,nuevoTOTA1,nuevoTOTA2;
        descuento1  = 0.05;
        descuento2 = 0.10;
        Scanner entra = new Scanner(System.in);
        
        System.out.println("INGRESE LA CANTIDAD DE PAQUETES"); 
        cantidad = entra.nextInt();
        
        
       
        totaGASTADO = (cantidad*10);
        precioNECE = (100-totaGASTADO);
        //DESCUENTOS 
        precioDES1 = (totaGASTADO*descuento1)/10.0;//descuento del 5%
        precioDES2 =(totaGASTADO*descuento2)/10.0;//descuento del 10%
        
        
        
        //TOTALES
        nuevoTOTA1 = (totaGASTADO-precioDES1); //TOTA DEL 5%
        nuevoTOTA2 = (totaGASTADO-precioDES2); //tota del 10%
        
 
        //
        
        if(cantidad <0){
            System.out.println("NO SE PERMITEN COMPRAS INFERIORES A 5 PRODUCTOS");
            if(cantidad < 5){
                System.out.println("NO SE PERMITEN COMPRAS NEGATIVAS");
            
            }
            
        }
        else if(cantidad >=5 && cantidad <= 15){
            System.out.println("EL COSTO DE ENVIO ES DE $10 USD");
            
            if(cantidad < 10){
                System.out.println("NO HAY PROMOCIONES, NECESITAS $"+precioNECE+" MAS PARA PODER ENTRAR EN UNA PROMO");
            }
            else if(totaGASTADO>100 && totaGASTADO<300){
                System.out.println("POSEE UN DESCUENTO DE 5% SOBRE EL TOTAL $"+totaGASTADO+
                        " EL NUEVO MONTO CON DESCUENTO ES DE: $"+nuevoTOTA1);
            }
            else if(totaGASTADO>300){
                System.out.println("POSEE UN DESCUENTO DE DEL 10% SOBRE EL TOTAL $"+totaGASTADO+
                        "SU NUEVO MONTO ES CON TOTAL DESCUENTO ES DE $"+nuevoTOTA2);
            }
            
            
        }
        else{
            System.out.println("EL ENVIO ES GRATUITO");
        
        }
        
        
 
        
    }
    
}
