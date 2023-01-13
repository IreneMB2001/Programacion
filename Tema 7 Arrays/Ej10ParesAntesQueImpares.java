/*Ej10ParesAntesQueImpares.java
*Programa que genera 20 numeros aleatorios entre 0 y 100 y tiene que mostrar primero los pares y despues impares.
*Irene Martin
*/
import java.util.Scanner;

public class Ej10ParesAntesQueImpares {
  public static void main (String [] args) {
    Scanner s = new Scanner (System.in);
    
    System.out.println(" ");
    
    //Declaracion de variables//
    int t=20;
    int[] numero=new int[t]; //Array original//
    int[] par=new int[t]; //Array que almacena los numeros pares del array original//
    int[] impar=new int[t]; //Array que almacena los numeros impares del array original//
    int n;
    int contPar=0; //contador para establecer las posiciones del array par//
    int contImpar=0; //contador para establecer las posiciones del array impar//
    int resto=0;

    System.out.println(" Array de 20 numeros aleatorios entre 0 y 100");
    System.out.println(" --------------------------------------------");

    //Establecer los valores de los arrays//
    for (n=0; n<t; n++) {
      numero[n]= (int)(Math.random()*101);
      resto=numero[n]%2;
      if (resto==0) {
        par[contPar++]=numero[n]; //En la posicion segun el contador se establecen los numeros pares//
      } else {
        impar[contImpar++]=numero[n]; //En la posicion segun el contador se establecen los numeros impares//
      }
      System.out.print(" | " +numero[n]);
    }
    System.out.println(" ");

    //Establecer las posiciones del array nuevo//
    for (n=0; n<contPar; n++) {
      numero[n]=par[n];
    } 
    for (n=contPar; n<t; n++) {
      numero[n]=impar[n-contPar];
    } 
    //Mostrar el array nuevo//
    System.out.println(" ");
    System.out.println(" Nuevo array con los numeros pares primero y despues los impares");
    System.out.println(" ---------------------------------------------------------------");
    for (n=0; n<t; n++) {
      System.out.print(" | " +numero[n]);
    }
  }
}
    
      


          



      



