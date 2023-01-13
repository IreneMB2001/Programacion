/*UltimaCifra.java
*Programa que te dice la ultima cifra de un numero introducido por teclado (limite de 5 cifras).
*@Irene Martin
*/
import java.util.Scanner;

public class UltimaCifra {
  public static void main (String [] args) {

    Scanner s= new Scanner (System.in);  
    
    System.out.println (" ");
    
    System.out.print (" Dime un numero y te devolvere su ultima cifra: ");
    int num= s.nextInt();
    //para coger el valor de la ultima cifra se utiliza el resto del numero entre 10//
    int resto= num%10;
    System.out.println (" La ultima cifra de tu numero es: " +resto);

  }        
}
