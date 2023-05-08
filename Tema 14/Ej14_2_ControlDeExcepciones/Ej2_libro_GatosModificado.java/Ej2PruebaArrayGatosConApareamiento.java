
/* Ej2PruebaArrayGatosConApareamiento.java
 * Prueba de la clase Gato implementando arrays 
 * Este ejercicio está modificado para probar el método apareaCon y la exepción ExcepcionApareamientoImposible
 * @author Irene Martín
 */
import java.util.Scanner;
public class Ej2PruebaArrayGatosConApareamiento {
  public static void main (String [] args) {
    Scanner s = new Scanner(System.in);

    //Creación del Array//
    Gato[] gato = new Gato[4];

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

    //prueba de apareamiento entre Garfield y un gato aleatorio//
    int indexAleatorio=(int)(Math.random()*3+1); //index aleatorio de 1 a 3
    System.out.println("Intentemos aparear a " +gato[0].getNombre() + " con " +gato[indexAleatorio].getNombre() + "...");
    System.out.println("---------------------------------------------------------------");
    try{
      gato[0].apareaCon(gato[indexAleatorio]);
    } catch (ExcepcionApareamientoImposible e){
      e.printStackTrace(); //Sirve para imprimir el mensaje completo de la excepción
      System.out.println("Excepción: " + e.getClass());
      System.out.println("Error: " + e.getMessage() +"\n");
    }
  }
}
