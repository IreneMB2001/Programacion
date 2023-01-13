/*BucleMuestraL.java
*Programa que te muestra una L con asteriscos segun la altura que desees.
*@Irene Martin
*/
import java.util.Scanner;

public class BucleMuestraL {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println (" ");
    
    System.out.print (" Por favor, introduzca la altura de la L: ");
    int altura= s.nextInt();
    System.out.println (" Aqui tienes tu L: ");
    System.out.println (" ");
    
    //Bucle para el palo vertical de la L//
    for (int i=1; i<=(altura-1); i++) { //Es altura-1 porque un asterisco se reserva para la parte horizontal//
      System.out.println (" *");
    }
    int paloHorizontal= (altura/2)+1; //Numero de asteriscos del palo horizontal//
    
    //Bucle para el palo horizontal de la L//
    for (int l=1; l<=paloHorizontal; l++) {
      System.out.print (" *");
    }
  }
}
