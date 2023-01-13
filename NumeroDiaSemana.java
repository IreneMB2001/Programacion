/*NumeroDiaSemana.java
*Programa que dado un numero del 1 al 7 escrito por teclado, te dice a que dia de la semana pertenece.
@Irene Martin
*/

import java.util.Scanner;

public class NumeroDiaSemana {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);  
    
    System.out.println (" ");
    
    System.out.print (" Dame un numero de dia de la semana: ");
    
    int dia= s.nextInt();
    
    String nombreDia;
    
    //Sentencia condicional//
    switch (dia) {
      case 1:
        nombreDia= "Lunes";
        break;
      case 2:
        nombreDia= "Martes";
        break;
      case 3:
        nombreDia= "Miercoles";
        break;
      case 4:
        nombreDia= "Jueves";
        break;
      case 5:
        nombreDia= "Viernes";
        break;
      case 6:
        nombreDia= "Sabado";
        break;
      case 7:
        nombreDia= "Domingo";
        break;
      default:
        nombreDia= "Este dia de la semana no existe";
    }
    System.out.println (" Dia " + dia + ": " + nombreDia);

  }
}
