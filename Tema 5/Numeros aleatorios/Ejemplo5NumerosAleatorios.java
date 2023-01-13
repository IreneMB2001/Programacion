/*Ejemplo5NumerosAleatorios.java
*Programa que imprime 20 numeros aleatorios entre 50 y 60 sin decimales (ambos incluidos).
*@Irene Martin
*/

public class Ejemplo5NumerosAleatorios  {
  public static void main (String [] args) {
    System.out.println (" ");
    
    System.out.print (" 20 numeros aleatorios entre 50 y 60 ");
    System.out.println ("(sin decimales): ");
    System.out.println (" ");
    for (int i=1; i<=20; i++) {
      System.out.println( " " +(int)(Math.random()*11 + 50)); 
    }
  }
}
