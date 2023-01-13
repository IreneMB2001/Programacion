/*NotaProgramacion.java
*Programa que te dice si has aprobado la asignatura de programacion introduciendo la nota de los dos examenes + recuperacion.
*@Irene Martin
*/
import java.util.Scanner;

public class NotaProgramacion {
  public static void main (String [] args) {

    Scanner s= new Scanner (System.in);  
    
    System.out.println (" ");
    
    System.out.println (" Dime la nota de tus dos examenes de programacion: ");
    System.out.print (" Examen 1: ");
    double examen1= s.nextDouble();
    System.out.print (" Examen 2: ");
    double examen2= s.nextDouble();
    
    double media= (examen1 + examen2)/2;
    String recuperacion;
    
    if (media>=5) {
      System.out.println (" Estupendo, has aprobado el trimestre.");
    } else if (media<5) {
      System.out.println (" Cual ha sido el resultado de la recuperacion? (apto/noapto)");
      System.out.print (" Resultado: ");
      recuperacion= s.next();
      recuperacion= recuperacion.toLowerCase();
      if (recuperacion.equals("apto")) {
        System.out.println (" Has conseguido aprobar el trimestre.");
        media=5;
      } else if (recuperacion.equals("noapto")) {
        System.out.println (" Lo siento, no has conseguido aprobar la asignatura.");
      }
    }
    System.out.printf (" Tu nota de programacion ha sido: %-5.2f\n", media);
  }
}
      
