/*BucleSumaProducto.java
*Programa que muestra por pantalla la suma y el producto de los 10 primeros numeros naturales.
*@Irene Martin
*/

public class BucleSumaProducto {
  public static void main (String [] args) {
    System.out.println (" ");
    int suma=0;
    int multiplicacion=1;

    for (int i=1; i<=10; i++) {
      suma=suma+i;
      multiplicacion=multiplicacion*i;
    }
    System.out.println (" La suma de los 10 primeros numeros es: " +suma);
    System.out.println (" La multiplicacion de los 10 primeros numeros es: " +multiplicacion);
  }
}
