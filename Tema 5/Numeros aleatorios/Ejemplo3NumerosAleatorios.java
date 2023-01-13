/*Ejemplo3NumerosAleatorios.java
*Programa que imprime 20 numeros aleatorios entre 0 y 15 sin decimales.
*@Irene Martin
*/

public class Ejemplo3NumerosAleatorios  {
  public static void main (String [] args) {
    System.out.println (" ");
    
    System.out.print (" 20 numeros aleatorios entre 0 y 15 ");
    System.out.println ("(sin decimales): ");
    System.out.println (" ");
    for (int i=1; i<=20; i++) {
      System.out.println( " " +(int)(Math.random()*16)); //entre parentesis int hace que solo sean enteros//
    }
  }
}
