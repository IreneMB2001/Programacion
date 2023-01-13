/*Ejemplo1Arrays.java
*Programa que muestra los elementos de un Array siguiendo el ejemplo 3 del libro.
*Irene Martin
*/
import java.util.Scanner; 

public class Ejemplo1Arrays {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    
    System.out.println(" ");
    
    int[] num=new int[10];
    
    num[0] = (int)Math.pow(2,0);
    num[1] = (int)Math.pow(2,1);
    num[2] = (int)Math.pow(2,2);
    num[3] = (int)Math.pow(2,3);
    num[4] = (int)Math.pow(2,4);
    num[5] = (int)Math.pow(2,5);
    num[6] = num[2]*10;
    num[7] = num[2]/10;
    num[8] = num[0] + num[1] + num[2];
    num[9] = num[8];
    
    //Mostrar el contenido del array//
    System.out.println(" El array num contiene los siguientes elementos:");
    
    for (int i=0; i<10; i++) {
      System.out.println(" " + num[i]);
    }
    
    //Mostrar el elemento de una posicion indicada por teclado//
    System.out.print(" Dime la posicion que quieres mostrar en elemento: ");
    int posicion = s.nextInt();
    System.out.println(" " + num[posicion]);
    
    //Mostrar la suma de las posiciones pares//
    int suma = num[0]+num[2]+num[4]+num[6]+num[8];
    System.out.println(" La suma de las posiciones pares es :" +suma);
    
  }
}
