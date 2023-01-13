/*Ej2NumerosEntre0y10Aleatorios.java
*Programa que imprime 20 numeros aleatorios entre 0 y 10 ambos incluidos separados por espacios.
*@Irene Martin
*/

public class Ej2NumerosEntre0y10Aleatorios  {
  public static void main (String [] args) {
    System.out.println (" ");
    
    System.out.print (" 20 numeros aleatorios entre 0 y 10: ");
    System.out.println (" ");
    
    //Bucle for//
    for (int i=1; i<=20; i++) {
      System.out.print( " " +(int)(Math.random()*11) + " "); //Es por 11 para que se incluya el 10// 
    }
  }
}

 
