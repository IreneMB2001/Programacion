/*ejercicio14.java
 *Programa que imprime una piramide segun la altura y el relleno que decidas.
 *@Irene Martin
*/
import java.util.Scanner;
import misFunciones.Geometria;

public class ejercicio14 {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println (" ");
    
    System.out.print (" Vamos a pintar una piramide, dime que altura quieres: ");
    int altura= s.nextInt();

    System.out.print (" Como quieres el relleno?: ");
    String relleno=s.next();
    System.out.println ();
    Geometria.CreaPiramide(altura, relleno);
  }
}
