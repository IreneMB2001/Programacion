/*Ejemplo4NumerosAleatorios.java
*Programa que imprime 20 numeros aleatorios entre 1 y 15 sin decimales.
*@Irene Martin
*/

public class Ejemplo4NumerosAleatorios  {
  public static void main (String [] args) {
    System.out.println (" ");
    
    System.out.print (" 20 numeros aleatorios entre 1 y 15 ");
    System.out.println ("(sin decimales): ");
    System.out.println (" ");
    for (int i=1; i<=20; i++) {
      System.out.println( " " +(int)(Math.random()*15 + 1)); //con +1 se desplaza de 0 a 1 y el 15 si cuenta//
    }
  }
}
