/*Ej9ArrayParImpar.java
*Programa que pide 8 numeros enteros y despues los muestra con la palabra par o impar.
*El numero sustituido aparecera entre comillas
*Irene Martin
*/
import java.util.Scanner;

public class Ej9ArrayParImpar {
  public static void main (String [] args) {
    Scanner s = new Scanner (System.in);
    
    System.out.println(" ");
    
    //Declaracion de variables//
    int t=8;
    int[] numero=new int[t];
    int n;
    int resto=0;
    
    //Bucle para establecer los 8 numeros//
    System.out.println(" Introduzca 8 numeros enteros:");
    System.out.println(" -----------------------------");

    for (n=0; n<t; n++) { 
      System.out.printf(" %-6s %-2s %-3s ", "Numero", n, "-->");
      numero[n]= s.nextInt();
    }
    
    //Bucle para mostrar los 8 numeros introducidos//
    System.out.println(" ----------------------------------------------------------");
    System.out.println(" Muestra de si los numeros introducidos son pares o impares");
    System.out.println(" ----------------------------------------------------------");
    for (n=0; n<t; n++) { 
      resto=numero[n]%2;
      if (resto==0) {
        System.out.printf(" %-4s %-9s ", numero[n], "--> par");
      } else {
        System.out.printf(" %-4s %-9s ", numero[n], "--> impar");
      }
      System.out.println(" ");
    }
  }
}

    
