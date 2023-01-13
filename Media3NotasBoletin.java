/*Media3NotasBoletin.java
*Programa que te hace la media de 3 notas y te dice si la nota media es insuficiente, suficiente, bien, notable o sobresaliente.
*@Irene Martin
*/
import java.util.Scanner; //declaramos el Scanner//

public class Media3NotasBoletin {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in); //creamos el objeto Scanner, llamado s.//
    
    System.out.println (" "); //Imprime un hueco en blanco para que el texto quede mas separado//
    
    System.out.println (" Dame las 3 notas que has sacado para hacer la media: ");
    
    System.out.print (" Nota 1: ");
    double nota1= s.nextDouble(); //variable double que almacena la primera nota//
    
    System.out.print (" Nota 2: ");
    double nota2= s.nextDouble(); //variable double que almacena la segunda nota//
    
    System.out.print (" Nota 3: ");
    double nota3= s.nextDouble(); //variable double que almacena la tercena nota//
    
    double media= (nota1+nota2+nota3)/3; //variable double que calcula la media de las 3 notas//
    
    //Sentencia if//
    if (media>=0 && media<5){ //condicion insuficiente//
      System.out.println (" Tu nota media es de " + media + " por lo tanto tienes un insuficiente");
     
    } else if (media>=5 && media<6) { //condicion suficiente//
      System.out.println (" Tu nota media es de " + media + " por lo tanto tienes un suficiente");
     
    } else if (media>=6 && media<7) { //condicion bien//
      System.out.println (" Tu nota media es de " + media + " por lo tanto tienes un bien");
	 
    } else if (media>=7 && media<9) { //condicion notable//
      System.out.println (" Tu nota media es de " + media + " por lo tanto tienes un notable");
	 
    } else if (media>=9 && media<=10){ //condicion sobresaliente//
      System.out.println (" Tu nota media es de " + media + " por lo tanto tienes un sobresaliente");
     
    }     
  }
}
