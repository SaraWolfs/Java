import java.lang.Math;
import java.util.Scanner;

public class Exercise_1 {
    //Secuenciales
    /*1. Realizar en Java un programa que calcule el cuadrado y el cubo de un número entero dado en el 
    programa y visualice los resultados. Utiliza el método pow de la librería Math de Java.*/ 
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Dame un número para calcular su resultado al cuadrado y al cubo");
        int numero= sc.nextInt();
        int numero_cuadrado = (int) Math.pow(numero, 2);
        int numero_cubo = (int) Math.pow(numero, 3);
        System.out.println("Número "+numero+ "\nResultado al cuadrado: "+numero_cuadrado+" y al cubo: "+numero_cubo);
    }
}
