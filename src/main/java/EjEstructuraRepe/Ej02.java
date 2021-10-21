package EjEstructuraRepe;

import java.util.Scanner;

/**
 *
 * @author davidfdez
 */
public class Ej02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, x;
        System.out.print("Ingrese el valor final:");
        n = teclado.nextInt();
        x = 1;
        while (x <= n) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
            //El programa sigue una serie de 1 en 1 hasta llegar al 
            //valor que el usuario le asigna en n
        }
    }
}
