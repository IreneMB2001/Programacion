import java.util.Scanner; //declaramos el Scanner//
/*ConversorMBKB.java
*Programa que realiza un conversor de MB, introducido por teclado, a KB y muestra el resultado por pantalla.
*@Irene Martin
*/

public class ConversorMBKB {
  public static void main (String [] args) {
  
    Scanner s = new Scanner(System.in); //creamos el objeto Scanner y quedará abreviado con una s.//
    
    System.out.print ("\n"); //Salto de linea para que el texto no quede pegado hacia arriba de la ventana.//
    
    System.out.print (" Dame una cifra en Megabytes: ");
    double mb= s.nextDouble(); //variable double que almacena los megabytes leidos//
  
    System.out.println ("\n"); //Salto de linea//
  
    System.out.println (" 1 MegaByte equivale a 1024 KiloBytes, por lo tanto:");
  
    double kb= 1024; //variable que almacena de 1 MegByte en kiloBytes//
    double conversion= mb*kb; //vairable double que almacena el resultado de la conversion//
  
    System.out.println (" Los " +mb+ " MegaBytes equivalen a " +conversion+ " KiloBytes.");
    //Se imprime el resultado de la conversion de los MegaBytes leidos en KiloBytes// 
  }
}
  
    
