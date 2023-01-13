/*CajaFuerte.java
*Programa que te da la oportunidad de abrir una caja fuerte, teniendo 4 intentos en total.
*@Irene Martin
*/
import java.util.Scanner; 

public class CajaFuerte {
  public static void main (String [] args) {
    System.out.println (" ");
    Scanner s= new Scanner (System.in);
    int intentos=4;
    int combinacion=4458;
    System.out.println (" Por favor, introduzca la combinacion de la caja fuerte.");
    int respuesta;
     do {
       System.out.println (" Tienes " +intentos+ " intentos.");
       System.out.print (" Combinacion: ");
       respuesta=s.nextInt();
       intentos--;
    } while ((intentos!=0) && (respuesta!=combinacion));
       if (respuesta!=combinacion){
         System.out.println (" Has agotado el numero de intentos"); 
       } else {
         System.out.println (" La caja fuerte se ha abierto satisfactoriamente");
       }
  }
}
