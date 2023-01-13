/*BucleSumaImparesPares.java
*Programa que muestra por pantalla la suma de los números pares y la suma de impares de los números comprendidos entre 100 y 200.
*@Irene Martin
*/

public class BucleSumaImparesPares {
  public static void main (String [] args) {
    System.out.println (" ");
    int sumaPar=0;
    int sumaImpar=0;

    for (int i=100; i<=200; i++) {
      if (i%2==0) {
        sumaPar=sumaPar+i;
      } else {
        sumaImpar=sumaImpar+i;
      }
    }
    
    System.out.println (" La suma de los numeros pares comprendidos entre 100 y 200 es: " +sumaPar);
    System.out.println (" La suma de los numeros impares comprendidos entre 100 y 200 es: " +sumaImpar);
  }
}
