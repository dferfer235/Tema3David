
package EjEstructurasSelec;

/**
 *
 * ¿Qué realiza el siguiente programa Java?
 */
public class Ej8 {

    

    public static void main(String args[]){
      char departamento = 'B';//Se crea una variable char para un departamento
                              //En este caso departamento guarda un valor de 'B'

      switch(departamento)//switch que observa el valor de la variable departamento
          //En este caso su valor hace que solo se ejecute el case 'B'
      {
         case 'A' :
            System.out.println("Desarrollo");
            break;
         case 'B' :
    	System.out.println("Recursos Humanos");
            break;
            //Se muestra el print y se sale del switch
         case 'C' :
            System.out.println("Finanzas");
            break;
         case 'D' :
            System.out.println("Mercadeo");
         default :
            System.out.println("Departamento no válido");
      }
      System.out.println("Código para el departamento es " + departamento);
   }

    
}
