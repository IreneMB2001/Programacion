/*BucleDigitosParesImpares.java
*Programa que te dice cuantos digitos pares e impares hay en un numero introducido por teclado.
*@Irene Martin
*/
import java.util.Scanner;

public class BucleDigitosParesImpares {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println (" ");
    
    System.out.print (" Por favor, introduzca un numero entero positivo: ");

    //Bucle en el caso de que de negativo//
    long num=s.nextLong();
    while (num<0) {
      System.out.print (" El numero introducido tiene que ser positivo, introducelo de nuevo: ");
      num=s.nextLong();
    }
    System.out.println (" ");
    
    //Declaracion de variables//
    long cifra=0;
    long contadorPar=0;
    long contadorImpar=0;
    long decreciente=num; //variable que contiene el valor de num para poder dividirlo entre 10//
    
    while (decreciente>0) {
      cifra=decreciente%10;
      if ((cifra%2)==0) { //if par//
        contadorPar++;
      } else { //if impar//
        contadorImpar++;
      }
      decreciente=decreciente/10;
    }
    System.out.println (" El " +num+ " contiene " +contadorPar+ " digitos pares y " +contadorImpar+ " digitos impares.");
  }
}

    
    
    
    
    
    
    
    
    
    
