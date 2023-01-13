/*PrecioBandera.java
*Programa que calcula el importe desglosado de una bandera dependiendo de su alto y su ancho.
*@Irene Martin
*/
import java.util.Scanner;

public class PrecioBandera {
  public static void main (String [] args) {

    Scanner s= new Scanner (System.in);  
    
    System.out.println (" ");
    
    System.out.print (" Introduzca la altura de la bandera en cm: ");
    double altura= s.nextDouble();
    System.out.print (" Ahora introduzca la anchura: ");
    double anchura= s.nextDouble();
    System.out.print (" Quiere el escudo bordado?(Si/No): ");
    String escudo= s.next();
    escudo= escudo.toLowerCase();
    
    //Sentencia condicional Escudo bordado/no bordado//
    String escudoBordado="n";
    double precioEscudo=0;
    
    switch (escudo) {
      case "si":
        escudoBordado="Con escudo";
        precioEscudo=2.50;
        break;
      case "no":
        escudoBordado="Sin escudo";
        precioEscudo=0;
        break;
      default:
        escudoBordado="n";
    }
    //calculo del precio de la bandera//
    double gastosEnvio=3.25;
    double area=anchura*altura;
    double precioMedida=area*0.01; //precio: 1 euros por centimetro cuadrado//
    double precioTotal=precioMedida+precioEscudo+gastosEnvio;
    
    //Desglose de la compra//
    if (escudoBordado=="n") { //en caso de que de error//
      System.out.println (" Error al introducir la condicion");
    } else { 
      System.out.println(" Gracias. Aqui tiene el desglose de su compra.");
      System.out.println(" ");
      System.out.println("------------------------------------------------------");
      System.out.printf(" Bandera de: (%-5.2fcm2)   %7.2f\n", area, precioMedida);
      System.out.printf(" %-10s       %16.2f\n", escudoBordado, precioEscudo);
      System.out.printf(" Gastos de envio:  %15.2f\n", gastosEnvio);
      System.out.println("------------------------------------------------------");
      System.out.printf(" Total: %26.2f\n", precioTotal);
      System.out.println("------------------------------------------------------");
    }
  }
}
    
        
    
