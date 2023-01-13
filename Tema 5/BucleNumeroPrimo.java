/*BucleNumeroPrimo.java
*Programa que te dice si el numero introducido por teclado es primo o no.
*@Irene Martin
*/
import java.util.Scanner;

public class BucleNumeroPrimo {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println (" ");
    
    System.out.println (" Introduce un numero para saber si es primo o no: ");
    System.out.print (" Numero: ");
    int num= s.nextInt();
    int i=1; //La variable i servirá para incrementar los numeros con los que se le hace el resto//
    int contador=0; //El contador servira para contar cuantas veces el resto del numero da 0//
    
    while (i<=num) { //El bucle termina cuando el incremento llega al valor del numero//
      int resto=num%i; //Se hace el resto del numero con el numero incrementado//
      if (resto==0) {
        contador++;
      }
      i++;
    }
    if (contador==2) { //Un numero primo solo es divisible entre si mismo y 1 (El resto es 0 solo 2 veces)//
      System.out.println (" El numero introducido es primo ");
    } else {
      System.out.println (" El numero introducido no es primo ");
    } 
  }
}

    
