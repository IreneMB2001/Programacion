/*BucleMediaSumaCuenta10000.java
*Programa que permite introducir una serie de numeros interminables hasta que la suma supere 10000.
*Ademas tambien realiza el total acumulado, la cuenta de los numeros y la media.
*@Irene Martin
*/
import java.util.Scanner;

public class BucleMediaSumaCuenta10000 {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println (" ");
    
    System.out.println (" Introduce todos los numeros que quieras: ");
    //Declaracion de variables//
    int num=0;
    int contador=0; //Variable int que servira para contar cuantos numeros se han introducido//
    int sumatorio=0;

    //Bucle para la introduccion de numeros//
    do { 
      System.out.print (" --> ");
      num= s.nextInt();
      contador++;
      sumatorio=sumatorio+num;
    } while (sumatorio<=10000);
    
    double media= (double)sumatorio/(double)contador; //Se convierte a double para añadir decimales//
    System.out.println (" La suma de los numeros ha superado el valor de 10000");
    System.out.println (" ");
    System.out.println (" - Los numeros totales introducidos son: " + contador);
    System.out.println (" - La suma de los numeros introducidos es: " + sumatorio);
    System.out.printf (" - La media de los numeros introducidos es: %-8.2f\n", media);
  }
}
