/*PiramideBucle.java
*Programa que imprime una piramide segun la altura y el relleno que decidas.
*@Irene Martin
*/
import java.util.Scanner;

public class PiramideBucle {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println (" ");
    
    System.out.print (" Vamos a pintar una piramide, dime que altura quieres: ");
    int altura= s.nextInt();

    System.out.print (" Como quieres el relleno?: ");
    String relleno=s.next();
    System.out.println (" ");
    
    int planta=1; //Con la variable planta se cuentan las plantas que se van pintando, empezando por la planta 1//
    int totalBlanco=altura-1;   
    
    //Bucle general//
    while (planta <= altura) { //El bucle se mantiene mientras la planta sea inferior o igual a la altura establecida//
	  //Bucle for para pintar el numero de blancas (espacios)//
      for (int b=1; b<=totalBlanco; b++) {
        System.out.print (" ");
      }
      //Bucle for para pintar el numero de rellenas//
      for (int r=1; r<=(2*planta-1); r++) {
        System.out.print (relleno);
      }
      totalBlanco--; //Una vez el bucle da una vuelta se disminuye el total de blancos a pintar para utilizar mas relleno//
      planta++; //Una vez el bucle da una vuelta se incrementa la planta para realizar la siguiente//
      System.out.println();
    }
  }
}
