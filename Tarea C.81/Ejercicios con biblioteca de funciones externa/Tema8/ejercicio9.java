/*ejercicio9.java
*Programa que según 3 números introducidos por teclado muestra cuál es el mayor de ellos.
*@Irene Martin
*/
import java.util.Scanner;
import misFunciones.Varias;

public class ejercicio9 {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println ();
    System.out.println (" Introduce 3 números enteros: ");
    System.out.print (" Numero 1 --> ");
    int num1=s.nextInt();
    System.out.print (" Numero 2 --> ");
    int num2=s.nextInt();
    System.out.print (" Numero 3 --> ");
    int num3=s.nextInt();
    int auxiliar= Varias.maximo(num1, num2);
    if (Varias.maximo(auxiliar, num3)==auxiliar) {
      System.out.println (" El máximo de de los 3 números es --> " +auxiliar);
    } else {
      System.out.println (" El máximo de de los 3 números es --> " +num3);
    }
  }
}
