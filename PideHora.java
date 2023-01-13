/*PideHora.java
*Programa que te pide una hora por teclado y muestra buenos dias, buenas tardes o buenas noches segun la hora.
*@Irene Martin
*/
import java.util.Scanner;//declaramos el Scanner//

public class PideHora {
  public static void main (String [] args) {
  
    System.out.println (" ");//Imprime un hueco en blanco para que no quede el texto quede mas separado//
    
    Scanner s= new Scanner(System.in);//Creamos el objeto Scanner, llamado s//
    System.out.print (" Hola, dime que hora es: ");
    int hora= s.nextInt(); //variable int que almacena la hora introducida por teclado. Es int porque los minutos no se tienen en cuenta//
    
    if (hora>=6 && hora<=12) { //Si la hora es mayor o igual a 6 y tambien es menor o igual a 12 entonces es: buenos dias//
      System.out.println (" Buenos dias!");
    } else if (hora>=13 && hora<=20) {
      System.out.println (" Buenas tardes!");//Si la hora es mayor o igual a 13 y tambien es menor o igual a 20 entonces es: buenas tardes//
    } else {
      System.out.println (" Buenas noches!");//Sino es ninguna de las dos condiciones anteriores, entonces: buenas noches//
    }   
  }
}
