/*BuclePotencia.java
*Programa que muestra por pantalla la potencia de un numero A elevado a un numero B, que tiene que ser entero y positivo.
*@Irene Martin
*/
import java.util.Scanner;

public class BuclePotencia {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println (" ");
    int potencia=1;
    
    System.out.print (" Dame el numero que quieres elevar: ");
    int base=s.nextInt();
    System.out.print (" Ahora dame su exponente: ");
    int exponente=s.nextInt();
    
    //Bucle en el caso de que el exponente introducido sea negativo//
    while (exponente<0) {
      System.out.print(" El exponente no puede ser negativo, escriba un numero positivo: ");
      exponente=s.nextInt();
    }
    for (int i=1; i<=exponente; i++) {
    potencia= potencia*base;
    }
    
    System.out.println (" La potencia del numero " +base+ " elevado a " +exponente+ " es : " +potencia);
  } 
}
