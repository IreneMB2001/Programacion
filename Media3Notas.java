/*Media3Notas.java
*Programa que calcula la media de tres notas.
*@Irene Martin
*/
import java.util.Scanner; //declaramos el Scanner//

public class Media3Notas {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in) ; //creamos el objeto Scanner, llamado s.//
    
    System.out.println (" "); //Imprime un hueco en blanco para que el texto quede mas separado//
    
    System.out.println (" Dame las 3 notas que has sacado para hacer la media: ");
    
    System.out.print (" Nota 1: ");
    double nota1= s.nextDouble(); //variable double que almacena la primera nota//
    System.out.print (" Nota 2: ");
    double nota2= s.nextDouble(); //variable double que almacena la segunda nota//
    System.out.print (" Nota 3: ");
    double nota3= s.nextDouble(); //variable double que almacena la tercera nota//
    
    double media= (nota1+nota2+nota3)/3; //variable double que calcula la media de las 3 notas//
    
    System.out.println (" Tu nota media es de " + media); //Impresion del resultado// 
  
  }
}
