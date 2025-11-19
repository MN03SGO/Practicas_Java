
package ejercicio;

import java.util.Scanner;


public class EJERCICIO {

    public static void main(String[] args) {

        //reutilizar la variable de entra
        int canti_PRODU;
        double monto, montoFALTANTE, montoDESCUENTO1, montoDESCUENTO2, nuevoMONTO1, nuevoMONTO2;

        Scanner entra = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de paquetes");
        canti_PRODU = entra.nextInt();

        if (canti_PRODU < 5) {
            System.out.println("NO SE PERMITEN COMPRAS MENORES A 5 PAQUETES");
            if (canti_PRODU <= 0) {
                System.out.println("NO SE PERMITEN CANTIDADES NEGATIVAS");
            }
        } else {
            //REUTILIZACION DE VARIABLE ENTRA

            entra = new Scanner(System.in);
            System.out.println("EL MONTO ES DE: ");
            monto = entra.nextDouble();

            if (canti_PRODU > 5 && canti_PRODU <= 15) {
                System.out.println("EL COSTO DE ENVIO ES DE $10");
                monto = monto + 10;
                if (monto < 100) {
                    montoFALTANTE = 100 - monto;
                    System.out.println("EL MONTO ES MENOR A $100, LE HACEN FALTA $" + montoFALTANTE);
                }else{
                    montoDESCUENTO1 = (monto * 0.10);
                    nuevoMONTO1 = (monto - montoDESCUENTO1);
                    System.out.println("POSEE UN DESCUENTO DEL 10% sobre el total");
                    System.out.println("EL DESCUENTO ES EQUIVALENTE " + montoDESCUENTO1);
                    System.out.println("SU NUEVO MONTO CON DESCUENTO ES DE: $" + nuevoMONTO1);
                    
                
            }
                


            } else {
               if (monto > 100 && monto < 300){
                    montoDESCUENTO1 = (monto * 0.05);
                    nuevoMONTO1 = (monto - montoDESCUENTO1);
                    System.out.println("POSEE UN DESCUENTO DEL 5% sobre el total");
                    System.out.println("EL DESCUENTO ES EQUIVALENTE " + montoDESCUENTO1);
                    System.out.println("SU NUEVO MONTO CON DESCUENTO ES DE: $" + nuevoMONTO1);
                    

               }else{
                    montoDESCUENTO1 = (monto * 0.10);
                    nuevoMONTO1 = (monto - montoDESCUENTO1);
                    System.out.println("POSEE UN DESCUENTO DEL 10% sobre el total");
                    System.out.println("EL DESCUENTO ES EQUIVALENTE " + montoDESCUENTO1);
                    System.out.println("SU NUEVO MONTO CON DESCUENTO ES DE: $" + nuevoMONTO1);
               }
                    
               
              
            }
        }

    }
}