/*Ej14ColoresAntesQuePalabras.java
*Programa que genera 20 numeros aleatorios entre 0 y 100 y tiene que mostrar primero los pares y despues impares.
*Irene Martin
*/
import java.util.Scanner;

public class Ej14ColoresAntesQuePalabras {
  public static void main (String [] args) {
    Scanner s = new Scanner (System.in);
    
    System.out.println(" ");
    
    //Declaracion de variables//
    int t=8;
    String[] serie=new String[t]; //Array original//
    String[]totalColores={"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
    String[] color=new String[t]; //Array que almacena los valores que son colores del array original//
    String[] noColor=new String[t]; //Array que almacena los valores que no son colores del array original//
    int n;
    int contColor=0; //contador para establecer las posiciones del array color//
    int contNoColor=0; //contador para establecer las posiciones del array noColor//

    System.out.println(" Establece 8 palabras:");
    System.out.println(" ---------------------");

    //Establecer los valores de los arrays//
    for (n=0; n<t; n++) {
      System.out.print(" Palabra " +n+ " --> ");
      serie[n]= s.next();
      if (serie[n]==totalColores[n]) {
        color[contColor++]=serie[n]; //En la posicion segun el contador se establecen los colores//
      } else {
        noColor[contNoColor++]=serie[n]; //En la posicion segun el contador se establecen los que no son colores//
      }
    }
    System.out.println(" ");

    //Establecer las posiciones del array nuevo//
    for (n=0; n<contColor; n++) {
      serie[n]=color[n];
    } 
    for (n=contColor; n<t; n++) {
      serie[n]=noColor[n-contColor];
    } 
    //Mostrar el array nuevo//
    System.out.println(" ");
    System.out.println(" Nuevo array con los colores primero y despues los que no son colores");
    System.out.println(" --------------------------------------------------------------------");
    for (n=0; n<t; n++) {
      System.out.print(" Palabra " +n+ " --> " +serie[n]);
    }
  }
}
    
      
