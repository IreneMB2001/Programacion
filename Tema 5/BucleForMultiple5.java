/*BucleForMultiple5.java
*Programa que muestra por pantalla los multiplos de 5 de 0 a 100 con bucle FOR.
*@Irene Martin
*/

public class BucleForMultiple5 {
  public static void main (String [] args) {
    System.out.println (" ");
    System.out.println (" Multiplos de 5 de 0 a 100 con el bucle FOR");
    for (int i=0; i<=100; i++) {
      if (i%5==0) {
        System.out.println (" " +i);
      } 
    }
  }
}
