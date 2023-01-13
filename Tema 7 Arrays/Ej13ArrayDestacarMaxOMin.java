/*Ej13ArrayDestacarMaxOMin.java
*Programa que genera 100 numeros aleatorios entre 0 y 500 y que destaca el maximo o el minimo segun se pide por teclado.
*El numero sale destacado con asteriscos y en color morado.
*Irene Martin
*/
import java.util.Scanner;

public class Ej13ArrayDestacarMaxOMin {
  public static void main (String [] args) {
    Scanner s = new Scanner (System.in);
    
    System.out.println(" ");
    
    System.out.println(" A continuacion se muestra un array formado por 100 numeros aleatorios de 0 a 500: ");
    System.out.println(" -------------------------------------------------------------------------------- ");
    
    //Declaracion de variables//
    int t=100;
    int[] numero= new int[t];
    int n;
    int maximo=Integer.MIN_VALUE;
    int minimo=Integer.MAX_VALUE;
    String destacado; 
    
    //Establecer el array con numeros aleatorios//
    for (n=0; n<t; n++) {
      numero[n]= (int)(Math.random()*501);

      //Sentencia if para establecer el maximo y el minimo//
      if(numero[n]>maximo) {
        maximo=numero[n];
      }
      if(numero[n]<minimo) {
        minimo=numero[n];
      }
      System.out.print(" " +numero[n]+ " ");
    }
    System.out.println("\n");
    System.out.print(" Quiere destacar el valor maximo o el valor minimo ? --> ");
    destacado=s.next();
    
    //Destacar el maximo o el minimo//
    System.out.println(" -----------------------------------------------------------------");
    System.out.println(" El array con el valor destacado permanece de la siguiente forma: ");
    System.out.println(" -----------------------------------------------------------------");
    for (n=0; n<t; n++) {
      if (destacado.equals("maximo") && (numero[n]==maximo)) { 
        System.out.print (" " + "\033[95m**" +numero[n]+ "**\033[39;49m "); //aparece en color morado//
      } else if (destacado.equals("minimo") && (numero[n]==minimo)){
        System.out.print (" " + "\033[95m**" +numero[n]+ "**\033[39;49m "); //aparece en color morado//
      } else {
        System.out.print(" " +numero[n]+ " ");
      }
    }
  }
}
    
 
