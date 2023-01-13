/*Ejemplo2NumerosAleatorios.java
*Programa que imprime 20 numeros aleatorios entre 0 y 15 sin llegar a 15 con decimales.
*@Irene Martin
*/

public class Ejemplo2NumerosAleatorios  {
  public static void main (String [] args) {
    System.out.println (" ");
    
    System.out.print (" 20 numeros aleatorios entre 0 y 15 ");
    System.out.println ("sin llegar a 15 con decimales: ");
    System.out.println (" ");
    for (int i=1; i<=20; i++) { //Se hace el bucle aleatorio 20 veces//
      System.out.println( " " +Math.random()*15); //*15 hace que el maximo sea hasta 15 sin contar//
    }
  }
}
