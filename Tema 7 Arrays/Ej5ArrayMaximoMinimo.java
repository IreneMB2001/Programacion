/*Ej5ArrayMaximoMinimo.java
*Programa que pide 10 numeros y muestra los todos los numeros indicando tambien el maximo y minimo.
*Irene Martin
*/
import java.util.Scanner;

public class Ej5ArrayMaximoMinimo {
  public static void main (String [] args) {
    Scanner s = new Scanner (System.in);
    
    System.out.println(" ");
    
    System.out.println(" Introduzca 10 numeros:");
    System.out.println(" ----------------------");
    //Declaracion de variables//
    int t = 10; //Variable que almacena el tamanio del scanner//
    int[] numero=new int[t]; 
    System.out.print(" Numero 0 --> ");
    numero[0]= s.nextInt();
    int maximo=numero[0]; //Tambien se puede utilizar Integer.MIN_VALUE e Integer.MAX_VALUE//
    int minimo=numero[0]; 
    int n; //Variable para almacenar las posiciones//
    
    //Bucle para establecer los 10 numeros//
    for (n=1; n<t; n++) { 
      System.out.print(" Numero " +n+ " --> ");
      numero[n]= s.nextInt();
      
      //Sentencia if para establecer el maximo y el minimo//
      if(numero[n]>maximo) {
        maximo=numero[n];
      }
      if(numero[n]<minimo) {
        minimo=numero[n];
      }
    }
    //Bucle para mostrar los numeros//
    System.out.println(" --------------------------------------------");
    System.out.println(" Los numeros introducidos son los siguientes: ");
    System.out.println(" --------------------------------------------");
    for (n = 0; n < t; n++) {
      //Sentencia if para mostrar el maximo y el minimo//
      System.out.print(" | " + numero[n]);
      if (numero[n] == maximo) {
        System.out.print(" --> maximo ");
      }
      if (numero[n] == minimo) {
        System.out.print(" --> minimo ");
      } 
    }
  }
}
      
      
    
