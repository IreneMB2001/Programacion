package ArraysDeObjetos.Ej1y2Gatos;
/* PruebaArrayGatos.java
 * Prueba de la clase Gato implementando arrays 
 * Se tiene que añadir la opción de darle de comer sardinas a uno de los gatos
 * @Author Irene
 */
import java.util.Scanner;
public class Ej2PruebaArrayGatos {
  public static void main (String [] args) {
    Scanner s = new Scanner(System.in);

    //Creación del Array//
    Gato[] gato = new Gato[4];

    //variables a utilizar después//
    String respuesta="";

    //Crear gatitos//
    System.out.println("\nHemos creado un array de 4 gatitos ");

    gato[0]= new Gato("Garfield", "macho", 3, "anaranjado con rayas", "americana", "vago");
    gato[1]= new Gato("Kira", "hembra", 2, "con manchas", "siamés", "narsicista");
    gato[2]= new Gato("Salem", "hembra", 1500, "negro y liso", "europea", "misteriosa");
    gato[3]= new Gato("Presidente miau", "macho", 7, "moteado", "bengali", "cariñoso");

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
