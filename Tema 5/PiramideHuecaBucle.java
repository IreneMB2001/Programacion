/*PiramideHuecaBucle.java
*Programa que imprime una piramide hueca segun la altura y el relleno que decidas.
*@Irene Martin
*/
import java.util.Scanner;
//Este ejercicio esta echo por fallo mio que no me acordaba que el 20 no entraba en la entrega//

public class PiramideHuecaBucle {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println (" ");
    
    System.out.print (" Vamos a pintar una piramide, dime que altura quieres: ");
    int altura= s.nextInt();

    System.out.print (" Como quieres el relleno?: ");
    String relleno=s.next();
    System.out.println (" ");
    
    int planta=1; //Con la variable planta se cuentan las plantas que se van pintando, empezando por la planta 1//
    int totalBlanco=altura-1; //Es altura - 1 porque la ultima planta se reserva para el bucle del relleno
    
    //Bucle general//
    while (planta <= (altura-1)) { //El bucle se mantiene mientras la planta sea inferior o igual a (altura-1)//
	  //Bucle for para pintar el numero de blancas (espacios)//
      for (int b=1; b<=totalBlanco; b++) {
        System.out.print (" ");
      }
      System.out.print (relleno); //Se pinta solo un relleno para despues pintar las blancas de dentro//
      
      //Bucle for para pintar las blancas que forman el hueco de la piramide//
      for (int r=1; r<=(2*planta-2); r++) {
        System.out.print (" ");
      }
      System.out.print (relleno); //Se cierra el hueco de la piramide//
      
      totalBlanco--; //Una vez el bucle da una vuelta se disminuye el total de blancos a pintar para utilizar mas relleno//
      planta++; //Una vez el bucle da una vuelta se incrementa la planta para realizar la siguiente//
      System.out.println();
    }
    //Bucle para pintar la ultima planta que esta entera rellena//
     for (int r=1; r<=(2*planta); r++) {
       System.out.print (relleno);
     }
   System.out.println (" ");
  }
}
