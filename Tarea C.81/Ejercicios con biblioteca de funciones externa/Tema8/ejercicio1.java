/*ejercicio1.java
*Programa que pide 2 numeros por teclado y muestra por pantalla el resultado de multiplicarlos.
*@Irene Martin
*/
import java.util.Scanner;
import misFunciones.Varias;

public class ejercicio1 {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println ();
    System.out.println (" Introduce 2 numeros para multiplicarlos: ");
    System.out.print (" Numero 1 -->");
    double num1=s.nextDouble();
    System.out.print (" Numero 2 -->");
    double num2=s.nextDouble();
    double multiplicacion= Varias.multiplica(num1, num2);
    System.out.println (" El resultado de la multiplicación de " +(int)num1+ "*" +(int)num2+ " es = " +(int)multiplicacion);
  }
}