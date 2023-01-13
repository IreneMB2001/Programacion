/*BucleCifrasParesImpares.java
*Programa que te pide 2 numeros y luego mezcla sus cifras pares e impares en otros 2 numeros.
*@Irene Martin
*/
import java.util.Scanner;

public class BucleCifrasParesImpares {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println (" ");
    
    System.out.print (" Por favor, introduzca el primer numero: ");
    long num1=s.nextLong();
    System.out.print (" Por favor, introduzca el segundo numero: ");
    long num2=s.nextLong();
    
    //Declaracion de variables//
    long cifra1=0;
    long cifra2=0;
    String seriePar="";
    String serieImpar="";

    //Bucle //
    while ((num2>0) && (num1>0)) {
      cifra2=num2%10; //como empieza por las cifras del final, para que vaya en orden se empieza por num2//
      if ((cifra2%2)==0)  {
        seriePar= cifra2+seriePar; 
      } 
      if ((cifra2%2)!=0)  {
        serieImpar= cifra2+serieImpar; 
      } 
      num2=num2/10;
      cifra1=num1%10;
      if ((cifra1%2)==0) {
        seriePar= cifra1+seriePar;
      }
      if ((cifra1%2)!=0) {
        serieImpar= cifra1+serieImpar;
      }
      num1=num1/10;
    }
    System.out.println (" El numero formado por los digitos pares es: " +seriePar);
    System.out.println (" El numero formado por los digitos impares es: " +serieImpar);
  }
} 
