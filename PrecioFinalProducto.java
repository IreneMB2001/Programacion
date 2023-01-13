/*PrecioFinalProducto.java
*Programa que calcula el importe total de un producto teniendo en cuenta la base imponible, el tipo de iva y el descuento.
*@Irene Martin
*/
import java.util.Scanner;

public class PrecioFinalProducto {
  public static void main (String [] args) {

    Scanner s= new Scanner (System.in);  
    
    System.out.println (" ");
    
    System.out.print (" Introduzca la base imponible: ");
    double baseImponible= s.nextDouble();
    System.out.print (" Introduzca el tipo de IVA (general, reducido o superreducido): ");
    String iva= s.next();
    iva= iva.toLowerCase();
    System.out.print (" Introduzca el codigo promocional (nopro, mitad, meno5 o 5porc): ");
    String promo= s.next();
    promo= promo.toLowerCase();
    
    //Sentencia condicional Tipo de IVA//
    double tipoIva = 0;
    
    switch (iva) {
      case "general":
        tipoIva=0.21;
        break;
      case "reducido":
        tipoIva=0.10;
        break;
      case "superreducido":
        tipoIva=0.4;
        break;
      default:
        tipoIva=0;
        System.out.println(" - El tipo de IVA introducido es incorrecto.");
   }
   //Calculo del precio con IVA//
   double precioIva= baseImponible*tipoIva;
   double precioNoDescuento= baseImponible+precioIva;
   
   //Sentencia condicional Tipo de descuento//
   double descuento = 0;
   
   switch(promo) {
     case "nopro": //Sin descuento//
       descuento = 0;
       break;
     case "mitad": //descuento de la mitad del importe//
       descuento= precioNoDescuento/2;
       break;
     case "meno5": //descuento de 5 euros//
       descuento=5;
       break;
     case "5porc": //descuento del 5%//
       descuento= precioNoDescuento*0.05;
       break;
     default:
       descuento = 99;
       System.out.println(" - Codigo promocional no valido.");
   }
   //importe total de la compra//
   double importeTotal= precioNoDescuento-descuento;
   
   //Impresion del resultado//
    if ((tipoIva==0) && (descuento==99)) { //en el caso de que haya errores//
      System.out.println(" - Error en el calculo de datos.");
    } else if ((tipoIva!=0) && (descuento!=99)) {
    System.out.println(" ");
    System.out.println("------------------------------------------------------");
    System.out.printf(" Base Imponible:   %15.2f\n", baseImponible);
    System.out.printf(" IVA: (%-5.2f)      %15.2f\n", tipoIva, precioIva);
    System.out.printf(" Precio con IVA:   %15.2f\n", +precioNoDescuento);
    System.out.println("------------------------------------------------------");
    System.out.printf(" Cod. promo: (%5s)   -%10.2f\n", promo, descuento);
    System.out.println("------------------------------------------------------");
    System.out.printf(" Importe total:    %15.2f\n", +importeTotal);
    System.out.println("------------------------------------------------------");
    }
  }
}
