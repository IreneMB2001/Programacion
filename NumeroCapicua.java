/*NumeroCapicua.java
*Programa que te dice si el numero introducido por teclado es capicua (limite de 5 cifras).
*@Irene Martin
*/
import java.util.Scanner;

public class NumeroCapicua {
  public static void main (String [] args) {

    Scanner s= new Scanner (System.in);  
    
    System.out.println (" ");
    
    System.out.print (" Dime un numero y te dire si es capicua: ");
    int num= s.nextInt();
    int resto= num%10; //Esta variable almacena la ultima cifra del numero//
    //Para saber si el numero es capicua hay que poner sus cifras al reves y compararlo//
    int dMillar= 0;
    int uMillar= 0;
    int centena = 0;
    int decena = 0;
    int unidad = 0;
    int resultado= 0;
    System.out.println (" ");
    
    //Sentencia if segun el numero de cifras//
    if (num>=10 && num<=99) {
      //operaciones//
      unidad= num/10;
      decena= resto*10;
      resultado= unidad+decena;
      //comprobacion del resultado//
      System.out.println (" Numero al reves:");
      System.out.println (" unidad: " +unidad);
      System.out.println (" decena: " +decena);
      System.out.println (" Resultado: " +resultado);
    } else if (num>=100 && num<=999) {
      //operaciones//
      unidad= num/100;
      decena= ((num/10)%10)*10;
      centena=resto*100;
      resultado= unidad+decena+centena;
      //comprobacion del resultado//
      System.out.println (" Numero al reves:");
      System.out.println (" unidad: " +unidad);
      System.out.println (" decena: " +decena);
      System.out.println (" centena: " +centena);
      System.out.println (" Resultado: " +resultado);
    } else if (num>=1000 && num<=9999) {
      //operaciones//
      unidad= num/1000;
      decena= ((num/100)%10)*10;
      centena= ((num/10)%10)*100;
      uMillar= resto*1000;
      resultado= unidad+decena+centena+uMillar;
      //comprobacion del resultado//
      System.out.println (" Numero al reves:");
      System.out.println (" unidad: " +unidad);
      System.out.println (" decena: " +decena);
      System.out.println (" centena: " +centena);
      System.out.println (" U.Millar: " +uMillar);
      System.out.println (" Resultado: " +resultado);
      
    } else if (num>=10000 && num<=99999) {
      //operaciones//
      unidad= num/10000;
      decena= ((num/1000)%10)*10;
      centena=((num/100)%10)*100;
      uMillar=((num/10)%10)*1000;
      dMillar= resto*10000;
      resultado= unidad+decena+centena+uMillar+dMillar;
      //comprobacion del resultado//
      System.out.println (" Numero al reves:");
      System.out.println (" unidad: " +unidad);
      System.out.println (" decena: " +decena);
      System.out.println (" centena: " +centena);
      System.out.println (" Un.millar: " +uMillar);
      System.out.println (" De.millar: " +dMillar);
      System.out.println (" Resultado: " +resultado);
    } else if (num>=0 && num<=9) {
      System.out.println (" El numero solo tiene una cifra.");		
    } else {
      System.out.print (" No se puede saber el resultado. ");
      System.out.print ("Recuerda que el numero tiene que ser positivo y entero, y su limite es de 5 cifras. ");
    }
    
    //Sentencia if segun el resultado//
    if (num==resultado) {
      System.out.println (" ");
      System.out.println (" El numero es capicua.");
    } else if (num!=resultado) {
      System.out.println (" ");
      System.out.println (" El numero no es capicua.");
    } 
  }  
}
   
