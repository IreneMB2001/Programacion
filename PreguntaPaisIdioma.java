/*PreguntaPaisIdioma.java
*Sentencia if: programa que pregunta cual es la capital de un pais y responde si es correcto o incorrecto.
@Irene Martin
*/
import java.util.Scanner; //Declaramos el Scanner//

public class PreguntaPaisIdioma {
  public static void main(String [] args) {
    Scanner s= new Scanner (System.in); //Creamos el objeto Scanner, llamado s//
    
    System.out.println (" "); //Imprime un hueco en blanco para que el texto quede mas separado//
    
    System.out.print (" Cual es el idioma oficial de Francia? ");
    String respuesta= s.nextLine(); //Variable string que almacena la respuesta introducida por teclado//
    respuesta= respuesta.toLowerCase();
    //toLowerCase(): sirve para convertir el dato en minuscula en caso de que se haya introducido en mayusculas//
    
    if (respuesta.equals("frances")) { //if: para que la respuesta sea correcta tiene que poner "frances"//
      System.out.println(" La respuesta es correca! :)");
    } else { //else: si no pone "frances" entonces la respuesta es incorrecta//
      System.out.println(" Lo siento, la respuesta es incorrecta.");
    }    
  }
}
