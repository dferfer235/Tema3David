package ejEstructurasSelec;

/**
 *
 * @author davidfdez
 */
public class Ej3 {

    public static void main(String[] args) {

        boolean valor1 = true, valor2 = false;
        boolean unaCondicion = true;
        boolean resultado = unaCondicion ? valor1 : valor2;

        System.out.println(resultado);//true

        int x = 10;
        int y = (x > 9) ? 100 : 200;

        System.out.println(y);//y = 100

        int publico = 19500;
        int vendidas = 19000;
        int aforo = 2000;
        String status = (publico < aforo)
                ? "Cabe mas gente"
                : (vendidas < aforo) ? "Aun no hemos vendido todo"
                        : "Esta todo vendido";

        System.out.println(status);//Esta todo vendido
    }

}
