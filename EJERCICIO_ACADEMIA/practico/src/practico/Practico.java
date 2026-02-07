
package practico;

import java.util.Scanner;

public class Practico {
    public static void main(String[] args) {
        System.out.println("**PARQUEO**");
        String placa = "";

        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;

        double diaTOT = 0;
        Scanner entrada = new Scanner(System.in);


        

        while(!placa.equalsIgnoreCase("fin")){
            System.out.println("-- INGRESE EL NUMERO DE PLACAS --");
            entrada = new Scanner(System.in);
            placa = entrada.next();

            System.out.println("** LOS SERVICIOS DISPONIBLES SON: **");
            System.out.println("1- Por hora");
            System.out.println("2- Media jornada");
            System.out.println("3- Jornada completa");

            entrada = new Scanner(System.in);
            int servi = entrada.nextInt();

            if(servi<=0 || servi>3){
                System.out.println("Peticion invalida");
            }
            else{
                if(servi == 1){
                    System.out.println("** Servicio seleccionado: Por hora **");
                    System.out.println("-- INGRESE LAS HORAS --");
                    entrada = new Scanner(System.in);
                    servi = entrada.nextInt();

                    int totaHORAS = (servi*3);
                    System.out.println("--Su total a pagar es de: "+totaHORAS);
                    cont1++;
                    diaTOT=diaTOT+totaHORAS;
                }
                else if (servi== 2) {
                    System.out.println("** Servicio seleccionado: Media jornada **");
                    System.out.println("El valor por el servicio de 5h es de $15 y posee un descuento del 5%");
                    double totDESC1 = 15-(15*0.05);
                    System.out.println("--Su total a pagar es de: " + totDESC1);
                    cont2++;
                    diaTOT=diaTOT+totDESC1;
                }
                else{
                    System.out.println("** Servicio seleccionado: Jornada completa **");
                    System.out.println("El valor por el servicio de 30h es de $30 y posee un descuento del 5%");
                    double des2 = 30-(30*0.10);
                    System.out.println("--Su total a pagar es de: " + des2);
                    cont3++;
                    diaTOT=diaTOT+des2;
                }
            }
        }
        System.out.println("");
        System.out.println("-- Cantidad de servicio por hora: "+cont1);
        System.out.println("-- Cantidad de servicio por media jornada: "+cont2);
        System.out.println("-- Cantidad de servicio por jornada completa: "+cont3);
        System.out.println("-- Total de ganancia del dia : $"+diaTOT);
        

    }
    


        
        
    
    
    
}
