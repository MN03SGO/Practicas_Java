/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_switch;

import java.util.Scanner;

/**
 *
 * @author sigaran
 */
public class EJERCICIO_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /**REALIZAR UN PROGRAMA SOLICITADO POR EL INSTITUTO, DONDE A PARTIR DEL INGRESO DE LA
        * EDAD DEL ALUMNO, EL SISTEMA INFROME POR PANTALLA  LOS DIAS Y HORARIOS CURSADOS
        */
       
        System.out.println("***ESCUELA NUEVA LUZ***");
        int edad;
       
        Scanner entra = new Scanner(System.in);
        System.out.println("- Ingrese la edad del alumno: ");
        edad = entra.nextInt();
        
        
        //IF, ELSE, IF
        
        if(edad >= 4 && edad <=6){
            System.out.println("**EL HORARIO ES**");
//            System.out.println("Lunes y miercoles de 16 a 17");
        
        }
        else if(edad >=7 && edad <=8){
            System.out.println("**EL HORARIO ES**");
            System.out.println("Martes y jueves de 16:30 a 17:30");
            
        }
        else if(edad >=9 && edad <=10){
            System.out.println("**EL HORARIO ES**");
            System.out.println("Martes y jueves de 17:30 a 19");
        }
        else if(edad >= 11 && edad <= 13){
            System.out.println("**EL HORARIO ES**");
            System.out.println("Lunes y miercoles de 17 a 18:30");
        }
        else{
            System.out.println("LA EDAD ES INCORRECTA");
        }
        
        
        
    }
    
}
