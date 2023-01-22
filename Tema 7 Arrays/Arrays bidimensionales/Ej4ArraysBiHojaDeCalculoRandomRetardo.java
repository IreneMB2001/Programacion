/*Ej4ArraysBiHojaDeCalculoRandomRetardo.java
*Tabla de un array bidimensional de numeros enteros aleatorios y el sumatorio de filas y columnas con retardo.
*@Irene Martín
*/

public class Ej4ArraysBiHojaDeCalculoRandomRetardo {
  public static void main(String[] args) 
    throws InterruptedException { // Se añade esta linea para poder usar el retardo//

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

    Thread.sleep(2000); // retardo de 2 segundos//

    // Establecer los datos aleatorios //
    System.out.println(" Array bidimensional con numeros aleatorios de 100 a 999 :");
    System.out.println(" ---------------------------------------------------------");
      for(fila = 0; fila < tamF; fila++) { //El primer bucle recorre cada fila//
        for(columna = 0; columna < tamC; columna++) { //dentro de cada fila se recorren las columnas correspondientes//
          num[fila][columna] = (int)(Math.random()*900+100);
        }
      }
    // Mostrar la tabla con los datos y las sumas de las filas //
    for(fila = 0; fila < tamF; fila++) { //primer bucle que recorre cada fila//
      for(columna = 0; columna < tamC; columna++) { //se establecen y se suman los valores segun la columna que toca//
        System.out.printf("%7d ", num[fila][columna]); 
        sumFila = sumFila+num[fila][columna];
      }
      System.out.printf("|%7d\n", sumFila); //La ultima columna imprime el sumatorio//
      sumFila = 0; 
    }
  
    // Mostrar en la ultima fila las sumas de las columnas //
    System.out.println(" -----------------------------------------------");

    for(columna = 0; columna < tamC; columna++) {  //primer bucle desde la primera a la ultima columna//
      for(fila = 0; fila < tamF; fila++) {
        sumColumna = sumColumna + num[fila][columna]; //se suman los resultados de cada fila de la columna//
      }
      total = total+sumColumna;
      System.out.printf("%7d ", sumColumna); //Se imprime el sumatorio de cada columna//
      sumColumna=0;
    }
    System.out.printf("|%7d ", total); //La ultima columna de la ultima fila imprime el sumatorio total//
  }
}
