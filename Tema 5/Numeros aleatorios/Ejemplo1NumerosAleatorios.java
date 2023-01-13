/*Ejemplo1NumerosAleatorios.java
*Programa que imprime 10 numeros aleatorios.
*@Irene Martin
*/

public class Ejemplo1NumerosAleatorios {
  public static void main(String[] args) {
    System.out.println(" ");
    System.out.println(" Diez numeros aleatorios:\n");
    for (int i = 1; i < 11; i++) {
      System.out.print(" ");
      System.out.println(Math.random());
    }
  }
}
