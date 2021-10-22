package ejEstructurasSelec;

import java.util.Scanner;

/**
 *
 * @author davidfdez
 */
public class EjBucleSeleccion {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        int opcionRepetir;
        boolean repetir = true;

        do {
            switch (opcion) {
                case 0:
                    System.out.println("Menú de opciones");
                    System.out.println("-------------------------");
                    System.out.println("1. Calcular el área de un Cuadrado");
                    System.out.println("2. Calcular el área de un Triángulo");
                    System.out.println("3. Calcular el área de un Círculo");
                    System.out.println("4. Finalizar");

                    System.out.println("Elija una opción: ");
                    opcion = entrada.nextInt();
                    if (opcion==0) {
                        opcion = 999;
                    }
                    break;
                case 1:
                    System.out.println("Ha seleccionado calcular el área de un cuadrado...");
                    System.out.println("Calculando el area del cuadrado...");
                    System.out.println("Proceso listo ¿Desea finalizar?");
                    System.out.println("-------------------------");
                    System.out.println("1. Si, deseo finalizar el programa");
                    System.out.println("2. No, voy a realizar otra operacion");
                    opcionRepetir = entrada.nextInt();
                    if (opcionRepetir == 1) {
                        opcion = 4;
                    } else {
                        if (opcionRepetir != 2) {
                            System.out.println("Opcion no valida, volviendo al menú");
                        }
                        opcion = 0;
                    }
                    break;
                case 2:
                    System.out.println("Ha seleccionado calcular el área de un triángulo...");
                    System.out.println("Calculando el area del triángulo...");
                    System.out.println("Proceso listo ¿Desea finalizar?");
                    System.out.println("-------------------------");
                    System.out.println("1. Si, deseo finalizar el programa");
                    System.out.println("2. No, voy a realizar otra operacion");
                    opcionRepetir = entrada.nextInt();
                    if (opcionRepetir == 1) {
                        opcion = 4;
                    } else {
                        if (opcionRepetir != 2) {
                            System.out.println("Opcion no valida, volviendo al menú");
                        }
                        opcion = 0;
                    }
                    break;
                case 3:
                    System.out.println("Ha seleccionado calcular el área de un círculo...");
                    System.out.println("Calculando el area del circulo...");
                    System.out.println("Proceso listo ¿Desea finalizar?");
                    System.out.println("-------------------------");
                    System.out.println("1. Si, deseo finalizar el programa");
                    System.out.println("2. No, voy a realizar otra operacion");
                    opcionRepetir = entrada.nextInt();
                    if (opcionRepetir == 1) {
                        opcion = 4;
                    } else {
                        if (opcionRepetir != 2) {
                            System.out.println("Opcion no valida, volviendo al menú");
                        }
                        opcion = 0;
                    }
                    break;
                case 4:
                    System.out.println("Ha seleccionado terminar");
                    repetir = false;
                    break;
                default:
                    System.out.println("Opcion no valida, introduzca una opcion correcta");
                    opcion = 0;
            }

        } while (repetir);

    }
}
