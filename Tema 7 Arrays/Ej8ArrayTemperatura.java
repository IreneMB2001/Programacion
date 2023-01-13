/*Ej8ArrayTemperatura.java
*Programa que te pide que introduzcas la temperatura de cada uno de los meses del anio y despues hace un diagrama de barras.
*Irene Martin
*/
import java.util.Scanner;

public class Ej8ArrayTemperatura {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    
    System.out.println(" ");
    
    //Declaracion de variables//
    String[]mes={"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    int[]grado=new int[12];
    int n;

    //Establecer los valores del array//
    for (n=0; n<12; n++) {
      System.out.print(" Introduce la temperatura media de " +mes[n]+ ": ");
      grado[n]=s.nextInt();
    }
    System.out.println("-------------------------------------------------------");

    //Bucle para hacer el diagrama de barras//
    for (n=0; n<12; n++) {
      System.out.printf(" %-12s" , mes[n]);
      for (int i=1; i<=grado[n]; i++) {
        System.out.print("*");
      }
      System.out.print(" " + grado[n] + "C");
      System.out.println(" ");
    }
    System.out.println("-------------------------------------------------------");
  }
}

    

