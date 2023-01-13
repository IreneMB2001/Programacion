/*BucleSuma100NSiguientes.java
*Programa que te calcula la suma de un numero introducido por teclado + los 100 siguientes.
*@Irene Martin
*/
import java.util.Scanner;

public class BucleSuma100NSiguientes {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println (" ");
    
    System.out.print (" Introduce un numero: ");
    int num=s.nextInt();
    while (num<0) {
      System.out.print (" El numero introducido debe ser entero y positivo, "); 
      System.out.print ("vuelve a introducirlo: "); 
      num=s.nextInt();
    }
    
    int sumatorio=0; //Vaiable que sumara todos los valores desde el numero introducido hasta los 100 siguientes//
    
    for (int i=1; i<=100; i++) {
      sumatorio=sumatorio+num; //El valor de esta variable al ser 0 se convierte en el valor del numero introducido//
      num++; //El numero introducido se incrementa//
    }
    System.out.println (" La suma del numero mas los 100 siguientes es: " +sumatorio);
  }
}
    
    
