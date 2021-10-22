package ejEstructuraRepe;

/**
 * @author davidfdez
 */
public class Ej04 {

    public static void main(String[] args) {
        int numero = 1;

        while (numero < 11) {
        //El programa comienza realizando un while 
        //con una serie de numeros del 1 al 10
            System.out.println("Número: " + numero);
            numero++;
        }
        do {
        //Despues el programa continua con un dowhile que hace una serie 
        //que invierte la anterior, desde el 10 hasta el 1
            System.out.println("Número: " + --numero);
        } while (numero > 1);
    }
}
