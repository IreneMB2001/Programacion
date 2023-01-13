/*BucleFactorial.java
*Programa que te hace el factorial de un numero introducido por teclado y sus anteriores.
*@Irene Martin
*/
import java.util.Scanner;

public class BucleFactorial {
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
    System.out.println (" Factoriales desde 1 hasta " +num+ " :");
    //Bucle principal//
    for (int i=1; i<=num; i++) { //este bucle incrementa la variable hasta llegar al numero//
      int factorial=i; //el factorial almacena el valor actual del incremento//
      for (int n=(i-1); n>=1; n--) { //este bucle empieza con el valor incrementado y lo decrece hasta llegar a 1//
        factorial=factorial*n; //se multiplica el primer incremento por su valor decreciente//
      }
      System.out.println ( " " + i + "! = " + factorial );
    }
  }
} 
      
 
