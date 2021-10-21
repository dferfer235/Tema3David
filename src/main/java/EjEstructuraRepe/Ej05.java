package EjEstructuraRepe;

import java.util.Scanner;

/**
 *
 * @author davidfdez
 */
public class Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, x;
        System.out.println("Ingrese el valor final:");
        n = teclado.nextInt();
        x = 1;
        do {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        } while (x <= n);

    }
}
