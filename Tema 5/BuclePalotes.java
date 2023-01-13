/*BuclePalotes.java
*Programa que te escribe un numero introducido por teclado con el metodo "palotes".
*@Irene Martin
*/
import java.util.Scanner;

public class BuclePalotes {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println (" ");
    
    System.out.print (" Por favor, introduzca un numero: ");
    long num=s.nextLong();
    System.out.println (" El numero introducido con el metodo palotes es el siguiente:");
    System.out.println (" ");
    
    //Declaracion de variables//
    long cifra=0;
    String palito="";

    //Bucle //
    while (num>0) {
      cifra=num%10; 
      for (int i=1; i<=cifra; i++)  {
        palito= " |" + palito; //de esta forma la ultima cifra no sale como la primera//
      }  
      num=num/10;  

      if(num != 0){
        palito = " -" + palito;	  
      }
    }
    System.out.println(palito);
  }
}
