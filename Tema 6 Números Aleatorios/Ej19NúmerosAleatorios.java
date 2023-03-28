/* Ej19NúmerosAleatorios.java
 * programa que muestra 50 números enteros aleatorios comprendidos entre el -100 y el 200 ambos incluidos. 
 * Luego se muestra el máximo de los pares, el mínimo de los impares y la media de todos los números generados.
 * Author @Irene Martín
 */
public class Ej19NúmerosAleatorios {
  public static void main(String[] args) {
    //Variables//
    int número;
    int maxPar = Integer.MIN_VALUE;
    int minImpar = Integer.MAX_VALUE;
    int suma=0; //sumatorio
    int t=50;

    System.out.println("\n50 NÚMEROS ALEATORIOS ENTRE -100 Y 200");
    System.out.println("--------------------------------------");
    //Bucle para establecer e imprimir los 50 números aleatorios//
    for (int i = 0; i < t; i++) {
      //Se le establece al número el valor al azar comprendido entre -100 y 200//
      número = (int)(Math.random() * 301) - 100;
      //Se imprime cada número//
      System.out.print(número + " ");

      //Si el número dividido entre 2 da de resto 0 es par//
      if (número%2==0) { 
        if (número>maxPar) { //Si el número es mayor que el valor mínimo se establece como máximo
          maxPar=número;
        } else {
        }
      } else { //En este caso el número es impar
        if (número<minImpar){ //Si el número es menor que el valor máximo se establece como mínimo
          minImpar=número;
        } else {
        }
      }
      //Se establece la suma de todos los números para después hacer la media//
      suma+=número;
    }
    //Se imprime el resultado final//
    System.out.println("\n--------------------------------------");
    System.out.println("- Máximo de los pares: " +maxPar);
    System.out.println("- Mínimo de los impares: " +minImpar);
    System.out.println("- Media de todos los números: " +suma/t +"\n");
  }
}
