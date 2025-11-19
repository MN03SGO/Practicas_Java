package ejerecicio_ternario2;

import java.util.Scanner;

/**
 *
 * @author sigaran
 */
public class Ejerecicio_ternario2 {

    public static void main(String[] args) {
        int cant_PRODUCTOS;
        
        double monto;
        
        System.out.println("_________________________________");
        System.out.println("INGRESE LA CANTIDAD DE PRODUCTOS");
        System.out.println("_________________________________");
        Scanner entra = new Scanner(System.in);
        cant_PRODUCTOS = entra.nextInt();
        
        
        System.out.println("_________________________________");
        System.out.println("INGRESE EL MONTO");
        System.out.println("_________________________________");
        entra = new Scanner(System.in);
        monto = entra.nextDouble();
            

        
        
        
        if(cant_PRODUCTOS <5){
            entra = new Scanner(System.in);entra = new Scanner(System.in);
            
            System.out.println("--No se permiten compras menores a 5 productos--");
            if(cant_PRODUCTOS <=0){
                System.out.println("--NO SE PERMITEN COMPRAS NEGATIVAS");
            }
        }
        
        else {
            if (cant_PRODUCTOS >= 5 && cant_PRODUCTOS <= 15) {
                System.out.println("EL COSTO DE ENVIO ES DE $10");
            } else if (cant_PRODUCTOS > 15) {
                System.out.println("EL ENVIO ES GRATIS **");
            }

        }

        
        
        
        
        
        
        
        
        
    }
}