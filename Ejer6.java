import java.io.PrintStream;
import java.util.Scanner;

public class Ejer6 {

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main (String[] args) {
        int segundos;
        int minutos;
        int horas;
        int dias;

        screen.println("ingrese el numero de segundos");
        segundos = keyboard.nextInt();
        dias = segundos / 86400;
        segundos = segundos % 86400;
        horas = segundos / 3600;
        segundos = segundos % 3600;
        minutos = segundos / 60;
        segundos = segundos % 60;

        screen.println("la cantidad : "+ mil +" monedas de mil "+quinientos+" monedas de quinientos "
                + docientos+" monedas de docientos "+ cincuenta +" monedas de cincuenta "+ cien +"monedas de cien "+ uno +" monedas de un peso");

    }
}
