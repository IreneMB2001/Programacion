/*SegundosMedianoche.java
*Programa que dada una hora determinada (horas y minutos) te dice cuantos segundos quedan para la medianoche.
*@Irene Martin
*/
import java.util.Scanner;

public class SegundosMedianoche {
  public static void main (String [] args) {

    Scanner s= new Scanner (System.in);  
    
    System.out.println (" ");
    
    System.out.println (" Dame una hora (horas y minutos) y te dire cuantos segundos quedan para la medianoche: ");
    
    //Introduccion de datos por teclado----------------------------------------------------------------------------//
    System.out.print (" hora: ");
    int horas= s.nextInt();
    System.out.print (" Minutos: ");
    int minutos= s.nextInt();
    
    //Equivalencia de segundos-------------------------------------------------------------------------------------------//
    int segundosM= 60; //segundos que tiene 1 minuto//
    int segundosH= 3600; //segundos que tiene 1 hora//
    int segundosDia= segundosH*24; //Para calcular los segundos de un dia se multiplican las 24 horas * los segundos que tiene una hora//
    
    //Calculo de los segundos totales de la hora introducida-------------------------------------------------------------------//
    
    //Se multiplican los segundos que tiene 1 minuto por los minutos introducidos//
    int totalSegundosM= segundosM*minutos; //Se multiplican los segundos que tiene 1 minuto por los minutos introducidos//
    int totalSegundosH= segundosH*horas; //Se multiplican los segundos que tiene 1 hora por las horas introducidas
    int totalSegundos= totalSegundosM + totalSegundosH; //la suma de ambos segundos anteriores es el total de segundos//
    
    //Calculo de los segundos restantes para llegar a las 12:00----------------------------------------------------------------//
    int segundosRestantes= segundosDia - totalSegundos; 
    //se restan los segundos que tiene un dia menos los segundos de la hora introducida//
    
    //Impresion del resultado-------------------------------------------------------------------------------------------------//
    System.out.println (" Faltan " +segundosRestantes+ " segundos para llegar a la medianoche cenicienta.");

  }
}
