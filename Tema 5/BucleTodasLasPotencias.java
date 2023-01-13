/*BucleTodasLasPotencias.java
*Programa que muestra por pantalla todas las potencias desde un numero A elevado a un numero B, que tiene que ser entero y positivo.
*@Irene Martin
*/
import java.util.Scanner;

public class BucleTodasLasPotencias {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println (" ");
    int potencia=1;
    int i=1; //variavle que sera el incremento de cada exponente//
    System.out.print (" Dame el numero que quieres elevar: ");
    int base=s.nextInt();
    System.out.print (" Ahora dame su exponente: ");
    int exponente=s.nextInt();
    System.out.println (" ");
    
    //Bucle en el caso de que el exponente introducido sea negativo//
    while (exponente<0) {
      System.out.print(" El exponente no puede ser negativo, escriba un numero positivo: ");
      exponente=s.nextInt();
      System.out.println (" ");
    }
    //Bucle para el calculo de cada potencia//
    while (i<=exponente) {
    potencia= potencia*base;
    System.out.println (" " +base+ "^" +i+ " = " +potencia);
    i++;
    }
  } 
}
