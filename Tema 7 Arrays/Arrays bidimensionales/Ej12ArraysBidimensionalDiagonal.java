/*Ej12ArraysBidimensionalDiagonal.java
*Tabla de un array bidimensional de numeros enteros aleatorios (entre 500 y 900) de 9x9.
*Se debe mostrar la posicion de los numeros en diagonal, el maximo, el minimo y la media.
*La diagonal va desde la esquina inferior izquierda hasta la esquina superior derecha.
*@Irene Martín
*/

public class Ej12ArraysBidimensionalDiagonal {
  public static void main(String[] args) {

    System.out.println();

    //Declaracion de variables y arrays//
    int tamF=9; //Tamanio de la fila//
    int tamC=9; //Tamanio de la columna//
    int maximo=Integer.MIN_VALUE;
    int minimo=Integer.MAX_VALUE;
    int[][] num = new int[tamF][tamC]; 
    int diagonal=0;
    int diagonalSuma=0;
    int media=0;

    int fila, columna;

    // Establecer los datos aleatorios //
    for(fila = 0; fila < tamF; fila++) { 
      for(columna = 0; columna < tamC; columna++) { 
        num[fila][columna] = (int)(Math.random()*401+500);
      }
    }
    // Mostrar la tabla del array//
    //Mostrar el numero de columnas//
    System.out.print(" Array num | ");
    for (columna = 0; columna < tamC; columna++) {
      System.out.printf("%-10s ", "columna " +columna);
    }
    System.out.println();
    System.out.println("---------------------------------------------------------------------------------------------------------------");
    
    //Mostrar el numero de fila y los valores//
    for(fila = 0; fila < tamF; fila++) { //Se recorre cada fila//
      System.out.print(" Fila: " + fila +"   |");
      for(columna = 0; columna < tamC; columna++) { //Dentro de cada fila se recorren sus correspondientes columnas//
        System.out.printf("%10d ", num[fila][columna]);
      }
      System.out.println();
    }
    System.out.println("---------------------------------------------------------------------------------------------------------------");

    // Mostrar la diagonal, el maximo, el minimo y la media //
    columna=0;
    System.out.print(" La diagonal de la esquina inferior izquierda a la esquina superior derecha tiene ");
    System.out.println("los siguientes valores: ");
    for(fila = tamF-1; fila >=0; fila--) { 
      diagonal= num[fila][columna];
      System.out.print(" " +diagonal+ " ");
      diagonalSuma = diagonalSuma + diagonal;

      if(num[fila][fila]>maximo) {
        maximo=num[fila][columna];
      }
      if(num[fila][fila]<minimo) {
        minimo=num[fila][columna];
      }
      columna++;
    }
    System.out.println("\n");
    System.out.println(" El maximo de la diagonal es : " +maximo);
    System.out.println(" El minimo de la diagonal es : " +minimo);
    media= diagonalSuma/tamC;
    System.out.println(" La media de la diagonal es : " +media);
  }
}
