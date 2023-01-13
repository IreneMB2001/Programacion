/*BucleEntre2Numeros.java
*Programa que te dice los numeros que hay entre 2 numeros introducidos por teclado incrementando de 7 en 7.
*@Irene Martin
*/
import java.util.Scanner;

public class BucleEntre2Numeros {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println (" ");
    
    System.out.print (" Introduce el primer numero: ");
    int num1=s.nextInt();
    System.out.print (" Introduce el segundo numero: ");
    int num2=s.nextInt();
    
    while (num1==num2) {
      System.out.println (" Los numeros tienen que ser distintos, vuelve a introducirlos: "); 
      System.out.print (" Numero 1: "); 
      num1=s.nextInt();
      System.out.print (" Numero 2: "); 
      num2=s.nextInt();
    }
    
    int sumatorio=0; //Vaiable que sumara todos los valores desde el numero introducido hasta los 100 siguientes//
    
    if (num1<num2) {
      System.out.print (" Los numeros comprendidos entre " +num1+ " y " +num2+ " contado de 7 en 7 ");
      System.out.println ("son los siguientes: ");
      for (int i=num1; i<num2; i=i+7) {
        System.out.println (" " +i);
      }   
    } else {
      System.out.print (" Los numeros comprendidos entre " +num2+ " y " +num1+ " contado de 7 en 7 ");
      System.out.println ("son los siguientes: ");
      for (int i=num2; i<num1; i=i+7) {
        System.out.println (" " +i);
      }
    }
  }
}
   
