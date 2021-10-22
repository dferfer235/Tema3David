package ejEstructurasSelec;

import java.util.Scanner;

/**
 * Leer un número entero entre 1 y 10 y mostrar el número escrito en numeros
 * romanos. Usa Switch
 *
 * @author davidfdez
 */
public class DiapC {

    public static void main(String[] args) {
        Scanner teclado;

        teclado = new Scanner(System.in);

        System.out.println("Introduzca el numero del 1 al 10");
        int numero = teclado.nextInt();

        switch (numero) {
            case 1:
                System.out.println("EL numero " + numero + " es I en numero romanos");
                break;
            case 2:
                System.out.println("EL numero " + numero + " es II en numero romanos");
                break;
            case 3:
                System.out.println("EL numero " + numero + " es III en numero romanos");
                break;
            case 4:
                System.out.println("EL numero " + numero + " es IV en numero romanos");
                break;
            case 5:
                System.out.println("EL numero " + numero + " es V en numero romanos");
                break;
            case 6:
                System.out.println("EL numero " + numero + " es VI en numero romanos");
                break;
            case 7:
                System.out.println("EL numero " + numero + " es VII en numero romanos");
                break;
            case 8:
                System.out.println("EL numero " + numero + " es VIII en numero romanos");
                break;
            case 9:
                System.out.println("EL numero " + numero + " es IX en numero romanos");
                break;
            case 10:
                System.out.println("EL numero " + numero + " es X en numero romanos");
                break;

            default:
                System.out.println("No es un numero valido");
        }

    }

}
