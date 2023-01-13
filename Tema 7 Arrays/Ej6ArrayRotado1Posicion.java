/*Ej6ArrayRotado1Posicion.java
*Programa que pide 15 numeros, almacenandolos en un array para rotarlos una posicion a la derecha.
*Por ejemplo: la posicion 0 pasa a ser la posicion 1, la 1 pasa a ser la 2, etc.
*Irene Martin
*/
import java.util.Scanner;

public class Ej6ArrayRotado1Posicion {
  public static void main (String [] args) {
    Scanner s = new Scanner (System.in);
    
    System.out.println(" ");
    
    //Declaracion de variables//
    int[] numero=new int[15];
    int n;
    int nuevo; //Variable que almacena la ultima posicion del array original//
    
    //Bucle para establecer los 10 numeros//
    System.out.println(" Introduzca 15 numeros:");
    System.out.println(" ----------------------");

    for (n=0; n<15; n++) { 
      System.out.printf(" %-6s %-2s %-3s ", "Numero", n, "-->");
      numero[n]= s.nextInt();
    }
    
    //Rotar el array una posicion a la derecha//
    nuevo = numero[14]; //La ultima posicion original se almacena en una variable//
    for (n=14; n>0; n--) { //Como la ultima posicion ocupara la primera, los valores seran el de la posicion anterior//
      numero[n]= numero[n-1];
    }
    numero[0]= nuevo; //La ultima posicion original pasa a ser la posicion 0//
    
    //Muestra del array actualizado//
    System.out.println(" -----------------------------------------------------------------");
    System.out.println(" Los numeros rotados una posicion a la derecha son los siguientes: ");
    System.out.println(" -----------------------------------------------------------------");
    for (n = 0; n < 15; n++) {
      System.out.printf(" %-6s %-2s %-3s %-3s\n", "Numero", n, "-->", numero[n]);
    }
  }
}
    
    
