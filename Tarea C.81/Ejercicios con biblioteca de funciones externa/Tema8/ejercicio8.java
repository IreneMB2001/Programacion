/*ejercicio8.java
*Programa que pide un valor n entero y muestra las siguientes funciones:
*El sumatorio de 1 a n, el factorial de 1 a n y el valor intermedio entre 1 y n
*@Irene Martin
*/
import java.util.Scanner;
import misFunciones.Varias;

public class ejercicio8 {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println ();
    System.out.print (" Introduce un número entero: ");
    int n=s.nextInt();
    int sumatorio=Varias.suma1aN(n);
    int factorial=Varias.producto1aN(n);
    System.out.println (" El sumatorio desde 1 hasta " +n+ " es --> " +sumatorio);
    System.out.println (" El factorial desde 1 hasta " +n+ " es --> " +factorial);
    System.out.printf("%-3s %-2s %-2s %3.2f ", " El número intermedio entre 1 y" ,n, "es -->" , Varias.intermedio1aN(n));
  }
}