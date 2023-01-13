/*BucleDoWhileMultiple5.java
*Programa que muestra por pantalla los multiplos de 5 de 0 a 100 con bucle DO WHILE.
*@Irene Martin
*/

public class BucleDoWhileMultiple5 {
  public static void main (String [] args) {
    System.out.println (" ");
    int i=0;
    System.out.println (" Multiplos de 5 de 0 a 100 con el bucle DO WHILE");
     do{
      if (i%5==0) {
        System.out.println (" " +i);
      } 
      i++;
    } while (i<=100);
  }
}
