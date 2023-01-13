/*EcuacionSegundoGrado.java
*Programa que calcula una ecuacion de segundo grado tipo ax^2 + bx + c = 0, siendo a, b y c introducidos por teclado.
*@Irene Martin
*/

import java.util.Scanner; //declaramos el Scanner//

public class EcuacionSegundoGrado {
  public static void main (String [] args) {
    Scanner s = new Scanner(System.in); //creamos el objeto Scanner, llamado s.//
    
    System.out.println (" "); //Imprime un hueco en blanco para que el texto quede mas separado//
    
    System.out.println (" Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    System.out.print (" Por favor, introduzca el valor de a: ");
    double a= s.nextDouble(); //variable double que almacena el valor introducido de a//
    
    System.out.print (" Ahora introduzca el valor de b: ");
    double b= s.nextDouble(); //variable double que almacena el valor introducido de b//
    
    System.out.print (" Ahora introduzca el valor de c: ");
    double c= s.nextDouble(); //variable double que almacena el valor introducido de c//
    
    if ((a != 0) && (b != 0) && (c != 0)) { //tiene que ser distinto de 0 porque sino no se puede resolver//
      double operacion1 = (b * b) - (4*a*c);//operacion a la que se le hara la raiz cuadrada//
      double raiz = Math.sqrt(operacion1); //variable double que almacena la raiz cuadrada de la operacion1//
      double operacion2p = (-b+raiz)/(2*a); //(-b+raiz)/2*a, es la ecuacion aniadiendole los datos anteriores, y la p es porque la opracion va en positivo//
      double operacion2n = (-b-raiz)/(2*a); //(-b-raiz)/2*a, es la ecuacion aniadiendole los datos anteriores, y la n es porque la opracion va en negativo//
      System.out.println (" El resultado de la ecuacion es: x = " +operacion2p+ " y " +operacion2n);//En este caso se imprime el resultado de la ecuacion//
    } else {
      System.out.println (" Esta ecuacion no tiene solucion");
    }
  }
}
