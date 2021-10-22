package ejEstructurasSelec;

public class Ej10 {

    /**
     * Modifica el código anterior para que variable2 valga 30.
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
                break;
            case 4:
                variable2 = 10;
                break;
            default:
                variable2 = 100;
                break;
        }
        System.out.println(variable2);
    }

}
