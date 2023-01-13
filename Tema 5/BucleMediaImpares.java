/*BucleMediaImpares.java
*Programa que en el que introduces una serie de numeros por teclado y te dice cuantos son y la media de los impares.
*@Irene Martin
*/
import java.util.Scanner;

public class BucleMediaImpares {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println (" ");
    
    System.out.println (" Introduce todos los numeros postitivos que necesites para hacer la media: ");
    //Declaracion de variables//
    int num=0;
    int incremento=0; //Variable int que servira para contar cuantos numeros se han introducido//
    int incrementoImpar=0; //Variable int que servira para contar cuantos numeros impares se han introducido//
    int sumatorioImpar=0; //Variable int que suma todos los numeros impares introducidos para despues calcular la media//

    //Bucle para la introduccion de numeros//
    while (num>=0) { //El bucle se realiza mientras el numero sea mayor o igual a 0, si es inferior se para//
      System.out.print (" --> ");
      num= s.nextInt();
      incremento++;
      if (((num%2)!=0) && (num>=0)) { //Un numero no divisible entre 2 es impar//
        incrementoImpar++;
        sumatorioImpar=sumatorioImpar+num;
      }
    }
    //Resolucion//
    System.out.println (" ");
    System.out.println (" Has escrito un numero negativo, por lo que la introduccion de numeros ha terminado.");
    int incrementoPositivos= incremento-1; //hay que restarle 1 al incremento para que no cuente el negativo//
    
    System.out.println (" - Los numeros positivos totales introducidos son: " + incrementoPositivos);
    System.out.println (" - El numero negativo introducido es: " + num);
    System.out.println (" - Los numeros impares totales introducidos son: " + incrementoImpar);
    
    double media= (double)sumatorioImpar/(double)incrementoImpar; //Se convierte a double para añadir decimales//
    
    System.out.printf (" - La media de los numeros impares introducidos es: %-4.2f\n", media);
  }
}
    
