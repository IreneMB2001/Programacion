/*ejercicio3.java
*Programa que pide 2 numeros por teclado y muestra por pantalla cual es el mínimo.
*@Irene Martin
*/
import java.util.Scanner;
import misFunciones.Varias;

public class ejercicio3 {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println ();
    System.out.println (" Introduce 2 numeros: ");
    System.out.print (" Numero 1 --> ");
    int num1=s.nextInt();
    System.out.print (" Numero 2 --> ");
    int num2=s.nextInt();
    int min= Varias.minimo(num1, num2);
    System.out.println (" El mínimo de ambos números es --> " +min);
  }
}
