/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author sigaran
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1, num2, respuesta;
       //SUMATORIA CON DECIMAL
        
        System.out.println("***SUMA DE NUMEROS***");
        Scanner teclado = new Scanner(System.in);
        System.out.println("PRIMER NUMERO");
        num1 = teclado.nextDouble();
        System.out.println("SEGUNDO NUMERO");
        num2 = teclado.nextDouble();
        respuesta = (num1 + num2);
        System.out.println("La sumatoria de los numeros es: "+respuesta);
        
       
        
        
        
    }
    
}
