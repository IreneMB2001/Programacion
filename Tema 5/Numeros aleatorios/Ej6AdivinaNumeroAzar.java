/*Ej6AdivinaNumeroAzar.java
*Programa que piensa un numero al azar entre 0 y 100 y tienes 5 oportunidades para adivinarlo.
*@Irene Martin
*/
import java.util.Scanner; 

public class Ej6AdivinaNumeroAzar {
  public static void main (String [] args) {
    System.out.println (" ");
    Scanner s= new Scanner (System.in);
    int intentos=5;
    int numeroCorrecto=(int)(Math.random()*101); //Al poner 101 el 100 cuenta//
    System.out.print (" Intenta adivinar el numero que se encuentra entre 0 y 100.");
    int respuesta;
    
    //Bucle para cada intento//
     do {
       System.out.println (" Tienes " +intentos+ " intentos.");
       System.out.print (" Combinacion: ");
       respuesta=s.nextInt();
       intentos--;
       
       //Sentencia condicional//
       if (respuesta<numeroCorrecto) {
         System.out.println (" El numero que has elegido es menor que el numero secreto.");
       } else if (respuesta>numeroCorrecto) {
         System.out.println (" El numero que has elegido es mayor que el numero secreto.");
       }
    } while ((intentos!=0) && (respuesta!=numeroCorrecto));
       if (respuesta!=numeroCorrecto){
         System.out.println (" Mala suerte, has agotado el numero de intentos."); 
       } else {
         System.out.println (" Bien hecho! has adivinado el numero.");
       }
  }
}
