/*Ej3ArrayOrdenInverso.java
*Programa que lee 10 numeros y los muestra en orden inverso con un array.
*Irene Martin
*/
import java.util.Scanner;

public class Ej3ArrayOrdenInverso {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    //
    System.out.println(" ");
    
    //Declaracion de variables//
    int[] num=new int[10];
    int n; //Variable para almacenar las posiciones//
    
    //Bucle para la introduccion de numeros//
    System.out.println(" Introduzca 10 numeros:");
    System.out.println(" ----------------------");
    
    for (n=0; n<10; n++) { //Se introducen los numeros de 0 a 9 posiciones//
      //System.out.print(" Numero " +n+ " --> ");
      System.out.printf(" %-6s %-2s %-3s ", "Numero", n, "-->");
      num[n]= s.nextInt();
    }

    //Bucle para hacer el orden inverso//
    System.out.println(" -------------------------------------------------------------");
    System.out.println(" Los numeros introducidos en orden inverso son los siguientes:");
    System.out.println(" -------------------------------------------------------------");
    //Una vez almacenadas las posiciones se disminuyen en un bucle empezando por la ultima para hacer el inverso//
    for (n=9; n>=0; n--) { 
      //System.out.println(" Numero " +n+ " --> " + num[n]);
      System.out.printf("%-6s %-2s %-3s %-3s\n", " Numero", n, "-->", num[n]);
    }

  }
}
