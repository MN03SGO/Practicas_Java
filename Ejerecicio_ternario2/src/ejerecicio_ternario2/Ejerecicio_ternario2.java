package ejerecicio_ternario2;

import java.util.Scanner;

/**
 *
 * @author sigaran
 */
public class Ejerecicio_ternario2 {

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
                monto = +10;
                
            } else {
                System.out.println("EL ENVIO ES GRATIS");
            }

            if (monto < 100) {
                montoFALTANTE = 100 - monto;
                //OPERACION DE MONTO
                System.out.println("EL MONTO ES MENOR A $100, LE HACEN FALTA $" + montoFALTANTE);

            }

        }

    }
}
