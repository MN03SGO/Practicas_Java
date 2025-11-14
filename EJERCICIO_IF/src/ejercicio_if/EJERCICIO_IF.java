/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_if;

import java.util.Scanner;

/**
 *
 * @author sigaran
 */
public class EJERCICIO_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("INGRESE LA EDAD: ");
        edad = teclado.nextInt();
        
        if(edad > 18){
            System.out.println("ERES MAYOR");
        }
        else if(edad == 18){
            System.out.println("TIENES LA EDAD IGUAL");
        }
        else{
            System.out.println("NO TIENES LA EDAD REQUERIDA");
        }
   
       
       
       
        
        
        
    }
    
}



