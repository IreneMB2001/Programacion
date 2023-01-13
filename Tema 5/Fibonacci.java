/*Fibonacci.java
*Programa que te muestra la serie de numeros de Fibonacci, poniendo un limite introducido por teclado.
*@Irene Martin
*/
import java.util.Scanner;

public class Fibonacci {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println (" ");
    
    System.out.print (" Introduce el numero limite para ver la serie de Fibonacci: ");
    //Declaracion de variables//
    int num=s.nextInt();
    int termino1=0;
    int termino2=1;
    int i=2; //El incremento empieza una vez se introduce un numero diferente de 2//
    //Como el 0 y el 1 ya estan establecidos la condicion solo se realiza si el numero introducido es diferente de 2//
    //Sentencia condicional segun el numero establecido//
    switch (num) {
      case 1:
        System.out.println (" " +termino1);
        break;
      case 2: 
        System.out.println (" " +termino1);
        System.out.println (" " +termino2);
        break;
      default:
        System.out.println (" " +termino1);
        System.out.println (" " +termino2);
        while(i!=num) { //El bucle termina cuando el incremento legue al mismo valor que el numero introducido//
          int termino3=termino1 + termino2;
          termino1=termino2; //Se cambian los valores para que el ultimo valor se sume con la suma de los dos valores anteriores//
          termino2=termino3;
          System.out.println (" " +termino2);
          i++;
        }
        break;
    }  
  }
}
        
    
