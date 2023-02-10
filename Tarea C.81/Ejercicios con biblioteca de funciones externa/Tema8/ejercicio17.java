/*ejercicio17.java
*Programa en el que se introducen una serie de números por teclado y se acaba cuando se introduce un 0.
*Cuando acabe la introducción de números se dirá si los números introducidos son primos o no.
*@Irene Martin
*/
import java.util.Scanner;
import misFunciones.Varias;

public class ejercicio17 {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println (" ");
    
    System.out.println (" Introduce todos los números que necesites (para parar necesitas introducir un 0): ");
    //Declaracion de variables//
    int num=1;
    int incremento=0; //Variable int que servira para contar cuandos numeros se han introducido//
    int sumatorio=0; //Variable int que suma todos los numeros introducidos para despues clacular la media//
    String seriePrimos=""; //Variable que almacena los números primos
    String serieNoPrimos=""; //Variable que almacena los números no primos
    
    //Bucle para la introduccion de numeros//
    while (num!=0) { //El bucle se realiza mientras el numero sea diferente de 0, si es igual se para//
      System.out.print (" --> ");
      num= s.nextInt();
      if (Varias.esPrimo(num)) {
        seriePrimos=seriePrimos+num+" ";
      } else {
        serieNoPrimos=serieNoPrimos+num+" ";
      }      
      incremento++;
      sumatorio=sumatorio+num;
    }
    //Resolucion//
    System.out.println (" ");
    System.out.println (" Has escrito un 0, por lo que la introduccion de numeros ha terminado.");
    
    System.out.println (" - Los numeros primos introducidos son: " +seriePrimos);
    System.out.println (" - Los numeros no primos son: " +serieNoPrimos);
    
  }
}
    
