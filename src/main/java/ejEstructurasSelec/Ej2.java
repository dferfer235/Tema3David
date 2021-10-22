package EjEstructurasSelec;

/**
 * Utilizando el operador ternario ?: de Java, implementa las siguientes
 * sentencias:
 *
 * Si el número “x” es mayor o igual que 135 se devolverá “mayor”, si es menor
 * se devolverá “menor”. Las cadenas que se devuelven se guardarán en una
 * variable llamada resultado.
 *
 * Si el número “x” es menor o igual que cero se imprimirá en pantalla “Menor
 * que cero”, si no se imprimirá “Mayor que cero”.
 *
 * Guardar el valor absoluto de un número entero en una variable entera (sin
 * usar la función Math.abs())
 */
public class Ej2 {

    public static void main(String[] args) {
        int x = 100;
        boolean mayorMenor = (x <= 135) ? true : false;

        if (mayorMenor == true) {
            System.out.println("Es mayor o igual que 135");
        } else {
            System.out.println("No es mayor que 135");

        }

        boolean mayorIgual = (x <= 0) ? true : false;

        if (mayorIgual == true) {
            System.out.println("Es mayor o igual que 0");
        } else {
            System.out.println("No es mayor que 0");

        }

    }
}
