/*Ej7ArraySustituirValor.java
*Programa que genera 100 numeros aleatorios entre 0 y 20 y que sustituye un valor por otro pedido por teclado.
*El numero sustituido aparecera entre comillas y en color morado.
*Irene Martin
*/
import java.util.Scanner;

public class Ej7ArraySustituirValor {
  public static void main (String [] args) {
    Scanner s = new Scanner (System.in);
    
    System.out.println(" ");
    
    System.out.println(" A continuacion se muestra un array formado por 100 numeros aleatorios de 0 a 20: ");
    System.out.println(" -------------------------------------------------------------------------------- ");
    
    //Declaracion de variables//
    int[] numero= new int[100];
    int n;
    int valor1; //variable que almacena uno de los valores mostrados en el array//
    int valor2; //variable que almacena el valor sustituto del anterior//
    
    //Establecer el array con numeros aleatorios//
    for (n=0; n<100; n++) {
      numero[n]= (int)(Math.random()*21);
      System.out.print(" " +numero[n]+ " ");
    }
    System.out.println(" ");
    System.out.print(" Introduzca uno de los numeros que se han mostrado anteriormente --> ");
    valor1=s.nextInt();
    System.out.print(" Ahora introduzca el valor por el que lo quiere sustituir --> ");
    valor2=s.nextInt();
    System.out.println(" ");
    
    //Sustituir el valor1 por el valor2//
    System.out.println(" -----------------------------------------------------------------");
    System.out.println(" El array con el valor sustituido permanece de la siguiente forma: ");
    System.out.println(" -----------------------------------------------------------------");
    for (n=0; n<100; n++) {
      if (valor1==numero[n]) { //Si el numero del array coincide con el valor introducido...//
        numero[n]=valor2;      //el numero se sustituye por el segundo valor introducido.//
        System.out.print (" " + "\033[95m''" +numero[n]+ "''\033[39;49m "); //aparece en color morado//
      } else {
        System.out.print(" " +numero[n]+ " ");
      }
    }
  }
}
    
    
