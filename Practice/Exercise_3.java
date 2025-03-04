import java.util.Scanner;

public class Exercise_3 {
    // Secuenciales
    /*
     * 3. Realizar en Java un programa que utilice la constante PI de la librería
     * Math de Java, y calcule el área
     * de un círculo, el radio será un valor real dado en el programa. El programa
     * mostrará en pantalla el área y el perímetro correspondientes, según se indica.
     * [ A=PIr2 ] [ P=2rPI ]*/
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double radio_circulo = 0;
        double area_circulo = 0;
        double perimetro_circulo = 0;

        System.out.println("Dame el radio de tu círculo:");
        radio_circulo = sc.nextDouble();
        System.out.println("El área y el perímetro de un círculo de radio xx cm.  es xx cm. cuadrados y xx cm \r\n" + //
                "respectivamente");
    }
}
