/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diaxhorario;

import static java.lang.ProcessBuilder.Redirect.to;
import java.util.Scanner;

/**
 *
 * @author sigaran
 */
public class DiaXhorario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int edad;
        String nom1;
        
        System.out.println("INGRESE EL NOMBRE DEL ALUMNO");
        Scanner entra1 = new Scanner(System.in);
        nom1 = entra1.next();
        
        System.out.println("*****************************");
        System.out.println("INGRESE LA EDAD DEL ALUMNO");
        Scanner entra2 = new Scanner(System.in);
        edad = entra2.nextInt();
        
        if(edad >= 4 && edad <=6){
            System.out.println("lunes y miercoles de 16 a 17");
            
         
        }
        else if(edad >=7 && edad <=8){
           System.out.println("martes y jueves de 16:30 a 17:39");
        }
        else if(edad >=9 && edad<=10){
           System.out.println("martes y jueves de 17:30 a 19");
        }
        else if(edad >= 11 && edad<=13){
           System.out.println(" lunes y miercoles de 17 a 18:30");
        }
       
        
        else{
            System.out.println("INGRESE UNA EDAD VALIDA");
        }
      
     
        
        
        
       
      
    }
    
}
