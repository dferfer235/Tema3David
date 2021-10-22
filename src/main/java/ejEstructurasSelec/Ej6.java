package ejEstructurasSelec;

import java.util.Scanner;

/**
 * Reescribe el programa anterior utilizando estructuras if-else if.
 */
public class Ej6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");

        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular el área de un cuadrado...");
        } else if (opcion == 2) {
            System.out.println("Ha seleccionado calcular el área de un triángulo...");
        } else if (opcion == 3) {
            System.out.println("Ha seleccionado calcular el área de un círculo...");
        } else {
            System.out.println("Ha seleccionado terminar");
        }
    }

}
