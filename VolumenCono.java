/*VolumenCono.java
*Programa que calcula el volumen de un cono, con los datos introducidos por teclado.
*@Irene Martin
*/

import java.util.Scanner; //declaramos el Scanner//

public class VolumenCono {
  public static void main (String [] args) {
    Scanner s = new Scanner(System.in); //creamos el objeto Scanner y quedará abreviado con una s.//
    
    System.out.print ("\n"); //Salto de linea para que el texto no quede pegado hacia arriba de la ventana.//
    
    System.out.println (" Calculo del volumen de un cono:\n");
    System.out.print( " Dame el radio de tu cono por favor: ");
    double radio= s.nextDouble(); //variable double que almacena el radio leido//
    
    System.out.print( " Ahora dame su altura  por favor: ");
    double altura= s.nextDouble(); //variable que almacena la altura leida//
    
    double pi =3.14; //variable double para el dato pi//
    
    double volumen= (1.0/3.0)* pi * (radio*radio) * altura; //variable double para el calculo del volumen//
    
    System.out.println( " El volumen de tu cono es de: " + volumen);
    //Se imprime en pantalla el resultado del volumen obtenido//
  
  }
}
