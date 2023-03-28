/* Ej10NúmerosAleatorios.java
 * programa que pinta por pantalla diez líneas formadas por caracteres.
 * El carácter con el que se pinta cada línea se elige de forma aleatoria entre (* ; - ; = ; . ; | ; @)
 * Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.
 * Author @Irene Martín
 */
public class Ej10NúmerosAleatorios {
  public static void main(String[] args) {
    //Variables//
    int númeroRelleno;
    int longitud;
    String relleno = "";
    int numLíneas=10; 

    System.out.println("\n10 LÍNEAS CON CARÁCTERES ALEATORIOS");
    //Primer bucle para establecer el número de líneas totales//
    for(int i = 1; i <= numLíneas; i++) {
      //Se establecen números aleatorios para la longitud de la línea y el carácter de relleno//
      longitud = (int)(Math.random() * 40) + 1;
      númeroRelleno = (int)(Math.random() * 6); //6 carácteres

      //Switch para saber a qué numero pertenece cada relleno//
      switch(númeroRelleno) {
        case 0:
          relleno = "*";
          break;
        case 1:
          relleno = "-";
          break;
        case 2:
          relleno = "=";
          break;
        case 3:
          relleno = ".";
          break;
        case 4:
          relleno = "|";
          break;
        case 5:
          relleno = "@";
          break;
        default:
      }
      //Bucle para imprimir cada línea//
      for(int l = 1; l <= longitud; l++) {
        System.out.print(relleno);
      }
      System.out.println();
    }
  }              
}
