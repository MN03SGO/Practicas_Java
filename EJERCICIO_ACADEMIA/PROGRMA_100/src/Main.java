import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //REALIZA UN PROGRAMA DADO POR EL TECLADO UN LIMITE NUMERICO(POR EJEMPLO 100)
        //MUESTRE EN PANTALLA TODOS LOS NUMEROS HASTA ESE LIMITE (EMPEZANDO POR 1)

        int teclado;
        int i;
        System.out.println("**Ingrese limite**");
        Scanner entra = new Scanner(System.in);
        teclado = entra.nextInt();


        for( i=1; i<=teclado; i++){
            System.out.println(i);
        }



    }
}