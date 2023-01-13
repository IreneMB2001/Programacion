/*Pasteleria.java
*Programa que calcula el importe desglosado de una bandera dependiendo de su alto y su ancho.
*@Irene Martin
*/
import java.util.Scanner;

public class Pasteleria {
  public static void main (String [] args) {

    Scanner s= new Scanner (System.in);  
    
    System.out.println (" ");
    
    System.out.print (" Elija un sabor (manzana, fresa o chocolate): ");
    String sabor= s.next();
    double precioSabor= 0;
    String tipoChocolate =".";
    
    //Sentencia condicional sabores//
    switch (sabor) {
      case "manzana":
        precioSabor = 18;
        break;
      case "fresa":
        precioSabor = 16;
        break;
      case "chocolate":
        System.out.print (" Que tipo de chocolate quiere? (negro o blanco): ");
        tipoChocolate= s.next();
        tipoChocolate= tipoChocolate.toLowerCase();
        if (tipoChocolate.equals("negro")) {
          precioSabor = 14;
        } else if (tipoChocolate.equals("blanco")) {
          precioSabor = 15;
        } else {
          precioSabor= 0;
          System.out.print (" - El tipo de chocolate elegido no es valido: ");
        }
        break;
      default:
        precioSabor= 0;
        System.out.println (" - El sabor elegido no es valido: ");
     }
     
     System.out.print(" Quiere nata incluida? (si o no): ");
     String respuesta1= s.next();
     respuesta1= respuesta1.toLowerCase();
     
     //Sentencia condicional Con nata o Sin nata//
     String nata= ".";
     double precioNata= 0;
     
     switch (respuesta1) {
       case "si":
         nata= "Con nata";
         precioNata= 2.5;
         break;
       case "no":
         nata= "Sin nata";
         precioNata= 0;
         break;
       default:
         nata= ".";
         System.out.println (" - La respuesta sobre la nata no es valida: ");
     }
     System.out.print(" Quiere ponerle nombre? (si o no): ");
     String respuesta2= s.next();
     respuesta2= respuesta2.toLowerCase();
     
     //Sentencia condicional Con nombre o Sin nombre//
     String nombre=".";
     double precioNombre= 0;
     
     switch (respuesta2) {
       case "si":
         nombre= "Con nombre";
         precioNombre= 2.75;
         break;
       case "no":
         nombre= "Sin nombre";
         precioNombre= 0;
         break;
       default:
         nombre= ".";
         System.out.println (" - La respuesta sobre el nombre no es valida: ");
     }
     
     //Sentencia if precios segun las opciones escogidas anteriormente//
     
     //chocolate//
     if ((sabor.equals("chocolate")) && (precioSabor!=0)) {
       System.out.print(" Tarta de " + sabor + " " + tipoChocolate + " : ");
       System.out.printf(" %-5.2f\n", +precioSabor);
     } 
     //fresa//
     if ((sabor.equals("fresa")) && (precioSabor!=0)) {
       System.out.print(" Tarta de " + sabor + " : ");
       System.out.printf(" %-5.2f\n", +precioSabor);
     } 

     
     //manzana//
     if ((sabor.equals("manzana")) && (precioSabor!=0)) {
       System.out.print(" Tarta de " + sabor + " : ");
       System.out.printf(" %-5.2f\n", +precioSabor);
     } 
     //nata//
     if (nata.equals("Con nata")) {
       System.out.print(" "+ nata + " : ");
       System.out.printf(" %-5.2f\n", +precioNata);
     } else if (nata.equals("Sin nata")){
       System.out.print(" "+ nata + " : ");
       System.out.printf(" %-5.2f\n", +precioNata);
     }
     //nombre//
     if (nombre.equals("Con nombre")) {
       System.out.print(" "+ nombre + " : ");
       System.out.printf(" %-5.2f\n", +precioNombre);
     } else if (nombre.equals("Sin nombre")){
       System.out.print(" "+ nombre + " : ");
       System.out.printf(" %-5.2f\n", +precioNombre);
     }

     double total= precioSabor+precioNata+precioNombre;
     System.out.print(" Total: ");
     System.out.printf(" %-5.2f\n", +total);
  }
}
