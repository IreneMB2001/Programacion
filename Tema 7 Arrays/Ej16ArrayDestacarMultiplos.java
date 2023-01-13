/*Ej16ArrayDestacarMultiplos.java
*Programa que genera 20 numeros aleatorios entre 0 y 400 y que destaca los multiplos de 5 o 7 segun se pide por teclado.
*El numero sale destacado con asteriscos y en color morado.
*Irene Martin
*/
import java.util.Scanner;

public class Ej16ArrayDestacarMultiplos {
  public static void main (String [] args) {
    Scanner s = new Scanner (System.in);
    
    System.out.println(" ");
    
    System.out.println(" A continuacion se muestra un array formado por 100 numeros aleatorios de 0 a 400: ");
    System.out.println(" -------------------------------------------------------------------------------- ");
    
    //Declaracion de variables//
    int t=20;
    int[] numero= new int[t];
    int n;
    int resto5=0;
    int resto7=0;
    String destacado; 
    
    //Establecer el array con numeros aleatorios//
    for (n=0; n<t; n++) {
      numero[n]= (int)(Math.random()*401);
      System.out.print(" " +numero[n]+ " ");
    }

    System.out.println("\n");
    System.out.print(" Quiere destacar los multiplos de 5 (a) o los multiplos de 7 (b)? --> ");
    destacado=s.next();
    
    //Destacar los multiplos de 5 o 7//
    System.out.println(" ----------------------------------------------------------------------");
    System.out.println(" El array con los multiplos destacados permanece de la siguiente forma: ");
    System.out.println(" ----------------------------------------------------------------------");
    for (n=0; n<t; n++) {
      resto5=numero[n]%5;
      resto7=numero[n]%7;

      if (destacado.equals("a") && (resto5==0)) {
        System.out.print (" " + "\033[95m[" +numero[n]+ "]\033[39;49m "); //aparece en color morado//
      } else if (destacado.equals("b") && (resto7==0)){
        System.out.print (" " + "\033[95m[" +numero[n]+ "]\033[39;49m "); //aparece en color morado//
      } else {
        System.out.print(" " +numero[n]+ " ");
      }
    }
  }
}
 
