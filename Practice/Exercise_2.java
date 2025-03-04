import java.util.Scanner;

public class Exercise_2 {
    // Secuenciales
    /*
     * 2. Realizar en Java un programa que calcule el área de un triángulo y
     * visualice el resultado según se
     * indica. La base y la altura serán valores reales dados en el programa.
     */
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Dame la base del triángulo:");
        double base_triangulo = sc.nextDouble();
        System.out.println("Dame la altura del triángulo");
        double altura_triangulo = sc.nextDouble();
        double area_triangulo = (base_triangulo * altura_triangulo) / 2;
        System.out.println("El área de un triángulo de base " + base_triangulo + " cm. y altura 3.5" + altura_triangulo
                + " cm. es " + area_triangulo + " cm. cuadrados");
    }
}