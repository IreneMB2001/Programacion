/*PiramideEligeVertice
*Programa que pinta una piramide y puedes decidir la posicion del vertice (arriba, abajo, izq o der) y el simbolo pintado.
*@Irene Martin
*/
import java.util.Scanner;

public class PiramideEligeVertice {
  public static void main (String [] args) {

    Scanner s= new Scanner (System.in);  
    
    System.out.println (" ");
    
    System.out.println (" Vamos a pintar una piramide, por favor dime donde quieres su vertice: ");
    System.out.println (" 1 : vertice arriba");
    System.out.println (" 2 : vertice abajo");
    System.out.println (" 3 : vertice izquierda");
    System.out.println (" 4 : vertice derecha");
    System.out.println (" ");
    System.out.print (" vertice: ");
    int vertice= s.nextInt(); //vertice: declaramos la variable int que almacena la respuesta del vertice//
    System.out.println (" ");
    System.out.println (" Ahora elige el simbolo: ");
    System.out.print (" simbolo: ");
    String a= s.next();//a: variable String que almacena la respuesta del simbolo//
    
    //Sentencia condicional switch//
    //para formar las piramides hay que crear impresiones con concatenaciones de la variable a//
    switch (vertice) {
      case 1:
        System.out.println (" ");
        System.out.println ("     "+a+"    ");
        System.out.println ("    "+a+a+a+"  ");
        System.out.println ("   "+a+a+a+a+a+"  ");
        System.out.println ("  "+a+a+a+a+a+a+a);
        System.out.println (" "+a+a+a+a+a+a+a+a+a);
        break;
      case 2:
        System.out.println (" ");
        System.out.println (" "+a+a+a+a+a+a+a+a+a);
        System.out.println ("  "+a+a+a+a+a+a+a);
        System.out.println ("   "+a+a+a+a+a+"  ");
        System.out.println ("    "+a+a+a+"  ");
        System.out.println ("     "+a+"    ");
        break;
      case 3:
        System.out.println (" ");
        System.out.println ("       "+a);
        System.out.println ("      "+a+a);
        System.out.println ("    "+a+a+a+a);
        System.out.println ("  "+a+a+a+a+a+a);
        System.out.println ("    "+a+a+a+a);
        System.out.println ("      "+a+a);
        System.out.println ("       "+a);
        break;
      case 4:
        System.out.println ("  ");
        System.out.println ("  "+a);
        System.out.println ("  "+a+a);
        System.out.println ("  "+a+a+a+a);
        System.out.println ("  "+a+a+a+a+a+a);
        System.out.println ("  "+a+a+a+a);
        System.out.println ("  "+a+a);
        System.out.println ("  "+a);
        break;
      default:
        System.out.println (" ");
        System.out.println (" La opcion que has introducido no es valida");
    }
  }
}
