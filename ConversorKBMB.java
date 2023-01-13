import java.util.Scanner; //declaramos el Scanner//
/*ConversorKBMB.java
*Programa que realiza un conversor de KB, introducido por teclado, a MB y muestra el resultado por pantalla.
*@Irene Martin
*/

public class ConversorKBMB {
  public static void main (String [] args) {
  
    Scanner s= new Scanner (System.in); //creamos el objeto Scanner y quedará abreviado con una s.//
    
    System.out.print ("\n"); //Salto de linea para que el texto no quede pegado hacia arriba de la ventana.//
    
    System.out.print (" Dame una cifra en Kilobytes: ");
    double kb= s.nextDouble(); //variable double que almacena la cifra en Kilobytes leida.//
    
    System.out.println ("\n"); //Salto de linea//
    
    System.out.println (" 1 Kilobyte equivale a 0,0009765625 (1/1024) Megabytes, por lo tanto:");
    double mb= 0.0009765625; //variable double que almacena la equivalencia en MB de 1 KB.//
    
    double conversion= kb*mb; //variable double que almacena el resultado de la conversion.//
    
    System.out.println (" Los " +kb+ " Kilobytes equivalen a " +conversion+ " Megabytes.");
    //Se imprime el resultado de la conversion.//
  }
}
    
