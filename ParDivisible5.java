/*ParDivisible5.java
*Programa que te dice si el numero introducido por teclado es par y/o divisible entre 5.
*@Irene Martin
*/
import java.util.Scanner;

public class ParDivisible5 {
  public static void main (String [] args) {

    Scanner s= new Scanner (System.in);  
    
    System.out.println (" ");
    
    System.out.print (" Dame un numero, por favor: ");
    
    //Introduccion de datos por teclado//
    int num= s.nextInt();
    double resto5= num%5; //Divisible 5: variable double que recoge el resto del numero entre 5//
    double resto2= num%2; //Par: variable double que recoge el resto del numero entre 2//
    
    //Sentencia if//
    if (resto5==0 && resto2==0) {
      System.out.println (" El numero introducido es par y tambien divisible entre 5.");
    } else if (resto5!=0 && resto2==0) {
      System.out.println (" El numero introducido es par pero no es divisible entre 5."); 
    } else if (resto5==0 && resto2!=0) {
      System.out.println (" El numero introducido no es par pero es divisible entre 5.");
    } else if (resto5!=0 && resto2!=0) {
      System.out.println (" El numero introducido no es par ni tampoco divisible entre 5.");
    }   
  }
}
