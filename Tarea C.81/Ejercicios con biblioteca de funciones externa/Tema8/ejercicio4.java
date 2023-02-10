/*ejercicio4.java
*Programa que pide 1 numero por teclado y muestra por pantalla si es negativo, positivo o cero.
*Devuelve -1 si es negativo, devuelve 1 si es positivo y devuelve 0 si es cero.
*@Irene Martin
*/
import java.util.Scanner;
import misFunciones.Varias;

public class ejercicio4 {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println ();
    System.out.print (" Introduce un numero: ");
    int num=s.nextInt();
    System.out.println (" El resultado se mostrará según los siguientes valores:");
    System.out.println (" Número negativo --> -1; Número positivo --> 1; Número cero --> 0");
    System.out.println (" Resultado --> " +Varias.dimeSigno(num));
  }
}
