/*ejercicio18.java
*Programa que te dice cual es el NIF asignado a un DNI introducido por teclado.
*@Irene Martin
*/
import java.util.Scanner;
import misFunciones.FunciArrays;
public class ejercicio18 {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);       
    System.out.print (" Introduce un DNI para saber cuál es su NIF --> ");
    int dni=s.nextInt();
    System.out.println ("(El resto del DNI dividido entre 23 será codificado por una letra)");
    int resto=dni%23;
    System.out.println (" resto --> " +resto);
    System.out.println (" El NIF para el DNI introducido será --> " +FunciArrays.dimeNIF(dni));
  }
}
