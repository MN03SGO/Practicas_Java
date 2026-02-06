import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //MIENTRAS NO INGRESE LA PALABRA SALIR NO SALE DEL BUCLE

        String palabra;

        System.out.println("*Ingrese la palabra*");
        Scanner pa=new Scanner(System.in);
        palabra = pa.next();

        while (!palabra.equals("salir")){
            System.out.printf("La palabra es:"+palabra);
            System.out.println("\n*Ingrese la palabra*");
            palabra = pa.next();
        }

    }
}