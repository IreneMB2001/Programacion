/*Ej5ArraysBidimensionalMaximoMinimo.java
*Tabla de un array bidimensional de numeros enteros (entre 0 y 1000) con 6 filas y 10 columnas.
*Se muestra la posicion del maximo y el minimo de dicha tabla.
*@Irene Martín
*/

public class Ej5ArraysBidimensionalMaximoMinimo {
  public static void main(String[] args) {

    System.out.println();

    //Declaracion de variables y arrays//
    int tamF=6; //Tamanio de la fila//
    int tamC=10; //Tamanio de la columna//
    int maximo=Integer.MIN_VALUE;
    int minimo=Integer.MAX_VALUE;
    int[][] num = new int[tamF][tamC]; 

    int fila, columna;

    // Establecer los datos aleatorios //
    for(fila = 0; fila < tamF; fila++) { 
      for(columna = 0; columna < tamC; columna++) { 
        num[fila][columna] = (int)(Math.random()*1001);
        //Sentencia if para establecer el maximo y el minimo//
        if(num[fila][columna]>maximo) {
          maximo=num[fila][columna];
        }
        if(num[fila][columna]<minimo) {
          minimo=num[fila][columna];
        }
      }
    }

    // Mostrar el resultado//
    System.out.print(" Array num | ");
    for (columna = 0; columna < tamC; columna++) {
      System.out.printf("%-10s ", "columna " +columna);
    }
    System.out.println();
    System.out.println("--------------------------------------------------------------------------------------------------------------------------");

    for(fila = 0; fila < tamF; fila++) { //Se recorre cada fila//
      System.out.print(" Fila: " + fila +"   |");

      for(columna = 0; columna < tamC; columna++) { //Dentro de cada fila se recorren sus correspondientes columnas//
        System.out.printf("%10d ", num[fila][columna]);
      }
      System.out.println();
    }
    System.out.println("--------------------------------------------------------------------------------------------------------------------------");

    // Mostrar el maximo y el minimo //
    for(fila = 0; fila < tamF; fila++) { 
      for(columna = 0; columna < tamC; columna++) { 

        if(num[fila][columna]==maximo) {
          System.out.println(" El maximo (" +maximo+ ") se encuentra en la posicion --> Fila: " +fila+ " ; columna: " +columna);
        }
        if(num[fila][columna]==minimo) {
           System.out.println(" El minimo (" +minimo+ ") se encuentra en la posicion --> Fila: " +fila+ " ; columna: " +columna);
        }
      }
    }
  }
}
