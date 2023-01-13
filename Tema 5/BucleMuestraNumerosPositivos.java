/*BucleMuestraNumerosPositivos.java
*Programa que dado un número entero positivo y diga cuales de sus cifras son pares y cuando suman.
*@Irene Martin
*/
import java.util.Scanner;

public class BucleMuestraNumerosPositivos {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println (" ");
    
    System.out.print (" Por favor, introduzca un numero entero positivo: ");
    //Declaracion de variables//
    long restoPositivo= 0;
    long cifra=0;
    String seriePar="";
    long sumatorioPar=0;

    //Bucle en el caso de que de negativo//
    long num=s.nextLong();
    while (num<0) {
      System.out.print (" El numero introducido tiene que ser positivo, introducelo de nuevo: ");
      num=s.nextLong();
    }
    
    
    //Bucle principal//
    while (num>0) {
      cifra=num%10;
      restoPositivo=cifra%2;
      if (restoPositivo==0) {
        seriePar= cifra + " " + seriePar; //La cifra tiene que ir antes que la serie para que vaya en orden//
        sumatorioPar=sumatorioPar+cifra;
      }
      num=num/10;
    }
    System.out.println (" Las cifras pares del numero son: " +seriePar);
    System.out.println (" La suma total de las cifras pares es: " +sumatorioPar);
  }
} 
      
 
