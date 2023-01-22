/*Ej18ArraysBidimensionalesOrdenAlterno.java
*Programa que genera 10 numeros aleatorios entre 0 y 200 y tiene que aparecer junto al indice ( de 0 a 9).
*Se deben colocar los numeros de forma alterna y en orden los menores o iguales a 100 y los mayores de 100.
*Irene Martin
*/
import java.util.Scanner;

public class Ej18ArraysBidimensionalesOrdenAlterno {
  public static void main (String [] args) {
    Scanner s = new Scanner (System.in);
    
    System.out.println(" ");
    
    //Declaracion de variables//
    int t=10;
    int[] valor=new int[t]; 
    int[] menor=new int[t]; 
    int[] mayor=new int[t]; 
    int[]indice={0,1,2,3,4,5,6,7,8,9}; 
    int n;
    int contMenores=0; //contador para establecer las posiciones del array menor//
    int contMayores=0; //contador para establecer las posiciones del array mayor//


    System.out.println(" Array de 10 numeros aleatorios entre 0 y 200");
    System.out.println(" --------------------------------------------");
    //Mostrar los valores de los dos arrays//
    System.out.print(" Indice | ");
    for (n=0; n<t; n++) { 
      System.out.printf ("%8d |", +indice[n]);
    }
    System.out.println();
    System.out.println(" -------------------------------------------------------------------------------------------------------------");
    System.out.print(" Valor  | ");
    //Establecer los numeros aleatorios y los menores y mayores de 100//
    for (n=0; n<t; n++) {
      valor[n]= (int)(Math.random()*201);
      if (valor[n]<=100) {
        menor[contMenores++]=valor[n];
      } else if (valor[n]>100){
        mayor[contMayores++]=valor[n];
      }
      System.out.printf ("%8d |", +valor[n]);
    }
    System.out.println("\n");

    //Mostrar los valores de los arrays mayor y menor//
    System.out.println(" Array de mayores y array de menores de 100");
    System.out.println(" --------------------------------------------");
    System.out.print(" mayor | ");
    for (n=0; n<t; n++) { 
      System.out.printf ("%8d |", +mayor[n]);
    }
    System.out.println();
    System.out.println(" -------------------------------------------------------------------------------------------------------------");
    System.out.print(" menor | ");
    for (n=0; n<t; n++) {
      System.out.printf ("%8d |", +menor[n]);
    }

    //Establecer las posiciones del array nuevo//
    for (n=0; n<t; n=n+2) { //Se establece de 2 en 2 para ir alternando entre mayores y menores//
      if (contMayores>0) {
      valor[n]= mayor[contMayores-1];
      contMayores--;
      } else {
      valor[n]=menor[contMenores-1];
      contMenores--;
      }
    }
    for (n=1;n<t;n=n+2) {
      if (contMenores>0) {
        valor[n]=menor[contMenores-1];
        contMenores--;
      } else {
        valor[n]=mayor[contMayores-1];;
        contMayores--;
      }
    }
    System.out.println("\n");
    //Mostrar los valores del array original con el nuevo orden//
    System.out.println(" Array original con nuevas posiciones");
    System.out.println(" -------------------------------------");
    System.out.print(" Indice | ");
    for (n=0; n<t; n++) { 
      System.out.printf ("%8d |", +indice[n]);
    }
    System.out.println();
    System.out.println(" -------------------------------------------------------------------------------------------------------------");
    System.out.print(" Valor  | ");
    for (n=0; n<t; n++) {
      System.out.printf ("%8d |", +valor[n]);
    }
  }
}
