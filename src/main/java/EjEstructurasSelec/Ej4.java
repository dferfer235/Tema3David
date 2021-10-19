package EjEstructurasSelec;

import java.util.Scanner;

/**
 *
 * @author davidfdez
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("escanear edad:");

        int edad = scanner.nextInt();

        boolean mayorEdad = (edad >= 18) ? true : false;

        String status = (mayorEdad == true)
                ? "Es mayor de edad"
                : "No es mayor de edad";

        System.out.println(status);

        System.out.print("mostrar la edad: ");
        System.out.println(edad);
    }

}
