/*PrecioDesayuno.java
*Programa que calcula el precio de un desayuno.
*@Irene Martin
*/
import java.util.Scanner;

public class PrecioDesayuno {
  public static void main (String [] args) {

    Scanner s= new Scanner (System.in);  
    
    System.out.println (" ");
    
    System.out.print(" Que ha tomado de comer? (palmera, donut o pitufo): ");
    String desayuno = s.next();
    desayuno= desayuno.toLowerCase();
    
    //Sentencia condicional segun el desayuno//
    double precioDesayuno = 0;
    String respuesta1="n";
    
    switch(desayuno) {
      case "palmera":
        precioDesayuno = 1.40;
        break;
      case "donut":
        precioDesayuno = 1.00;
        break;
      case "pitufo":
        System.out.print(" Con que se ha tomado el pitufo? (aceite o tortilla): ");
        respuesta1= s.next();
        if (respuesta1.equals("aceite")){
          precioDesayuno = 1.20;
        } else if (respuesta1.equals("tortilla")) {
          precioDesayuno = 1.60;
        } else {
          precioDesayuno = 99; //en caso de error//
          if (precioDesayuno == 99){
            System.out.println(" El tipo de pitufo introducido no es valido");
          }
        }
        break;
      default:
        precioDesayuno = 0;
        if (precioDesayuno == 0){
          System.out.println(" El desayuno introducido no es valido");
        }
    }
    //Sentencia condicional segun la bebida// 
    System.out.print(" Que ha tomado de beber? (zumo o cafe): "); 
    String bebida = s.next();
    bebida= bebida.toLowerCase(); 
    double precioBebida=0; 
    
    switch(bebida) {
      case "zumo":
        precioBebida = 1.50;
        break;
      case "cafe":
        precioBebida = 1.20;
        break;   
      default:
        precioBebida = 0; //en caso de error//
        if (precioBebida == 0){
          System.out.println(" La bebida introducida no es valida");
        }
    }
    
    //Resultado final//
    double precioTotal= precioDesayuno+precioBebida;
    
     if ((desayuno.equals("pitufo")) && (precioDesayuno!=99) && (precioBebida!=0)) {
       System.out.print(" pitufo de " + respuesta1 + " : ");
       System.out.printf(" %-5.2f\n", +precioDesayuno);
       System.out.print(" "+ bebida + " : ");
       System.out.printf(" %-5.2f\n", +precioBebida);
       System.out.print(" Total desayuno : ");
       System.out.printf(" %-5.2f\n", +precioTotal);
     } else if ((precioDesayuno!=0) && (precioBebida!=0) && (precioDesayuno!=99)) {
       System.out.print(" "+ desayuno + " : ");
       System.out.printf(" %-5.2f\n", +precioDesayuno);
       System.out.print(" "+ bebida + " : ");
       System.out.printf(" %-5.2f\n", +precioBebida);
       System.out.print(" Total desayuno : ");
       System.out.printf(" %-5.2f\n", +precioTotal);
     } 
  }
}
        
        
        
        
