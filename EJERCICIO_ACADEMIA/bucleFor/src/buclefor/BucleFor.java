/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buclefor;

public class BucleFor {

    public static void main(String[] args) {
        int suma =0;
          for(int contador =0;contador <10;contador ++ ){
              System.out.println("ESTOY EN UNA VUELTA  "+contador);
              suma = 5 +contador;
              
              if(suma>=7){
                  contador = 11;
              }
                  
          }
    }
    
}
