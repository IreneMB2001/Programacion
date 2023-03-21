package ArraysDeObjetos.Ej1y2Gatos;
/* PruebaArrayGatos.java
 * Prueba de la clase Gato implementando arrays (los datos se introducen por teclado)
 * Se tiene que añadir la opción de darle de comer sardinas a uno de los gatos
 * @Author Irene
 */
import java.util.Scanner;
public class Ej1PruebaArrayGatos {
  public static void main (String [] args) {
    Scanner s = new Scanner(System.in);

    //Creación del Array//
    Gato[] gato = new Gato[4];

    //variables a utilizar después//
    String respuesta="";

    //Establecer los valores de cada Gato//
    System.out.print("\nVamos a crear un Array de 4 gatitos, ");
    System.out.println("para ello introduce los datos de cada uno de ellos:");

    for (int i=0; i<4; i++) {
      System.out.println("Datos del Gato " +(i+1));
      System.out.println("-------------------");
      System.out.println("     /\\   /\\     o------o");
      System.out.println("    (=* T *=)  <o| miau |");
      System.out.println("  (  |     |     o------o");
      System.out.println("   \\_(_U_U_)\n");
      System.out.print("Nombre --> ");
      String nombre = s.next();

      System.out.print("Sexo (macho, hembra) --> ");
      String sexo = s.next();

      System.out.print("Pelaje --> ");
      String pelaje = s.next();

      System.out.print("Raza --> ");
      String raza = s.next();

      System.out.print("Personalidad --> ");
      String personalidad = s.next();
      
      System.out.print("Edad --> ");
      int edad = s.nextInt();

      //Segun la posición en la que se encuentra el array se crea un nuevo gato con los datos anteriores//
      gato[i]= new Gato(nombre, sexo, edad, pelaje, raza, personalidad);
      System.out.println("\n");
    }

    //Imprimir los datos que cada gato//
    System.out.println("Ahora vamos a presentar a los gatitos");
    System.out.println("-------------------------------------");

    for (int i=0; i<4; i++) {
      System.out.println("Gato " +(i+1)+ ":");
      System.out.println(gato[i]);
    }
    System.out.println();

    //Dar de comer a los gatos//
    System.out.println("Creo que los gatitos están hambrientos. Prueba a darles de comer (recuerda que tenemos " 
      +Gato.getSardinasTotales()+ " sardinas totales)");

    do {
      //gatos disponibles//
      for (int i=0; i<4; i++) {
        System.out.println((i+1)+ ". " +gato[i].getNombre());
      }
      //elección//
      System.out.print("Eleccion --> ");
      int elección=s.nextInt();
      System.out.print("Cuántas sardinas quieres darle? --> ");
      int numSardinas=s.nextInt();
      
      //Switch para dar de comer al gato según cual ha sido elegido
      switch(elección){
        case 1:
          gato[0].comer(numSardinas);
          break;
        case 2:
          gato[1].comer(numSardinas);
          break;
        case 3:
          gato[2].comer(numSardinas);
          break;
        case 4:
          gato[3].comer(numSardinas);
          break;
        default:
      }

      System.out.print("Quieres seguir dandole de comer a los gatitos? --> ");
      respuesta=s.next();

    } while(!respuesta.equals("no"));
  }
}
