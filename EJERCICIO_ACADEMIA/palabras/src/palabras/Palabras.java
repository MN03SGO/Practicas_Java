/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palabras;

import java.util.Scanner;

public class Palabras {

    public static void main(String[] args) {
        String palabra;
        System.out.println("INGRESE LAS PALABRAS");
        
        Scanner tecla = new Scanner(System.in);
        palabra = tecla.nextLine();
        
        while (!palabra.equalsIgnoreCase("salir")) {
            System.out.println("La plabra es: " + palabra);
            System.out.println("INGRESE LAS PALABRAS");
            palabra = tecla.nextLine();

        }
        System.out.println("gracias");
    
    }
    
}
