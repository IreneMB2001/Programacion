/*BucleCuantosPositivosYNegativos.java
*Programa que te pide introducir 10 numeros y te dice cuales son negativos y cuales positivos.
*@Irene Martin
*/
import java.util.Scanner;

public class BucleCuantosPositivosYNegativos {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println (" ");
    
    System.out.println (" Introduce 10 numeros: ");
    //Declaracion de variables//
    int num=0;
    int i=0; //Variable int que servira de incremento general para establecer el limite de 10 numeros//
    int incrementoPositivos=0; //Variable int que servira para contar cuandos numeros positivos se han introducido//
    int incrementoNegativos=0; //Variable int que servira para contar cuandos numeros negativos se han introducido//
    
    //Bucle para la introduccion de numeros//
    while (i<10) { //El bucle se realiza mientras el incremento sea menor que 10//
      System.out.print (" --> ");
      num= s.nextInt();
      i++;
      if(num>=0) { //Si el numero es mayor o igual a 0 se cuenta como positivo//
        incrementoPositivos++;
      } else { //Si es lo contrario se cuenta como negativo//
        incrementoNegativos++;
      }
    }
    //Resolucion//
    System.out.println (" "); 
    System.out.println (" - Numero total de positivos: " + incrementoPositivos);
    System.out.println (" - Numero total de negativos: " + incrementoNegativos);
    
  }
}
