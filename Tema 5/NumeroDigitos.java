/*NumeroDigitos.java
*Programa que te dice cuantos digitos tiene el numero introducido.
*@Irene Martin
*/
import java.util.Scanner;

public class NumeroDigitos {
  public static void main (String [] args) {

    Scanner s= new Scanner (System.in);  
    
    System.out.println (" ");
    
    System.out.print (" Dime un numero y te dire cuantos digitos tiene: ");
    long num=s.nextLong();
    int contador=0;
    while (num!=0) { //hay que hacer un bucle para que cuando el numero se divida entre 10 tiene que llegar a 0 para pararse//
      num=num/10; //El numero de cifras equivale al numero de veces que el numero se divide entre 10.//
      contador++; //cada vez que el numero se divida entre 10 el contador suma 1 para averiguar el numero de digitos.//
    }
    System.out.println (" Tu numero tiene " +contador+ " digitos.");
      
  }
}
