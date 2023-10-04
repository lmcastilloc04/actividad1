import java.io.PrintStream;
import java.util.Scanner;

public class Ejer7 {

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main (String[] args) {
        double ancho;
        double alto;
        double largo;
        double volumen;

        screen.println("Ingrese el alto del acuario cm:");
        alto = keyboard.nextDouble();
        screen.println("Ingrese el ancho del acuario cm:");
        ancho = keyboard.nextDouble();
        screen.println("Ingrese el largo del acuario cm:");
        largo = keyboard.nextDouble();
        screen.println("Ingrese el volumen del acuario cm:");
        volumen = keyboard.nextDouble();

        volumen = alto*ancho*largo;
        volumen = volumen * 0.90;

        screen.println("El volumen de agua necesario equivale a: "+volumen+" cm3");
    }
}
