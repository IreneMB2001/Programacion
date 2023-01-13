/*Ordena3Numeros.java
*Programa que te ordena 3 numeros de menor a mayor introducidos por teclado.
*@Irene Martin
*/
import java.util.Scanner; //declaramos el Scanner//

public class Ordena3Numeros {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in); //creamos el objeto Scanner, llamado s.//
    
    System.out.println (" "); //Imprime un hueco en blanco para que el texto quede mas separado//
    
    System.out.println (" Por favor, introduce 3 numeros: ");
    
    System.out.print (" Primer numero: ");
    double num1= s.nextDouble(); //variable double que almacena el primer numero//
    
    System.out.print (" Segundo numero: ");
    double num2= s.nextDouble(); //variable double que almacena el segundo numero//
    
    System.out.print (" Tercer numero: ");
    double num3= s.nextDouble(); //variable double que almacena el tercer numero//
    
    //Sentencia if - Con 3 numeros se pueden hacer hasta 6 combinaciones//
    if ((num1<num2) && (num1<num3) && (num2<num3)) {
      System.out.println (" ");
      System.out.println (" El orden de los numeros introducidos es el siguiente:");
      System.out.println (" " + num1);
      System.out.println (" " + num2);
      System.out.println (" " + num3);
    
    } else if ((num2<num1) && (num2<num3) && (num1<num3)){
      System.out.println (" ");
      System.out.println (" El orden de los numeros introducidos es el siguiente:");
      System.out.println (" " + num2);
      System.out.println (" " + num1);
      System.out.println (" " + num3);
    
    } else if ((num2<num1) && (num2<num3) && (num3<num1)){
      System.out.println (" ");
      System.out.println (" El orden de los numeros introducidos es el siguiente:");
      System.out.println (" " + num2);
      System.out.println (" " + num3);
      System.out.println (" " + num1);
    
    } else if ((num1<num2) && (num1<num3) && (num3<num2)){
      System.out.println (" ");
      System.out.println (" El orden de los numeros introducidos es el siguiente:");
      System.out.println (" " + num1);
      System.out.println (" " + num3);
      System.out.println (" " + num2);
    
    } else if ((num3<num1) && (num3<num2) && (num1<num2)){
      System.out.println (" ");
      System.out.println (" El orden de los numeros introducidos es el siguiente:");
      System.out.println (" " + num3);
      System.out.println (" " + num1);
      System.out.println (" " + num2);
    
    } else if ((num3<num1) && (num3<num2) && (num1<num2)){
      System.out.println (" ");
      System.out.println (" El orden de los numeros introducidos es el siguiente:");
      System.out.println (" " + num3);
      System.out.println (" " + num2);
      System.out.println (" " + num1);
    
    } 
  }
}
