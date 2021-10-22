package ejEstructurasSelec;

/**
 *
 * @author davidfdez
 */
public class DiapB {

    public static void main(String[] args) {
        char tipoLetra = 123;

        if (tipoLetra >= 48 && tipoLetra <= 57) {
            System.out.println("Es un digito");
        } else {
            if (tipoLetra >= 65 && tipoLetra <= 90) {
                System.out.println("Es un letra mayúscula");
            } else {
                if (tipoLetra >= 97 && tipoLetra <= 122) {
                    System.out.println("El numero es negativo");
                } else {
                    System.out.println("No es un caracter valido");
                }

            }
        }
    }

}
