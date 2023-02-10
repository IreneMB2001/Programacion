/*ejercicio21.java
*Programa que muestra un menu de opciones y según la elección calcula una determinada función geométrica.
*El proceso se repetirá una y otra vez hasta que se introduzca la opción de salir, terminando el programa.
*@Irene Martin
*/
import java.util.Scanner;
import misFunciones.*;
public class ejercicio21 {
  public static void main (String [] args) {
    int eleccion=0;
    do {
      eleccion=Geometria.menu();
      if (eleccion==1) {
        System.out.println(Geometria.circunferencia(Geometria.pideRadio()));     
      } else if (eleccion==2) {
        System.out.println(Geometria.areaCirculo(Geometria.pideRadio())); 
      } else if (eleccion==3) {
        System.out.println(Geometria.volumen(Geometria.pideRadio()));       
      } else if (eleccion==4) {
        double radio=Geometria.pideRadio();
        System.out.println(Geometria.circunferencia(radio));     
        System.out.println(Geometria.areaCirculo(radio));   
        System.out.println(Geometria.volumen(radio));           
      }
    } while (eleccion!=5);
  }
}
