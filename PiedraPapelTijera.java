/*PiedraPapelTijera.java
*Programa que realiza el juego de piedra papel y tijera.
*@Irene Martin
*/
import java.util.Scanner;

public class PiedraPapelTijera {
  public static void main (String [] args) {

    Scanner s= new Scanner (System.in);  
    
    System.out.println (" ");
    
    System.out.print(" Turno del jugador 1 (introduzca piedra, papel o tijera): ");
    String jugador1 = s.next();
    
    System.out.print(" Turno del jugador 2 (introduzca piedra, papel o tijera): ");
    String jugador2 = s.next();
 
    int ganador = 2; //2 porque hay 2 jugadores//
    
    //Sentencia condicional jugador1//
    switch(jugador1) {
      case "piedra":
        if (jugador2.equals("tijera")) {
          ganador = 1; //La piedra le gana a la tijera//
        }
        break;
      case "papel":
        if (jugador2.equals("piedra")) {
          ganador = 1; //El papel le gana a la piedra//
        }
        break;
      case "tijera":
        if (jugador2.equals("papel")) {
          ganador = 1; //La tijera le gana al papel//
        }
      break;
      default:
        ganador = -1; //valor establecido en caso de error//
        System.out.println(" Se ha introducido una accion no valida.");
    }
    
    //Sentencia condicional jugador2//
    switch(jugador2) {
      case "piedra":
        if (jugador1.equals("tijera")) {
          ganador = 2; 
        }
        break;
      case "papel":
        if (jugador1.equals("piedra")) {
          ganador = 2; 
        }
        break;
      case "tijera":
        if (jugador1.equals("papel")) {
          ganador = 2; 
        }
      break;
      default:
        ganador = -1; //valor establecido en caso de error//
        System.out.println(" Se ha introducido una accion no valida.");
    }
    //Sentencia if en caso de empate//
    if (jugador1.equals(jugador2)) {
      ganador = 0;
      System.out.println(" Resultado: Empate");
    } 
    //Resultado del juego//
    if ((ganador!=0) && (ganador!=-1)) {
      System.out.println(" Resultado: Ha ganado el jugador: " +ganador);
    }
  }
}
