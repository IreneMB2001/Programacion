/*EcuacionPrimerGrado.java
*Programa que calcula una ecuacion de primer grado tipo ax + b= 0, siendo a y b introducidos por teclado
*@Irene Martin
*/

import java.util.Scanner; //declaramos el Scanner//

public class EcuacionPrimerGrado {
  public static void main (String [] args) {
    Scanner s = new Scanner(System.in); //creamos el objeto Scanner, llamado s.//
    
    System.out.println (" "); //Imprime un hueco en blanco para que no quede el texto quede mas separado//
    
    System.out.println (" Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    System.out.print (" Por favor, introduzca el valor de a: ");
    double a= s.nextDouble(); //variable double que almacena el valor introducido de a//
    
    System.out.print (" Ahora introduzca el valor de b: ");
    double b= s.nextDouble(); //variable double que almacena el valor introducido de b//
    
    if (a==0) { //Si a vale 0 la ecuacion no se puede resolver//
      System.out.print (" Esa ecuacion no tiene solucion real");
    } else {
      double x = -b/a; //ax + b = 0, al despejar la x la ecuacion se convierte en: x= -b/a//
      System.out.print (" El resultado de la ecuacion es: x = " +x);//En este caso se imprime el resultado de la ecuacion//
    }   
  }
}
