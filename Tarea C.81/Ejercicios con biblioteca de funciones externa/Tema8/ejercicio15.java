/*ejercicio15.java
 *Programa que genera un array con los 100 primeros números naturales, su suma y su media.
 *@Irene Martin
*/
import misFunciones.FunciArrays;

public class ejercicio15 {
  public static void main (String [] args) {
    System.out.println (" ");
    
    System.out.print (" A continuación se mostrará un array de los primeros 100 números,");
    System.out.println (" además de su suma y su media");
    int t=100;
    int[] array=FunciArrays.generaArrayInt(t);
    for (int i=0; i<t; i++) { 
      System.out.print(" "+array[i]+ " |");
    }
    System.out.println ("\n");
    System.out.println ( "La suma del array es --> " +FunciArrays.sumaArrayInt(array));
    System.out.printf("%-3s %3.2f ", " La media del array es -->" , FunciArrays.mediaArrayInt(array));
  }
}
