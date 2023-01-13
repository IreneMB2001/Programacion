/*MinutosFinde.java
*Programa que dada una hora y dia determinados te dice cuantos minutos quedan para el fin de semana.
*@Irene Martin
*/
import java.util.Scanner;

public class MinutosFinde {
  public static void main (String [] args) {

    Scanner s= new Scanner (System.in);  
    
    System.out.println (" ");
    
    System.out.print (" Dame un dia de la semana entre Lunes y Viernes: ");
    String dia= s.next();
    dia= dia.toLowerCase();
    System.out.println (" Ahora, dame una hora (horas y minutos): ");
    System.out.print (" hora: ");
    int horas= s.nextInt();
    System.out.print (" Minutos: ");
    int minutos= s.nextInt();
    System.out.println (" A continuacion se mostraran los minutos que quedan para llegar al fin de semana...\n");
    
    //Equivalencia de minutos-------------------------------------------------------------------------------------------//
    int minutosH= 60; //minutos que tiene 1 hora//
    int minutosDia= minutosH*24; //Para calcular los minutos de un dia se multiplican las 24 horas * los minutos que tiene una hora//
    
    //Calculo de los minutos totales de la hora introducida-------------------------------------------------------------------//
    int totalMinutosH= horas*minutosH; //Se multiplican los minutos que tiene 1 hora por las horas introducidas//
    int minutosIntroducidos= totalMinutosH+minutos; //Los minutos totales seran la suma de totalMinutosH + minutos introducidos//
    
    //Calculo de los minutos totales cuando llega el fin de semana------------------------------------------------------------//
    //Se establece que el fin de semana comienza a las 15:00 del Viernes//
    int minutosFinde= 15*minutosH; //Se multiplican los minutos que tiene 1 hora por la hora en la que empieza el fin de semana(15)//
    int minutosTotales= minutosFinde + (minutosDia*4); 
    /*Se suman los minutos anteriormente calculados con 
    la multiplicacion de los minutos que tiene un dia por 4(Lunes, Martes, Miercoles, Jueves)*/
    
    //Calculo de los minutos actuales segun el dia introducido--------------------------------------------------------------//
    int diaNumerico= 0;
    
    //Sentencia Condicional-- Para averiguar los dias de la semana que han pasado anteriormente----------------------------//
    switch(dia) {
      case "lunes":
        diaNumerico = 0; //Si estamos a lunes solo tenemos en cuenta la hora introducida, por eso es 0//
        break;
      case "martes":
        diaNumerico = 1;
        break;
      case "miercoles":
        diaNumerico = 2;
        break;
      case "jueves":
        diaNumerico = 3;
        break;
      case "viernes":
        diaNumerico = 4;
        break;
      default:
        diaNumerico = 5; 
        System.out.println (" El dia de la semana introducido es incorrecto");
    }
    int minutosActuales= (diaNumerico*minutosDia)+minutosIntroducidos;
    //Se suman los minutos de los dias anteriores mas los minutos totales de la hora introducida por teclado//
    int minutosRestantes= minutosTotales-minutosActuales;
    //Se restan los minutos totales que hay cuando empieza el fin de semana menos los minutos actuales calculados//
    
    //Sentencia if para que cuando los minutos sean 1, ponga 1 minuto en vez de 1 minutos//
    if ((minutosRestantes==1) && (diaNumerico!=5)) {
      System.out.println(" Falta " +minutosRestantes+ " minuto para llegar al fin de semana.");
    } else if ((minutosRestantes!=1) && (diaNumerico!=5)) {
      System.out.println(" Faltan " +minutosRestantes+ " minutos para llegar al fin de semana.");
    }
  }
}
