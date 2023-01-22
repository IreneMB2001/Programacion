/*Ej1ArraysBidimensionalesTabla.java
*Tabla de un array bidimensional de numeros enteros con 3 filas y 6 columnas
*@Irene Martín
*/

public class Ej1ArraysBidimensionalesTabla {
  public static void main(String[] args) {

    System.out.println();

    //Declaracion de variables y arrays//
    int tamF=3; //Tamanio de la fila//
    int tamC=6; //Tamanio de la columna//
    int[][] num = new int[tamF][tamC]; // array de 3 filas por 6 columnas

    //Fila 0//
    num[0][0]=0;
    num[0][1]=30;
    num[0][2]=2;
    num[0][5]=5;
    //Fila 1//
    num[1][0]=75;
    num[1][4]=0;
    //Fila 2//
    num[2][2]=-2;
    num[2][3]=9;
    num[2][5]=11;

    int fila, columna;

    System.out.print(" Array num | ");
    for (columna = 0; columna < tamC; columna++) {
      System.out.printf("%-10s ", "columna " +columna);
    }
    System.out.println();
    System.out.println("-----------------------------------------------------------------------------");

    for(fila = 0; fila < tamF; fila++) { //Se recorre cada fila//
      System.out.print(" Fila: " + fila +"   |");

      for(columna = 0; columna < tamC; columna++) { //Dentro de cada fila se recorren sus correspondientes columnas//
        System.out.printf("%10d ", num[fila][columna]);
      }
      System.out.println();
    }
    System.out.println("-----------------------------------------------------------------------------");
  }
}
