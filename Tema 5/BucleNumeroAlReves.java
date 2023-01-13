/*BucleNumeroAlReves.java
*Programa que te pide un numero por teclado y te lo muestra al reves.
*@Irene Martin
*/
import java.util.Scanner;

public class BucleNumeroAlReves {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println (" ");
    
    System.out.print (" Por favor, introduzca un numero: ");
    long num=s.nextLong();
    //Declaracion de variables//
    long cifra=0;
    String serie="";

    //Bucle para poner el numero al reves//
    while (num>0) {
      cifra=num%10;
      serie= serie+cifra; 
      num=num/10;
    }
    System.out.println (" El numero al reves es: " +serie);
  }
} 
      
