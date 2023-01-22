/*EjercicioPropuestoTabla.java
*Programa en el que los valores resultantes de las columnas de la tabla es 1 + 1 consecutivamente.
*@Irene Martín
*/

public class EjercicioPropuestoTabla {
  public static void main(String[] args) {

    System.out.println();

    //Declaracion de variables y arrays//
    int tamF=6; //Tamanio de la fila//
    int tamC=4; //Tamanio de la columna//
    int valor=1; 
    int[][] num = new int[tamF][tamC]; // array de 4 filas por 5 columnas
    int fila;
    int columna;

    // Establecer los valores//
    for (columna = 0; columna < tamC; columna++){ 
      for (fila = 0; fila < tamF; fila++) { 
        num[fila][columna] = valor;
        valor++;
      }
    }
    // Imprimir el resultado//

    //Establecer el numero de columnas//
    System.out.print(" Array num | ");
    for (columna = 0; columna < tamC; columna++) {
      System.out.printf("%-10s ", "columna " +columna);
    }
    System.out.println();
    System.out.println("----------------------------------------------------------");

    //Establecer el numero de filas y los valores correspondientes//
    for(fila = 0; fila < tamF; fila++) {
      System.out.print(" Fila: " + fila + "   |");
      for(columna = 0; columna < tamC; columna++) {
        System.out.printf("%10d ", num[fila][columna]);
      }
      System.out.println();
    }
  }
}
