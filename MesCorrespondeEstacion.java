/*MesCorrespondeEstacion.java
*Programa que pide al usuario un numero de mes y te dice la estacion que le corresponde.
@Irene Martin
*/
import java.util.Scanner; 

public class MesCorrespondeEstacion {
  public static void main (String [] args) {

Scanner s= new Scanner (System.in);  
    
    System.out.println (" ");
    
    System.out.print (" Dame un numero de mes del anio: ");
    
    int mes= s.nextInt();
    
    String estacion;
    
    //Sentencia condicional//
    switch (mes) {
      case 1:
      case 2:
      case 3:
        estacion= "Diciembre";
        break;
      case 4:
      case 5:
      case 6:
        estacion= "Primavera";
        break;
      case 7:
      case 8:
      case 9:
        estacion= "Verano";
        break;
      case 10:
      case 11:
      case 12:
        estacion= "Otonio";
        break;
      default:
        estacion= "Este mes del anio no existe";
    }
    System.out.println (" mes " + mes + ": " + estacion);
 
  }
}
