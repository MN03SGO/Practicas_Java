/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codewar_funcion_if;

import java.util.Scanner;

/**
 *
 * @author sigaran
 */
public class CODEWAR_FUNCION_IF {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[]arg){ 

        int edad;

        Scanner tecla = new Scanner(System.in);
        
       

        System.out.println("***ESCUELA VERDE AZUL***");

        System.out.println("Ingresa la edad del alumno");
        edad = tecla.nextInt();

        switch(edad){
            
            case 4,6 -> System.out.println("Lunes y miercoles de 16 a 17");
            case 7,8 -> System.out.println("Martes y jueves");   
            case 9,10 -> System.out.println("Martes y jueves de 17:30 a 19");
            case 11,13 -> System.out.println("Lunes y miercoles de 17 a 18:30");
            
             
             
            
        
        }

        
                
                
        

    }


}



