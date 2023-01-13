/*TablaMultiplicar.java
*Programa que muestra la tabla de multiplicar de un numero introducido por teclado.
*@Irene Martin
*/
import java.util.Scanner; 

public class TablaMultiplicar {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    
    System.out.println (" ");
 
    System.out.print (" Introduce un numero y te mostrare su tabla de multiplicar: ");
    int num= s.nextInt();
    int multiplicacion=1;
    
    //Bucle para hacer cada multiplicacion//
    for (int i=1; i<=10; i++) { 
      multiplicacion=num*i;
      System.out.printf (" %-1s * %-2s = %-5s\n", num, i, multiplicacion);
      } 
    }
  }

