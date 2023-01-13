/*Ej4ArrayNumeroCuadradoCuboAleatorio.java
*Programa que define 3 arrays de 20 numeros: numeros aleatorios entre 0 y 100, su cuadrado y su cubo.
*Irene Martin
*/

public class Ej4ArrayNumeroCuadradoCuboAleatorio {
  public static void main (String [] args) {
    
    System.out.println(" ");
    
    //Declaracion de variables//
    int[] numero=new int[20];
    int[] cuadrado=new int[20];
    int[] cubo=new int[20];
    int n; //Variable para almacenar las posiciones//
    
    //Bucle para establecer los numeros aleatorios//
    for (n=0; n<20; n++) {
      numero[n]= (int)(Math.random()*101);
      cuadrado[n]= numero[n]*numero[n];
      cubo[n]= cuadrado[n]*numero[n];
    }
    
    //Muestra del resultado//
    System.out.print(" Tabla de 3 arrays formados por 20 numeros aleatorios entre 0 y 100, ");
    System.out.println("el cuadrado y el cubo de dichos numeros consecutivamente: ");
    System.out.println(" -------------------------------");
    System.out.printf ("%-8s %-10s %-10s\n", " numero", " cuadrado", " cubo");
    System.out.println(" -------------------------------");
    for (n=0; n<20; n++) {
      System.out.printf(" %-8s %-9s  %-10s\n", numero[n], cuadrado[n], cubo[n]);
    }
    System.out.println(" -------------------------------");
  }
}
