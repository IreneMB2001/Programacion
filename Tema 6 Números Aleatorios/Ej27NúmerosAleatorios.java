/* Ej27NúmerosAleatorios.java
 * Programa que implementa el juego piedra, papel y tijera teniendo al usuario y el ordenador como contrincantes
 * @Author Irene Martín
 */

import java.util.Scanner;
public class Ej27NúmerosAleatorios {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("\nJUEGO PIEDRA, PAPEL Y TIJERAS --> Contrincantes: Usuario y Ordenador");
    System.out.println("-----------------------------");
    System.out.print("Turno del usuario (introduzca piedra, papel o tijera): ");
    String usuario = s.next();

    //Establecer la jugada del ordenador//
    //La figura se establecerá de forma aleatoria (sólo hay 3 opciones)//
    String ordenador = "";
    int numFigura = (int)(Math.random() * 3);

    //Switch para establecer la figura del ordenador//
    switch (numFigura) {
      case 0:
        ordenador = "piedra";
        break;
      case 1:
        ordenador = "papel";
        break;
      case 2:
        ordenador = "tijera";
        break;
      default:
    }
    System.out.println("Turno del ordenador: " + ordenador);

    //Establecer quien ha ganado//
    if (usuario==ordenador) {
      System.out.println("Empate");
    } else {
      //Se establece la variable ganador. Si es 1 gana el usuario y si es 2 gana el ordenador
      int ganador = 2;

      //Switch para establecer el valor de ganador según la jugada del usuario
      switch (usuario) {
        case "piedra":
          if (ordenador.equals("tijera")) { //la piedra gana a la tijera
            ganador = 1;
          }
          break;
        case "papel":
          if (ordenador.equals("piedra")) { //el papel gana a la piedra
            ganador = 1;
          }
          break;
        case "tijera":
          if (ordenador.equals("papel")) { //la tijera gana al papel
            ganador = 1;
          }
          break;
        default:
      }
      //Se imprime quien gana la partida//
      if (ganador==1) {
        System.out.println("Gana el usuario");
      } else {
        System.out.println("Gana el ordenador");
      }
    } //fin del else
  }
}
