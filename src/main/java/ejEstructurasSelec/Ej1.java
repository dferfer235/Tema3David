package ejEstructurasSelec;

import java.util.Scanner;

/**
 *10= NO es mayor de edad
 *18= Es mayor de edad
 *67= Es mayor de edad
 * @author davidfdez
 */
public class Ej1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("escanear edad:");

        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

        System.out.print("mostrar la edad: ");
        System.out.println(edad);
    }

}
