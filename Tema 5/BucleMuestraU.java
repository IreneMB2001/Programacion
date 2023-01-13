/*BucleMuestraU.java
*Programa que te muestra una U con asteriscos segun la altura que desees.
*@Irene Martin
*/
import java.util.Scanner;

public class BucleMuestraU {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println (" ");
    
    System.out.print (" Por favor, introduzca la altura de la U: ");
    int altura= s.nextInt();
    System.out.println (" Aqui tienes tu U: ");
    System.out.println (" ");
    int paloHorizontal= altura-2; //Numero de asteriscos del palo horizontal//
    
    int planta=1;
    //Bucle para la parte vertical de la U//
    while (planta<=(altura-1)) { //Es altura-1 porque un asterisco se reserva para la parte horizontal//
      planta++;
      System.out.print (" "); //espacio de margen//
      System.out.print ("* "); //comienzo de la U + margen//
      
      //Bucle para las blancas de la U//
      for (int l=1; l<=paloHorizontal; l++) {
        System.out.print ("  ");
      }
        System.out.println ("*"); //final de la U //
      }
    
    //Bucle para el palo horizontal de la L//
    System.out.print ("   ");   
    for (int l=1; l<=paloHorizontal; l++) {
      System.out.print ("* "); //palo horizontal + margen//
    }
  }
}
