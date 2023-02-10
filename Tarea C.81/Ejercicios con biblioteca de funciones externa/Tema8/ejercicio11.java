/*ejercicio11.java
*Programa que pide 1 numero por teclado y te muestra su tabla de multiplicar.
*@Irene Martin
*/
import java.util.Scanner;
import misFunciones.Varias;

public class ejercicio11 {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println ();
    System.out.print (" Introduce un numero y te mostrare su tabla de multiplicar: ");
    int num=s.nextInt();
    Varias.TablaMultiplicar(num);
  }
}