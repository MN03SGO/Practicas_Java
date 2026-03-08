package retroalimentacion;

import java.util.Scanner;

public class RetroAlimentacion {
    public static void main (String [] args){
    String palabra;
    int contador;
    System.out.println("Ingrese una palabra");
    Scanner entrada = new Scanner(System.in);
    palabra = entrada.nextLine();
    while ( !palabra.equalsIgnoreCase("salir")){
        System.out.println("Vuelva a intentarlo: "+palabra);
        System.out.println("Ingrese una palabra");
        entrada = new Scanner(System.in);
        palabra = entrada.nextLine();
     
     }
        System.out.println("HAS  SALIDO");
       
    
    }


}