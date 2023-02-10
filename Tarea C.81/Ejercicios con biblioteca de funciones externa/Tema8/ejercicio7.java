/*ejercicio7.java
*Programa que pide el ancho y el alto de un rectángulo y muestra su perímetro y área.
*@Irene Martin
*/
import java.util.Scanner;
import misFunciones.Geometria;

public class ejercicio7 {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println ();
    System.out.println (" Introduce el ancho y el alto del rectángulo: ");
    System.out.print (" Ancho --> ");
    double ancho=s.nextDouble();
    System.out.print (" Alto --> ");
    double alto=s.nextDouble();
    double perimetro=Geometria.perimetroRectangulo(ancho, alto);
    double area=Geometria.areaRectangulo(ancho, alto);
    System.out.println (" El perímetro del rectángulo es " +perimetro+ " y el área es " +area);
  }
}