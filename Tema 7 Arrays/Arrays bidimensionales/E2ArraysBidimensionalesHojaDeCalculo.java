/*E2ArraysBidimensionalesHojaDeCalculo.java
*Tabla de un array bidimensional de numeros enteros introducidos por teclado y el sumatorio de filas y columnas
*@Irene Martín
*/
import java.util.Scanner;

public class E2ArraysBidimensionalesHojaDeCalculo {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);

    System.out.println();

    //Declaracion de variables y arrays//
    int tamF=4; //Tamanio de la fila//
    int tamC=5; //Tamanio de la columna//
    int[][] num = new int[tamF][tamC]; // array de 4 filas por 5 columnas
    int fila;
    int columna;
    int sumFila=0; //sumatorio de las filas//
    int sumColumna=0; //sumatorio de las columnas//
    int total=0; //sumatorio total//

    // Establecer los datos introducidos por teclado //
    System.out.println(" Introduzca los numeros del array :");
    System.out.println(" ----------------------------------");
      for(fila = 0; fila < tamF; fila++) { //El primer bucle recorre cada fila//
        for(columna = 0; columna < tamC; columna++) { //dentro de cada fila se recorren las columnas correspondientes//
          System.out.print(" Fila " + fila + " (columna " + columna + ") --> ");
          num[fila][columna] = s.nextInt();
        }
      }
    // Mostrar la tabla con los datos y las sumas de las filas //
    System.out.println(" -----------------------------------------------");
    for(fila = 0; fila < tamF; fila++) { //primer bucle que recorre cada fila//
      for(columna = 0; columna < tamC; columna++) { //se establecen y se suman los valores segun la columna que toca//
        System.out.printf("%4d ", num[fila][columna]);
        sumFila = sumFila+num[fila][columna];
      }
      System.out.printf("|%4d\n", sumFila); //La ultima columna imprime el sumatorio//
      sumFila = 0; 
    }
  
    // Mostrar en la ultima fila las sumas de las columnas //
    System.out.println(" -----------------------------------------------");

    for(columna = 0; columna < tamC; columna++) {  //primer bucle desde la primera a la ultima columna//
      for(fila = 0; fila < tamF; fila++) {
        sumColumna = sumColumna + num[fila][columna]; //se suman los resultados de cada fila de la columna//
      }
      total = total+sumColumna;
      System.out.printf("%4d ", sumColumna); //Se imprime el sumatorio de cada columna//
      sumColumna=0;
    }
    System.out.printf("|%4d ", total); //La ultima columna de la ultima fila imprime el sumatorio total//
  }
}
