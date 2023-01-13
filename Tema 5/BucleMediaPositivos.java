/*BucleMediaPositivos.java
*Programa que te dice cual es la media de una serie de numeros introducidos por teclado.
*@Irene Martin
*/
import java.util.Scanner;

public class BucleMediaPositivos {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println (" ");
    
    System.out.println (" Introduce todos los numeros postitivos que necesites para hacer la media: ");
    //Declaracion de variables//
    int num=0;
    int incremento=0; //Variable int que servira para contar cuandos numeros se han introducido//
    int sumatorio=0; //Varaible int que suma todos los numeros introducidos para despues clacular la media//
    
    //Bucle para la introduccion de numeros//
    while (num>=0) { //El bucle se realiza mientras el numero sea mayor o igual a 0, si es inferior se para//
      System.out.print (" --> ");
      num= s.nextInt();
      incremento++;
      sumatorio=sumatorio+num;
    }
    //Resolucion//
    System.out.println (" ");
    System.out.println (" Has escrito un numero negativo, por lo que la introduccion de numeros ha terminado.");
    int incrementoPositivos= incremento-1; //La media se hace solo con los positivos, por lo que hay que restarle 1 al incremento//
    
    System.out.println (" - Los numeros positivos totales introducidos son: " + incrementoPositivos);
    System.out.println (" - El numero negativo introducido es: " + num);
    
    int sumatorioPositivos= sumatorio-num; //Hay que restar el numero negativo introducido//
    double media= (double)sumatorioPositivos/(double)incrementoPositivos; //Se convierte a double para añadir decimales//
    
    System.out.printf (" - La media de los numeros positivos introducidos es: %-4.2f\n", media);
    //System.out.println (" La media de los numeros introducidos es: " +media);
  }
}
    
