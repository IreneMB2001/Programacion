/*PrimeraCifra.java
*Programa que te dice la primera cifra de un numero introducido por teclado (limite de 5 cifras).
*@Irene Martin
*/
import java.util.Scanner;

public class PrimeraCifra {
  public static void main (String [] args) {

    Scanner s= new Scanner (System.in);  
    
    System.out.println (" ");
    
    System.out.print (" Dime un numero y te devolvere su primera cifra: ");
    int num= s.nextInt();
    //para coger el valor de la primera cifra se divide el numero entre 10//
    int Cifras2= num/10;
    //Si el numero tiene mas de 2 cifras, se le añade a 10 un 0 mas, segun las cifras del numero//
    int Cifras3= num/100;
    int Cifras4= num/1000;
    int Cifras5= num/10000;
    
    //Sentencia if//
    if (num>=10 && num<=99) {
      System.out.println (" La primera cifra de tu numero es: " +Cifras2);
    } else if (num>=100 && num<=999) { 
      System.out.println (" La primera cifra de tu numero es: " +Cifras3);
    } else if (num>=1000 && num<=9999) {  
      System.out.println (" La primera cifra de tu numero es: " +Cifras4);
    } else if (num>=10000 && num<=99999) {
      System.out.println (" La primera cifra de tu numero es: " +Cifras5);
    } else if (num>=0 && num<=9) {
      System.out.println (" Tu numero no tiene mas de 2 cifras por lo que la primera cifra es: " +num);
    } else {
      System.out.println (" Solo se admiten numeros de hasta 5 cifras.");
    }
  }        
}
