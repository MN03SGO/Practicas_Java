/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores.ternarios;

import java.util.Scanner;

/**
 *
 * @author sigaran
 */
public class OPERADORESTERNARIOS {

   
    public static void main(String[] args) {
        //formula: variable = (condicion) ? si_aplica : no_aplica;
        
        
        /*EJEMPLO: 
            UN PROGRAMA QUE DEPENDIENDO DEL PROMEDIO DE UN ALUMNO, 
            NOS DIGA SI APROBO O NO UNA MATERIA
        */
        
        int materia1,materia2,materia3,materia4,totaSUM, totaFIN;
        //SECION MANUAL
        String promedioFIN;
        double prome;
        //ENTRADA
        int elegir;
        String estu;
        Scanner entra = new Scanner(System.in);
        System.out.println("**CALCULAR ALUMNOS APROBADOS**");
        System.out.println("**__________________________*");
        System.out.println("**1- (MANUAL) PARA PROMEDIO X MATERIA**");
        System.out.println("**2- (DIRECTO) PARA PROMEDIO**");
        elegir = entra.nextInt();
        
        switch (elegir){
            case 1: 
                 System.out.println("**PROMEDIO DE MATERIA**");
                 System.out.println("Ingrese nombre del alumno: ");
                 estu = entra.next();
                 System.out.println("**Ingrese LA NOTA QUE SACO**");
                 System.out.println("---Materias---");
                 System.out.println("CLASE 1");
                 System.out.println("MATEMATICAS");
                 materia1 = entra.nextInt();
                 System.out.println("CLASE 2");
                 System.out.println("SOCIALES");
                 materia2 = entra.nextInt();
                 System.out.println("CLASE 3");
                 System.out.println("CIENCIAS");
                 materia3 = entra.nextInt();
                 System.out.println("CLASE 4");
                 System.out.println("LENGUAJE");        
                 materia4 = entra.nextInt();
        //SUMA DE LAS NOTAS
                totaSUM = (materia1+materia2+materia3+materia4);
                totaFIN = totaSUM/4;
                promedioFIN = (totaFIN >= 5) ? "APROBADO" : "DESAPROBADO"; 
                System.out.println("total: "+promedioFIN);
                break;
            case 2: 
                System.out.println("INGRESE PROMEDIO");
                prome = entra.nextDouble() ;
                promedioFIN = (prome>=5) ? "APROBADO": "DESAPROBADO";
                System.out.println("ALUMNO: "+promedioFIN);
                break;
        }
        entra.close();
    }  
}
