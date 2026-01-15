/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_paquetes;

import java.util.Scanner;

/**
 *
 * @author sigaran
 */
public class EJERCICIO_PAQUETES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int paquetes;
        double precio;

        System.out.println("- Ingrese la cantidad de paquetes");
        Scanner entrada1 = new Scanner(System.in);
        paquetes = entrada1.nextInt();

        if (paquetes < 5) {
            if (paquetes < 0) {
                System.out.println("** NO SE PERMITEN COMPRAS NEGATIVAS");
            } else {
                System.out.println("** NO SE PERMITEN COMPRAS MENORES A 5 PRODUCTOS");
            }

            // EMPIEZA EJERCICIO
        } else if (paquetes >= 5 && paquetes <= 15) {
            System.out.println("**El costo del envio es de $10");
            System.out.println("- INGRESE EL PRECIO DEL PAQUETE  ");
            entrada1 = new Scanner(System.in);
            precio = entrada1.nextDouble();

            precio = (precio + 10);

            if (precio < 100) {
                double precioFaltante = (100 - precio);
                System.out.println("- SU TOTAL CON ENVIO AGREGADO ES DE: $ " + precio);
                System.out.println("- NO HAY PROMOCIONES, LE HACEN FALTA:  $" + precioFaltante + "  PARA PODER \nPARA PODER ENTRAR EN UNA PROMO");
            } else if (precio > 100 && precio < 300) {
                double descuento1 = (precio * 0.05);
                double precioFINAL1 = (precio - descuento1);

                System.out.println("** POSEE UN DESCUENTO DEL 5% QUE EQUIVALE A: " + descuento1);
                System.out.println("** SU NUEVO MONTO CON DESCUENTO ES DE: $" + precioFINAL1);
            } else if (precio > 300) {
                double descuento2 = (precio * 0.10);
                double precioFINAL2 = (precio - descuento2);
                System.out.println("** POSEE UN DESCUENTO DE 10%  QUE EQUIVALE A: " + descuento2);
                System.out.println("** SU NUEVO MONTO CON DESCUENTO ES DE $" + precioFINAL2);
            }

        } else {
            System.out.println("- INGRESE EL PRECIO DEL PAQUETE  ");
            entrada1 = new Scanner(System.in);
            precio = entrada1.nextDouble();
            
            if (precio > 100 && precio < 300) {
                double descuento1 = (precio * 0.05);
                double precioFINAL1 = (precio - descuento1);
                System.out.println("SU ENVIO ES GRATIS");
                System.out.println("** POSEE UN DESCUENTO DEL 5% QUE EQUIVALE A: " + descuento1);
                System.out.println("** SU NUEVO MONTO CON DESCUENTO ES DE: $" + precioFINAL1);
            } else if (precio > 300) {
                double descuento2 = (precio * 0.10);
                double precioFINAL2 = (precio - descuento2);
                System.out.println("SU ENVIO ES GRATIS");
                System.out.println("** POSEE UN DESCUENTO DE 10%  QUE EQUIVALE A: " + descuento2);
                System.out.println("** SU NUEVO MONTO CON DESCUENTO ES DE $" + precioFINAL2);
            }
            
            

      
            } 
        }

        // SECUENCIA DEL EJERCICIO
    }


