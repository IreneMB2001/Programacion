/*BucleWhileMultiple5.java
*Programa que muestra por pantalla los multiplos de 5 de 0 a 100 con bucle WHILE.
*@Irene Martin
*/

public class BucleWhileMultiple5 {
  public static void main (String [] args) {
    System.out.println (" ");
    int i=0;
    System.out.println (" Multiplos de 5 de 0 a 100 con el bucle WHILE");
    while (i<=100) {
      if (i%5==0) {
        System.out.println (" " +i);
      } 
      i++;
    }
  }
}
