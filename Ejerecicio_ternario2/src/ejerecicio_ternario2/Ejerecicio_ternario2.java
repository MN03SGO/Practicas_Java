package ejerecicio_ternario2;

import java.util.Scanner;

/**
 *
 * @author sigaran
 */
public class Ejerecicio_ternario2 {

    public static void main(String[] args) {
        int cant_PRODUCTOS;
        
        double  monto,descuento1, descuento2,res1 ,tota1, tota2, faltante1, faltante2;
        
        System.out.println("_________________________________");
        System.out.println("INGRESE LA CANTIDAD DE PRODUCTOS");
        System.out.println("_________________________________");
        Scanner entra = new Scanner(System.in);
        cant_PRODUCTOS = entra.nextInt();
        
       

        
        
        
        if(cant_PRODUCTOS <5){
            
            System.out.println("--No se permiten compras menores a 5 productos--");
            if(cant_PRODUCTOS <=0){
                System.out.println("--NO SE PERMITEN COMPRAS NEGATIVAS");
            }
        }
        
        
        else {

            entra = new Scanner(System.in);
            System.out.println("_________________________________");
            System.out.println("INGRESE EL MONTO");
            System.out.println("_________________________________");
            monto = entra.nextDouble();

            
            
            if (cant_PRODUCTOS >= 5 && cant_PRODUCTOS <= 15) {
                System.out.println("EL COSTO DE ENVIO ES DE $10");
                monto = monto +10;

            }
            else{
                System.out.println("EL MONTO ES GRATIS");
            }
            if(monto<100){
                res1=100-monto;
                System.out.println("El monto es menor a 100 le hacen  falta: $"+res1);
            
            }if(monto>100 && monto<300){
                descuento1 = (monto * 0.05);
                tota1 = (monto-descuento1);
                System.out.println("Tiene un descuento del 5% equivale a: "+descuento1);
                System.out.println("--Su nuevo total con descuento es de: $"+ tota1);
            }
            if(monto>300){
                    descuento2  = (monto*0.10);
                    tota2 = (monto-descuento2);
                    System.out.println("Tiene un descuento del 10% equivale a: "+descuento2);
                    System.out.println("--Su nuevo total con descuento es de: $"+tota2);
                
            }
     
            }
 
    }
}