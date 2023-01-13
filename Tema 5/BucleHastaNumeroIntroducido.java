/*BucleHastaNumeroIntroducido.java
*Programa que muestra por pantalla los números naturales hasta un valor introducido por teclado.
*@Irene Martin
*/
import java.util.Scanner;

public class BucleHastaNumeroIntroducido {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
   
    System.out.println (" ");
    System.out.println(" Numeros Naturales:");
    System.out.print(" Por favor introduce un numero como limite: ");
    int num= s.nextInt();
    
    for (int i=1; i<=num; i++) {
      System.out.println (" " +i);
    }
  }
}
