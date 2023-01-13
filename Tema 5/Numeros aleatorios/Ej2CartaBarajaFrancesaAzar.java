/*Ej2CartaBarajaFrancesaAzar.java
*Programa que muestra una carta de la baraja francesa (numero y palo).
*@Irene Martin
*/
import java.util.Scanner; 

public class Ej2CartaBarajaFrancesaAzar {
  public static void main (String [] args) {
    System.out.println (" ");
    System.out.println(" Carta al azar de la baraja francesa:");

    //Declaracion de variables//
    String palo = "";
    String carta = "";
    int numPalo = (int)(Math.random()*4 + 1);
    int numCarta = (int)(Math.random()*13 + 1);
    
    //Sentencia condicional switch para el numero de carta y su palo//
    switch(numPalo) {
      case 1:
        palo = "picas";
        break;
      case 2:
        palo = "corazones";
        break;
      case 3:
        palo = "diamantes";
        break;
      case 4:
        palo = "treboles";
        default:
    }

    switch(numCarta) {
      case 1:
        carta = "As";
        break;
      case 2:
        carta = "2";
        break;
      case 3:
        carta = "3";
        break;
      case 4:
        carta = "4";
        break;
      case 5:
        carta = "5";
        break;
      case 6:
        carta = "6";
        break;
      case 7:
        carta = "7";
        break;
      case 8:
        carta = "8";
        break;
      case 9:
        carta = "9";
        break;
      case 10:
        carta = "10";
        break;
      case 11:
        carta = "J";
        break;
      case 12:
        carta = "Q";
        break;
      case 13:
        carta = "K";
        break;
      default:
    }
    System.out.println(" Carta seleccionada --> "+ carta + " de " + palo);
  }
}
