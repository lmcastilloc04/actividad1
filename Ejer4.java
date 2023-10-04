import java.io.PrintStream;
import java.util.Scanner;

public class Ejer4 {

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main (String[] args) {
        int plata;
        int mil;
        int quinientos;
        int docientos;
        int cien;
        int cincuenta;
        int uno;

        screen.println("ingrese la cantidad de numero que quiere dividir");
        plata = keyboard.nextInt();
        mil=plata/1000;
        plata=plata % 1000;
        quinientos=plata /500;
        plata=plata % 500;
        docientos=plata / 200;
        plata=plata % 200;
        cien=plata / 100;
        plata=plata % 100;
        cincuenta=plata / 50;
        plata=plata % 50;
        uno=plata;

        screen.println("la cantidad ingresa se divide en: "+ mil +" monedas de mil "+quinientos+" monedas de quinientos "
                        + docientos+" monedas de docientos "+ cincuenta +" monedas de cincuenta "+ cien +"monedas de cien "+ uno +" monedas de un peso");
    }


}
