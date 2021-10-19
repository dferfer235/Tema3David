package EjEstructurasSelec;

public class Ej9 {

    /**
     * ¿Cuánto vale variable2 al finalizar la ejecución del switch?
     */
    public static void main(String[] args) {
        int variable = 1, variable2;
        switch (variable) {
            case 1:
                variable2 = 5;
                break;
            case 2:
                variable2 = 20;
                break;
            case 3:
                variable2 = 30;
            case 4:
                variable2 = 10;
            default:
                variable2 = 100;
                break;
        }
        System.out.println(variable2);
        //Debido a la falta de break; en el case 3; y case 4; El programa pasa
        //directamente al default y se le asigna un valor de 100 a variable2
        //Si ponemos un break en cada case, el switch se ejecuta sin problema
    }

}
