/*DiaCorrespondeAsignatura.java
*Programa que te pregunta un numero de dia de la semana y te dice la primera asignatura que te toca.
*@Irene Martin
*/
import java.util.Scanner;

public class DiaCorrespondeAsignatura {
  public static void main (String [] args) {

    Scanner s= new Scanner (System.in);  
    
    System.out.println (" ");
    
    System.out.print (" Dame un numero de dia de la semana, te dire que asignatura te toca a primera hora: ");
    
    int dia= s.nextInt();
    
    String primeraAsignatura;
    String nombreDia;
    
    //Sentencia condicional//
    switch (dia) {
      case 1:
        primeraAsignatura= "No tienes asignatura a primera hora";
        nombreDia="Lunes";
        break;
      case 2:
        primeraAsignatura= "Base de datos";
        nombreDia="Martes";
        break;
      case 3:
        primeraAsignatura= "Base de datos";
        nombreDia="Miercoles";
        break;
      case 4:
        primeraAsignatura= "Sistemas informaticos";
        nombreDia="Jueves";
        break;
      case 5:
        primeraAsignatura= "Lenguajes de marcas";
        nombreDia="Viernes";
        break;
      case 6:
        primeraAsignatura= "Es fin de semana, no tienes clases!";
        nombreDia="Sabado";
        break;
      case 7:
        primeraAsignatura= "Es fin de semana, no tienes clases!";
        nombreDia="Domingo";
        break;
      default:
        primeraAsignatura= "No se puede establecer la asignatura";
        nombreDia="Error!";
    }
    System.out.println (" ");
    System.out.println (" - Dia introducido: " + nombreDia);
    System.out.println (" - Asignatura: " + primeraAsignatura);
  }
}
